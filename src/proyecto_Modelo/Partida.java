/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alumno
 */
public class Partida {

    private static int cod_partida;
    private String modo_de_juego;
    private String dificultad;
    private String fecha_realizacion;
    private int puntuacion;
    private String nombre_usuario;
    private String nombre_jugador;

    private ClaseDAO dao = new ClaseDAO();
    private LocalDate fechaActual;

    /**
     * Constructor de clase
     *
     * @param dificultad dificultad de la partida
     * @param nombre_usuario nombre de usuario
     * @param nombre_jugador nombre de jugador
     */
    public Partida(String dificultad, String nombre_usuario, String nombre_jugador) {

        this.cod_partida = dao.ConsultarCodigoPartida();
        this.modo_de_juego = "TIME TRIAL";
        this.dificultad = dificultad;

        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha_realizacion = (fechaActual).format(dtf);

        this.puntuacion = 0;
        this.nombre_usuario = nombre_usuario;
        this.nombre_jugador = nombre_jugador;

    }

    /**
     * Método get
     *
     * @return fecha de realización de la partida
     */
    public String getFecha_realizacion() {
        return fecha_realizacion;
    }

    /**
     * Método set que establece la fecha de realización
     *
     * @param fecha_realizacion fecha en la que fue jugada la partida
     */
    public void setFecha_realizacion(String fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    /**
     * Método get
     *
     * @return código de partida
     */
    public int getCod_partida() {
        return cod_partida;
    }

    /**
     * Método que establece el código de partida
     *
     * @param cod_partida código de partida
     */
    public void setCod_partida(int cod_partida) {
        this.cod_partida = cod_partida;
    }

    /**
     * Método get
     *
     * @return modo de juego en el que se desarrolla la partida
     */
    public String getModo_de_juego() {
        return modo_de_juego;
    }

    /**
     * Método set que establece el modo de juego
     *
     * @param modo_de_juego modo de juego en el que se realiza la partida
     */
    public void setModo_de_juego(String modo_de_juego) {
        this.modo_de_juego = modo_de_juego;
    }

    /**
     * Método get
     *
     * @return dificultad en la que se desarrolla la partida
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Método set que establece la dificultad de la partida
     *
     * @param dificultad dificultad de la partida
     */
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Método get
     *
     * @return puntuación del jugador
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Método set que establece la puntuación del jugador
     *
     * @param puntuacion puntuación
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Método get
     *
     * @return nombre de usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * Método set que establece el nombre de usuario
     *
     * @param nombre_usuario nombre de usuario
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * Método get
     *
     * @return nombre de jugador
     */
    public String getNombre_jugador() {
        return nombre_jugador;
    }

    /**
     * Método set que establece el nombre de jugador
     *
     * @param nombre_jugador nombre de jugador
     */
    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    /**
     * Devuelve una cadena string con los valores de atributos
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Partida{" + "modo_de_juego=" + modo_de_juego + ", dificultad=" + dificultad + ", fecha_realizacion=" + fecha_realizacion + ", puntuacion=" + puntuacion + ", nombre_usuario=" + nombre_usuario + ", nombre_jugador=" + nombre_jugador + ", fechaActual=" + fechaActual + '}';
    }

}
