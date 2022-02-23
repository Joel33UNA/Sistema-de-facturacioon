/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.table;
import sistemadefacturacion.logic.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class ClienteTableModel extends AbstractTableModel implements TableModel {
    private String[] atributos ={"Nombre", "ID", "Teléfono", "E-mail", "Cantidad de facturas" };
    private ArrayList<Cliente> clientes;
    
    public ClienteTableModel(ArrayList<Cliente> clientes){
       this.clientes = clientes;
    }
    
    @Override
    public int getRowCount() {
        return this.clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
     public String getColumnName(int columnIndex){
         return atributos[columnIndex];
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch(columnIndex){
            case 0: { return cliente.getNombre();}
            case 1: { return cliente.getCedula(); }
            case 2: { return cliente.getTelefono(); }
            case 3: { return cliente.getCorreoElec(); }
            case 4: { return cliente.getFacturas().size(); }
            default: return 0;
        }
    }
    
}