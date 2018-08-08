/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Nivel {

    private int cod_nivel;
    private int cod_partida;
    private String tipo;
    private int nro_nivel;
    private String estado;

    private ClaseDAO dao = new ClaseDAO();

    /**
     * Método constructor
     *
     * @param cod_partida código único de partida
     */
    public Nivel(int cod_partida) {

        this.cod_nivel = dao.ConsultarCodigoNivel();
        this.cod_partida = cod_partida;
        this.tipo = "NORMAL";
        this.nro_nivel = 1;
        this.estado = "SUPERADO";

    }

    /**
     * Método get
     *
     * @return código de nivel
     */
    public int getCod_nivel() {
        return cod_nivel;
    }

    /**
     * Método set que establece el código de nivel
     *
     * @param cod_nivel
     */
    public void setCod_nivel(int cod_nivel) {
        this.cod_nivel = cod_nivel;
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
     * Método set que establece el código de partida
     *
     * @param cod_partida código de partida
     */
    public void setCod_partida(int cod_partida) {
        this.cod_partida = cod_partida;
    }

    /**
     * Método get
     *
     * @return tipo de nivel
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método set que establece el tipo de nivel
     *
     * @param tipo tipo de nivel (NORMAL o MADNESS)
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método get
     *
     * @return número de nivel
     */
    public int getNro_nivel() {
        return nro_nivel;
    }

    /**
     * Método set que establece el número de nivel
     *
     * @param nro_nivel número de nivel
     */
    public void setNro_nivel(int nro_nivel) {
        this.nro_nivel = nro_nivel;
    }

    /**
     * Método get
     *
     * @return estado del nivel (SUPERADO o NO SUPERADO)
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método set que establece el estado del nivel
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve una cadena string con los valores de atributos
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Niveles{" + "cod_nivel=" + cod_nivel + ", cod_partida=" + cod_partida + ", tipo=" + tipo + ", nro_nivel=" + nro_nivel + ", estado=" + estado + '}';
    }

    /**
     * Método que retorna el tiempo máximo del nivel indicado en el parámetro en
     * una partida ARCADE o STRINGS
     *
     * @param nivel nivel actual de la partida
     * @return el tiempo máximo del que dispone el usuario en el nivel indicado
     */
    public int getTiempo(int nivel) {

        int tiempo = 0;

        if (nivel == 1 || nivel % 3 == 1) {

            tiempo = 60;

        } else if (nivel == 2 || nivel % 3 == 2) {

            tiempo = 55;

        } else {

            tiempo = 50;

        }

        return tiempo;
    }

    /**
     * Genera un número aleatorio entre 1 y 10 con el fin de simular unos
     * porcentajes 80 y 20% de que se genere un nivel normal o madness en una
     * partida ARCADE o STRINGS
     *
     * @return tipo de nivel
     */
    public String aleatorizadorTipoNivel() {

        Random aleatorio = new Random();

        int num = aleatorio.nextInt(10 - 1) + 1;

        if (num <= 2) {

            this.tipo = "MADNESS";

        } else {

            this.tipo = "NORMAL";

        }

        return this.tipo;
    }

}
