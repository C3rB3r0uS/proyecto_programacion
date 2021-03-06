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
    
    /**
     * Método actionPerformed que imprime cierto comportamiento a los elementos
     * JButton existentes en la clase
     */

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

        if (ae.getSource() == this.vpn.jButton_Enter) {

            if (timer.isRunning() == true) {

                operacion = new Operacion(nivel.getCod_nivel(), partida.getCod_partida());

                // Recojo la operación generada por el botón Start
                operacionGenerada = vpn.JLabel_Operacion.getText();

                // Llamo a la función que evalúa la operación matemática
                resultadoCorrecto = operacion.getResultado(operacionGenerada);

                //Utilizo try-catch para recoger el posible error al intentar convertir String en int
                try {

                    respuesta = Integer.parseInt(vpn.jTextField_Respuesta.getText());

                } catch (NumberFormatException nfe) {

                    this.vpn.jTextField_Respuesta.setText("");

                }

                if (respuesta != resultadoCorrecto) {

                    fallos = fallos + 1;
                    this.vpn.jLabel_ContadorFallos.setText(fallos + "");
                    this.vpn.jTextField_Respuesta.setText("");

                    if (fallos == 3) {

                        //REVISAR
//                        dao.insertarOperaciones(dao.consultarCodigoOperaciones(), nivel.getCod_nivel(), partida.getCod_partida(), operacionGenerada, resultadoCorrecto, "NO RESUELTA");
                        operacionGenerada = operacion.generarOperacion(partida.getModo_de_juego(), partida.getDificultad(), 1);
                        resultadoCorrecto = operacion.getResultado(operacionGenerada);
                        this.vpn.JLabel_Operacion.setText(operacionGenerada);

                        fallos = 0;
                        this.vpn.jLabel_ContadorFallos.setText(fallos + "");

                    }

                } else {

                    puntuacion = puntuacion + 1;
                    fallos = 0;
                    this.vpn.jLabel_ContadorPuntuacion.setText(puntuacion + "");
                    this.vpn.jLabel_ContadorFallos.setText(fallos + "");

                    // REVISAR
//                    dao.insertarOperaciones(dao.consultarCodigoOperaciones(), nivel.getCod_nivel(), partida.getCod_partida(), operacionGenerada, resultadoCorrecto, "RESUELTA");
                    operacionGenerada = operacion.generarOperacion(partida.getModo_de_juego(), partida.getDificultad(), 1);
                    resultadoCorrecto = operacion.getResultado(operacionGenerada);
                    this.vpn.JLabel_Operacion.setText(operacionGenerada);
                    this.vpn.jTextField_Respuesta.setText("");

                }

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

                        //REVISAR
                        
                        dao.insertarPartida(partida.getCod_partida(), partida.getModo_de_juego(), partida.getDificultad(), partida.getFecha_realizacion(), Integer.parseInt(vpn.jLabel_ContadorPuntuacion.getText()), jugador.getNombre_usuario(), jugador.getNombre_jugador());
//                        dao.insertarNiveles(nivel.getCod_nivel(), partida.getCod_partida(), nivel.getTipo(), nivel.getNro_nivel(), nivel.getEstado());

                        timer.stop();

                    }

                }

            });

            timer.start();

        }

    }

}
