/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import proyecto_Modelo.ClaseDAO;
import proyecto_Vista.Ventana_Creacion_Cuenta;
import proyecto_Vista.Ventana_Log_in;

/**
 *
 * @author Equipo
 */
public class Controlador_creacion_cuenta implements ActionListener {

    private Ventana_Creacion_Cuenta vcc;

    public Controlador_creacion_cuenta(Ventana_Creacion_Cuenta v) {

        this.vcc = v;
        v.jButton_crear_cuenta.addActionListener(this);
        v.jButton_Volver.addActionListener(this);
        v.jButton_Cerrar.addActionListener(this);

    }
    
    /**
     * Método actionPerformed que imprime cierto comportamiento a los elementos
     * JButton existentes en la clase
     */

    @Override
    public void actionPerformed(ActionEvent ae) {

        ClaseDAO dao = new ClaseDAO();

        if (ae.getSource() == this.vcc.jButton_Cerrar) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");

            if (respuesta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        if (ae.getSource() == this.vcc.jButton_Volver) {

            Ventana_Log_in log = new Ventana_Log_in();
            Controlador_Log_In cli = new Controlador_Log_In(log);
            log.setVisible(true);
            vcc.dispose();
        }

        if (ae.getSource() == this.vcc.jButton_crear_cuenta) {

            String errores = "Los siguientes errores han ocurrido: \n";
            int cont = 0;

            if (this.vcc.jTextField_nom_ape.getText().equals("") || this.vcc.jTextField_nom_usuario.getText().equals("") || this.vcc.jTextField_nombre_ingame.getText().equals("") || this.vcc.jPasswordField_contrasenia.getText().equals("") || this.vcc.jPasswordField_confirmacion_contrasenia.getText().equals("")) {

                errores += "-Todos los campos son obligatorios \n";

            } else {

                cont = cont + 1;

            }

            // COMPROBACIONES NOMBRE USUARIO
            if (dao.consultarDisponibilidadNombreUsuario(this.vcc.jTextField_nom_usuario.getText()) == false) {

                vcc.jTextField_nom_usuario.setText("");

                errores += "-El nombre de usuario elegido ya se encuentra registrado. Por favor, pruebe con otro nombre. \n";

            } else {

                cont = cont + 1;
            }

            if ((this.vcc.jTextField_nom_usuario.getText().length() < 5 || (this.vcc.jTextField_nom_usuario.getText().length() > 15))) {

                vcc.jTextField_nom_usuario.setText("");
                errores += "-La longitud del nombre de usuario debe ser entre 5 y 15 caracteres. Por favor, introduzca otro nombre. \n";

            } else {

                cont = cont + 1;

            }

            // COMPROBACIONES NOMBRE INGAME
            if (dao.consultarDisponibilidadNombreUsuario(this.vcc.jTextField_nombre_ingame.getText()) == false) {

                vcc.jTextField_nombre_ingame.setText("");
                errores += "-El nombre de jugador elegido ya se encuentra registrado. Por favor, pruebe con otro nombre. \n";

            } else {

                cont = cont + 1;
            }

            if ((this.vcc.jTextField_nombre_ingame.getText().length() < 5 || (this.vcc.jTextField_nombre_ingame.getText().length() > 15))) {

                vcc.jTextField_nombre_ingame.setText("");
                errores += "-La longitud de el nombre de jugador debe ser entre 5 y 15 caracteres. Por favor, introduzca otro nombre. \n";

            } else {

                cont = cont + 1;

            }

            // COMPROBACIONES CONTRASEÑA
            if ((String.valueOf(this.vcc.jPasswordField_contrasenia.getPassword()).length() < 10 || (String.valueOf(this.vcc.jPasswordField_contrasenia.getPassword()).length() > 20))) {

                vcc.jPasswordField_contrasenia.setText("");
                errores += "-La longitud de la contraseña debe ser entre 10 y 20 caracteres. Por favor, introduzca otra contraseña. \n";

            } else {

                cont = cont + 1;

            }

            if (this.vcc.jPasswordField_contrasenia.getText().equals(this.vcc.jPasswordField_confirmacion_contrasenia.getText())) {

                cont = cont + 1;

            } else {

                errores += "-Las contraseñas introducidas no coinciden entre sí. \n";

            }

            if (cont == 7) {

                dao.crearCuenta(vcc.jTextField_nom_usuario.getText(), vcc.jTextField_nombre_ingame.getText(), String.valueOf(this.vcc.jPasswordField_contrasenia.getPassword()), vcc.jTextField_nom_ape.getText(), this.vcc.jComboBox_Pais.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "La cuenta ha sido creada correctamente");

            } else {

                JOptionPane.showMessageDialog(null, errores);
                errores = "";

            }

        }

    }

}
