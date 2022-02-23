/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.factura;
import java.io.IOException;
import javax.swing.JTable;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.logic.Factura;
import sistemadefacturacion.logic.Producto;
import sistemadefacturacion.presentation.table.ClienteTableModel;
import sistemadefacturacion.presentation.table.FacturaTableModel;
import sistemadefacturacion.presentation.table.ProductoTableModel;
import sistemadefacturacion.presentation.table.LineaTableModel;

public class Interfaz extends javax.swing.JFrame implements Observer{
    public Interfaz() {
        this.control = null;
        this.model = null;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoFactura = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFacturas = new javax.swing.JTable();
        jLabelBusqueda = new javax.swing.JLabel();
        jLabelNombreBusqueda = new javax.swing.JLabel();
        jTextFieldBusquedaFactura = new javax.swing.JTextField();
        jButtonBusquedaFactura = new javax.swing.JButton();
        jButtonGenerarPDF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientesRegistro = new javax.swing.JTable();
        jLabelNombreBusquedaRegistro = new javax.swing.JLabel();
        jButtonBusquedaCliente = new javax.swing.JButton();
        jButtonGenerarXML = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jButtonAgregarFactura = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVentaProductos = new javax.swing.JTable();
        jLabelNombreBusquedaRegistro1 = new javax.swing.JLabel();
        jTextFieldBusquedaCliente = new javax.swing.JTextField();
        jTextFieldBusquedaProducto = new javax.swing.JTextField();
        jButtonBusquedaProducto = new javax.swing.JButton();
        jComboBoxCantidad = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCarrito = new javax.swing.JTable();
        jLabelCarrito = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jButtonAgregarProducto = new javax.swing.JButton();

        setTitle("Facturación");
        setResizable(false);

        infoFactura.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        infoFactura.setForeground(new java.awt.Color(0, 0, 255));
        infoFactura.setText("Registrar factura.");

        jTableFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFacturas);

        jLabelBusqueda.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelBusqueda.setForeground(new java.awt.Color(0, 0, 255));
        jLabelBusqueda.setText("Búsqueda de factura.");

        jLabelNombreBusqueda.setText("Nombre del cliente:");

