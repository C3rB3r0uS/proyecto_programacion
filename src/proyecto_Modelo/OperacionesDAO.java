/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class OperacionesDAO {
    
    Conexion conexion;
    
    public OperacionesDAO(){
        
        conexion = new Conexion();
        
    }
    
    public int consultarCodigo (){
        
        Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            PreparedStatement ps = accesoBD.prepareStatement("SELECT * FROM DEPART WHERE DEPT_NO=?");
//            ps.setString(1, );
            
            ResultSet rs = ps.executeQuery();
            
            
            
            conexion.closeConexion(accesoBD);
        }catch(SQLException e){
            System.out.println("Excepción SQL. consultarCodigo: " + e.getMessage());
        }
        
        
    
        return codigo;
        
    }
    
}
