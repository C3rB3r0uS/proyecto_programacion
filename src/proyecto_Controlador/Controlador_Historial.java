/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_Modelo.ClaseDAO;
import proyecto_Modelo.Jugador;
import proyecto_Modelo.Partida;
import proyecto_Vista.Ventana_Historial;
import proyecto_Vista.Ventana_Menu;

/**
 *
 * @author Equipo
 */
public class Controlador_Historial implements ActionListener {

    private Jugador jugador;
    private Ventana_Historial vh;

    private ClaseDAO dao = new ClaseDAO();
    DefaultTableModel modeloTabla;

    public Controlador_Historial(Jugador j, Ventana_Historial vh) {

        this.jugador = j;
        this.vh = vh;

        this.vh.jButton_Cerrar.addActionListener(this);
        this.vh.jButton_Volver.addActionListener(this);
        this.vh.jButton_Consultar.addActionListener(this);
        modeloTabla = new DefaultTableModel();
//        modeloTabla.addColumn("CÓDIGO DE PARTIDA");
        modeloTabla.addColumn("MODO DE JUEGO");
        modeloTabla.addColumn("DIFICULTAD");
        modeloTabla.addColumn("FECHA DE REALIZACIÓN");
        modeloTabla.addColumn("PUNTUACIÓN");
        this.vh.Tabla.setModel(modeloTabla);

    }
    
    public void actualizarTabla(String nombreUsuario, String nombreJugador){
        
        modeloTabla.setRowCount(0);
        
        ArrayList <Partida> partidas = dao.obtenerPartidas(this.jugador.getNombre_usuario(), this.jugador.getNombre_jugador());
        String [] fila;
        
        for (Partida p : partidas) {
            
            fila = new String [4];
//            fila[0] = p.getCod_partida() + "";
            fila[0] = p.getModo_de_juego();
            fila[1] = p.getDificultad();
            fila[2] = p.getFecha_realizacion();
            fila[3] = p.getPuntuacion() + "";
            
            modeloTabla.addRow(fila);
            
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.vh.jButton_Cerrar) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");

            if (respuesta == JOptionPane.YES_OPTION) {

                System.exit(0);

            }

        }
        
         if (ae.getSource() == this.vh.jButton_Volver) {

            Ventana_Menu vm = new Ventana_Menu();
            Controlador_menu cm = new Controlador_menu(vm, jugador);
            vm.jLabel_LogAs.setText("LOG: " + this.jugador.getNombre_jugador());
            vm.setVisible(true);
            vh.dispose();

        }
        
        if(ae.getSource() == this.vh.jButton_Consultar){
            
            String nombreUsuario = this.jugador.getNombre_usuario();
            String nombreJugador = this.jugador.getNombre_jugador();
            
            actualizarTabla(nombreUsuario, nombreJugador);
            
        }

    }

}