        jButtonBusquedaFactura.setText("Buscar");
        jButtonBusquedaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBusquedaFacturaMouseClicked(evt);
            }
        });

        jButtonGenerarPDF.setText("Generar PDF");
        jButtonGenerarPDF.setEnabled(false);
        jButtonGenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerarPDFMouseClicked(evt);
            }
        });

        jTableClientesRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientesRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesRegistroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClientesRegistro);

        jLabelNombreBusquedaRegistro.setText("Nombre del cliente:");

        jButtonBusquedaCliente.setText("Buscar");
        jButtonBusquedaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBusquedaClienteMouseClicked(evt);
            }
        });

        jButtonGenerarXML.setText("Generar XML");
        jButtonGenerarXML.setEnabled(false);
        jButtonGenerarXML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerarXMLMouseClicked(evt);
            }
        });

        jLabelCliente.setForeground(new java.awt.Color(0, 0, 255));
        jLabelCliente.setText("Seleccione el cliente:");

        jLabelProducto.setForeground(new java.awt.Color(0, 0, 255));
        jLabelProducto.setText("Seleccione el producto:");

        jButtonAgregarFactura.setText("Registrar factura");
        jButtonAgregarFactura.setEnabled(false);
        jButtonAgregarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarFacturaMouseClicked(evt);
            }
        });

        jTableVentaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVentaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentaProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableVentaProductos);

        jLabelNombreBusquedaRegistro1.setText("Nombre del producto:");

        jButtonBusquedaProducto.setText("Buscar");
        jButtonBusquedaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBusquedaProductoMouseClicked(evt);
            }
        });

        jComboBoxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxCantidad.setEnabled(false);

        jTableCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableCarrito);

        jLabelCarrito.setForeground(new java.awt.Color(0, 0, 255));
        jLabelCarrito.setText("Carrito de compras:");

        jLabelCantidad.setText("Cantidad:");

        jButtonAgregarProducto.setText("Agregar al carrito de compras");
        jButtonAgregarProducto.setEnabled(false);
        jButtonAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNombreBusquedaRegistro)
                            .addGap(26, 26, 26)
                            .addComponent(jTextFieldBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonBusquedaCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNombreBusquedaRegistro1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonBusquedaProducto))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4)
                        .addComponent(jButtonAgregarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelCantidad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBoxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jButtonAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabelCarrito)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProducto)
                            .addComponent(jLabelCliente)))
                    .addComponent(infoFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonGenerarXML, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelNombreBusqueda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldBusquedaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonBusquedaFactura)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBusqueda)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(infoFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBusqueda)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreBusquedaRegistro)
                    .addComponent(jButtonBusquedaCliente)
                    .addComponent(jLabelNombreBusqueda)
                    .addComponent(jTextFieldBusquedaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusquedaFactura)
                    .addComponent(jTextFieldBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreBusquedaRegistro1)
                            .addComponent(jTextFieldBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBusquedaProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCantidad)
                            .addComponent(jButtonAgregarProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabelCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarFactura)
                    .addComponent(jButtonGenerarPDF)
                    .addComponent(jButtonGenerarXML))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBusquedaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaFacturaMouseClicked
        // Búsqueda de la factura en específico
        Factura nuevo = new Factura(this.jTextFieldBusquedaFactura.getText());
        this.control.busquedaFactura(nuevo);
    }//GEN-LAST:event_jButtonBusquedaFacturaMouseClicked

    private void jButtonBusquedaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaClienteMouseClicked
        // Búsqueda del cliente en específico
        Cliente nuevo = new Cliente(this.jTextFieldBusquedaCliente.getText());
        this.control.busquedaCliente(nuevo);
    }//GEN-LAST:event_jButtonBusquedaClienteMouseClicked

    private void jButtonBusquedaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaProductoMouseClicked
        // Búsqueda del producto en específico
        Producto nuevo = new Producto(this.jTextFieldBusquedaProducto.getText());
        this.control.busquedaProducto(nuevo);
    }//GEN-LAST:event_jButtonBusquedaProductoMouseClicked

    private void jButtonAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarProductoMouseClicked
        Producto p = this.model.getListP().get(this.jTableVentaProductos.getSelectedRow());
        control.agregarProducto(p, this.jComboBoxCantidad.getSelectedIndex());
    }//GEN-LAST:event_jButtonAgregarProductoMouseClicked

    private void jTableVentaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentaProductosMouseClicked
        this.jButtonAgregarProducto.setEnabled(true); //Habilita el botón de agregar producto al carrito.
        this.jComboBoxCantidad.setEnabled(true);
    }//GEN-LAST:event_jTableVentaProductosMouseClicked

    private void jButtonAgregarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarFacturaMouseClicked
        try{
            if (jTableCarrito.getRowCount() == 0)
                throw new Exception();
            Cliente c = model.getListC().get(this.jTableClientesRegistro.getSelectedRow());
            c.addFactura(model.getCurrent());
            model.getCurrent().setCliente(c);
            model.getCurrent().setEmpresa(sistemadefacturacion.logic.Service.instancia().getEmpresa());
            control.agregarFactura(model.getCurrent());
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente o añadir mínimo un producto.");
        }
    }//GEN-LAST:event_jButtonAgregarFacturaMouseClicked

    private void jTableClientesRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesRegistroMouseClicked
        this.jButtonAgregarFactura.setEnabled(true); // Habilita el botón de agregar factura al sistema.
    }//GEN-LAST:event_jTableClientesRegistroMouseClicked

    private void jTableFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFacturasMouseClicked
        this.jButtonGenerarXML.setEnabled(true);
        this.jButtonGenerarPDF.setEnabled(true);
    }//GEN-LAST:event_jTableFacturasMouseClicked

    private void jButtonGenerarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarPDFMouseClicked
        try {
            Factura f = this.model.getListF().get(this.jTableFacturas.getSelectedRow());
            this.control.crearPDF(f);
            javax.swing.JOptionPane.showMessageDialog(null, "¡PDF generado!");
        } 
        catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "No seleccionó ninguna factura, reintente.");
        }
    }//GEN-LAST:event_jButtonGenerarPDFMouseClicked

    private void jButtonGenerarXMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarXMLMouseClicked
        try {
            Factura f = this.model.getListF().get(this.jTableFacturas.getSelectedRow());
            this.control.crearXML(f);
            javax.swing.JOptionPane.showMessageDialog(null, "¡XML generado!");
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonGenerarXMLMouseClicked

    public void setControl(Control control){
        this.control = control;
    }
    
    public JTable getTablaFacturas() {
        return jTableFacturas;
    }
    
    public JTable getTablaClientesRegistro(){
        return jTableClientesRegistro;
    }
    
    public JTable getTablaVentaProductos(){
        return jTableVentaProductos;
    }
    
    public JTable getTablaCarrito(){
        return jTableCarrito;
    }
    
    public void bloquearItems(){
        this.jComboBoxCantidad.setEnabled(false);
        this.jButtonAgregarFactura.setEnabled(false);
        this.jButtonAgregarProducto.setEnabled(false);
    }
    
    public void setModel(Model model){
        this.model = model;
        model.addObserver(this);
    }
    
    Control control;
    Model model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoFactura;
    private javax.swing.JButton jButtonAgregarFactura;
    private javax.swing.JButton jButtonAgregarProducto;
    private javax.swing.JButton jButtonBusquedaCliente;
    private javax.swing.JButton jButtonBusquedaFactura;
    private javax.swing.JButton jButtonBusquedaProducto;
    private javax.swing.JButton jButtonGenerarPDF;
    private javax.swing.JButton jButtonGenerarXML;
    private javax.swing.JComboBox<String> jComboBoxCantidad;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCarrito;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelNombreBusqueda;
    private javax.swing.JLabel jLabelNombreBusquedaRegistro;
    private javax.swing.JLabel jLabelNombreBusquedaRegistro1;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCarrito;
    private javax.swing.JTable jTableClientesRegistro;
    private javax.swing.JTable jTableFacturas;
    private javax.swing.JTable jTableVentaProductos;
    private javax.swing.JTextField jTextFieldBusquedaCliente;
    private javax.swing.JTextField jTextFieldBusquedaFactura;
    private javax.swing.JTextField jTextFieldBusquedaProducto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.jTableClientesRegistro.setModel(new ClienteTableModel(this.model.getListC()));
        this.jTableFacturas.setModel(new FacturaTableModel(this.model.getListF()));
        this.jTableVentaProductos.setModel(new ProductoTableModel(this.model.getListP()));
        this.jTableCarrito.setModel(new LineaTableModel(this.model.getCurrent().getLineas()));
    }
}
