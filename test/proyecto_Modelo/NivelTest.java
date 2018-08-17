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
public class NivelTest {
    
    public NivelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTiempo method, of class Nivel.
     */
    @Test
    public void testGetTiempo() {
        System.out.println("getTiempo");
        int nivel = 17;
        Nivel instance = new Nivel(1);
        int expResult = 55;
        int result = instance.getTiempo(nivel);
        assertEquals(expResult, result);
        
    }
    
}
