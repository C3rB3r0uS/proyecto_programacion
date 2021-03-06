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
public class Ventana_Log_in extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public Ventana_Log_in() {
        initComponents();
        this.setLocationRelativeTo(null); // Obliga a que la ventana se abra en el centro de la pantalla
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
        jTextField_NombreUsuario = new javax.swing.JTextField();
        jButton_Entrar = new javax.swing.JButton();
        jContraseña = new javax.swing.JPasswordField();
        jLabel_Nombre_usuario = new javax.swing.JLabel();
        jLabel_Contrasenia = new javax.swing.JLabel();
        jLabel_Crear_cuenta = new javax.swing.JLabel();
        jLabel_Ventana_Actual = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon.png"))); // NOI18N
        jButton_Cerrar.setToolTipText("Cierra la aplicación ");
        getContentPane().add(jButton_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 40, 20));

        jTextField_NombreUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField_NombreUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_NombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_NombreUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(jTextField_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 340, 40));

        jButton_Entrar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Entrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_entrar.png"))); // NOI18N
        jButton_Entrar.setToolTipText("Entra en la aplicación");
        getContentPane().add(jButton_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 200, 50));

        jContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 340, 40));

        jLabel_Nombre_usuario.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_Nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre_usuario.setText("Nombre de usuario");
        getContentPane().add(jLabel_Nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 310, 30));

        jLabel_Contrasenia.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_Contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Contrasenia.setText("Password");
        getContentPane().add(jLabel_Contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 160, -1));

        jLabel_Crear_cuenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Crear_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Crear_cuenta.setText("¿ No tienes cuenta ? Haz click en el link");
        getContentPane().add(jLabel_Crear_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 330, -1));

        jLabel_Ventana_Actual.setFont(new java.awt.Font("Digital Dare", 1, 24)); // NOI18N
        jLabel_Ventana_Actual.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ventana_Actual.setText("RANDOM.MATHS/LOGIN");
        getContentPane().add(jLabel_Ventana_Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PantallaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 1290, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_NombreUsuarioMouseClicked
        jTextField_NombreUsuario.setText("");
    }//GEN-LAST:event_jTextField_NombreUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_Cerrar;
    public javax.swing.JButton jButton_Entrar;
    public javax.swing.JPasswordField jContraseña;
    public javax.swing.JLabel jLabel_Contrasenia;
    public javax.swing.JLabel jLabel_Crear_cuenta;
    public javax.swing.JLabel jLabel_Fondo;
    public javax.swing.JLabel jLabel_Nombre_usuario;
    public javax.swing.JLabel jLabel_Ventana_Actual;
    public javax.swing.JTextField jTextField_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
