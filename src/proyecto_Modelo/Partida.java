/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Partida {
    
    private static int cod_partida;
    private String modo_de_juego;
    private String dificultad;
    private LocalDate fecha_realizacion;
    private int puntuacion;
    private String nombre_usuario;
    private String nombre_jugador;

    public Partida(int cod_partida, String modo_de_juego, String dificultad, LocalDate fecha_realizacion, int puntuacion, String nombre_usuario, String nombre_jugador) {
        this.cod_partida = cod_partida;
        this.modo_de_juego = modo_de_juego;
        this.dificultad = dificultad;
        this.fecha_realizacion = fecha_realizacion;
        this.puntuacion = puntuacion;
        this.nombre_usuario = nombre_usuario;
        this.nombre_jugador = nombre_jugador;
      
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

    public LocalDate getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(LocalDate fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
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

}
