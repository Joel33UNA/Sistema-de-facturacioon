/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.factura;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.logic.Factura;
import sistemadefacturacion.logic.Producto;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import sistemadefacturacion.logic.Linea;

public class Model extends Observable{
    private boolean flag;
    private Factura  current;
    private ArrayList<Factura> listF;
    private ArrayList<Cliente> listC;
    private ArrayList<Producto> listP;
    
    public Model(){
        flag = false;
        current = new Factura();
        listF = new ArrayList<>();
        listC = new ArrayList<>();
        listP = new ArrayList<>();
    }
    
    public Factura getCurrent(){
        return current;
    }
    
    public ArrayList<Factura> getListF(){
        return listF;
    }
    
    public ArrayList<Cliente> getListC(){
        return listC;
    }
    
    public ArrayList<Producto> getListP(){
        return listP;
    }
    
    public boolean getFlag(){
        return this.flag;
    }
    
    public void setCurrent(Factura current){
        this.current = current;
    }
    
    public void setListF(ArrayList<Factura> list){
        this.listF = list;
    }
    
    public void setListC(ArrayList<Cliente> list){
        this.listC = list;
    }
    
    public void setListP(ArrayList<Producto> list){
        this.listP = list;
    }
    
    public void setFlag(boolean flag){
        this.flag = flag;
    }
    
    public void agregarLinea(Linea l){
        this.current.agregarLinea(l);
    }
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
}
