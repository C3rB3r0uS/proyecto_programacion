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

    private Conexion conexion;

    public ClaseDAO() {

        conexion = new Conexion();

    }

    /**
     * Comprueba en la base de datos que las credenciales introducidas por el
     * usuario coincidan con alguna de las cuentas almacenadas en la base de
     * datos.
     *
     * @param nombreUser nombre de usuario
     * @param passUser contraseña del usuario
     * @return valor booleano que confirme la existencia de la cuenta y los
     * credenciales almacenados
     */
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

    /**
     * Obtiene todos los datos almacenados en la base de datos, perteneciente al
     * usuario.
     *
     * @param nombreUser nombre del usuario
     * @param passUser contraseña del usuario
     * @return objeto Jugador con toda la información del usuario
     */
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

    /**
     * Comprueba la disponibilidad del nombre de usuario ingresado por el
     * usuario del sistema
     *
     * @param nombreUsuario nombre de usuario
     * @return boolean, indicando si ya existe alguna cuenta con el nombre de
     * usuario introducido por el usuario
     */
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

    /**
     * Comprueba la disponibilidad del nombre de jugador ingresado por el
     * usuario del sistema
     *
     * @param nombreIngame nombre de Jugador, o nombre por el que se reconocerá
     * al usuario dentro del sistema
     * @return boolean, indicando si ya existe alguna cuenta con el nombre de
     * Jugador introducido por el usuario
     */
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

    /**
     * Inserta en la base de datos correspondiente la cuenta con la información
     * ingresada por el usuario
     *
     * @param nombreUsuario nombre de usuario, con el que el usuario podrá hacer
     * log in en el sistema
     * @param nombreJugador nombre de jugador, con el que se identificará al
     * usuario dentro del sistema
     * @param contrasenia contraseña
     * @param nom_apellidos nombre y apellidos
     * @param pais país de residencia
     */
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

    /**
     * Consulta en la base de datos de código de partida.
     *
     * @return Siguiente código de partida disponible para su uso
     */
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

    /**
     * Consulta en la base de datos de código de nivel.
     *
     * @return Siguiente código de nivel disponible para su uso
     */
    public int ConsultarCodigoNivel() {

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

    /**
     * Consulta en la base de datos de código de operación.
     *
     * @return Siguiente código de operación disponible para su uso
     */
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

    /**
     * Obtiene las partidas almacenadas en la base de datos, por orden
     * descendente, jugadas en un modo y una dificultad específica.
     *
     * @param modo modo de juego en el que se realizaron la partida
     * @param dificultad dificultad en la que se desarrollaron las partidas
     * @return ArrayList con objetos Partida, que contienen información esencial
     * para la implementación de la ventana "Ranking".
     */
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
                p.setCod_partida(rs.getInt(1));
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

        return partidas;

    }

    /**
     * Obtiene las partidas jugadas por un usuario concreto almacenadas en la
     * base de datos
     *
     * @param nombreUsuario nombre del usuario que jugó las partidas
     * @param nombreJugador nombre de jugador que jugó las partidas
     * @return ArrayList con objetos partida, que contienen información esencial
     * para la implementación de la ventana "Historial".
     */
    public ArrayList<Partida> obtenerPartidas(String nombreUsuario, String nombreJugador) {

        Connection accesoBD = conexion.getConexion();
        ArrayList<Partida> partidas = new ArrayList();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("SELECT * FROM PARTIDA WHERE NOMBRE_USUARIO = ? AND NOMBRE_JUGADOR = ?");
            ps.setString(1, nombreUsuario);
            ps.setString(2, nombreJugador);

            ResultSet rs = ps.executeQuery();

            Partida p;
            int contador = 1;

            while (rs.next() && contador <= 10) {

                p = new Partida(rs.getString(3), rs.getString(6), rs.getString(7));
                p.setCod_partida(rs.getInt(1));
                p.setModo_de_juego(rs.getString(2));
                p.setPuntuacion(rs.getInt(5));

                partidas.add(p);

                contador++;

            }

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Excepción al obtener partidas: " + e.getMessage());

        }

        return partidas;

    }

    /**
     * Realiza una inserción en la base de datos PARTIDA.
     *
     * @param codPartida código de partida único que identifica la partida
     * jugada
     * @param modoJuego modo de juego en el que se desarrolla la partida
     * @param dificultad dificultad en la que se desarrolla la partida
     * @param fechaRealizacion fecha en la que se realizó la partida
     * @param puntuacion puntuación conseguida por el usuario
     * @param nombreUsuario nombre de usuario
     * @param nombreJugador nombre de jugador
     */
    public void insertarPartida(int codPartida, String modoJuego, String dificultad, String fechaRealizacion, int puntuacion, String nombreUsuario, String nombreJugador) {

        Connection accesoBD = conexion.getConexion();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("INSERT INTO PARTIDA VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, codPartida);
            ps.setString(2, modoJuego);
            ps.setString(3, dificultad);
            ps.setString(4, fechaRealizacion);
            ps.setInt(5, puntuacion);
            ps.setString(6, nombreUsuario);
            ps.setString(7, nombreJugador);

            ps.executeUpdate();

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Error al insertar en tabla Partida: " + e.getMessage());
            System.out.println("Nombre usuario: " + nombreUsuario);
            System.out.println("Nombre jugador: " + nombreJugador);

        }

    }

    /**
     * Realiza una inserción en la base de datos NIVELES.
     *
     * @param codNivel código de nivel único que identifica al nivel
     * @param codPartida código de partida único que identifica la partida
     * jugada
     * @param tipo identifica si la partida fue "NORMAL" o "MADNESS"
     * (implementación futura)
     * @param NroNivel Número de nivel. Diponible en modos "STRINGS" y "ARCADE"
     * @param estado Indica si fue o no superado el nivel
     */
    public void insertarNiveles(int codNivel, int codPartida, String tipo, int NroNivel, String estado) {

        Connection accesoBD = conexion.getConexion();

        try {

            PreparedStatement ps = accesoBD.prepareStatement("INSERT INTO NIVELES VALUES (?,?,?,?,?)");
            ps.setInt(1, codNivel);
            ps.setInt(2, codPartida);
            ps.setString(3, tipo);
            ps.setInt(4, NroNivel);
            ps.setString(5, estado);

            ps.executeUpdate();

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Error al insertar nivel: " + e.getMessage());

        }

    }

    /**
     * Realiza una inserción en la base de datos OPERACIONES.
     *
     * @param codOperacion código de operación único que identifica a la
     * operación generada.
     * @param codNivel código de nivel único que identifica al nivel
     * @param codPartida código de partida único que identifica la partida
     * jugada
     * @param operacionGenerada operación matemática generada aleatoriamente
     * @param resultado resultado de la operación generada
     * @param estado Indica si fue "RESUELTA" o "NO RESUELTA"
     */
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

            ps.executeUpdate();

            conexion.closeConexion(accesoBD);

        } catch (SQLException e) {

            System.out.println("Fallo al insertar en operaciones: " + e.getMessage());

        }

    }

}
