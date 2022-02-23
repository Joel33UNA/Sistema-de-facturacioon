/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.producto;
import sistemadefacturacion.logic.Producto;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable{
    private Producto current;
    private ArrayList<Producto> list;
    
    public Model(){
        current = new Producto();
        list = new ArrayList<>();
    }
    
    public Producto getCurrent(){
        return current;
    }
    
    public ArrayList<Producto> getList(){
        return list;
    }
    
    public void setCurrent(Producto current){
        this.current = current;
    }
    
    public void setList(ArrayList<Producto> list){
        this.list = list;
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
