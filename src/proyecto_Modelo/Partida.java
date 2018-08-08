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
    
    ClaseDAO d = new ClaseDAO();
    LocalDate fechaActual;

    public Partida(String dificultad, String nombre_usuario, String nombre_jugador) {
        
        this.cod_partida = d.ConsultarCodigoPartida();
        this.modo_de_juego = "TIME TRIAL";
        this.dificultad = dificultad;
        
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha_realizacion = (fechaActual).format(dtf);
        
        this.puntuacion = 0;
        this.nombre_usuario = nombre_usuario;
        this.nombre_jugador = nombre_jugador;
      
    }

    public String getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(String fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }
    
    public int getCod_partida() {
        return cod_partida;
    }

    public void setCod_partida(int cod_partida) {
        this.cod_partida = cod_partida;
    }

    public String getModo_de_juego() {
        return modo_de_juego;
    }

    public void setModo_de_juego(String modo_de_juego) {
        this.modo_de_juego = modo_de_juego;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    @Override
    public String toString() {
        return "Partida{" + "modo_de_juego=" + modo_de_juego + ", dificultad=" + dificultad + ", fecha_realizacion=" + fecha_realizacion + ", puntuacion=" + puntuacion + ", nombre_usuario=" + nombre_usuario + ", nombre_jugador=" + nombre_jugador + ", fechaActual=" + fechaActual + '}';
    }

    
    
}
