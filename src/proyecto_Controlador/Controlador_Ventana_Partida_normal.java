/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import proyecto_Modelo.ClaseDAO;
import proyecto_Modelo.Jugador;
import proyecto_Modelo.Nivel;
import proyecto_Modelo.Operacion;
import proyecto_Modelo.Partida;
import proyecto_Vista.Ventana_Menu;
import proyecto_Vista.Ventana_Partida_normal;

/**
 *
 * @author Equipo
 */
public class Controlador_Ventana_Partida_normal implements ActionListener {

    /*
    
    Al pulsar el botón START empieza la cuenta atrás. El botón START desaparece.
    Mientras el timer siga activo, se generarán operaciones matemáticas que son mostradas en un JLABEL
    Si el usuario falla la respuesta 3 veces, una nueva operación matemática es generada y mostrada. El contador de fallos se reinicia a 0.
    Por cada acierto, puntuación se incrementa en 1 y es mostrado en la JLABEL correspondiente.
    
    Por cada operación generada se deberá de crear un objeto OPERACION. 
    Éste objeto contendrá información sobre esta operación y los datos que almacene serán utilizados como argumento para insertar esta
    esta información en la tabla "OPERACIONES" de la bbdd. 
    Uno de esos atributos (String estado) contendrá si la operación ha sido resuelta o no (utilizando para ello un String).
    
     */
    private Ventana_Partida_normal vpn;

    private Jugador jugador;
    private Partida partida;
    private Nivel nivel;
    private Operacion operacion;
    private ClaseDAO dao = new ClaseDAO();

    private Timer timer;
    private int inicio;

    private int fallos = 0;
    private int puntuacion = 0;
    private String operacionGenerada = "";
    private int resultadoCorrecto = 0;
    private int respuesta = 0;
    private int codNivel = 0;
    private int codPartida = 0;

    public Controlador_Ventana_Partida_normal(Ventana_Partida_normal vpn, Jugador j, Partida p, Nivel n) {

        this.vpn = vpn;
        this.jugador = j;
        this.partida = p;
        this.nivel = n;
        this.vpn.jButton_Start.addActionListener(this);
        this.vpn.jButton_Volver.addActionListener(this);
        this.vpn.jButton_Enter.addActionListener(this);
        this.vpn.jButton_Cerrar.addActionListener(this);
        this.vpn.jButton_Enter.setVisible(false);

        this.vpn.JLabel_Operacion.setText("- - - - -");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.vpn.jButton_Cerrar) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?");

            if (respuesta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

        if (ae.getSource() == this.vpn.jButton_Volver) {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?");

            if (respuesta == JOptionPane.YES_OPTION) {

                Ventana_Menu vm = new Ventana_Menu();
                Controlador_menu cm = new Controlador_menu(vm, jugador);
                vm.jLabel_LogAs.setText("LOG: " + this.jugador.getNombre_jugador());
                vm.setVisible(true);
                vpn.dispose();

            }

        }

//        int fallos = 0;
//        int puntuacion = 0;
//        String operacionGenerada = "";
//        int resultadoCorrecto = 0;
//        int respuesta = 0;
//        int codNivel = nivel.getCod_nivel();
//        int codPartida = partida.getCod_partida();
        if (ae.getSource() == this.vpn.jButton_Enter) {

            operacion = new Operacion(dao.ConsultarCodigoNivel(), dao.ConsultarCodigoPartida());

            operacionGenerada = vpn.JLabel_Operacion.getText();
            resultadoCorrecto = operacion.getResultado(operacionGenerada);

            ScriptEngineManager sem = new ScriptEngineManager();
            ScriptEngine engine = sem.getEngineByName("JavaScript");

            try {

                respuesta = (int) engine.eval(operacionGenerada);

            } catch (ScriptException se) {

                this.vpn.jTextField_Respuesta.setText("");

            }

            if (respuesta != resultadoCorrecto) {

                fallos = fallos + 1;
                this.vpn.jLabel_ContadorFallos.setText(fallos + "");
                this.vpn.jLabel_ContadorFallos.paintImmediately(this.vpn.jLabel_ContadorFallos.getVisibleRect());

                if (fallos == 3) {

                    operacionGenerada = operacion.generarOperacion(partida.getModo_de_juego(), partida.getDificultad(), 1);
                    vpn.JLabel_Operacion.setText(operacionGenerada);
                    fallos = 0;

                }

            } else {

                puntuacion = puntuacion + 1;
                vpn.jLabel_ContadorPuntuacion.setText(puntuacion + "");

            }

        }

        // CUENTA ATRÁS
        if (ae.getSource() == this.vpn.jButton_Start) {

            operacion = new Operacion(1, 1);
            vpn.JLabel_Operacion.setText(operacion.generarOperacion(partida.getModo_de_juego(), partida.getDificultad(), 1));

            inicio = 59;

            timer = new Timer(1000, new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    vpn.jButton_Start.setVisible(false);
                    vpn.jButton_Enter.setVisible(true);

                    vpn.jLabel_ContadorTiempo.setText(Integer.toString(inicio));

                    inicio--;

                    if (inicio == -1) {

                        timer.stop();

                    }

                }

            });

            timer.start();

        }

    }

}
