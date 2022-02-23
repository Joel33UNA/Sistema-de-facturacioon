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
import sistemadefacturacion.logic.Factura;

public class FacturaTableModel extends AbstractTableModel implements TableModel {
    public String[] atributos = {"N. de Factura", "Cliente", "Fecha"};
    public ArrayList<Factura> facturas;
    
    public FacturaTableModel(ArrayList<Factura> facturas){
        this.facturas = facturas;
    }
    
    @Override
    public int getRowCount() {
        return this.facturas.size();
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
        Factura factura = facturas.get(rowIndex);
        switch(columnIndex){
            case 0: { return factura.getNumero(); }
            case 1: { return factura.getCliente().getNombre();}
            case 2: { return factura.getFecha();}
            default: return null;
        }
    }
}