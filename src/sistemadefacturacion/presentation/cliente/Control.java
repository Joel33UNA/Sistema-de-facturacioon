/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.cliente;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.presentation.table.ClienteTableModel;

public class Control {
    private Model model;
    private Interfaz interfaz;
    
    public Control(Model model, Interfaz interfaz){
        this.model = model;
        this.interfaz = interfaz;
        model.setList(sistemadefacturacion.logic.Service.instancia().getClientes());
        interfaz.setControl(this);
        interfaz.setModel(model);
        interfaz.getTablaClientes().setModel(new ClienteTableModel(sistemadefacturacion.logic.Service.instancia().getClientes()));
    }
    
    public boolean agregar(Cliente c){
        if (sistemadefacturacion.logic.Service.instancia().equalsClientes(c))
            return false;
        sistemadefacturacion.logic.Service.instancia().addCliente(c);
        model.setCurrent(new Cliente());
        model.setList(sistemadefacturacion.logic.Service.instancia().getClientes());        
        model.commit();
        return true;
    }
    
    public void busqueda(Cliente c) {
        model.setList(sistemadefacturacion.logic.Service.instancia().busquedaCliente(c));
        model.commit();
    }
    
    public void show(){
        interfaz.setVisible(true);
    } 
}
