/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombreProp;
    protected String placa;
    protected double valorCancelar;
    
    public void establecerNombrePropietario(String nom){
        nombreProp = nom;
    }
    
    public void establecerPlaca(String p){
        placa = p;
    }
    
    public abstract void establecerValorCancelar();
    
    public String obtenerNombrePropietario(){
        return nombreProp;
    }
    
    public String obtenerPlaca(){
        return placa;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
}
