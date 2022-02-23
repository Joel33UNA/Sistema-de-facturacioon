
/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.producto;

import sistemadefacturacion.logic.Producto;
import sistemadefacturacion.presentation.table.ProductoTableModel;

public class Control {
    private Model model;
    private Interfaz interfaz;
    
    public Control(Model model, Interfaz interfaz){
        this.model = model;
        this.interfaz = interfaz;
        model.setList(sistemadefacturacion.logic.Service.instancia().getProductos());
        interfaz.setModel(model);
        interfaz.setControl(this);
        interfaz.getTablaProductos().setModel(new ProductoTableModel(sistemadefacturacion.logic.Service.instancia().getProductos()));
    }
    
    public void show(){
        interfaz.setVisible(true);
    }
    
    public boolean agregar(Producto p){
        if (sistemadefacturacion.logic.Service.instancia().equalsProductos(p))
            return false;
        sistemadefacturacion.logic.Service.instancia().addProducto(p);
        model.setCurrent(new Producto());
        model.setList(sistemadefacturacion.logic.Service.instancia().getProductos());        
        model.commit();
        return true;
    }
    
    public void busqueda(Producto p){    
        model.setList(sistemadefacturacion.logic.Service.instancia().busquedaProducto(p));
        model.commit();        
    }

}
