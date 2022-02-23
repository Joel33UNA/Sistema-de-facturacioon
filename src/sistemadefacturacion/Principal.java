/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion;
import sistemadefacturacion.presentation.principal.Interfaz;
import sistemadefacturacion.presentation.principal.Model;
import sistemadefacturacion.presentation.principal.Control;

public class Principal {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Model model = new Model();
        Control control = new Control(model, vista);
        vista.setVisible(true);
    }
}