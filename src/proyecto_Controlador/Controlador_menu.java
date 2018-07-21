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
import proyecto_Vista.Ventana_Historial;
import proyecto_Vista.Ventana_Log_in;
import proyecto_Vista.Ventana_Menu;
import proyecto_Vista.Ventana_Ranking;
import proyecto_Vista.Ventana_Seleccion;

/**
 *
 * @author Equipo
 */
public class Controlador_menu implements ActionListener {
    
    Ventana_Menu vm;
    Jugador j;
    
    public Controlador_menu(Ventana_Menu vm, Jugador j){
        
        this.vm = vm;
        this.j = j;
        vm.jButton_Jugar.addActionListener(this);
        vm.jButton_Historial.addActionListener(this);
        vm.jButton_Ranking.addActionListener(this);
        vm.jButton_Cerrar_Sesion.addActionListener(this);
        vm.jButton_Cerrar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
            if(ae.getSource() == this.vm.jButton_Cerrar){
            
             int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");
           
           if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
           }
        }
        
        if(ae.getSource() == this.vm.jButton_Jugar) {
            
            Ventana_Seleccion vs = new Ventana_Seleccion();
            Controlador_seleccion cs = new Controlador_seleccion(vs, j);
            vs.setVisible(true);
            vm.dispose();
            
        }
        
        if(ae.getSource() == this.vm.jButton_Historial){
            
            Ventana_Historial vh = new Ventana_Historial();
            vh.setVisible(true);
            vm.dispose();
            
        }
        
        if(ae.getSource() == this.vm.jButton_Ranking){
            
            Ventana_Ranking vr = new Ventana_Ranking ();
            vr.setVisible(true);
            vm.dispose();

        }
        
        if(ae.getSource() == this.vm.jButton_Cerrar_Sesion){
            
            Ventana_Log_in vli = new Ventana_Log_in ();
            vli.setVisible(true);
            vm.dispose();
            
        }
           
    }
    
}