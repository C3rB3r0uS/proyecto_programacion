/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.sql.Connection;
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
      
    //LOG IN
    
    public boolean ConsultarUserPass(String nombreUser, String passUser){
        
        Connection accesoBD = conexion.getConexion();
        boolean resultado = false;

        try{

           Statement s = accesoBD.createStatement();
           ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_USUARIO = " + "'" + nombreUser + "'" + " AND CONTRASENIA = " + "'" + passUser + "'" );
            
           int cont = 0;
           
           if(rs.next()){
               
               resultado = true;

           }else{
                    
           }
  
        }catch(SQLException e){
            
            System.out.println("Excepción al consultar User/Pass: " + e.getMessage());
            }
        
            return resultado;

       }
    
    public Jugador obtenerDatosJugador (String nombreUser, String passUser){
        
        Connection accesoBD = conexion.getConexion();
        Jugador j = null;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_USUARIO = '" + nombreUser + "' AND CONTRASENIA = '" + passUser + "'");
            
            if(rs.next()){
                
                j = new Jugador (rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                
            }else{
                
                System.out.println("El usuario indicado no existe");
                System.out.println("NombreUser consultado: " + nombreUser);
                System.out.println("PassUser consultada: " + passUser);
                
            }
            
        }catch(SQLException e){
            
            System.out.println("Error al obtener los datos del jugador: " + e.getMessage());
            
        }
        
        return j;
        
    }
    
    // VENTANA CREACIÓN DE CUENTA
    
    public boolean consultarDisponibilidadNombreUsuario (String nombreUsuario){
        
        Connection accesoBD = conexion.getConexion();
        boolean resultado = true;

        try{

           Statement s = accesoBD.createStatement();
           ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_USUARIO = " + "'" + nombreUsuario + "'");          
           
           if(rs.next()){
               
               resultado = false;

           }else{
                    
           }
  
        }catch(SQLException e){
            
            System.out.println("Excepción al consultar disponibilidad nombre usuario: " + e.getMessage());
            }
        
            return resultado;
   
        }
    
     public boolean consultarDisponibilidadNombreIngame (String nombreIngame){
        
        Connection accesoBD = conexion.getConexion();
        boolean resultado = true;

        try{

           Statement s = accesoBD.createStatement();
           ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_JUGADOR = " + "'" + nombreIngame + "'");

           if(rs.next()){
               
               resultado = false;

           }else{
           
           }
  
        }catch(SQLException e){
            
            System.out.println("Excepción al consultar disponibilidad nombre ingame: " + e.getMessage());
            }
        
            return resultado;
   
        }
     
         public void crearCuenta (String nombreUsuario, String nombreJugador, String contrasenia,String nom_apellidos, String pais){
        
        Connection accesoBD = conexion.getConexion();
        
        try{
            
            Statement s = accesoBD.createStatement();
            s.executeUpdate("INSERT INTO JUGADOR (NOMBRE_USUARIO,NOMBRE_JUGADOR,CONTRASENIA,NOM_APELLIDOS,PAIS) VALUES ('"+nombreUsuario+"','"+nombreJugador+"','"+contrasenia+"','"+nom_apellidos+"','"+pais+"')");
            
        }catch(SQLException e){
            
            System.out.println("Excepción SQL al insertar en tabla: " + e.getMessage());
            
        }
        
    }
         
         
     // Obtención de los códigos que identifican a cada partida, nivel u operación
     
    public int ConsultarCodigoPartida(){
        
        Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_PARTIDA FROM PARTIDA WHERE COD_PARTIDA = (SELECT MAX(COD_PARTIDA) FROM PARTIDA)");
            
            if(rs.next()){
                
                codigo = rs.getInt(1);
                
            }else{
                
                codigo = 1;
                
            }

            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            System.out.println("Excepción SQL al consultar CodigoPartida: " + e.getMessage());
        }
        
        return codigo;
        
    }
    
    public int ConsultarCodigoNiveles(){
        
         Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_NIVEL FROM NIVELES WHERE COD_NIVEL = (SELECT MAX(COD_NIVEL) FROM NIVELES)");
            
            if(rs.next()){
                
                codigo = rs.getInt(1);
                
            }else{
                
                codigo = 1;
                
            }
         
            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            System.out.println("Excepción SQL al consultar CodigoNiveles: " + e.getMessage());
        }
        
        return codigo;
        
    }
    
    
    public int consultarCodigoOperaciones (){
        
        Connection accesoBD = conexion.getConexion();
        int codigo = 0;
        
        try{
            
            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_OPERACION FROM OPERACIONES WHERE COD_OPERACION = (SELECT MAX(COD_OPERACION) FROM OPERACIONES)");
           
            if(rs.next()){
                
                codigo = rs.getInt(1);
                
            }else{
                
                codigo = 1;
                
            }

            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            System.out.println("Excepción SQL al consultar CodigoOperaciones: " + e.getMessage());
        }

        return codigo;
        
    }
    
}
