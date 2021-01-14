/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Miguel
 */
public class VentanaInicial extends javax.swing.JFrame {
    private String usuario1;
    private String usuario2;

    /**
     * Creates new form VentanaInicial
     */
    public VentanaInicial() {
        initComponents();
        setSize(630, 480);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        cajaNombre2 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzarJuego = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tres en Raya");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 400, 41));

        etiquetaNombre1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        etiquetaNombre1.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombre1.setText("Jugador 1:");
        jPanel1.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 97, 30));

        etiquetaNombre2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        etiquetaNombre2.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombre2.setText("Jugador 2:");
        jPanel1.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 97, 25));

        cajaNombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(cajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 195, 30));

        cajaNombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cajaNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(cajaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 195, 31));

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        etiquetaMuestra1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        etiquetaMuestra1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 290, 50));

        etiquetaMuestra2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        etiquetaMuestra2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 290, 60));

        botonComenzarJuego.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        botonComenzarJuego.setText("Comenzar Juego");
        botonComenzarJuego.setVisible(false);
        botonComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(botonComenzarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 140, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salido.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombre2ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        usuario1 = cajaNombre1.getText();
        usuario2 = cajaNombre2.getText();
        botonGuardar.setVisible(false);
        
        etiquetaMuestra1.setText(usuario1 + " jugará primero.\n Ficha: X");
        etiquetaMuestra2.setText(usuario2 + " jugará segundo.\n Ficha: O");
        botonComenzarJuego.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarJuegoActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal ventanaP = new VentanaPrincipal(usuario1,usuario2);
        ventanaP.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonComenzarJuegoActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzarJuego;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
