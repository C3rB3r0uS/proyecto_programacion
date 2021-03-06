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
public class Ventana_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Menu
     */
    public Ventana_Menu() {
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
        jButton_Jugar = new javax.swing.JButton();
        jButton_Historial = new javax.swing.JButton();
        jButton_Ranking = new javax.swing.JButton();
        jButton_Cerrar_Sesion = new javax.swing.JButton();
        jLabel_Ventana_Actual = new javax.swing.JLabel();
        jLabel_LogAs = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon.png"))); // NOI18N
        jButton_Cerrar.setToolTipText("");
        getContentPane().add(jButton_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 40, 20));

        jButton_Jugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_jugar.png"))); // NOI18N
        jButton_Jugar.setToolTipText("");
        getContentPane().add(jButton_Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 350, 70));

        jButton_Historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_historial.png"))); // NOI18N
        jButton_Historial.setToolTipText("");
        getContentPane().add(jButton_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 350, 50));

        jButton_Ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_ranking.png"))); // NOI18N
        jButton_Ranking.setToolTipText("");
        getContentPane().add(jButton_Ranking, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 350, 50));

        jButton_Cerrar_Sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_cerrarSesion.png"))); // NOI18N
        jButton_Cerrar_Sesion.setToolTipText("");
        getContentPane().add(jButton_Cerrar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 350, 50));

        jLabel_Ventana_Actual.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_Ventana_Actual.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ventana_Actual.setText("RANDOM.MATHS/MENU");
        getContentPane().add(jLabel_Ventana_Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 50));

        jLabel_LogAs.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_LogAs.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LogAs.setText("LOG: ");
        getContentPane().add(jLabel_LogAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 560, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PantallaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ventana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_Cerrar;
    public javax.swing.JButton jButton_Cerrar_Sesion;
    public javax.swing.JButton jButton_Historial;
    public javax.swing.JButton jButton_Jugar;
    public javax.swing.JButton jButton_Ranking;
    private javax.swing.JLabel jLabel_Fondo;
    public javax.swing.JLabel jLabel_LogAs;
    private javax.swing.JLabel jLabel_Ventana_Actual;
    // End of variables declaration//GEN-END:variables
}
