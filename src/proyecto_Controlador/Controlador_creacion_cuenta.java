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
    
    Ventana_Creacion_Cuenta v;
    
    public Controlador_creacion_cuenta(Ventana_Creacion_Cuenta v){
        
        this.v = v;
        v.jButton_crear_cuenta.addActionListener(this);
        v.jButton_Volver.addActionListener(this);
        
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        ClaseDAO d = new ClaseDAO ();
        
        if(ae.getSource() == this.v.jButton_Volver){
            
            Ventana_Log_in log = new Ventana_Log_in ();
            Controlador_Log_In cli = new Controlador_Log_In(log);
            log.setVisible(true);
            v.dispose();
        }
        
        if(ae.getSource() == this.v.jButton_crear_cuenta){
            
            String errores = "Los siguientes errores han ocurrido: \n";
             int cont = 0;
            
            if(this.v.jTextField_nom_ape.getText().equals("")){
                
                errores += "-Campo Nombre y Apellidos obligatorio \n";
                
            }else{
                
                cont = cont + 1;
                
            }
            
            // COMPROBACIONES NOMBRE USUARIO
            
            if(d.consultarDisponibilidadNombreUsuario(this.v.jTextField_nom_usuario.getText()) == false ){
                
                v.jTextField_nom_usuario.setText("");

                errores += "-El nombre de usuario elegido ya se encuentra registrado. Por favor, pruebe con otro nombre. \n";
                
            }else{
                
                cont = cont + 1;
            }
            
            if( (this.v.jTextField_nom_usuario.getText().length() < 5 || (this.v.jTextField_nom_usuario.getText().length() > 15) )){
                
                 v.jTextField_nom_usuario.setText("");
                errores += "-La longitud del nombre de usuario debe ser entre 5 y 15 caracteres. Por favor, introduzca otro nombre. \n";
                
            }else{
                
                cont = cont + 1;
                
            }
            
            
            // COMPROBACIONES NOMBRE INGAME
            
             if(d.consultarDisponibilidadNombreUsuario(this.v.jTextField_nombre_ingame.getText()) == false ){
                
                v.jTextField_nombre_ingame.setText("");
                errores += "-El nombre de jugador elegido ya se encuentra registrado. Por favor, pruebe con otro nombre. \n";
                
            }else{
                
                cont = cont + 1;
            }
            
            if( (this.v.jTextField_nombre_ingame.getText().length() < 5 || (this.v.jTextField_nombre_ingame.getText().length() > 15) )){
                
                 v.jTextField_nombre_ingame.setText("");
                errores += "-La longitud de el nombre de jugador debe ser entre 5 y 15 caracteres. Por favor, introduzca otro nombre. \n";
                
            }else{
                
                cont = cont + 1;
                
            }
            
            // COMPROBACIONES CONTRASEÑA
            
            if( (String.valueOf(this.v.jPasswordField_contrasenia.getPassword()).length() < 10 || (String.valueOf(this.v.jPasswordField_contrasenia.getPassword()).length()  > 20) )){
                
                 v.jPasswordField_contrasenia.setText("");
                errores +=  "-La longitud de la contraseña debe ser entre 10 y 20 caracteres. Por favor, introduzca otra contraseña. \n";
                
            }else{
                
                cont = cont + 1;
                
            }
            
            if( !Arrays.equals(v.jPasswordField_contrasenia.getPassword(),v.jPasswordField_confirmacion_contrasenia.getPassword()) ){
                
//                 errores += "-Las contraseñas introducidas no coinciden entre sí. \n";

            }else{
                
                cont = cont + 1;
                
            }
            
            if(cont == 7){
                
                d.crearCuenta(v.jTextField_nom_usuario.getText(), v.jTextField_nombre_ingame.getText(), String.valueOf(this.v.jPasswordField_contrasenia.getPassword()), v.jTextField_nom_ape.getText(), this.v.jComboBox_Pais.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "La cuenta ha sido creada correctamente");
                
            }else{
                
                JOptionPane.showMessageDialog(null, errores);
                errores = "";
                
            }
                   
        }
        
    }

}
