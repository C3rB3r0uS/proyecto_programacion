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
import proyecto_Modelo.Nivel;
import proyecto_Modelo.Operacion;
import proyecto_Modelo.Partida;
import proyecto_Vista.Ventana_Menu;
import proyecto_Vista.Ventana_Partida_madness;

/**
 *
 * @author Equipo
 */
public class Controlador_Ventana_madness implements ActionListener {
    
    // Para no hacer directamente editable jtextfield => No editable
    
    Ventana_Partida_madness vpm;
    
    Jugador j;
    Partida p;
    Nivel n;
    Operacion o;
    
    Timer t;
    int inicio;
    
    public Controlador_Ventana_madness (Ventana_Partida_madness vpm, Jugador j, Partida p, Nivel n, Operacion o){
        
        this.vpm = vpm;
        this.j = j;
        this.p = p;
        this.n = n;
        this.o = o;
        
        this.vpm.jButton_Cero.addActionListener(this);
        this.vpm.jButton_Uno.addActionListener(this);
        this.vpm.jButton_Dos.addActionListener(this);
        this.vpm.jButton_Tres.addActionListener(this);
        this.vpm.jButton_Cuatro.addActionListener(this);
        this.vpm.jButton_Cinco.addActionListener(this);
        this.vpm.jButton_Seis.addActionListener(this);
        this.vpm.jButton_Siete.addActionListener(this);
        this.vpm.jButton_Ocho.addActionListener(this);
        this.vpm.jButton_Nueve.addActionListener(this);
        
        this.vpm.jButton_Start.addActionListener(this);
        this.vpm.jButton_Volver.addActionListener(this);
        this.vpm.jButton_Enter.addActionListener(this);
        this.vpm.jButton_Delete.addActionListener(this);
        
        this.vpm.jButton_Cerrar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         if(ae.getSource() == this.vpm.jButton_Cerrar){
            
             int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
           
           if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
                
                }
            }
         
           if(ae.getSource() == this.vpm.jButton_Volver){
                
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?");
                
                 if(respuesta == JOptionPane.YES_OPTION){
                
                     Ventana_Menu vm = new Ventana_Menu();
                     Controlador_menu cm = new Controlador_menu(vm, j);
                     vm.jLabel_LogAs.setText("LOG: " + this.j.getNombre_jugador());
                     vm.setVisible(true);
                     vpm.dispose();
                     
                        }
                
                }
           
           if(ae.getSource() == this.vpm.jButton_Start){
                
                inicio = 59;
             
                t = new Timer (1000, new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                            
                                vpm.jButton_Start.setVisible(false);

                                vpm.jLabel_ContadorTiempo.setText(Integer.toString(inicio)); 
                
                                inicio--;
 
                                }
  
                        });
        
                        t.start();
                        
                        while(inicio > 0){

                        }
                        
                        
                        
                
                }
         
         
        
    }
    
}
