/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.principal;
import java.util.Observable;

public class Interfaz extends javax.swing.JFrame implements java.util.Observer {
    public Interfaz() {
        control = null;
        model = null;
        initComponents();
        //this.setLocationRelativeTo(null);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jButtonFacturas = new javax.swing.JButton();
        jButtonProducto = new javax.swing.JButton();
        jButtonEmpresa = new javax.swing.JButton();
        jLabelEmpresa = new javax.swing.JLabel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelProductos = new javax.swing.JLabel();
        jLabelFacturas = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");

        jLabelTitulo.setBackground(new java.awt.Color(204, 255, 102));
        jLabelTitulo.setFont(new java.awt.Font("Bell MT", 0, 48)); // NOI18N
        jLabelTitulo.setText("         Sistema de facturación de productos");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setOpaque(true);

        jButtonClientes.setBackground(new java.awt.Color(255, 255, 153));
        jButtonClientes.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadefacturacion/presentation/principal/clien.PNG"))); // NOI18N
        jButtonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClientesMouseClicked(evt);
            }
        });

        jButtonFacturas.setBackground(new java.awt.Color(0, 204, 204));
        jButtonFacturas.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadefacturacion/presentation/principal/fact.PNG"))); // NOI18N
        jButtonFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFacturasMouseClicked(evt);
            }
        });

        jButtonProducto.setBackground(new java.awt.Color(240, 240, 153));
        jButtonProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadefacturacion/presentation/principal/produc.PNG"))); // NOI18N
        jButtonProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProductoMouseClicked(evt);
            }
        });

        jButtonEmpresa.setBackground(new java.awt.Color(0, 204, 204));
        jButtonEmpresa.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jButtonEmpresa.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadefacturacion/presentation/principal/empres.PNG"))); // NOI18N
        jButtonEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEmpresaMouseClicked(evt);
            }
        });

        jLabelEmpresa.setBackground(new java.awt.Color(204, 255, 0));
        jLabelEmpresa.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelEmpresa.setText("Empresa");
        jLabelEmpresa.setOpaque(true);

        jLabelClientes.setBackground(new java.awt.Color(204, 255, 0));
        jLabelClientes.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelClientes.setText("Clientes");
        jLabelClientes.setOpaque(true);

        jLabelProductos.setBackground(new java.awt.Color(204, 255, 0));
        jLabelProductos.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelProductos.setText("Productos");
        jLabelProductos.setToolTipText("");
        jLabelProductos.setOpaque(true);

        jLabelFacturas.setBackground(new java.awt.Color(204, 255, 0));
        jLabelFacturas.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelFacturas.setText("Facturas");
        jLabelFacturas.setOpaque(true);

        jButtonSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(204, 255, 102));
        jButtonSalvar.setText("GUARDAR");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jLabelProductos)
                    .addComponent(jLabelEmpresa)
                    .addComponent(jButtonEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientes)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelFacturas))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmpresa)
                    .addComponent(jLabelClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jButtonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductos)
                    .addComponent(jLabelFacturas))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEmpresaMouseClicked
        control.empresaShow();
    }//GEN-LAST:event_jButtonEmpresaMouseClicked

    private void jButtonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClientesMouseClicked
        control.clienteShow();
    }//GEN-LAST:event_jButtonClientesMouseClicked

    private void jButtonProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProductoMouseClicked
        control.productoShow();
    }//GEN-LAST:event_jButtonProductoMouseClicked

    private void jButtonFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFacturasMouseClicked
        control.facturaShow();
    }//GEN-LAST:event_jButtonFacturasMouseClicked

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
        control.store();
        javax.swing.JOptionPane.showMessageDialog(null, "¡Operación realizada correctamente!.");
    }//GEN-LAST:event_jButtonSalvarMouseClicked
    
    public Control getControl(){
        return control;
    }
    
    public Model getModel(){
        return model;
    }
    
    public void setControl(Control control){
        this.control = control;
    }
    
    public void setModel(Model model){
        this.model = model;
        model.addObserver(this);
    }
    
    private Control control;
    private Model model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonEmpresa;
    private javax.swing.JButton jButtonFacturas;
    private javax.swing.JButton jButtonProducto;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void update(Observable o, Object arg) {
    }
}