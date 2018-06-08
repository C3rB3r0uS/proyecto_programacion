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
import java.sql.Statement;

/**
 *
 * @author alumno
 */
public class ClaseDAO {
    
    Conexion conexion;
    
    public ClaseDAO(){
        
        conexion = new Conexion();
        
    }
    
    public int consultarCodigoPartida(){
        
        Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_PARTIDA FROM PARTIDA WHERE COD_PARTIDA = (SELECT MAX(COD_PARTIDA) FROM PARTIDA)");
            codigo = rs.getInt(1);
            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            System.out.println("Excepción SQL. consultarCodigo: " + e.getMessage());
        }
        
        return codigo;
        
    }
    
    public int ConsultarCodigoNiveles(){
        
         Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_NIVEL FROM NIVELES WHERE COD_OPERACION = (SELECT MAX(COD_NIVEL) FROM NIVELES)");
            codigo = rs.getInt(1);
            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            System.out.println("Excepción SQL. consultarCodigo: " + e.getMessage());
        }
        
        return codigo;
        
    }
    
    
    public int consultarCodigoOperaciones (){
        
        Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_OPERACION FROM OPERACIONES WHERE COD_OPERACION = (SELECT MAX(COD_OPERACION) FROM OPERACIONES)");
            codigo = rs.getInt(1);
            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            System.out.println("Excepción SQL. consultarCodigo: " + e.getMessage());
        }

        return codigo;
        
    }
    
}
