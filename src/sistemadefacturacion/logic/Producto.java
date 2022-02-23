/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)

public class Producto {
    @XmlID
    private String codigo;
    private String nombre;
    private double precio;
    private double impuesto;

    public Producto(String codigo, String nombre, double precio, double impuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.impuesto = impuesto / 100;
        this.precio = precio + precio * this.impuesto;
    }
    
    public Producto(String nombre){
        this.nombre = nombre;
        this.codigo = "";
        this.precio = 0.0;
        this.impuesto = 0.0;
    }
    
    public Producto(){
        this.codigo = "";
        this.nombre = "";
        this.precio = 0.0;
        this.impuesto = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto * 100;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto =  impuesto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
}