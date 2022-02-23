/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.cliente;
import sistemadefacturacion.presentation.cliente.Control;
import java.util.Observable;
import javax.swing.JTable;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.presentation.table.ClienteTableModel;

public class Interfaz extends javax.swing.JFrame implements java.util.Observer {
    public Interfaz() {
        control = null;
        model = null;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelCodigoPro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabelTablaClientes = new javax.swing.JLabel();
        infoCliente = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNombreCli = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButtonAgregaCliente = new javax.swing.JButton();
        jLabelBusqueda = new javax.swing.JLabel();
        jLabelNombreBusqueda = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBusqueda = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabelCodigoPro.setText("Código:");

        setTitle("Clientes");
        setResizable(false);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableClientes);

        jLabelTablaClientes.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelTablaClientes.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTablaClientes.setText("Tabla de clientes registrados.");

        infoCliente.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        infoCliente.setForeground(new java.awt.Color(0, 0, 255));
        infoCliente.setText("Registro del cliente.");

        jLabelID.setText("ID:");

        jLabelNombreCli.setText("Nombre:");

        jLabelTelefono.setText("Teléfono:");

        jLabelCorreo.setText("Correo:");

        jButtonAgregaCliente.setText("Agregar cliente");
        jButtonAgregaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregaClienteMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButtonAgregaCliente)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreCli)
                                    .addComponent(jLabelID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBusqueda)
                                    .addComponent(infoCliente))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombreBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonBusqueda)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldBusqueda))))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTablaClientes)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoCliente)
                    .addComponent(jLabelTablaClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreCli)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreo))
                        .addGap(29, 29, 29)
                        .addComponent(jButtonAgregaCliente)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelBusqueda)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreBusqueda)
                            .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBusqueda)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregaClienteMouseClicked
        try{
            if(jTextFieldID.getText().isEmpty() || jTextFieldNombre.getText().isEmpty() || this.jTextFieldTelefono.getText().isEmpty() || jTextFieldCorreo.getText().isEmpty())
                throw new Exception();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Espacios en blanco, reintente.");
            return ;
        }
        try{
            Cliente c = new Cliente(jTextFieldID.getText(), jTextFieldNombre.getText(), jTextFieldTelefono.getText(), jTextFieldCorreo.getText());
            if(!control.agregar(c))
                throw new Exception();
            jTextFieldNombre.setText(null); jTextFieldID.setText(null);
            jTextFieldTelefono.setText(null); jTextFieldCorreo.setText(null);
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "El cliente ya se encuentra registrado.");
        }
    }//GEN-LAST:event_jButtonAgregaClienteMouseClicked

    private void jButtonBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaMouseClicked
        Cliente c = new Cliente(jTextFieldBusqueda.getText());
        this.control.busqueda(c);
    }//GEN-LAST:event_jButtonBusquedaMouseClicked

    @Override
    public void update(Observable o, Object arg) {
        this.jTableClientes.setModel(new ClienteTableModel(model.getList()));
    }
    
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
    
     public JTable getTablaClientes(){
        return jTableClientes;
    }

    Control control;
    Model model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoCliente;
    private javax.swing.JButton jButtonAgregaCliente;
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelCodigoPro;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombreBusqueda;
    private javax.swing.JLabel jLabelNombreCli;
    private javax.swing.JLabel jLabelTablaClientes;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
