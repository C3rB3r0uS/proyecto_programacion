/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import proyecto_Modelo.Jugador;
import proyecto_Modelo.Niveles;
import proyecto_Modelo.Operaciones;
import proyecto_Modelo.Partida;
import proyecto_Vista.Ventana_Menu;
import proyecto_Vista.Ventana_Partida_normal;

/**
 *
 * @author Equipo
 */
public class Controlador_Ventana_Partida_normal implements ActionListener {
    
    Ventana_Partida_normal vpn;
    Jugador j;
    Partida p;
    Niveles n;
    Operaciones o;
    
    Timer t;
    int inicio;

    public Controlador_Ventana_Partida_normal(Ventana_Partida_normal vpn, Jugador j, Partida p, Niveles n) {
        
        this.vpn = vpn;
        this.j = j;
        this.p = p;
        this.n = n;
        this.vpn.jButton_Start.addActionListener(this);
        this.vpn.jButton_Volver.addActionListener(this);
        this.vpn.jButton_Enter.addActionListener(this);
        this.vpn.jButton_Cerrar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
            if(ae.getSource() == this.vpn.jButton_Cerrar){
            
             int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
           
           if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
           }
        }
            
            
            if(ae.getSource() == this.vpn.jButton_Volver){
                
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?");
                
                 if(respuesta == JOptionPane.YES_OPTION){
                
                     Ventana_Menu vm = new Ventana_Menu();
                     Controlador_menu cm = new Controlador_menu(vm, j);
                     vm.jLabel_LogAs.setText("LOG: " + this.j.getNombre_jugador());
                     vm.setVisible(true);
                     vpn.dispose();
                     
                                }
                
                }
            
            if(ae.getSource() == this.vpn.jButton_Start){
                
                inicio = 59;
             
                t = new Timer (1000, new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                            
                                vpn.jButton_Start.setVisible(false);

                                vpn.jLabel_ContadorTiempo.setText(Integer.toString(inicio)); 
                
                                inicio--;
 
                                }
  
                        });
        
                        t.start();
                        
                        while(inicio > 0){

                        }
                
                }
        
    }
    
}
