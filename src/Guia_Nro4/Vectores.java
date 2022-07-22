/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro4;

import java.util.Scanner;

/**
 *
 * @author Andrés Soria
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 0;
        
        // Declaramos vectores
        
        int []VectorDeEnteros = new int[5];
        
        // Cargar valores manualmente
        
        VectorDeEnteros[0] = 10;
        VectorDeEnteros[1] = 15;
        
        // Para inicializar un vector deberia hacer esto
        
        for (int i = 0; i <= 4; i++) 
        {
            VectorDeEnteros[i]= 0;
            
        }
        
        Scanner teclado = new Scanner(System.in);
        
        int c = 0;
        
        for (int k = 0; k <=4; k++) 
        {
            System.out.println("Ingrese el valor de la posicion " + k);
           
            
            c = teclado.nextInt();
            
            VectorDeEnteros [k] = c;
            
        }
        
        // Mostrar vector
        
        for (int w = 0; w <= 4; w++) 
        {
            
            System.out.println("El valor en la posicion " + w + " ES " + VectorDeEnteros[w]);
            
        }
        
        int promedio = 0;
        int acumulador = 0;
        int contador = 0;
        
        for (int i = 0; i <= 4; i++) 
        {
            acumulador = acumulador + VectorDeEnteros[i];
            contador = contador +1 ;
            
          
        }
        
       System.out.println("La cantidad acumulada es = " + acumulador);
        
       promedio = acumulador / contador;
       
       System.out.println("El promedio total es igual a = " + promedio);
        
        
        
        
        
        
    }
    
}
