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
public class Prueba {
    
    public static void main(String[] args) {
        
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
       
//        System.out.println("1. " + op.generarOperacion("ARCADE", "FACIL", 1));
//        System.out.println("2. " + op.generarOperacion("ARCADE", "FACIL", 4));
//        System.out.println("3. " + op.generarOperacion("STRING", "FACIL", 1));
        System.out.println("4. " + op.generarOperacion("STRINGS", "FACIL", 1));
        System.out.println("5. " + op.generarOperacion("STRINGS", "NORMAL", 1));
        System.out.println("6. " + op.generarOperacion("STRINGS", "DIFICIL", 1));
//        System.out.println("7. " + op.generarOperacion("TIME TRIAL", "NORMAL", 4));
        
//        int i = 1;
//        
//        while(i < 20){
//        
//         int operador2 = (int)(Math.random()* 9) +2;
//            System.out.println(operador2);
//         i++;
//         
//        }
    

    }
    
}
