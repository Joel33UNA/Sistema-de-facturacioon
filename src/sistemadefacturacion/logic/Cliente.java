/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;

import java.util.ArrayList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)

public class Cliente {
    @XmlID
    private String cedula;
    
    private String nombre;
    private String telefono;
    private String correoElec;
    
    @XmlIDREF
    private ArrayList<Factura> facturas;

    public Cliente(String cedula, String nombre, String telefono, String correoElec) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElec = correoElec;
        this.facturas = new ArrayList<>();
    }
    
    public Cliente(String nombre){
        this.nombre = nombre;
        this.cedula = "";
        this.telefono = "";
        this.correoElec = "";
        this.facturas = null;
    }
    
    public Cliente(){
        this.cedula = "";
        this.nombre = "";
        this.telefono = "";
        this.correoElec = "";
        this.facturas = null;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }
    
    public void addFactura(Factura f){
        facturas.add(f);
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }    
}