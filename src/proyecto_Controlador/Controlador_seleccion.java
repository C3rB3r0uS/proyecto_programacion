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
    int random;
    
    String modoSeleccionado;
    String dificultadSeleccionada;
    
    int codigo;
    
    public Controlador_seleccion(Ventana_Seleccion vs, Jugador j){
        
        this.vs = vs;
        this.j  = j;
        
        vs.jButton_Jugar.addActionListener(this);
        vs.jButton_Volver.addActionListener(this);
        vs.jButton_Cerrar.addActionListener(this);
        vs.jComboBox_Dificultad.addActionListener(this);
        vs.jComboBox_Modo.addActionListener(this);
        
        vs.jComboBox_Modo.addItem("TIME TRIAL");
//        vs.jComboBox_Modo.addItem("ARCADE");
//        vs.jComboBox_Modo.addItem("STRINGS");
        
        vs.jComboBox_Dificultad.addItem("FACIL");
        vs.jComboBox_Dificultad.addItem("NORMAL");
        vs.jComboBox_Dificultad.addItem("DIFICIL");
        
    }

    public Jugador getJ() {
        return j;
    }

    public void setJ(Jugador j) {
        this.j = j;
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
             vm.jLabel_LogAs.setText("LOG:" + this.j.getNombre_jugador());
             vm.setVisible(true);
             vs.dispose();
             
         }
         
         if(ae.getSource() == this.vs.jButton_Jugar){
             
                modoSeleccionado = this.vs.jComboBox_Modo.getSelectedItem().toString();
                dificultadSeleccionada = this.vs.jComboBox_Dificultad.getSelectedItem().toString();

//                p = new Partida (modoSeleccionado,dificultadSeleccionada,this.getJ().getNombre_usuario(), this.getJ().getNombre_jugador());
//                codigo = p.getCod_partida();
//                n = new Niveles (codigo,"NORMAL");

               if(modoSeleccionado.equals("TIME TRIAL")){
                   
//                        JOptionPane.showMessageDialog(null, "Modo seleccionado: " + modoSeleccionado + " dificultad seleccionada: " + dificultadSeleccionada);
                   
                        this.p = new Partida (dificultadSeleccionada,this.getJ().getNombre_usuario(), this.getJ().getNombre_jugador());
                        this.n = new Niveles (this.p.getCod_partida());
                                   
                        Ventana_Partida_normal vpn = new Ventana_Partida_normal ();
                        Controlador_Ventana_Partida_normal cvpn = new Controlador_Ventana_Partida_normal(vpn, j, p, n);
                        vpn.jLabel_LogAs.setText("LOG: " + this.j.getNombre_jugador());
                        vpn.setVisible(true);
                        vs.dispose();
                   
               }
//               }else{
//                   
//                        random = (int)(Math.random()*10)+1;
//                        
//                        if(random <= 8){
//                            
//                                this.p = new Partida (this.vs.jComboBox_Modo.getSelectedItem().toString(),this.vs.jComboBox_Dificultad.getSelectedItem().toString(),this.j.getNombre_usuario(),this.j.getNombre_jugador());
//                                this.n = new Niveles (this.p.getCod_partida(),"NORMAL");
//                                
//                                Ventana_Partida_normal vpn = new Ventana_Partida_normal ();
//                                Controlador_Ventana_Partida_normal cvpn = new Controlador_Ventana_Partida_normal(vpn, this.j, this.p, this.n);
//                                vpn.jLabel_LogAs.setText("LOG: " + this.j.getNombre_jugador());
//                                vpn.setVisible(true);
//                                vs.dispose();
//                            
//                        }else{
//                            
//                                this.p = new Partida (this.vs.jComboBox_Modo.getSelectedItem().toString(),this.vs.jComboBox_Dificultad.getSelectedItem().toString(),this.j.getNombre_usuario(),this.j.getNombre_jugador());
//                                this.n = new Niveles (this.p.getCod_partida(),"MADNESS");
//                            
//                                Ventana_Partida_madness vpm = new Ventana_Partida_madness();
//                                vpm.setVisible(true);
//                                vs.dispose();
//                            
//                                }
// 
//                        }

                }
                
        }
    
}
