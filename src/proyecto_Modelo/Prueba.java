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
public class Prueba {
    
    public static void main(String[] args) throws ScriptException {
        
        Operaciones op = new Operaciones (1,1,1);
              
//        System.out.println("1. " + op.valorMaximo("STRINGS", "FACIL", 1)); // 10
//        System.out.println("2. " + op.valorMaximo("STRINGS", "FACIL", 4)); // 100
//        System.out.println("3. " + op.valorMaximo("STRINGS", "NORMAL", 4)); //1000
//        System.out.println("4. " + op.valorMaximo("TIME TRIAL", "FACIL", 1)); // 100
//        System.out.println("5. " + op.valorMaximo("TIME TRIAL", "FACIL", 4)); // 1000
//        System.out.println("6. " + op.valorMaximo("TIME TRIAL", "NORMAL", 4)); //1000
//        System.out.println("7. " + op.valorMaximo("ARCADE", "NORMAL", 1)); // 100
//        System.out.println("8. " + op.valorMaximo("ARCADE", "NORMAL", 4)); //1000
//        System.out.println("9. " + op.valorMaximo("ARCADE", "FACIL", 7)); // 10000
       

        //*** DIFICULTAD FACIL ***

//        System.out.println("1. " + op.generarOperacion("ARCADE", "FACIL", 1));
//        System.out.println("2. " + op.generarOperacion("ARCADE", "FACIL", 4));
//        System.out.println("3. " + op.generarOperacion("TIME TRIAL", "FACIL", 1));
//        System.out.println("4. " + op.generarOperacion("TIME TRIAL", "FACIL", 4));
//        System.out.println(op.generarOperacion("STRINGS", "FACIL", 1));
//        System.out.println(op.generarOperacion("STRINGS", "FACIL", 4));
        
        //*** DIFICULTAD MEDIA ***
        
//        System.out.println("1. " + op.generarOperacion("ARCADE", "NORMAL", 1));
//        System.out.println("2. " + op.generarOperacion("TIME TRIAL", "NORMAL", 4));
        System.out.println(op.generarOperacion("STRINGS", "NORMAL", 1));
//        System.out.println("3. " + op.generarOperacion("STRINGS", "NORMAL", 4));
              

        /*Case 3: division
        Entra al do-while
        java.lang.Double cannot be cast to java.lang.Integer
        La cadena generada era: 99 / 5
        El resultado es:0
        El resultado es: 0
        1. 99 / 5*/
        
//        int i = 0;
    
        // IMPRIMTE ENTRE 1 Y 9
        
//        do{
//         int operando2 = (int)(Math.random()*9)+1;
//         System.out.println("operando2 = " + operando2);
//         i++;
//        }while(i < 50);


        //IMPRIME ENTRE 2 Y 10

//        do{
//         int operando2 = (int)(Math.random()*9)+2;
//         System.out.println("operando2 = " + operando2);
//         i++;
//        }while(i < 50);


//        int maximo = 1000;
//        int aux = 0;
//        String operacion = "";
//        
//        int operando1 = (int)(Math.random()*(maximo/10))+1;
//        int operando2 = (int)(Math.random()*9)+1;
//        
//        aux = operando1*operando2;
//        operacion = aux + " / " + operando2;
//        
//        System.out.println("operando1 = " + operando1);
//        System.out.println("operando2 = " + operando2);
//        
//        System.out.println("aux = " + aux);
//        System.out.println(operacion);
        


    }
    
}
