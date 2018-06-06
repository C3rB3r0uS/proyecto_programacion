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
public class Operaciones {
    
    private static int cod_operacion;
    private int cod_nivel;
    private int cod_partida;
    private String op_generada;
    private int resultado;
    private String estado;

    public Operaciones(int cod_operacion, int cod_nivel, int cod_partida) {
        
        this.cod_operacion = cod_operacion;
        this.cod_nivel = cod_nivel;
        this.cod_partida = cod_partida;
 
    }

    public int getCod_operacion() {
        return cod_operacion;
    }

    public void setCod_operacion(int cod_operacion) {
        this.cod_operacion = cod_operacion;
    }

    public int getCod_nivel() {
        return cod_nivel;
    }

    public void setCod_nivel(int cod_nivel) {
        this.cod_nivel = cod_nivel;
    }

    public int getCod_partida() {
        return cod_partida;
    }

    public void setCod_partida(int cod_partida) {
        this.cod_partida = cod_partida;
    }

    public String getOp_generada() {
        return op_generada;
    }

    public void setOp_generada(String op_generada) {
        this.op_generada = op_generada;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int valorMaximo (String modo, String dificultad, int nivel){
        
        int maximo = 0;
        
        // Con estos switches anidados se pretende dar un valor inicial que dependa del modo de juego y la dificultad, 
        // para posteriormente calcular el valor máximo final dependiendo del nivel en el que se encuentre
        // Solo los valores máximos de los valores involucrados en sumas, ya que en las multiplicaciones se mantiene constante (1 al 10) 
        
        switch(modo){

            case "ARCADE":
                
                switch(dificultad){
                    
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
                
                switch(dificultad){
                    
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
                
                switch(dificultad){
                    
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

        if(nivel <= 3){
   
        }else{
            
            do{
                
                maximo = maximo*10;
                nivel = nivel - 3;
                
            }while(nivel > 3);
             
            }
        
        return maximo;

    }
    
    public String generarOperacion (String modo, String dificultad, int nivel){
        
        Random aux = new Random ();
        String cadenaOperacion = "";
        int resultado = 0;
        int operador1 = 0;
        int operador2 = 0;
        int aleatorio = 0;
        
        switch(modo){
            
            // ***ARCADE*** Resuelve correctamente las 5 operaciones para superar el nivel
            // ***TIME TRIAL*** Resuelve el máximo número de operaciones antes del tiempo límite
            
            case "ARCADE": case "TIME TRIAL":
                
                switch(dificultad){
                
                    case "FACIL":
                        
                    // Calcula un número aleatorio entero entre 0 y 2 sin incluir el 2 (0 o 1)
                        
                    aleatorio = aux.nextInt(2);
                            
                            switch(aleatorio){
                                
                                // Suma   
                                
                                case 0:
                                    
                                    // Con +1 -1 se consigue que el valor 1 entre dentro del rango de los números generados
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion = operador1 + " + " + operador2;
                                    resultado = operador1 + operador2;
                                 
                                    break;
                                    
                                // Resta    
                                 
                                case 1:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion = operador1 + " - " + operador2;
                                    resultado = operador1 - operador2;
                                    
                                    break;
    
                            }
                      
                        break;
                        
                    case "NORMAL":
                        
                         aleatorio = aux.nextInt(4);
                            
                            switch(aleatorio){
                                
                                // Suma   
                                
                                case 0:
                                    
                                    // Con +1 -1 se consigue que el valor 1 entre dentro del rango de los números generados
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion = operador1 + " + " + operador2;
                                    resultado = operador1 + operador2;
                                 
                                    break;
                                    
                                // Resta    
                                 
                                case 1:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion = operador1 + " - " + operador2;
                                    resultado = operador1 - operador2;
                                    
                                    break;
                                    
                                // Multiplicación    
                                    
                                case 2:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)(Math.random()*9)+2;
                                    
                                    cadenaOperacion = operador1 + " * " + operador2;
                                    resultado = operador1 * operador2;
                                    
                                    break;
                                    
                                // División
                                    
                                case 3:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    
                                    // Con este bucle do-while se pretende generar valores aleatorios que generen resultados exactos de la división
                                    // ,es decir, que el resto sea 0
                                    
                                    do{
                                    
                                    operador2 = (int)(Math.random()*9)+2;
                                    
                                    // El segundo operando debe de ser mayor que 0 y resultado exacto al dividirse con operador1
                                    
                                    }while(operador2 <= 0 || operador1 % operador2 != 0);
                                    
                                    cadenaOperacion = operador1 + " / " + operador2;
                                    resultado = operador1 / operador2;
                                    
                                    break;
    
                            }
                        
                        break;
                        
                    case "DIFICIL":
                        
                        aleatorio = aux.nextInt(4);
                            
                            switch(aleatorio){
                                
                                // Suma   
                                
                                case 0:
                                    
                                    // Con +1 -1 se consigue que el valor 1 entre dentro del rango de los números generados
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion = operador1 + " + " + operador2;
                                    resultado = operador1 + operador2;
                                 
                                    break;
                                    
                                // Resta    
                                 
                                case 1:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion = operador1 + " - " + operador2;
                                    resultado = operador1 - operador2;
                                    
                                    break;
                                    
                                // Multiplicación    
                                    
                                case 2:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    operador2 = (int)(Math.random()*9)+2;
                                    
                                    cadenaOperacion = operador1 + " * " + operador2;
                                    resultado = operador1 * operador2;
                                    
                                    break;
                                    
                                // División
                                    
                                case 3:
                                    
                                    operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    
                                    // Con este bucle do-while se pretende generar valores aleatorios que generen resultados exactos de la división
                                    // ,es decir, que el resto sea 0
                                    
                                    do{
                                    
                                    operador2 = (int)(Math.random()*9)+2;
                                    
                                    // El segundo operando debe de ser mayor que 0 y resultado exacto al dividirse con operador1
                                    
                                    }while((operador2 <= 0 || operador1 % operador2 != 0));
                                    
                                    cadenaOperacion = operador1 + " / " + operador2;
                                    resultado = operador1 / operador2;
                                    
                                    break;
    
                            }
                        
                        break;
 
                }
                
                break;
                
            // ***STRINGS*** Supera las 3 cadenas de operaciones (compuestas por 5 operadores cada una) para superar el nivel
                
            case "STRINGS":
                
                int contador = 0;
                
                switch(dificultad){
              
                    case "FACIL":
                        
                        operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                        resultado = operador1;
                        cadenaOperacion = " " + operador1;

                        do{
                            
                            aleatorio = aux.nextInt(2);
                            
                            switch(aleatorio){
                                
                                // Suma   
                                
                                case 0:
                                    
                                    // Con +1 -1 se consigue que el valor 1 entre dentro del rango de los números generados
                                    
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion += " + " + operador2;
                                    resultado += operador2;
                                 
                                    break;
                                    
                                // Resta    
                                 
                                case 1:
                                    
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion += " - " + operador2;
                                    resultado -= operador2;
                                    
                                    break;
   
                            }
                            
                            contador++;
 
                            }while(contador < 5);
                                     
                        break;
                        
                    case "NORMAL":
                        
                        operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                        cadenaOperacion = "" + operador1;
                        
                      do{
                            
                            aleatorio = aux.nextInt(4);
                            
                            switch(aleatorio){
                                
                                // Suma   
                                
                                case 0:
                                    
                                    // Con +1 -1 se consigue que el valor 1 entre dentro del rango de los números generados
                                    
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion += " + " + operador2;
                                    resultado += operador2;
                                 
                                    break;
                                    
                                // Resta    
                                 
                                case 1:
                                    
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion += " - " + operador2;
                                    resultado -= operador2;
                                    
                                    break;
                                    
                                // Multiplicación    
                                    
                                case 2:
                                    
                                    operador2 = (int)(Math.random()*9)+2;
                                    cadenaOperacion += " * " + operador2;
                                    resultado *= operador2;
                                    
                                    break;
                                    
                                // División
                                    
                                case 3:
                               
                                    // Con este bucle do-while se pretende generar valores aleatorios que generen resultados exactos de la división
                                    // ,es decir, que el resto sea 0
                                    
                                    do{
                                    
                                    // Valores entre 2 y 10
                                        
                                    operador2 = (int)(Math.random()*9)+2;
                                    
                                    }while(operador1 % operador2 != 0);
                                    
                                    cadenaOperacion += " / " + operador2;
                                    resultado /= operador2;
                                    
                                    break;
    
                            }
                            
                            contador++;
 
                            }while(contador < 5);
                        
                        break;
                        
                    case "DIFICIL":
                        
                        operador1 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                        cadenaOperacion = "" + operador1;
                        
                      do{
                            
                            aleatorio = aux.nextInt(4);
                            
                            switch(aleatorio){
                                
                                // Suma   
                                
                                case 0:
                                    
                                    // Con +1 -1 se consigue que el valor 1 entre dentro del rango de los números generados
                                    
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion += " + " + operador2;
                                    resultado += operador2;
                                 
                                    break;
                                    
                                // Resta    
                                 
                                case 1:
                                    
                                    operador2 = (int)Math.floor(Math.random()*(valorMaximo(modo,dificultad,nivel) - 1) + 1);
                                    cadenaOperacion += " - " + operador2;
                                    resultado -= operador2;
                                    
                                    break;
                                    
                                // Multiplicación    
                                    
                                case 2:
                                    
                                    operador2 = (int)(Math.random()*9)+2;
                                    cadenaOperacion += " * " + operador2;
                                    resultado *= operador2;
                                    
                                    break;
                                    
                                // División
                                    
                                case 3:
                               
                                    // Con este bucle do-while se pretende generar valores aleatorios que generen resultados exactos de la división
                                    // ,es decir, que el resto sea 0
                                    
                                    do{
                                        
                                    // Valores entre 2 y 10
                                    
                                    operador2 = (int)(Math.random()*9)+2;
                                    
                                    }while(operador1 % operador2 != 0);
                                    
                                    cadenaOperacion += " / " + operador2;
                                    resultado /= operador2;
                                    
                                    break;
    
                            }
                            
                            contador++;
 
                            }while(contador < 5);
                        
                        break;
                     
                }
                
                break;

        }
        
        System.out.println("El resultado es: " + resultado);

        return cadenaOperacion;

    }
    
}
