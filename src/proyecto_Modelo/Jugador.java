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

    /**
     * Constructor de la clase
     *
     * @param nombre_usuario
     * @param nombre_jugador
     * @param contrasenia
     * @param nom_apellidos
     * @param pais
     */
    public Jugador(String nombre_usuario, String nombre_jugador, String contrasenia, String nom_apellidos, String pais) {

        this.nombre_usuario = nombre_usuario;
        this.nombre_jugador = nombre_jugador;
        this.contrasenia = contrasenia;
        this.nom_apellidos = nom_apellidos;
        this.pais = pais;

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
     * Método get
     *
     * @return contraseña
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Método set que establece la contraseña
     *
     * @param contrasenia contraseña
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Método get
     *
     * @return nombre y apellidos
     */
    public String getNom_apellidos() {
        return nom_apellidos;
    }

    /**
     * Método set que establece los nombres y los apellidos
     *
     * @param nom_apellidos nombres y apellidos
     */
    public void setNom_apellidos(String nom_apellidos) {
        this.nom_apellidos = nom_apellidos;
    }

    /**
     * Método get
     *
     * @return país de residencia
     */
    public String getPais() {
        return pais;
    }

    /**
     * Método set que establece el país
     *
     * @param pais país de residencia
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Devuelve una cadena string con los valores de atributos
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Jugador{" + "nombre_usuario=" + nombre_usuario + ", nombre_jugador=" + nombre_jugador + ", contrasenia=" + contrasenia + ", nom_apellidos=" + nom_apellidos + ", pais=" + pais + '}';
    }

}
