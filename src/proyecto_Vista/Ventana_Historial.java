/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Vista;

import java.awt.event.KeyEvent;

/**
 *
 * @author Pedro
 */
public class Ventana_Historial extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Historial
     */
    public Ventana_Historial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Cerrar = new javax.swing.JButton();
        jLabel_Ventana_Actual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Volver = new javax.swing.JButton();
        jLabel_LogAs = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon.png"))); // NOI18N
        jButton_Cerrar.setToolTipText("Cierra la aplicación ");
        jButton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarActionPerformed(evt);
            }
        });
        jButton_Cerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_CerrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButton_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 40, 20));

        jLabel_Ventana_Actual.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_Ventana_Actual.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ventana_Actual.setText("RANDOM.MATHS/HISTORIAL");
        getContentPane().add(jLabel_Ventana_Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESULTADOS DE LAS ULTIMAS 10 PARTIDAS ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_volver.png"))); // NOI18N
        getContentPane().add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 240, 75));

        jLabel_LogAs.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_LogAs.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LogAs.setText("LOG:");
        getContentPane().add(jLabel_LogAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 500, 40));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_CerrarActionPerformed

    private void jButton_CerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_CerrarKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){

            System.exit(0);

        }
    }//GEN-LAST:event_jButton_CerrarKeyPressed

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
            java.util.logging.Logger.getLogger(Ventana_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cerrar;
    public javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Fondo;
    public javax.swing.JLabel jLabel_LogAs;
    private javax.swing.JLabel jLabel_Ventana_Actual;
    // End of variables declaration//GEN-END:variables
}
