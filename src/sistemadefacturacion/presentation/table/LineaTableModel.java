/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.table;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistemadefacturacion.logic.Linea;

public class LineaTableModel extends AbstractTableModel implements TableModel {
    private String[] atributos = {"Producto", "Cantidad", "Total"};
    private ArrayList<Linea> lineas;
    
    public LineaTableModel(ArrayList<Linea> lineas){
        this.lineas = lineas;
    }
    
    public LineaTableModel(){
        this.lineas = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return lineas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return atributos[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Linea linea = lineas.get(rowIndex);
        switch(columnIndex){
            case 0: {return linea.getProducto().getNombre(); }
            case 1: { return linea.getCantidad();}
            case 2: { return linea.getTotal();}
            default: return null;
        }
    }

}
