
package com.mycompany.foro5pooumd;

//@author gomez
public class Nota {
    
    private double valor;
    
    public Nota(double valor) throws IllegalArgumentException{
        if(valor < 0 || valor > 5){
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        }
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    
}
