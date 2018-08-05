/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Niveles {
    
    private static int cod_nivel;
    private int cod_partida;
    private String tipo;
    private int nro_nivel;
    private String estado;
    
    ClaseDAO d = new ClaseDAO();

    public Niveles(int cod_partida) {
       
        this.cod_nivel = d.ConsultarCodigoNiveles();
        this.cod_partida = cod_partida;
        this.tipo = "NORMAL";
        this.nro_nivel = 1;
        this.estado = "NO SUPERADO";
       
    }

    public int getCod_nivel() {
        return cod_nivel;
    }

    public void setCod_nivel(int cod_nivel) {
        this.cod_nivel = cod_nivel;
    }

    public int getCod_partida() {
        return cod_partida;
    }

    public void setCod_partida(int cod_partida) {
        this.cod_partida = cod_partida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNro_nivel() {
        return nro_nivel;
    }

    public void setNro_nivel(int nro_nivel) {
        this.nro_nivel = nro_nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public int getTiempo(int nivel){
        
       int tiempo = 0;
       
       if(nivel == 1 || nivel%3 == 1){
           
           tiempo = 60;
           
       }else if (nivel == 2 || nivel%3 == 2){
           
           tiempo = 55;
           
       }else{
           
           tiempo = 50;
           
       }
        
        return tiempo;
    }
    
    public String aleatorizadorTipoNivel (){
        
        Random aleatorio = new Random();
        
        int num = aleatorio.nextInt(10-1)+1;
        
        if(num <= 2){
            
            this.tipo = "MADNESS";
            
        }else{
            
            this.tipo = "NORMAL";
            
        }
        
        return this.tipo;
    }
    
}
