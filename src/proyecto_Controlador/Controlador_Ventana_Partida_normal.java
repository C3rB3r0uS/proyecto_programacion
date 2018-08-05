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
    
    private Ventana_Partida_normal vpn;
    private Jugador j;
    private Partida p;
    private Niveles n;
    private Operaciones o;
    
    private Timer t;
    private int inicio;
    
    private int fallos;
    private String operacionGenerada;
    private int resultadoCorrecto;
    private int respuesta;
    private int codNivel;
    private int codPartida;

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
                                
                                if(inicio == -1){
                                    
                                    t.stop();
                                    
                                }
        
                                /*CODIGO
                                  /* while(inicio > 0){         
                                si fallo menor que 3
                                    generarOperacion
                                    si resultado = acierto entonces fallo = 0 y contador puntacion +1
                                    si no fallo +1
                                }*/  
                                
                                }
  
                        });
        
                        t.start();
                                
                                fallos = 0;
                                operacionGenerada = "";
                                resultadoCorrecto = 0;
                                respuesta = 0;
                                
                                codNivel = n.getCod_nivel();
                                codPartida = p.getCod_partida();
  
//                                while(inicio > 0){
//                          
//                                    o = new Operaciones (1, 1);
//                                
//                                    operacionGenerada = o.generarOperacion(p.getModo_de_juego(), p.getDificultad(), n.getNro_nivel());
//    
//                                    resultadoCorrecto = o.getResultado(operacionGenerada);
//                                    
//                                    vpn.JLabel_Operacion.setText(operacionGenerada);
//                                    
//                                        if(ae.getSource() == vpn.jButton_Enter){
//                                          
//                                                    try{
//                                                        
//                                                        respuesta = Integer.parseInt(vpn.jTextField_Respuesta.getText());
//                                                        
//                                                    }catch(NumberFormatException nfe){
//                                                    
//                                                        vpn.jTextField_Respuesta.setText("");
//                                                        fallos++;
//                                                    
//                                                    }
//                                                    
//                                                    if(respuesta != resultadoCorrecto){
//                                                        
//                                                        fallos++;
//                                                        
//                                                    }
//                                            
//                                                }
//                                        
//                                        }
                          
                }
            
           
    }
    
}
