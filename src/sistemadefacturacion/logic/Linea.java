/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/


package sistemadefacturacion.logic;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)

public class Linea {
    @XmlID
    private String codigo;
    
    private int cantidad;
    private double total;
    
    @XmlIDREF
    private Producto producto;

    public Linea(Producto producto, int cantidad) {
        Date date = new Date();
        this.codigo = new SimpleDateFormat("HH:mm:ss").format(date);
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = this.producto.getPrecio() * this.cantidad;
    }
    
    public Linea(){
        this.codigo = "";
        this.producto = null;
        this.cantidad = 0;
        this.total = 0.0;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProductos(Producto producto) {
        this.producto = producto;
    }    
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.producto.getPrecio() * this.cantidad;
    }
}
