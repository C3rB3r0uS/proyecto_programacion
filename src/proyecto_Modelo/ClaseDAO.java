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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class ClaseDAO {

    Conexion conexion;

    public ClaseDAO() {

        conexion = new Conexion();

    }

    //LOG IN
    public boolean ConsultarUserPass(String nombreUser, String passUser) {

        Connection accesoBD = conexion.getConexion();
        boolean resultado = false;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_USUARIO = " + "'" + nombreUser + "'" + " AND CONTRASENIA = " + "'" + passUser + "'");

            int cont = 0;

            if (rs.next()) {

                resultado = true;

            } else {

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Excepción al consultar User/Pass: " + e.getMessage());
        }

        return resultado;

    }

    public Jugador obtenerDatosJugador(String nombreUser, String passUser) {

        Connection accesoBD = conexion.getConexion();
        Jugador j = null;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_USUARIO = '" + nombreUser + "' AND CONTRASENIA = '" + passUser + "'");

            if (rs.next()) {

                j = new Jugador(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));

            } else {

                System.out.println("El usuario indicado no existe");
                System.out.println("NombreUser consultado: " + nombreUser);
                System.out.println("PassUser consultada: " + passUser);

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Error al obtener los datos del jugador: " + e.getMessage());

        }

        return j;

    }

    // VENTANA CREACIÓN DE CUENTA
    public boolean consultarDisponibilidadNombreUsuario(String nombreUsuario) {

        Connection accesoBD = conexion.getConexion();
        boolean resultado = true;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_USUARIO = " + "'" + nombreUsuario + "'");

            if (rs.next()) {

                resultado = false;

            } else {

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Excepción al consultar disponibilidad nombre usuario: " + e.getMessage());
        }

        return resultado;

    }

    public boolean consultarDisponibilidadNombreIngame(String nombreIngame) {

        Connection accesoBD = conexion.getConexion();
        boolean resultado = true;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM JUGADOR WHERE NOMBRE_JUGADOR = " + "'" + nombreIngame + "'");

            if (rs.next()) {

                resultado = false;

            } else {

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Excepción al consultar disponibilidad nombre ingame: " + e.getMessage());
        }

        return resultado;

    }

    public void crearCuenta(String nombreUsuario, String nombreJugador, String contrasenia, String nom_apellidos, String pais) {

        Connection accesoBD = conexion.getConexion();

        try {

            Statement s = accesoBD.createStatement();
            s.executeUpdate("INSERT INTO JUGADOR (NOMBRE_USUARIO,NOMBRE_JUGADOR,CONTRASENIA,NOM_APELLIDOS,PAIS) VALUES ('" + nombreUsuario + "','" + nombreJugador + "','" + contrasenia + "','" + nom_apellidos + "','" + pais + "')");

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Excepción SQL al insertar en tabla: " + e.getMessage());

        }

    }

    // Obtención de los códigos que identifican a cada partida, nivel u operación
    public int ConsultarCodigoPartida() {

        Connection accesoBD = conexion.getConexion();
        int codigo = 0;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_PARTIDA FROM PARTIDA WHERE COD_PARTIDA = (SELECT MAX(COD_PARTIDA) FROM PARTIDA)");

            if (rs.next()) {

                codigo = rs.getInt(1) + 1;

            } else {

                codigo = 1;

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {
            System.out.println("Excepción SQL al consultar CodigoPartida: " + e.getMessage());
        }

        return codigo;

    }

    public int ConsultarCodigoNiveles() {

        Connection accesoBD = conexion.getConexion();
        int codigo = 0;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_NIVEL FROM NIVELES WHERE COD_NIVEL = (SELECT MAX(COD_NIVEL) FROM NIVELES)");

            if (rs.next()) {

                codigo = rs.getInt(1) + 1;

            } else {

                codigo = 1;

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {
            System.out.println("Excepción SQL al consultar CodigoNiveles: " + e.getMessage());
        }

        return codigo;

    }

    public int consultarCodigoOperaciones() {

        Connection accesoBD = conexion.getConexion();
        int codigo = 0;

        try {

            Statement s = accesoBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_OPERACION FROM OPERACIONES WHERE COD_OPERACION = (SELECT MAX(COD_OPERACION) FROM OPERACIONES)");

            if (rs.next()) {

                codigo = rs.getInt(1) + 1;

            } else {

                codigo = 1;

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {
            System.out.println("Excepción SQL al consultar CodigoOperaciones: " + e.getMessage());
        }

        return codigo;

    }

    public ArrayList<Partida> obtenerPuntuaciones(String modo, String dificultad) {

        Connection accesoBD = conexion.getConexion();
        ArrayList<Partida> partidas = new ArrayList();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("SELECT * FROM PARTIDA WHERE MODO_DE_JUEGO =? AND DIFICULTAD=? ORDER BY PUNTUACION DESC");
            ps.setString(1, modo);
            ps.setString(2, dificultad);

            ResultSet rs = ps.executeQuery();

            Partida p;

            int contador = 1;

            while (rs.next() && contador <= 10) {

                p = new Partida(rs.getString(3), rs.getString(6), rs.getString(7));
                p.setPuntuacion(rs.getInt(5));

                partidas.add(p);

                contador++;
            }

//             if(rs.next() == false){
//                 
//                 p = new Partida ("NORMAL","PEDROB","C3RB3R0US");
//                 p.setPuntuacion(900);
//                 
//                 partidas.add(p);
//                 
//             }

        conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Excepción al obtener jugadores: " + e.getMessage());

        }

        JOptionPane.showMessageDialog(null, "Tamaño arrayList: " + partidas.size());

        return partidas;

    }
    
    public ArrayList<Partida> obtenerPartidas(String nombreUsuario, String nombreJugador){
        
        Connection accesoBD = conexion.getConexion();
        ArrayList<Partida> partidas = new ArrayList ();
        
        try{
            
            PreparedStatement ps = accesoBD.prepareStatement("SELECT * FROM PARTIDA WHERE NOMBRE_USUARIO = ? AND NOMBRE_JUGADOR = ?");
            ps.setString(1, nombreUsuario);
            ps.setString(2, nombreJugador);
            
            ResultSet rs = ps.executeQuery();
            
            Partida p;
            int contador = 1;
            
            while(rs.next() && contador <= 10){
                
                p = new Partida(rs.getString(3),rs.getString(6),rs.getString(7));
                p.setModo_de_juego(rs.getString(2));
                p.setPuntuacion(rs.getInt(5));
                
                partidas.add(p);
                
                contador++;
                
            }
            
            conexion.closeConexion(accesoBD);
            
        }catch(SQLException e){
            
            System.out.println("Excepción al obtener partidas: " + e.getMessage());
            
        }
        
        return partidas;
        
    }

    public void insertarPartida(int codPartida, String modoJuego, String dificultad, String fechaRealizacion, String nombreUsuario, String nombreJugador) {

        Connection accesoBD = conexion.getConexion();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("INSERT INTO TABLE PARTIDA VALUES (?,?,?,?,?,?)");
            ps.setInt(1, codPartida);
            ps.setString(2, modoJuego);
            ps.setString(3, dificultad);
            ps.setString(4, fechaRealizacion);
            ps.setString(5, nombreUsuario);
            ps.setString(6, nombreJugador);

            JOptionPane.showMessageDialog(null, "Insertado correctamente");

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Error al insertar en tabla Partida: " + e.getMessage());

        }

    }

    public void insertarNiveles(int codNivel, int codPartida, String tipo, int NroNivel, String estado) {

        Connection accesoBD = conexion.getConexion();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("INSERT INTO NIVELES VALUES (?,?,?,?,?)");
            ps.setInt(1, codNivel);
            ps.setInt(2, codPartida);
            ps.setString(3, tipo);
            ps.setInt(4, NroNivel);
            ps.setString(5, estado);

            JOptionPane.showMessageDialog(null, "Insertado correctamente");

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Error al insertar nivel: " + e.getMessage());

        }

    }

    public void insertarOperaciones(int codOperacion, int codNivel, int codPartida, String operacionGenerada, int resultado, String estado) {

        Connection accesoBD = conexion.getConexion();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("INSERT INTO OPERACIONES VALUES (?,?,?,?,?,?)");
            ps.setInt(1, codOperacion);
            ps.setInt(2, codNivel);
            ps.setInt(3, codPartida);
            ps.setString(4, operacionGenerada);
            ps.setInt(5, resultado);
            ps.setString(6, estado);

            JOptionPane.showMessageDialog(null, "Insertado correctamente");

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Fallo al insertar en operaciones: " + e.getMessage());

        }

    }

}
