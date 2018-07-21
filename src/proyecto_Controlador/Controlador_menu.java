/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public Controlador_menu(Ventana_Menu vm){
        
        this.vm = vm;
        vm.jButton_Jugar.addActionListener(this);
        vm.jButton_Historial.addActionListener(this);
        vm.jButton_Ranking.addActionListener(this);
        vm.jButton_Cerrar_Sesion.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == this.vm.jButton_Jugar) {
            
            Ventana_Seleccion vs = new Ventana_Seleccion();
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
