/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import proyecto_Modelo.ClaseDAO;
import proyecto_Modelo.Jugador;
import proyecto_Vista.Ventana_Creacion_Cuenta;
import proyecto_Vista.Ventana_Log_in;
import proyecto_Vista.Ventana_Menu;

/**
 *
 * @author alumno
 */
public class Controlador_Log_In implements ActionListener, MouseListener, KeyListener{
    
    Ventana_Log_in login;
    
    public Controlador_Log_In (Ventana_Log_in log){
        
        this.login = log;
        log.jButton_Cerrar.addActionListener(this);
        log.jButton_Entrar.addActionListener(this);
        log.jLabel_Crear_cuenta.addMouseListener(this);
        log.addKeyListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == this.login.jButton_Cerrar){
            
             int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
           
           if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
           }
        }
        
        if(ae.getSource() == this.login.jButton_Entrar){
            
            ClaseDAO d = new ClaseDAO();
            Jugador j = null;
            
            String nombreIntroducido = this.login.jTextField_NombreUsuario.getText();
            String contraseniaIntroducida = this.login.jContraseña.getText();
  
            if(d.ConsultarUserPass(nombreIntroducido, contraseniaIntroducida) == true){

                JOptionPane.showMessageDialog(null, "Datos introducidos válidos");

                // Obtiene los datos del jugador cuyo nombre de usuario y contraseña son los introducidos
                // Esos datos se transfieren a la siguiente ventana como argumento
                
                j = d.obtenerDatosJugador(nombreIntroducido, contraseniaIntroducida);
                
                Ventana_Menu vm = new Ventana_Menu();
                vm.jLabel_LogAs.setText("LOG: " + j.getNombre_jugador());
                Controlador_menu cm = new Controlador_menu(vm,j);
                vm.setVisible(true);
                login.dispose();
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Datos introducidos inválidos");
                
            }
  
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
         if(me.getSource() == this.login.jLabel_Crear_cuenta){
            
            Ventana_Creacion_Cuenta vcc = new Ventana_Creacion_Cuenta();
            Controlador_creacion_cuenta ccc = new Controlador_creacion_cuenta (vcc);
            vcc.setVisible(true);
            login.dispose();
            
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {  
    }

    @Override
    public void mouseEntered(MouseEvent me) {   
    }

    @Override
    public void mouseExited(MouseEvent me) { 
    }

    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        int code = (int)ke.getKeyChar();
        
        System.out.println("Code: " + code);
   
       if(code == KeyEvent.VK_ESCAPE){
           
           int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
           
           if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
           }

       }
       
       if(code == KeyEvent.VK_ENTER){
        
           ClaseDAO d = new ClaseDAO();
            
            String nombreIntroducido = login.jTextField_NombreUsuario.getText();
            String contraseniaIntroducida = String.valueOf(this.login.jContraseña.getPassword());
  
            if(d.ConsultarUserPass(nombreIntroducido, contraseniaIntroducida) == true){
                
                JOptionPane.showMessageDialog(null, "Datos introducidos válidos");

                Ventana_Menu vm = new Ventana_Menu();
                vm.setVisible(true);
                login.dispose();
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Datos introducidos inválidos");
                
            }

       }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
 
}
