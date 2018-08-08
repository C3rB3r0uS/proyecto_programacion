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
import proyecto_Vista.Ventana_Menu;
import proyecto_Vista.Ventana_Ranking;

/**
 *
 * @author Equipo
 */
public class Controlador_Ranking implements ActionListener {

    private Jugador jugador;
    private Ventana_Ranking vr;
    private DefaultTableModel modeloTabla;

    ClaseDAO dao = new ClaseDAO();

    public Controlador_Ranking(Jugador j, Ventana_Ranking vr) {

        this.jugador = j;
        this.vr = vr;

        this.vr.jButton_Cerrar.addActionListener(this);
        this.vr.jButton_Volver.addActionListener(this);
        this.vr.jButton_Consultar.addActionListener(this);
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("NOMBRE DEL JUGADOR");
        modeloTabla.addColumn("PUNTUACIÓN");
        this.vr.Tabla_Ranking.setModel(modeloTabla);
        this.vr.jComboBox_Modo.addItem("TIME TRIAL");
        this.vr.jComboBox_Dificultad.addItem("FACIL");
        this.vr.jComboBox_Dificultad.addItem("NORMAL");
        this.vr.jComboBox_Dificultad.addItem("DIFICIL");

    }
    
    public void actualizarTabla(String modo, String dificultad){
        
        modeloTabla.setRowCount(0);
        
        ArrayList <Partida> partidas = dao.obtenerPuntuaciones(modo, dificultad);
        String [] fila;
        
        for (Partida p : partidas) {
            
            fila = new String [2];
            fila[0] = p.getNombre_jugador();
            fila[1] = Integer.toString(p.getPuntuacion());
            modeloTabla.addRow(fila);
            
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.vr.jButton_Cerrar) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");

            if (respuesta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        if (ae.getSource() == this.vr.jButton_Volver) {

            Ventana_Menu vm = new Ventana_Menu();
            Controlador_menu cm = new Controlador_menu(vm, jugador);
            vm.jLabel_LogAs.setText("LOG: " + this.jugador.getNombre_jugador());
            vm.setVisible(true);
            vr.dispose();

        }
        
        if(ae.getSource() == this.vr.jButton_Consultar){
            
            String modo = this.vr.jComboBox_Modo.getSelectedItem().toString();
            String dificultad = this.vr.jComboBox_Dificultad.getSelectedItem().toString();
            
            actualizarTabla(modo,dificultad);
            
            
        }
 
    }

}
