/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_Modelo;

/**
 *
 * @author alumno
 */
public class Operaciones {
    
    private static int cod_operacion;
    private int cod_nivel;
    private int cod_partida;
    private String op_generada;
    private int resultado;
    private String estado;

    public Operaciones(int cod_operacion, int cod_nivel, int cod_partida, String op_generada, int resultado, String estado) {
        this.cod_operacion = cod_operacion;
        this.cod_nivel = cod_nivel;
        this.cod_partida = cod_partida;
        this.op_generada = op_generada;
        this.resultado = resultado;
        this.estado = estado;
        
    }

    public int getCod_operacion() {
        return cod_operacion;
    }

    public void setCod_operacion(int cod_operacion) {
        this.cod_operacion = cod_operacion;
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

    public String getOp_generada() {
        return op_generada;
    }

    public void setOp_generada(String op_generada) {
        this.op_generada = op_generada;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // generarOperacion aumenta en un 1 dígito el número de dígitos de las operaciones generadas
    
    public void generarOperacion (String modo, String dificultad, int nivel){
        
        switch(modo){
            
            case "ARCADE":
                
                switch(dificultad){
                
                    case "FACIL":
                        
                        break;
                        
                    case "NORMAL":
                        
                        break;
                        
                    case "DIFICIL":
                        
                        break;
 
                }
                
                break;
                
            case "STRINGS":
                
                switch(dificultad){
                    
                    case "FACIL":
                        
                        break;
                        
                    case "NORMAL":
                        
                        break;
                        
                    case "DIFICIL":
                        
                        break;
                     
                }
                
                break;
                
                
            case "TIME TRIAL":
                
                 switch(dificultad){
                    
                    case "FACIL":
                        
                        break;
                        
                    case "NORMAL":
                        
                        break;
                        
                    case "DIFICIL":
                        
                        break;
                     
                }
                 
                 break;
                 
            case "CUSTOM":
            
            
            
        }
        
    }
    
}
