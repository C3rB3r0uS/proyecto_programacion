/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

/**
 *
 * @author alumno
 */
public class Jugador {
    
    private String nombre_usuario;
    private String nombre_jugador;
    private String contrasenia;
    private String nom_apellidos;
    private String pais;

    public Jugador(String nombre_usuario, String nombre_jugador, String contrasenia, String nom_apellidos, String pais) {
        
        this.nombre_usuario = nombre_usuario;
        this.nombre_jugador = nombre_jugador;
        this.contrasenia = contrasenia;
        this.nom_apellidos = nom_apellidos;
        this.pais = pais;
        
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNom_apellidos() {
        return nom_apellidos;
    }

    public void setNom_apellidos(String nom_apellidos) {
        this.nom_apellidos = nom_apellidos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre_usuario=" + nombre_usuario + ", nombre_jugador=" + nombre_jugador + ", contrasenia=" + contrasenia + ", nom_apellidos=" + nom_apellidos + ", pais=" + pais + '}';
    }
    
}
