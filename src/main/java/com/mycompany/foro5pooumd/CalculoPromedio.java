

package com.mycompany.foro5pooumd;

//@author gomez

import java.util.InputMismatchException;
import java.util.Scanner;

 
public class CalculoPromedio {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        Estudiante estudiante = new Estudiante(nombre);
        int cantidadNotas = 0;
        while(true){
            try{
                System.out.println("Ingrese la cantidad de notas a procesar (min 2  max 20)");
                cantidadNotas = entrada.nextInt();
                if(cantidadNotas <2 || cantidadNotas>20){
                    System.out.println("Error: Ingrese un numero entre 2 y 20");
                }else{
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println("Error: Ingrese un numero entero");
                entrada.next();
            }
        }
        
        for(int i=0; i<cantidadNotas; i++){
            while(true){
                try{
                    System.out.println("Ingrese la nota numero "+(i+1)+" rango de 0 a 5");
                    double valorNota = entrada.nextDouble();
                    Nota nota = new Nota(valorNota);
                    estudiante.agregarNota(nota);
                    System.out.println("Nota "+(i+1)+"agregada correctamente");
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Error: debe ingresar un numero en formato decimal");
                    entrada.next();
                }catch(IllegalArgumentException e){
                    System.out.println("Error "+ e.getMessage());
                }
            }
        }
        
        try{
            System.out.println("Total de notas ingresadas "+estudiante.getCantidadNotas());
            double promedio = estudiante.calcularPromedio();
            System.out.println("El promedio de "+ estudiante.getNombre()+" es "+ promedio);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
