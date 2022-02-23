
/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.table;
import java.text.DecimalFormat;
import sistemadefacturacion.logic.Producto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


public class ProductoTableModel extends AbstractTableModel implements TableModel {
    private String[] atributos ={"Código", "Nombre", "Precio", "Impuesto(%)" };
    private ArrayList<Producto> productos;
    

    public ProductoTableModel(ArrayList<Producto> productos) {
        this.productos = productos;      
    }
    
    @Override
    public int getRowCount() {
        return this.productos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
     public String getColumnName(int columnIndex){
         return atributos[columnIndex];
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = productos.get(rowIndex);
        DecimalFormat df = new DecimalFormat("####");
        switch(columnIndex){
            case 0: { return producto.getCodigo();}
            case 1: { return producto.getNombre(); }
            case 2: { return df.format(producto.getPrecio()); }
            case 3: { return producto.getImpuesto(); }
            default: return 0;
        }
    }
}