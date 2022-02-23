/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;
import java.util.ArrayList;
import sistemadefacturacion.data.Data;

public class Service {
    private static Service instancia;
    public Data informacion;

    private Service() {
        try{
            informacion = XmlPersister.instancia().load();
        }
        catch(Exception e){
            informacion = new Data();
        }
        
    }
    
    public static Service instancia(){
        if (instancia == null){
            instancia = new Service();
        }
        return instancia;
    }
    
    public ArrayList<Cliente> getClientes() {
        return informacion.getClientes();
    }

    public void addCliente(Cliente c){
        informacion.getClientes().add(c);
    }
    
    public ArrayList<Producto> getProductos() {
        return informacion.getProductos();
    }
    
    public ArrayList<Factura> getFacturas(){
        return informacion.getFacturas();
    }
    
    public Empresa getEmpresa(){
        return informacion.getEmpresa();
    }

    public void addProducto(Producto p){
        informacion.getProductos().add(p);
    }

    public boolean equalsClientes(Object obj){
        return informacion.equalsClientes(obj);
    }
    
    public boolean equalsProductos(Object obj){
        return informacion.equalsProductos(obj);
    }
    
    public ArrayList<Cliente> busquedaCliente(Cliente c){
        ArrayList<Cliente> nuevo = new ArrayList<>();
        for(int i = 0; i < informacion.getNClientes(); i++)
            if(informacion.getClientes().get(i).getNombre().contains(c.getNombre()))
                nuevo.add(informacion.getClientes().get(i));
        return nuevo;
    }
    
    public ArrayList<Producto> busquedaProducto(Producto p){
        ArrayList<Producto> nuevo = new ArrayList<>();
        for (int i = 0; i < informacion.getNProductos(); i++)
            if(informacion.getProductos().get(i).getNombre().contains(p.getNombre()))
                nuevo.add(informacion.getProductos().get(i));
        return nuevo;
    }
    
    public ArrayList<Factura> busquedaFactura(Factura f){
        ArrayList<Factura> nuevo = new ArrayList<>();
        for (int i = 0; i < informacion.getNFacturas(); i++)
            if (informacion.getFacturas().get(i).getCliente().getNombre().contains(f.getCliente().getNombre()))
                nuevo.add(informacion.getFacturas().get(i));
        return nuevo;
    }

    public void store() {
        try{
            sistemadefacturacion.logic.XmlPersister.instancia().store(informacion);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}