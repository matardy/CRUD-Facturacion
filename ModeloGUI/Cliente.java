package ModeloGUI;

import EncapsulationObjects.CiudadEncapsulation;
import EncapsulationObjects.ClienteEncapsulation;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author DETPC
 */
public class Cliente extends javax.swing.JFrame {
    DBMethods methods = new DBMethods();
    DefaultTableModel tabla;


    /**
     * Creates new form Ventana1
     */
    public Cliente() {
        initComponents();

        tabla = (DefaultTableModel) tblDataCliente.getModel();


        ArrayList<String> IDClienteArray = new ArrayList<>();
        IDClienteArray = methods.getIDCliente();
        cmbIDCliente.setModel(new javax.swing.DefaultComboBoxModel(IDClienteArray.toArray(new String[0])));

        ArrayList<String> IDCiudadArray = new ArrayList<>();
        IDCiudadArray = methods.getIDCiudad();
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel(IDCiudadArray.toArray(new String[0])));

        cmbIDCliente.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnUpdate.setEnabled(false);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtApellidoCliente = new javax.swing.JTextField();
        btnVerDatos = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        chkHabilitarEdicion = new javax.swing.JCheckBox();
        btnInsertar = new javax.swing.JButton();
        cmbIDCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDatosCliente = new javax.swing.JTextArea();
        txtSalario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblNombreCiudad = new javax.swing.JLabel();
        lblEstadoCiudad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataCliente = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmiCerrarVentana1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });

        btnVerDatos.setText("Ver Datos");
        btnVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        chkHabilitarEdicion.setText("Habilitar Actualizar y Eliminar");
        chkHabilitarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHabilitarEdicionActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        cmbIDCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Cliente");
        jLabel1.setToolTipText("ID Ciudad");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        txtAreaDatosCliente.setColumns(20);
        txtAreaDatosCliente.setRows(5);
        jScrollPane1.setViewportView(txtAreaDatosCliente);

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Salario");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudad"));

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo ciudad");

        lblNombreCiudad.setText("nombre ciudad");

        lblEstadoCiudad.setText("estado ciudad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(lblNombreCiudad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEstadoCiudad))
                                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNombreCiudad)
                                        .addComponent(lblEstadoCiudad))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDataCliente.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Cod Cliente", "Cod Ciudad", "Nombre ", "Apellido", "Correo", "Salario"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDataCliente);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jmiCerrarVentana1.setText("Cerrar ventana 1");
        jmiCerrarVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarVentana1ActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCerrarVentana1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(btnInsertar)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(btnUpdate)
                                                                        .addGap(12, 12, 12)
                                                                        .addComponent(btnEliminar))
                                                                .addComponent(chkHabilitarEdicion)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(14, 14, 14)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel5))
                                                        .addGap(38, 38, 38)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cmbIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtNombreCliente)
                                                                        .addComponent(txtApellidoCliente)
                                                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnVerDatos)
                                                .addGap(447, 447, 447))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(168, 168, 168))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cmbIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                        .addComponent(btnVerDatos, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnInsertar)
                                                        .addComponent(btnUpdate)
                                                        .addComponent(btnEliminar))
                                                .addGap(18, 18, 18)
                                                .addComponent(chkHabilitarEdicion)
                                                .addGap(111, 111, 111))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(17, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>

    private void jmiCerrarVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarVentana1ActionPerformed
        // TODO add your handling code here:
        MenuFactura obj= new MenuFactura();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiCerrarVentana1ActionPerformed


    private void txtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {
        txtAreaDatosCliente.setText("");
        ArrayList<ClienteEncapsulation> clienteView = new ArrayList<>();
        clienteView = methods.clienteView();
        String viewOfCliente = "";
        for(ClienteEncapsulation i: clienteView){
            viewOfCliente = "[ " + i.id + " " + i.codCiudad + " " + i.nombreCliente + " " + i.apellidoCliente + " " + i.correoCliente + " " + i.salario + " ]" + "\n";
            txtAreaDatosCliente.append(viewOfCliente);
            String[] row = {i.id, i.codCiudad, i.nombreCliente, i.apellidoCliente, i.correoCliente, i.salario};
            tabla.addRow(row);
        }

    }

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void chkHabilitarEdicionActionPerformed(java.awt.event.ActionEvent evt) {
        if(chkHabilitarEdicion.isSelected()){
            cmbIDCliente.setEnabled(true);
            btnEliminar.setEnabled(false);
            btnUpdate.setEnabled(true);
        }else{
            cmbIDCliente.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnUpdate.setEnabled(false);
        }
    }

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {
        methods.setCliente((String) cmbCiudad.getSelectedItem(), txtNombreCliente.getText(), txtApellidoCliente.getText(), txtCorreo.getText(), txtSalario.getText());
        // Para que se actualicen los comboBox
        ArrayList<String> IDClienteArray = new ArrayList<>();
        IDClienteArray = methods.getIDCliente();
        cmbIDCliente.setModel(new javax.swing.DefaultComboBoxModel(IDClienteArray.toArray(new String[0])));

        // Para que la vista se modifique
        txtAreaDatosCliente.setText("");
        ArrayList<ClienteEncapsulation> clienteView = new ArrayList<>();
        clienteView = methods.clienteView();
        String viewOfCliente = "";
        for(ClienteEncapsulation i: clienteView){
            viewOfCliente = "[ " + i.id + " " + i.codCiudad + " " + i.nombreCliente + " " + i.apellidoCliente + " " + i.correoCliente + " " + i.salario + " ]" + "\n";
            txtAreaDatosCliente.append(viewOfCliente);
        }
    }

    private void cmbIDClienteActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<ClienteEncapsulation> data = new ArrayList<>();
        data = methods.searchRowCliente(Integer.parseInt((String) cmbIDCliente.getSelectedItem()));
        txtNombreCliente.setText(data.get(0).nombreCliente);
        txtApellidoCliente.setText(data.get(0).apellidoCliente);
        txtCorreo.setText(data.get(0).correoCliente);
        txtSalario.setText(data.get(0).salario);
        cmbCiudad.setSelectedItem(data.get(0).codCiudad);
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        methods.updateCliente(Integer.parseInt((String)cmbIDCliente.getSelectedItem()), (String) cmbCiudad.getSelectedItem(), txtNombreCliente.getText(), txtApellidoCliente.getText(), txtCorreo.getText(), txtSalario.getText());
        // Para que se actualicen los comboBox
        ArrayList<String> IDClienteArray = new ArrayList<>();
        IDClienteArray = methods.getIDCliente();
        cmbIDCliente.setModel(new javax.swing.DefaultComboBoxModel(IDClienteArray.toArray(new String[0])));

        // Para que la vista se modifique
        txtAreaDatosCliente.setText("");
        ArrayList<ClienteEncapsulation> clienteView = new ArrayList<>();
        clienteView = methods.clienteView();
        String viewOfCliente = "";
        for(ClienteEncapsulation i: clienteView){
            viewOfCliente = "[ " + i.id + " " + i.codCiudad + " " + i.nombreCliente + " " + i.apellidoCliente + " " + i.correoCliente + " " + i.salario + " ]" + "\n";
            txtAreaDatosCliente.append(viewOfCliente);
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        methods.deleteCliente(Integer.parseInt((String) cmbIDCliente.getSelectedItem()));
        // Para que se actualicen los comboBox
        ArrayList<String> IDClienteArray = new ArrayList<>();
        IDClienteArray = methods.getIDCliente();
        cmbIDCliente.setModel(new javax.swing.DefaultComboBoxModel(IDClienteArray.toArray(new String[0])));

        // Para que la vista se modifique
        txtAreaDatosCliente.setText("");
        ArrayList<ClienteEncapsulation> clienteView = new ArrayList<>();
        clienteView = methods.clienteView();
        String viewOfCliente = "";
        for(ClienteEncapsulation i: clienteView){
            viewOfCliente = "[ " + i.id + " " + i.codCiudad + " " + i.nombreCliente + " " + i.apellidoCliente + " " + i.correoCliente + " " + i.salario + " ]" + "\n";
            txtAreaDatosCliente.append(viewOfCliente);
        }
    }

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<CiudadEncapsulation> data = new ArrayList<>();
        data = methods.searchRowCiudad(Integer.parseInt((String) cmbCiudad.getSelectedItem()));
        lblNombreCiudad.setText(data.get(0).nombreCiudad);
        lblEstadoCiudad.setText(data.get(0).estado);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JCheckBox chkHabilitarEdicion;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbIDCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmiCerrarVentana1;
    private javax.swing.JLabel lblEstadoCiudad;
    private javax.swing.JLabel lblNombreCiudad;
    private javax.swing.JTable tblDataCliente;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextArea txtAreaDatosCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration
}
