/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.principal;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable{

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o); 
        this.setChanged();
        this.notifyObservers();
    }

} 