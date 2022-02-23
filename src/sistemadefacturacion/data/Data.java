/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.data;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import sistemadefacturacion.logic.Empresa;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.logic.Factura;
import sistemadefacturacion.logic.Producto;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Data {
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Factura> facturas;
    private Empresa empresa;
    
    public Data(){
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        facturas = new ArrayList<>();
        empresa = new Empresa();
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    
    public ArrayList<Factura> getFacturas(){
        return facturas;
    }
    
    public Empresa getEmpresa(){
        return empresa;
    }
    
    public int getNClientes(){
        return clientes.size();
    }
    
    public int getNProductos(){
        return productos.size();
    }
    
    public int getNFacturas(){
        return facturas.size();
    }
    
     public void setClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
    
    public void setProductos(ArrayList<Producto> productos){
        this.productos = productos;
    }
    
    public void setFacturas(ArrayList<Factura> facturas){
        this.facturas = facturas;
    }
    
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }

    public boolean equalsClientes(Object obj) {
       for (int i = 0; i < clientes.size(); i++)
           if(clientes.get(i).equals(obj))
                   return true;
       return false;
    }
    
    public boolean equalsProductos(Object obj){
        for (int i = 0; i < productos.size(); i++)
            if (productos.get(i).equals(obj))
                return true;
        return false;
    }
}
