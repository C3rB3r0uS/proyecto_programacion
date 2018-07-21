/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto_Modelo.Jugador;
import proyecto_Modelo.Niveles;
import proyecto_Modelo.Operaciones;
import proyecto_Modelo.Partida;
import proyecto_Vista.Ventana_Menu;
import proyecto_Vista.Ventana_Partida_madness;
import proyecto_Vista.Ventana_Partida_normal;
import proyecto_Vista.Ventana_Seleccion;

/**
 *
 * @author Equipo
 */
public class Controlador_seleccion implements ActionListener {
    
    Ventana_Seleccion vs;
    Jugador j;
    Partida p;
    Niveles n;
    Operaciones o;
    
    public Controlador_seleccion(Ventana_Seleccion vs, Jugador j){
        
        this.vs = vs;
        this.j  = j;
        
        vs.jButton_Jugar.addActionListener(this);
        vs.jButton_Volver.addActionListener(this);
        vs.jButton_Cerrar.addActionListener(this);
        vs.jComboBox_Dificultad.addActionListener(this);
        vs.jComboBox_Modo.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         if(ae.getSource() == this.vs.jButton_Cerrar){
            
             int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
           
           if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
           }
        }
         
         if(ae.getSource() == this.vs.jButton_Volver){
             
             Ventana_Menu vm = new Ventana_Menu();
             Controlador_menu cm = new Controlador_menu(vm,this.j);
             vm.setVisible(true);
             vs.dispose();
             
         }
         
         if(ae.getSource() == this.vs.jButton_Jugar){

               if(this.vs.jComboBox_Modo.getSelectedItem().toString().equals("TIME TRIAL")){
                   
                        Ventana_Partida_normal vpn = new Ventana_Partida_normal ();
                        Controlador_Ventana_Partida_normal cvpn = new Controlador_Ventana_Partida_normal(vpn, j, p, n, o);
                        vpn.setVisible(true);
                        vs.dispose();
                   
               }else{
                   
                        int random = (int)(Math.random()*10)+1;
                        
                        if(random <= 8){
                            
                                Ventana_Partida_normal vpn = new Ventana_Partida_normal ();
                                Controlador_Ventana_Partida_normal cvpn = new Controlador_Ventana_Partida_normal(vpn, j, p, n, o);
                                vpn.setVisible(true);
                                vs.dispose();
                            
                        }else{
                            
                                Ventana_Partida_madness vpm = new Ventana_Partida_madness();
                                vpm.setVisible(true);
                                vs.dispose();
                            
                            
                                }
 
                        }

                }
                
        }
    
}
