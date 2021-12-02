/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectarconmysql;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ventanaConexion extends javax.swing.JFrame {

    public ventanaConexion() {
        initComponents();
        txtCuadro.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtCuadro = new javax.swing.JTextArea();
        btnPulsar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCuadro.setColumns(20);
        txtCuadro.setForeground(new java.awt.Color(0, 153, 0));
        txtCuadro.setRows(5);
        jScrollPane1.setViewportView(txtCuadro);

        btnPulsar.setText("Conectar");
        btnPulsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulsarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnPulsar)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnPulsar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPulsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulsarActionPerformed
//        // TODO add your handling code here:
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestionusuarios", "root", "");
//            String text = "Conexión realizada";
//            txtCuadro.append(text);
//        } catch (SQLException s) {
//            System.out.println("Error");
//        } catch (ClassNotFoundException c) {
//        }

        conectarOracle();
    }//GEN-LAST:event_btnPulsarActionPerformed

    public void conectarOracle() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "ORA-manager0");

            String text = "Conexión realizada";
            txtCuadro.append(text);
        } catch (SQLException s) {
            System.out.println("Error");
        } catch (ClassNotFoundException c) {
        }
    }

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
            java.util.logging.Logger.getLogger(ventanaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaConexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPulsar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCuadro;
    // End of variables declaration//GEN-END:variables
}
