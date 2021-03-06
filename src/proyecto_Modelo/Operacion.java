/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.util.Random;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author alumno
 */
public class Operacion {

    private int cod_operacion;
    private int cod_nivel;
    private int cod_partida;
    private String op_generada;
    private int resultado;
    private String estado;

    private ClaseDAO dao = new ClaseDAO();

    /**
     * Constructor de la clase
     *
     * @param cod_nivel código de nivel
     * @param cod_partida código de partida
     */
    public Operacion(int cod_nivel, int cod_partida) {

        this.cod_operacion = dao.consultarCodigoOperaciones();
        this.cod_nivel = cod_nivel;
        this.cod_partida = cod_partida;
        this.op_generada = "";
        this.resultado = 0;
        this.estado = "NO RESUELTA";

    }

    /**
     * Método get
     *
     * @return código de operación
     */
    public int getCod_operacion() {
        return cod_operacion;
    }

    /**
     * Método set que establece el código de operación
     *
     * @param cod_operacion código de operación
     */
    public void setCod_operacion(int cod_operacion) {
        this.cod_operacion = cod_operacion;
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
     * @param cod_nivel código de nivel
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
     * @return operación matemática generada
     */
    public String getOp_generada() {
        return op_generada;
    }

    /**
     * Método set que establece la operación generada
     *
     * @param op_generada operación matemática generada
     */
    public void setOp_generada(String op_generada) {
        this.op_generada = op_generada;
    }

    /**
     * Método get
     *
     * @return resultado de la operación generada
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Método set que establece el resultado de la operación
     *
     * @param resultado resultado de la operación generada
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * Método get
     *
     * @return estado de la operación (RESUELTA o NO RESUELTA)
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método set que establece el estado de la operación
     *
     * @param estado estado de la operación (RESUELTA o NO RESUELTA)
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que establece los valores máximos de los valores generados en una
     * partida dependiendo del modo, dificultad y nivel de la partida
     *
     * @param modo modo de juego en el que se desarrolla la partida
     * @param dificultad dificultad de la partida
     * @param nivel nivel actual de la partida (ARCADE o STRINGS)
     * @return valor máximo del valor generado
     */
    public int getValorMaximo(String modo, String dificultad, int nivel) {

        int maximo = 0;

        // Con estos switches anidados se pretende dar un valor inicial que dependa del modo de juego y la dificultad, 
        // para posteriormente calcular el valor máximo final dependiendo del nivel en el que se encuentre
        // Solo los valores máximos de los valores involucrados en sumas, ya que en las multiplicaciones se mantiene constante (1 al 10) 
        switch (modo) {

            case "ARCADE":

                switch (dificultad) {

                    case "FACIL":

                        maximo = 100;

                        break;

                    case "NORMAL":

                        maximo = 100;

                        break;

                    case "DIFICIL":

                        maximo = 10000;

                        break;

                }

                break;

            case "TIME TRIAL":

                switch (dificultad) {

                    case "FACIL":

                        maximo = 100;

                        break;

                    case "NORMAL":

                        maximo = 100;

                        break;

                    case "DIFICIL":

                        maximo = 10000;

                        break;

                }

                break;

            case "STRINGS":

                switch (dificultad) {

                    case "FACIL":

                        maximo = 10;

                        break;

                    case "NORMAL":

                        maximo = 100;

                        break;

                    case "DIFICIL":

                        maximo = 1000;

                        break;

                }

                break;

        }

        if (nivel <= 3) {

        } else {

            do {

                maximo = maximo * 10;
                nivel = nivel - 3;

            } while (nivel > 3);

        }

        return maximo;

    }

    /**
     * Método que genera una operación matemática dependiendo del modo de juego,
     * dificultad y nivel actual de la partida
     *
     * @param modo modo de juego
     * @param dificultad dificultad establecida de la partida
     * @param nivel nivel en el que se encuentra la partida (ARCADE o STRINGS)
     * @return operación matemática 
     */
    public String generarOperacion(String modo, String dificultad, int nivel) {

        // https://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form
        Random aux = new Random();

        String cadenaOperacion = "";
        int operando1 = 0;
        int operando2 = 0;
        int auxiliar = 0;
        int aleatorio = 0;

        switch (modo) {

            // ***ARCADE*** Resuelve correctamente las 5 operaciones para superar el nivel
            // ***TIME TRIAL*** Resuelve el máximo número de operaciones antes del tiempo límite
            case "ARCADE":
            case "TIME TRIAL":

                switch (dificultad) {

                    case "FACIL":

                        // Calcula un número aleatorio entero entre 0 y 2 sin incluir el 2 (0 o 1)
                        aleatorio = aux.nextInt(2);

                        switch (aleatorio) {

                            // Suma   
                            case 0:

                                operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                operando2 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                cadenaOperacion = operando1 + " + " + operando2;

                                break;

                            // Resta    
                            case 1:

                                operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                operando2 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                cadenaOperacion = operando1 + " - " + operando2;

                                break;

                        }

                        break;

                    case "NORMAL":
                    case "DIFICIL":

                        aleatorio = aux.nextInt(4);

                        switch (aleatorio) {

                            // Suma   
                            case 0:

                                operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                operando2 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                cadenaOperacion = operando1 + " + " + operando2;

                                break;

                            // Resta    
                            case 1:

                                operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                operando2 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                cadenaOperacion = operando1 + " - " + operando2;

                                break;

                            // Multiplicación    
                            case 2:

                                operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                operando2 = (int) (Math.random() * 9) + 1; // Número aleatorio entre 2 y 10
                                cadenaOperacion = operando1 + " * " + operando2;

                                break;

                            // División
                            /* La razón por la que fallaba la división en la 
                                    dificultad NORMAL y DIFICIL se debe a que Java 
                                    generaba un número aleatorio entre 1 y el valor máximo establecido de acuerdo a su modo, 
                                    dificultad y nivel, y ese número es asignado a operando1. Cuando casualmente el valor 
                                    generado es un número primo, y tras haberse generado y asignado un número aleatorio limitado a valores 
                                    entre 2 y 10 a operando2, el programa entra en un loop sin fin
                                    al entrar en el bucle do-while del correspondiente switch*/
 /*A nivel de optimización esta forma no lo es en absoluto ya que el tamaño de los valores máximos va creciendo 
                                   conforme el usuario completa niveles, por lo que ese necesario un mayor número de cálculos hasta encontrar un múltiplo*/
                            case 3:

                                operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel)) / 10) + 1;
                                operando2 = (int) (Math.random() * 9) + 1; // Genera un valor entre 1 y 9
                                auxiliar = operando1 * operando2;

                                cadenaOperacion = auxiliar + " / " + operando2;

                                break;

                        }

                        break;

                }

