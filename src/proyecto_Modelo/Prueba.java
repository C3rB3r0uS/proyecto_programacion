/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import proyecto_Controlador.Controlador_creacion_cuenta;
import proyecto_Controlador.Controlador_seleccion;
import proyecto_Vista.Ventana_Creacion_Cuenta;
import proyecto_Vista.Ventana_Seleccion;

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
//        System.out.println(op.generarOperacion("STRINGS", "DIFICIL", 1));
//        System.out.println(op.generarOperacion("STRINGS", "NORMAL", 4));

        // *** DIFICULTAD DIFICIL ***
        
//                System.out.println("3. " + op.generarOperacion("STRINGS", "DIFICIL", 1));
//                System.out.println("3. " + op.generarOperacion("STRINGS", "DIFICIL", 4));
              

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
        

        ClaseDAO d = new ClaseDAO();
//        System.out.println("Código de partida: " + d.ConsultarCodigoPartida());
//        System.out.println("Código de nivel: " + d.ConsultarCodigoNiveles());
//        System.out.println("Código de operación: " + d.consultarCodigoOperaciones());
//        System.out.println("Resultado disponibilidad de nombre usuario: " + d.consultarDisponibilidadNombreUsuario("random"));
//         System.out.println("Resultado disponibilidad de nombre ingame: " + d.consultarDisponibilidadNombreIngame("random"));
//        
//        System.out.println("Resultado disponibilidad de nombre usuario: " + d.consultarDisponibilidadNombreUsuario("PEDROB"));
//         System.out.println("Resultado disponibilidad de nombre ingame: " + d.consultarDisponibilidadNombreIngame("C3RB3R0US"));
  
        
//        boolean respuesta = d.ConsultarUserPass("PEDROB", "A4B7C899091");
//        System.out.println("La respuesta es: " + respuesta);

            Jugador j = d.obtenerDatosJugador("PEDROB", "A4B7C899091");
//            System.out.println(j);

//        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate ld = LocalDate.now();
//        
//        System.out.println("La fecha actual es: " + dtf.format(ld));
//
//            for (int i = 1; i < 10; i++) {
//                
//                int random = (int)(Math.random()*10)+1;
//                System.out.println("random = " + random);
//            
//        }
        
        Ventana_Seleccion vs = new Ventana_Seleccion ();
        Controlador_seleccion cs = new Controlador_seleccion (vs, j);
        vs.setVisible(true);



    }
    
}
