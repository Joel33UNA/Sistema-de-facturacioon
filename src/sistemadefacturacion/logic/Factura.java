/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)

public class Factura {
    @XmlID
    private String numero;
    private Date fecha;
    
    @XmlIDREF
    private Cliente cliente;
    private ArrayList<Linea> lineas;  
    private Empresa empresa;

    public Factura() {
        DecimalFormat df = new DecimalFormat("###");
        this.numero = df.format(sistemadefacturacion.logic.Service.instancia().getFacturas().size() + 1);
        this.fecha = new Date();
        this.cliente = new Cliente();
        this.lineas = new ArrayList<>();
        this.empresa = sistemadefacturacion.logic.Service.instancia().getEmpresa();
    }
    
    public Factura(String nombre){
        this.cliente = new Cliente(nombre);
        this.numero = "";
        this.fecha = null;
        this.lineas = null;
        this.empresa = null;
    }

    public String getNumero() {
        return numero;
    }

    public String getFecha() {
        SimpleDateFormat fActual = new SimpleDateFormat("hh:mm a dd-MMM-yyyy");
        return fActual.format(fecha);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }  

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void agregarLinea(Linea l){
        this.lineas.add(l);
    }
    
    public double Total(){
        double suma = 0;
        for(int i = 0; i < getLineas().size(); i++){
            suma += lineas.get(i).getTotal();
        }
        return suma;
    }
}
