/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Conexion {
    
    public Conexion(){
        
    }
    
    public Connection getConexion (){
        
        Connection conn = null;
        
        try{
            
            try{
                
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:random/random@localhost:1521:XE");
                 
            }catch(SQLException e){
                
                System.out.println("Clase no encontrada: " + e.getMessage());
                
            }
  
        }catch(ClassNotFoundException e){
            
            System.out.println("Clase no encontrada: " + e.getMessage());
            
        }
        
        return conn;
        
    }
    
    public void closeConexion (Connection conn){
        
        try{
            
            conn.close();
            
        }catch(SQLException e){
            
            System.out.println("Error SQL: " + e.getMessage());
            
        }
 
    }
    
}
