
package com.mycompany.foro5pooumd;

// @author gomez

import java.util.ArrayList;

 
public class Estudiante {
    
    private String nombre;
    private ArrayList<Nota> notas;
    
    public Estudiante(String nombre){
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }
    public void agregarNota(Nota nota){
        notas.add(nota);
    }
    public double calcularPromedio(){
        if(notas.size() <2 ){
            System.out.println("Se necesitan al menos 2 notas para calcular el promedio");
            return 0;
        }
        double suma = 0;
        for(Nota nota: notas){
            suma += nota.getValor();
        }
        return suma/notas.size();
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidadNotas(){
        return notas.size();
    }
}
