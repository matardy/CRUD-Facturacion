/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn_fact;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Adhisson Cedeño
 */
public class RegistroProducto extends javax.swing.JPanel {
    
    DBMethods methods = new DBMethods();
    
    /**
     * Creates new form Principal
     */
    public RegistroProducto() {
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
        nombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        descuento = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        unidades = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Ingreso de un Producto");
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
        jLabel1.setText("Registro");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setText("Ingrese el nombre");
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Descuento");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        descuento.setForeground(new java.awt.Color(102, 102, 102));
        descuento.setText("Ingrese el descuento en porcentaje");
        descuento.setBorder(null);
        descuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descuentoMousePressed(evt);
            }
        });
        add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Cantidad de Unidades");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        unidades.setForeground(new java.awt.Color(102, 102, 102));
        unidades.setText("Ingrese la cantidad de unidades existen");
        unidades.setBorder(null);
        unidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unidadesMousePressed(evt);
            }
        });
        add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Precio");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        precio.setForeground(new java.awt.Color(102, 102, 102));
        precio.setText("Ingrese el precio del producto");
        precio.setBorder(null);
        precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioMousePressed(evt);
            }
        });
        add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Tipo");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        tipo.setForeground(new java.awt.Color(102, 102, 102));
        tipo.setText("Ingrese el tipo del producto");
        tipo.setBorder(null);
        tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tipoMousePressed(evt);
            }
        });
        add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
        setLabels();
        if (nombre.getText().equals("Ingrese el nombre")) {
            nombre.setText("");
        }
    }//GEN-LAST:event_nombreMousePressed

    private void descuentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMousePressed
        setLabels();
        if (descuento.getText().equals("Ingrese el descuento en porcentaje")) {
            descuento.setText("");
        }
    }//GEN-LAST:event_descuentoMousePressed

    private void unidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unidadesMousePressed
        setLabels();
        if (unidades.getText().equals("Ingrese la cantidad de unidades existen")) {
            unidades.setText("");
        }
    }//GEN-LAST:event_unidadesMousePressed

    private void precioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioMousePressed
        setLabels();
        if (precio.getText().equals("Ingrese el precio del producto")) {
            precio.setText("");
        }
    }//GEN-LAST:event_precioMousePressed

    private void tipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoMousePressed
        setLabels();
        if (tipo.getText().equals("Ingrese el tipo del producto")) {
            tipo.setText("");
        }
    }//GEN-LAST:event_tipoMousePressed

    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed

        try {
            if (nombre.getText().equals("Ingrese el nombre") 
                    || descuento.getText().equals("Ingrese la provincia")
                    || unidades.getText().equals("Ingrese la cantidad de unidades existen") 
                    || precio.getText().equals("Ingrese el precio del producto")
                    || tipo.getText().equals("Ingrese el tipo del producto")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                nombre.requestFocus();
            } else {
                String uname = nombre.getText();
                String udesc = descuento.getText();
                String uUni = unidades.getText();
                String uprecio = precio.getText();
                String utipo = tipo.getText();
                
                if (uname == null || "".equals(uname)
                        || udesc == null || "".equals(udesc)
                        || uUni == null || "".equals(uUni)
                        || uprecio == null || "".equals(uprecio)
                        || utipo == null || "".equals(utipo)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    nombre.requestFocus();
                } else {
                    methods.setProducto(uname, udesc, uUni, uprecio,utipo);
                    nombre.setText("");
                    descuento.setText("");
                    unidades.setText("");
                    precio.setText("");
                    tipo.setText("");
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Producto ingresado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buttonMousePressed

    private void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    private void setLabels(){
        if (nombre.getText().equals("") || nombre.getText() == null || nombre.getText().equals(" ")) {
            nombre.setText("Ingrese el nombre");
        }
        if (unidades.getText().equals("") || unidades.getText() == null || unidades.getText().equals(" ")) {
            unidades.setText("Ingrese la cantidad de unidades existen");
        }
        if (descuento.getText().equals("") || descuento.getText() == null || descuento.getText().equals(" ")) {
            descuento.setText("Ingrese el descuento en porcentaje");
        }
        if (precio.getText().equals("") || precio.getText() == null || precio.getText().equals(" ")) {
            precio.setText("Ingrese el precio del producto");
        }
        if (tipo.getText().equals("") || tipo.getText() == null || tipo.getText().equals(" ")){
            tipo.setText("Ingrese el tipo del producto");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField descuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField unidades;
    // End of variables declaration//GEN-END:variables
}