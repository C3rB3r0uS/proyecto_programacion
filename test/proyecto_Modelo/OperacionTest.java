/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getValorMaximo method, of class Operacion.
     */
    @Test
    public void testGetValorMaximo() {
        System.out.println("getValorMaximo");
        String modo = "STRINGS";
        String dificultad = "FACIL";
        int nivel = 4;
        Operacion instance = new Operacion(1,1);
        int expResult = 100;
        int result = instance.getValorMaximo(modo, dificultad, nivel);
        assertEquals(expResult, result);
       
    }
 
}
