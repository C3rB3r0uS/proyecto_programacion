/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Principal;

import proyecto_Controlador.Controlador_Log_In;
import proyecto_Vista.Ventana_Log_in;

/**
 *
 * @author alumno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Ventana_Log_in vli = new Ventana_Log_in();
        Controlador_Log_In clg = new Controlador_Log_In(vli);
        
        vli.setVisible(true);
        
    }
    
}