                break;

            // ***STRINGS*** Supera las 3 cadenas de operaciones (compuestas por 5 operadores cada una) para superar el nivel
            case "STRINGS":

                int contador = 0;

                switch (dificultad) {

                    case "FACIL":

                        operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                        cadenaOperacion = "" + operando1;

                        do {

                            aleatorio = aux.nextInt(2);

                            switch (aleatorio) {

                                // Suma   
                                case 0:

                                    operando2 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                    cadenaOperacion += " + " + operando2;

                                    break;

                                // Resta    
                                case 1:

                                    operando2 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                    cadenaOperacion += " - " + operando2;

                                    break;

                            }

                            contador++;

                        } while (contador < 4);

                        break;

                    case "NORMAL":
                    case "DIFICIL":

                        operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                        cadenaOperacion = "" + operando1;

                        do {

                            if (contador != 3) {

                                aleatorio = aux.nextInt(4);

                            } else {

                                aleatorio = aux.nextInt(2);

                            }

                            switch (aleatorio) {

                                // Suma   
                                case 0:

                                    operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                    cadenaOperacion += " + " + operando1;
                                    contador += 1;

                                    break;

                                // Resta    
                                case 1:

                                    operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                    cadenaOperacion += " - " + operando1;
                                    contador += 1;

                                    break;

                                // Multiplicación    
                                case 2:

                                    operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel))) + 1;
                                    operando2 = (int) (Math.random() * 9) + 1;
                                    cadenaOperacion += " + " + operando1 + " * " + operando2;
                                    contador += 2;

                                    break;

                                // División
                                case 3:

                                    operando1 = (int) (Math.random() * (getValorMaximo(modo, dificultad, nivel)) / 10) + 1;
                                    operando2 = (int) (Math.random() * 9) + 1;
                                    auxiliar = operando1 * operando2;
                                    cadenaOperacion += " + " + auxiliar + " / " + operando2;
                                    contador += 2;

                                    break;

                            }

                        } while (contador < 4);

                        break;

                }

                break;

        }

        return cadenaOperacion;

    }

    /**
     * Método que evalúa una operación matemática
     *
     * @param operacion operación matemática
     * @return resultado de la operación
     */
    public int getResultado(String operacion) {

        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("JavaScript");

        int resultado = 0;

        try {

            resultado = (int) engine.eval(operacion);

        } catch (ScriptException se) {

            System.out.println("Imposible evaluar string: " + se.getMessage());

        }

        return resultado;

    }

}
