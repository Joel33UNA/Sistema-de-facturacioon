/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)

public class Empresa {
    @XmlID
    private String nombre;
    
    private String cedulaJuridica;
    
    
    public Empresa(String nombre, String cedulaJuridica){
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
    }
    
    public Empresa(){
        this.nombre = "Indefinido";
        this.cedulaJuridica = "Indefinido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCedulaJuridica(){
        return cedulaJuridica;
    }
    
    public void setCedulaJuridica(String cedulaJuridica){
        this.cedulaJuridica = cedulaJuridica;
    }
}
