/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import proyecto_Modelo.ClaseDAO;
import proyecto_Vista.Ventana_Creacion_Cuenta;
import proyecto_Vista.Ventana_Log_in;
import proyecto_Vista.Ventana_Menu;

/**
 *
 * @author alumno
 */
public class Controlador_Log_In implements ActionListener, MouseListener{
    
    Ventana_Log_in log;
    
    public Controlador_Log_In (Ventana_Log_in log){
        
        this.log = log;
        log.jButton_Cerrar.addActionListener(this);
        log.jButton_Entrar.addActionListener(this);
        log.jLabel_Crear_cuenta.addMouseListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == this.log.jButton_Cerrar){
            System.exit(0);
        }
        
        if(ae.getSource() == this.log.jButton_Entrar){
            
            ClaseDAO d = new ClaseDAO();
            
            String nombreIntroducido = log.jTextField_NombreUsuario.getText();
            String contraseniaIntroducida = log.jContraseña.getText();
  
            if(d.ConsultarUserPass(nombreIntroducido, contraseniaIntroducida) == true){
                
                JOptionPane.showMessageDialog(null, "Datos introducidos válidos");

                Ventana_Menu vm = new Ventana_Menu();
                vm.setVisible(true);
                log.dispose();
                
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
         if(me.getSource() == this.log.jLabel_Crear_cuenta){
            
            Ventana_Creacion_Cuenta vcc = new Ventana_Creacion_Cuenta();
            Controlador_creacion_cuenta ccc = new Controlador_creacion_cuenta (vcc);
            vcc.setVisible(true);
            log.dispose();
            
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
 
}
