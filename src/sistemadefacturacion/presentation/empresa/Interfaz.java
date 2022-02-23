/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.empresa;

import java.util.ArrayList;
import sistemadefacturacion.logic.Empresa;
import java.util.Observable;
import sistemadefacturacion.logic.Cliente;
import sistemadefacturacion.logic.Factura;
import sistemadefacturacion.logic.Producto;
import sistemadefacturacion.presentation.empresa.Control;

public class Interfaz extends javax.swing.JFrame implements java.util.Observer {
    public Interfaz() {
        this.control = null;
        this.model = null;
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabelClientes = new javax.swing.JLabel();
        jTextFieldClientes = new javax.swing.JTextField();
        jLabelProductos = new javax.swing.JLabel();
        jTextFieldProductos = new javax.swing.JTextField();
        jLabelFacturas = new javax.swing.JLabel();
        jTextFieldFacturas = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Empresa");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTitulo.setText("Datos de la empresa.");

        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.setEnabled(false);

        jLabelCedula.setText("Ced. Jurídica:");

        jTextFieldCedula.setText("Cédula");
        jTextFieldCedula.setEnabled(false);

        jLabelClientes.setText("Clientes registrados:");

        jTextFieldClientes.setText("0");
        jTextFieldClientes.setEnabled(false);

        jLabelProductos.setText("Productos registrados:");

        jTextFieldProductos.setText("0");
        jTextFieldProductos.setEnabled(false);

        jLabelFacturas.setText("Facturas registradas:");

        jTextFieldFacturas.setText("0");
        jTextFieldFacturas.setEnabled(false);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setEnabled(false);
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNombre)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelCedula)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitulo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCedula))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFacturas)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelProductos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCedula)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClientes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFacturas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonEditar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        this.jTextFieldCedula.setEnabled(true);
        this.jTextFieldNombre.setEnabled(true);
        this.jButtonGuardar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarMouseClicked

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked

        try{
           if(jTextFieldNombre.getText().isEmpty() || jTextFieldCedula.getText().isEmpty())
               throw new Exception();
        }
       catch(Exception e){
           javax.swing.JOptionPane.showMessageDialog(null, "Espacios en blanco, reintente.");
           return;
       }
        control.setEmpresa(jTextFieldNombre.getText(), jTextFieldCedula.getText());
        this.jTextFieldCedula.setEnabled(false);
        this.jTextFieldNombre.setEnabled(false);
        this.jButtonGuardar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    @Override
    public void update(Observable o, Object arg) {
        Empresa e = model.getCurrent();
        ArrayList<Producto> p = model.getListP();
        ArrayList<Cliente> c = model.getListC();
        ArrayList<Factura> f = model.getListF();
        this.jTextFieldCedula.setText(e.getCedulaJuridica());
        this.jTextFieldNombre.setText(e.getNombre());
        this.jTextFieldProductos.setText(String.valueOf(p.size()));
        this.jTextFieldClientes.setText(String.valueOf(c.size()));
        this.jTextFieldFacturas.setText(String.valueOf(f.size()));
    }
    
    public void setjTextFieldNombre(String jTextFieldEditar){
        this.jTextFieldNombre.setText(jTextFieldEditar);
    }
    
    public void setjTextFieldCedula(String jTextFieldCedula){
        this.jTextFieldCedula.setText(jTextFieldCedula);
    }
    
    public void setjTextFieldFacturas(String jTextFieldFacturas){
        this.jTextFieldFacturas.setText(jTextFieldFacturas);
    }
    
    public void setjTextFieldClientes(String jTextFieldClientes){
        this.jTextFieldClientes.setText(jTextFieldClientes);
    }
    
    public void setjTextFieldProductos(String jTextFieldProductos){
        this.jTextFieldProductos.setText(jTextFieldProductos);
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
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldClientes;
    private javax.swing.JTextField jTextFieldFacturas;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldProductos;
    // End of variables declaration//GEN-END:variables
}
