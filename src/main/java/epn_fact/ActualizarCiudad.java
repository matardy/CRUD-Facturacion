/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn_fact;

import EncapsulationObjects.CiudadEncapsulation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Adhisson Cedeño
 */
public class ActualizarCiudad extends javax.swing.JPanel {
    
    DBMethods methods = new DBMethods();
    
    /**
     * Creates new form Principal
     */
    public ActualizarCiudad() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        habitantes = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Actualizar Ciudad");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Ingrese el nombre");
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Provincia o Estado");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        provincia.setForeground(new java.awt.Color(102, 102, 102));
        provincia.setText("Ingrese la provincia");
        provincia.setBorder(null);
        provincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                provinciaMousePressed(evt);
            }
        });
        add(provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Cantidad de Habitantes");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        habitantes.setForeground(new java.awt.Color(102, 102, 102));
        habitantes.setText("Ingrese la cantidad de habitantes");
        habitantes.setBorder(null);
        habitantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                habitantesMousePressed(evt);
            }
        });
        add(habitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Código de la Ciudad");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        codigo.setForeground(new java.awt.Color(102, 102, 102));
        codigo.setText("Ingrese el código de la ciudad");
        codigo.setBorder(null);
        codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigoMousePressed(evt);
            }
        });
        add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
        setLabels();
        if (name.getText().equals("Ingrese el nombre")) {
            name.setText("");
        }
    }//GEN-LAST:event_nameMousePressed

    private void provinciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinciaMousePressed
        setLabels();
        if (provincia.getText().equals("Ingrese la provincia")) {
            provincia.setText("");
        }
    }//GEN-LAST:event_provinciaMousePressed

    private void habitantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habitantesMousePressed
        setLabels();
        if (habitantes.getText().equals("Ingrese la cantidad de habitantes")) {
            habitantes.setText("");
        }
    }//GEN-LAST:event_habitantesMousePressed

    private void codigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMousePressed
        setLabels();
        if (codigo.getText().equals("Ingrese el código de la ciudad")) {
            codigo.setText("");
        }
        ArrayList<CiudadEncapsulation> data = new ArrayList<>();
        data = methods.searchRowCiudad(Integer.parseInt(codigo.getText()));
        name.setText(data.get(0).nombreCiudad);
        provincia.setText(data.get(0).estado);
        habitantes.setText(data.get(0).numeroHabitantes);
    }//GEN-LAST:event_codigoMousePressed

    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed

        try {
            if (name.getText().equals("Ingrese el nombre") || provincia.getText().equals("Ingrese la provincia")
                    || habitantes.getText().equals("Ingrese la cantidad de habitantes") || codigo.getText().equals("Ingrese el código de la ciudad")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                name.requestFocus();
            } else {
                String uname = name.getText();
                String uprov = provincia.getText();
                String uhabit = habitantes.getText();
                String ucod = codigo.getText();

                if (uname == null || "".equals(uname) || uprov == null || "".equals(uprov) || uhabit == null || "".equals(uhabit) || ucod == null || "".equals(ucod)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    name.requestFocus();
                } else {
                    methods.updateCiudad(Integer.parseInt(ucod), uname, uprov, uhabit);
                    name.setText("");
                    provincia.setText("");
                    habitantes.setText("");
                    codigo.setText("");
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Ciudad actualizada correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buttonMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    private void setLabels(){
        if (name.getText().equals("") || name.getText() == null || name.getText().equals(" ")) {
            name.setText("Ingrese el nombre");
        }
        if (habitantes.getText().equals("") || habitantes.getText() == null || habitantes.getText().equals(" ")) {
            habitantes.setText("Ingrese la cantidad de habitantes");
        }
        if (provincia.getText().equals("") || provincia.getText() == null || provincia.getText().equals(" ")) {
            provincia.setText("Ingrese la provincia");
        }
        if (codigo.getText().equals("") || codigo.getText() == null || codigo.getText().equals(" ")) {
            codigo.setText("Ingrese el código de la ciudad");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField habitantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField name;
    private javax.swing.JTextField provincia;
    // End of variables declaration//GEN-END:variables
}