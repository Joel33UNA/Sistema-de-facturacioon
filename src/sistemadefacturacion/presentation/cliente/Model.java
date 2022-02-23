/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.cliente;
import sistemadefacturacion.logic.Cliente;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable{
    private Cliente current;
    private ArrayList<Cliente> list;
    
    public Model(){
        current = new Cliente();
        list = new ArrayList<>();
    }
    
    public Cliente getCurrent(){
        return current;
    }
    
    public ArrayList<Cliente> getList(){
        return list;
    }
    
    public void setCurrent(Cliente current){
        this.current = current;
    }
    
    public void setList(ArrayList<Cliente> list){
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
