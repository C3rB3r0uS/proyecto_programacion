/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Vista;

/**
 *
 * @author alumno
 */
public class Ventana_Partida_madness extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_partida_madness
     */
    public Ventana_Partida_madness() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Cerrar = new javax.swing.JButton();
        jLabel_Ventana_Actual = new javax.swing.JLabel();
        jButton_Uno = new javax.swing.JButton();
        jButton_Dos = new javax.swing.JButton();
        jButton_Tres = new javax.swing.JButton();
        jButton_Cuatro = new javax.swing.JButton();
        jButton_Cinco = new javax.swing.JButton();
        jButton_Seis = new javax.swing.JButton();
        jButton_Siete = new javax.swing.JButton();
        jButton_Ocho = new javax.swing.JButton();
        jButton_Nueve = new javax.swing.JButton();
        jButton_Cero = new javax.swing.JButton();
        jButton_Enter = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        JLabel_Operacion = new javax.swing.JLabel();
        jTextField_Respuesta = new javax.swing.JTextField();
        jLabel_Contador = new javax.swing.JLabel();
        jButton_Start = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();
        jLabel_LogAs = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon.png"))); // NOI18N
        jButton_Cerrar.setPreferredSize(new java.awt.Dimension(45, 27));
        getContentPane().add(jButton_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        jLabel_Ventana_Actual.setFont(new java.awt.Font("Digital Dare", 0, 24)); // NOI18N
        jLabel_Ventana_Actual.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ventana_Actual.setText("RANDOM.MATHS/MADNESS");
        getContentPane().add(jLabel_Ventana_Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, -1));

        jButton_Uno.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Uno.setText("1");
        getContentPane().add(jButton_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 70, -1));

        jButton_Dos.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Dos.setText("2");
        getContentPane().add(jButton_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jButton_Tres.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Tres.setText("3");
        getContentPane().add(jButton_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        jButton_Cuatro.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Cuatro.setText("4");
        jButton_Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CuatroActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jButton_Cinco.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Cinco.setText("5");
        jButton_Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CincoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jButton_Seis.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Seis.setText("6");
        getContentPane().add(jButton_Seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        jButton_Siete.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Siete.setText("7");
        getContentPane().add(jButton_Siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jButton_Ocho.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Ocho.setText("8");
        getContentPane().add(jButton_Ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, -1));

        jButton_Nueve.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Nueve.setText("9");
        getContentPane().add(jButton_Nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jButton_Cero.setFont(new java.awt.Font("Digital Dare", 1, 48)); // NOI18N
        jButton_Cero.setText("0");
        jButton_Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CeroActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, -1));

        jButton_Enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_enter.png"))); // NOI18N
        getContentPane().add(jButton_Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 200, 50));

        jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_delete.png"))); // NOI18N
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 200, 50));

        JLabel_Operacion.setFont(new java.awt.Font("Digital Dare", 0, 60)); // NOI18N
        JLabel_Operacion.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_Operacion.setText("  --- presione start --- ");
        getContentPane().add(JLabel_Operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jTextField_Respuesta.setFont(new java.awt.Font("Digital Dare", 0, 48)); // NOI18N
        getContentPane().add(jTextField_Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 530, 80));

        jLabel_Contador.setFont(new java.awt.Font("Digital Dare", 0, 95)); // NOI18N
        jLabel_Contador.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Contador.setText("59");
        getContentPane().add(jLabel_Contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 150, 90));

        jButton_Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_start.png"))); // NOI18N
        jButton_Start.setPreferredSize(new java.awt.Dimension(310, 90));
        getContentPane().add(jButton_Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_volver.png"))); // NOI18N
        getContentPane().add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 240, 75));

        jLabel_LogAs.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_LogAs.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LogAs.setText("LOG:");
        getContentPane().add(jLabel_LogAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 470, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CincoActionPerformed

    private void jButton_CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CeroActionPerformed

    private void jButton_CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CuatroActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Partida_madness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Partida_madness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Partida_madness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Partida_madness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Partida_madness().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Operacion;
    private javax.swing.JButton jButton_Cero;
    private javax.swing.JButton jButton_Cerrar;
    private javax.swing.JButton jButton_Cinco;
    private javax.swing.JButton jButton_Cuatro;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Dos;
    private javax.swing.JButton jButton_Enter;
    private javax.swing.JButton jButton_Nueve;
    private javax.swing.JButton jButton_Ocho;
    private javax.swing.JButton jButton_Seis;
    private javax.swing.JButton jButton_Siete;
    public javax.swing.JButton jButton_Start;
    private javax.swing.JButton jButton_Tres;
    private javax.swing.JButton jButton_Uno;
    public javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel_Contador;
    private javax.swing.JLabel jLabel_Fondo;
    public javax.swing.JLabel jLabel_LogAs;
    private javax.swing.JLabel jLabel_Ventana_Actual;
    private javax.swing.JTextField jTextField_Respuesta;
    // End of variables declaration//GEN-END:variables
}
