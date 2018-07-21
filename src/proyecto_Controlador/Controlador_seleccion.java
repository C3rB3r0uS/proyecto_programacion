/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto_Modelo.Jugador;
import proyecto_Vista.Ventana_Seleccion;

/**
 *
 * @author Equipo
 */
public class Controlador_seleccion implements ActionListener {
    
    Ventana_Seleccion vs;
    Jugador j;
    
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
        
    }
    
}
