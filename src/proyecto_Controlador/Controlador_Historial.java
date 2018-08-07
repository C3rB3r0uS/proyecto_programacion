/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto_Modelo.ClaseDAO;
import proyecto_Modelo.Jugador;
import proyecto_Vista.Ventana_Historial;

/**
 *
 * @author Equipo
 */
public class Controlador_Historial implements ActionListener {

    private Jugador jugador;
    private Ventana_Historial vh;

    private ClaseDAO dao = new ClaseDAO();

    public Controlador_Historial(Jugador j, Ventana_Historial vh) {

        this.jugador = j;
        this.vh = vh;

        this.vh.jButton_Cerrar.addActionListener(this);
        this.vh.jButton_Volver.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.vh.jButton_Cerrar) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");

            if (respuesta == JOptionPane.YES_OPTION) {

                System.exit(0);

            }

        }

    }

}
