/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectarconmysql;

import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author DAM2A-28
 */
public class ventanaVerificar extends javax.swing.JFrame {

    Connection conexion = null;

    /**
     * Creates new form ventanaVerificar
     */
    public ventanaVerificar() {
        initComponents();
        conectarBaseDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Control de acceso");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Usuario");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar1.setText("Aceptar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        btnCambiarContraseña.setText("Cambiar Contraseña");
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevoUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCambiarContraseña))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnAceptar1)
                                .addGap(58, 58, 58)
                                .addComponent(btnCancelar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña)
                            .addComponent(txtUsuario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarContraseña)
                    .addComponent(btnNuevoUsuario))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ////////////////////////////////////////        METODOS        ////////////////////////////////////////
    public boolean conectarBaseDatos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/basedatoscasa", "root", "");
            return true;

        } catch (SQLException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public ResultSet conseguirTabla() {
        Statement stmt;
        ResultSet resultado = null;
        try {
            stmt = conexion.createStatement();
            resultado = stmt.executeQuery("SELECT * FROM usuarios");
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVerificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public void limpiarVentanas() {
        txtUsuario.setText("");
        txtContraseña.setText("");
    }

    public boolean buscarUsuario(String usuario, String contraseña) {
        boolean encontrado = false;

        try {
            Statement stmt = (Statement) conexion.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM usuarios WHERE nombre = '" + usuario + "' and contraseña = '" + contraseña + "' ");

            if (resultado.next()) {
                encontrado = true;
            }

            resultado.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVerificar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return encontrado;
    }

    public int confirmarNuevaContraseña(String contraseñaNueva, String confirmacionContraseñaNueva) {

        if (!contraseñaNueva.equals("") && !confirmacionContraseñaNueva.equals("")) {
            if (contraseñaNueva.equals(confirmacionContraseñaNueva)) {
                try {
                    Statement stmt = conexion.createStatement();
                    stmt.executeUpdate("UPDATE usuarios SET contraseña = '" + contraseñaNueva + "' WHERE nombre = '" + txtUsuario.getText() + "'");

                    stmt.close();

                    return 1;
                } catch (SQLException ex) {
                    Logger.getLogger(ventanaVerificar.class.getName()).log(Level.SEVERE, null, ex);
                    return 2;
                }
            } else {
                return 4;
            }
        } else {
            return 3;
        }
    }

    public boolean validarContraseña(String contraseña) {

        char[] arrContraseña = contraseña.toCharArray();
        int contadorMayus = 0;
        boolean respuesta = true;

        if (contraseña.length() < 8) {

            respuesta = false;
        }

        if (Character.isDigit(arrContraseña[0])) {
            respuesta = false;
        }

        for (int i = 0; i < arrContraseña.length; i++) {
            if (Character.isUpperCase(arrContraseña[0])) {
                contadorMayus++;
            }

            if (!Character.isLetterOrDigit(arrContraseña[0]) || String.valueOf(arrContraseña[0]) == "_") {
                respuesta = false;
            }
        }

        if (contadorMayus < 1) {
            respuesta = false;
        }

        return respuesta;
    }

    ////////////////////////////////////////        BOTONES        ////////////////////////////////////////

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed

        if (txtUsuario.getText().isEmpty() || String.valueOf(txtContraseña.getPassword()).isEmpty()) {

            JOptionPane.showMessageDialog(this, "Tienes que rellenar los dos campos");

        } else {
            boolean encontrado = false;
            if (conectarBaseDatos()) {
                try {
                    String texto = "";
                    ResultSet tabla = conseguirTabla();
                    while (tabla.next() && !encontrado) {
                        if (txtUsuario.getText().equals(tabla.getString("nombre")) && String.valueOf(txtContraseña.getPassword()).equals(tabla.getString("contraseña"))) {
                            texto = "Usuario encontrado";
                            encontrado = true;
                        } else if (!encontrado) {
                            texto = "Usuario no encontrado";
                        }
                    }
                    JOptionPane.showMessageDialog(this, texto);
                } catch (SQLException ex) {
                    Logger.getLogger(ventanaVerificar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Conexión fallida");
            }
        }
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarVentanas();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        Statement stmt;
        String contraseña = String.valueOf(txtContraseña.getPassword());
        if (conectarBaseDatos()) {
            if (buscarUsuario(txtUsuario.getText(), contraseña) == true) {
                JOptionPane.showMessageDialog(this, "Usuario existente");
            } else {
                try {
                    String nombre = txtUsuario.getText();

                    if (validarContraseña(contraseña)) {
                        stmt = conexion.createStatement();
                        stmt.executeUpdate("INSERT INTO usuarios (nombre, contraseña) VALUES ('" + nombre + "', '" + contraseña + "')");

                        if (buscarUsuario(nombre, contraseña)) {
                            JOptionPane.showMessageDialog(this, "Usuario creado con exito");

                        } else {
                            JOptionPane.showMessageDialog(this, "Error creacion de usuario");
                        }

                        stmt.close();
                    } else {
                        JOptionPane.showMessageDialog(this, "La contraseña no cumple los requisitos");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(ventanaVerificar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Conexion fallida a la base de datos");

        }
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        if (conectarBaseDatos()) {

            if (buscarUsuario(txtUsuario.getText(), String.valueOf(txtContraseña.getPassword()))) {

                String contraseñaNueva = JOptionPane.showInputDialog("Introduce la nueva contraseña: ");
                String confirmacionContraseñaNueva = JOptionPane.showInputDialog("Confirma la contraseña: ");

                switch (confirmarNuevaContraseña(contraseñaNueva, confirmacionContraseñaNueva)) {
                    case 1:
                        JOptionPane.showMessageDialog(this, "Contraseña cambiada con éxito");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "Error : Contraseña no cambiada.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(this, "Error : Las contraseñas nuevas no pueden estar vacías.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(this, "Error : La confirmacion de la contraseña nueva no coincide.");
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(this, ("El usuario introducido no existe o la contraseña es incorrecta"));
            }
        }
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

    ////////////////////////////////////////        ////////        ////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(ventanaVerificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVerificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVerificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVerificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaVerificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
