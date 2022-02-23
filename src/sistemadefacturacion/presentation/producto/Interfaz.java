/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.producto;

import java.util.Observable;
import javax.swing.JTable;
import sistemadefacturacion.logic.Producto;
import sistemadefacturacion.presentation.table.ProductoTableModel;

public class Interfaz extends javax.swing.JFrame implements java.util.Observer {
    public Interfaz() {
        control = null;
        model = null;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabelCodigoPro = new javax.swing.JLabel();
        jLabelNombrePro = new javax.swing.JLabel();
        jLabelPrecioProd = new javax.swing.JLabel();
        jLabelImpuestoPro = new javax.swing.JLabel();
        jLabelPorcen = new javax.swing.JLabel();
        jTextFieldCodigoPro = new javax.swing.JTextField();
        infoProduc = new javax.swing.JLabel();
        jLabelTablaProd = new javax.swing.JLabel();
        jTextFieldNombrePro = new javax.swing.JTextField();
        jTextFieldPrecioProd = new javax.swing.JTextField();
        jTextFieldImpuesProd = new javax.swing.JTextField();
        jButtonAgregaProd = new javax.swing.JButton();
        jLabelBusqueda = new javax.swing.JLabel();
        jLabelNombreBusqueda = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBusqueda = new javax.swing.JButton();

        setTitle("Productos");
        setResizable(false);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio", "Impuesto(%)"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        jLabelCodigoPro.setText("Código:");

        jLabelNombrePro.setText("Nombre:");

        jLabelPrecioProd.setText("Precio:");

        jLabelImpuestoPro.setText("Impuesto:");

        jLabelPorcen.setText("%");

        infoProduc.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        infoProduc.setForeground(new java.awt.Color(0, 0, 255));
        infoProduc.setText("Registro del producto.");

        jLabelTablaProd.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelTablaProd.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTablaProd.setText("Tabla de productos registrados.");

        jButtonAgregaProd.setText("Agregar producto");
        jButtonAgregaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregaProdActionPerformed(evt);
            }
        });

        jLabelBusqueda.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelBusqueda.setForeground(new java.awt.Color(0, 0, 255));
        jLabelBusqueda.setText("Búsqueda por filtro.");

        jLabelNombreBusqueda.setText("Nombre:");

        jButtonBusqueda.setText("Buscar");
        jButtonBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBusquedaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelImpuestoPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAgregaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldImpuesProd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPorcen))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelNombrePro)
                                            .addGap(14, 14, 14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabelCodigoPro)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelPrecioProd)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCodigoPro)
                                    .addComponent(jTextFieldNombrePro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrecioProd)))
                            .addComponent(jLabelBusqueda)
                            .addComponent(infoProduc))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBusqueda)
                                .addGap(25, 25, 25)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTablaProd)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTablaProd)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoProduc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigoPro)
                            .addComponent(jTextFieldCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombrePro)
                            .addComponent(jTextFieldNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecioProd)
                            .addComponent(jTextFieldPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldImpuesProd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImpuestoPro)
                            .addComponent(jLabelPorcen))
                        .addGap(28, 28, 28)
                        .addComponent(jButtonAgregaProd)
                        .addGap(43, 43, 43)
                        .addComponent(jLabelBusqueda)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreBusqueda)
                            .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBusqueda)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregaProdActionPerformed
        double precio, impuesto;
        try{
            if(jTextFieldCodigoPro.getText().isEmpty() || jTextFieldPrecioProd.getText().isEmpty() || this.jTextFieldPrecioProd.getText().isEmpty() || jTextFieldImpuesProd.getText().isEmpty())
                throw new Exception();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Espacios en blanco, reintente.");
            return;
        }
         try{
             precio = Double.parseDouble(jTextFieldPrecioProd.getText());
             impuesto = Double.parseDouble(jTextFieldImpuesProd.getText());
         }
         catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, "Carácteres inválidos, reintente.");
             jTextFieldPrecioProd.setText(null); jTextFieldImpuesProd.setText(null);
             return;
         }
         try{
             Producto producto = new Producto(jTextFieldCodigoPro.getText(),jTextFieldNombrePro.getText(),precio,impuesto);
             if(!control.agregar(producto))
                 throw new Exception();
             jTextFieldCodigoPro.setText(null); jTextFieldNombrePro.setText(null);
             jTextFieldPrecioProd.setText(null); jTextFieldImpuesProd.setText(null);
         }
         catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, "El producto ya se encuentra registrado.");
             jTextFieldCodigoPro.setText(null); jTextFieldNombrePro.setText(null);
             jTextFieldPrecioProd.setText(null); jTextFieldImpuesProd.setText(null);
         }
    }//GEN-LAST:event_jButtonAgregaProdActionPerformed

    private void jButtonBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaMouseClicked
        Producto p = new Producto(jTextFieldBusqueda.getText());
        this.control.busqueda(p);
    }//GEN-LAST:event_jButtonBusquedaMouseClicked

    public void setControl(Control control){
        this.control = control;
    }
    
    public void setModel(Model model){
        this.model = model;
        this.model.addObserver(this);
    }
    
     @Override
    public void update(Observable o, Object arg) {
       this.jTableProductos.setModel(new ProductoTableModel(model.getList()));
    }
    
     public Control getControl(){
        return control;
    }
    
    public Model getModel(){
        return model;
    }
    
    public JTable getTablaProductos(){
        return jTableProductos;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoProduc;
    private javax.swing.JButton jButtonAgregaProd;
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelCodigoPro;
    private javax.swing.JLabel jLabelImpuestoPro;
    private javax.swing.JLabel jLabelNombreBusqueda;
    private javax.swing.JLabel jLabelNombrePro;
    private javax.swing.JLabel jLabelPorcen;
    private javax.swing.JLabel jLabelPrecioProd;
    private javax.swing.JLabel jLabelTablaProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldCodigoPro;
    private javax.swing.JTextField jTextFieldImpuesProd;
    private javax.swing.JTextField jTextFieldNombrePro;
    private javax.swing.JTextField jTextFieldPrecioProd;
    // End of variables declaration//GEN-END:variables
    private Control control;
    private Model model;

   
}
