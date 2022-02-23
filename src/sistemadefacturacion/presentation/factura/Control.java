/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.factura;
import java.io.IOException;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.logic.Factura;
import sistemadefacturacion.logic.Linea;
import sistemadefacturacion.logic.Producto;
import sistemadefacturacion.presentation.table.FacturaTableModel;
import sistemadefacturacion.presentation.table.ClienteTableModel;
import sistemadefacturacion.presentation.table.ProductoTableModel;
import sistemadefacturacion.presentation.table.LineaTableModel;

public class Control {
    private Interfaz interfaz;
    private Model model;
    
    public Control(Model model, Interfaz interfaz){
        this.interfaz = interfaz;
        this.model = model;
        this.interfaz.setControl(this);
        this.interfaz.setModel(model);
        this.interfaz.getTablaFacturas().setModel(new FacturaTableModel(sistemadefacturacion.logic.Service.instancia().getFacturas()));
        this.interfaz.getTablaClientesRegistro().setModel(new ClienteTableModel(sistemadefacturacion.logic.Service.instancia().getClientes()));
        this.interfaz.getTablaVentaProductos().setModel(new ProductoTableModel(sistemadefacturacion.logic.Service.instancia().getProductos()));
        this.interfaz.getTablaCarrito().setModel(new LineaTableModel());
        
    }
    
    public void busquedaFactura(Factura f){
        this.model.setListF(sistemadefacturacion.logic.Service.instancia().busquedaFactura(f));
        this.model.commit();
    }
    
    public void busquedaCliente(Cliente c){
        this.model.setListC(sistemadefacturacion.logic.Service.instancia().busquedaCliente(c));
        this.model.commit();
    }
    
    public void busquedaProducto(Producto p){
        this.model.setListP(sistemadefacturacion.logic.Service.instancia().busquedaProducto(p));
        this.model.commit();
    }
    
    public void agregarProducto(Producto p, int index){
        if (model.getFlag() == false){
            this.model.setFlag(true);
            model.setCurrent(new Factura());
            this.model.getCurrent().agregarLinea(new Linea(p, index + 1));
            this.model.commit();
        }
        else{
            this.model.getCurrent().agregarLinea(new Linea(p, index + 1));
            this.model.commit();
        }
    }
    
    public void agregarFactura(Factura f){
        sistemadefacturacion.logic.Service.instancia().getFacturas().add(f);
        this.model.setListF(sistemadefacturacion.logic.Service.instancia().getFacturas());
        this.model.setFlag(false);
        this.model.setCurrent(new Factura());
        this.model.commit();
        this.interfaz.bloquearItems();
    }
    
    public void show(){
        interfaz.setVisible(true);
    }

    void crearPDF(Factura f) throws IOException {
        sistemadefacturacion.logic.PDF.createPdf(f);
    }

    void crearXML(Factura f) {
        sistemadefacturacion.logic.XmlFactura.crearXML(f);
    }
}
