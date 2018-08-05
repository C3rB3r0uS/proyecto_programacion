/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto_Modelo.ClaseDAO;
import proyecto_Modelo.Jugador;
import proyecto_Vista.Ventana_Ranking;

/**
 *
 * @author Equipo
 */
public class Controlador_Ranking implements ActionListener{
    
    Jugador j;
    Ventana_Ranking vr;
    
    ClaseDAO d = new ClaseDAO ();

    public Controlador_Ranking(Jugador j, Ventana_Ranking vr) {
        
        this.j = j;
        this.vr = vr;
        
        this.vr.jButton_Cerrar.addActionListener(this);
        this.vr.jButton_Volver.addActionListener(this);
        this.vr.jButton_Consultar.addActionListener(this);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
    
}
