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
public class EjercicioNro69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
        double acumulador = 0;
        double promedio = 0;
        double mayor,menor;
        
        
        
        double []VectorCincoPosiciones = new double[5];
        
        for (int i = 0; i <=4; i++) 
        {
            VectorCincoPosiciones[i] = 0;
   
        }
        mayor = VectorCincoPosiciones[0];
        menor = VectorCincoPosiciones[0];
        
        
        for (int i = 0; i <=4; i++)
        {
            System.out.println("Ingrese un numero para la primera posicion " +i);
            
             VectorCincoPosiciones[i] = teclado.nextDouble();
             
             if (i == 0) 
             {
                 menor = VectorCincoPosiciones[i];
                 mayor = VectorCincoPosiciones[i];
                
             }
             if (VectorCincoPosiciones[i] > mayor) 
             {
                 mayor = VectorCincoPosiciones[i];
                
             }
             if (VectorCincoPosiciones[i] < menor) 
             {
                 menor = VectorCincoPosiciones[i];
                
             }
             
             
             
             
             
        }
        

        
         
       
        for (int i = 0; i <= 4; i++) 
        {
            contador = contador + 1;
            
            acumulador = acumulador + VectorCincoPosiciones[i];
            
            
            
            
        }
        
        if (contador > 0) 
        {
             promedio = acumulador / contador ;
             
             System.out.println("El promedio total es igual a = " + promedio);
            
        }
        else
        {
            System.out.println("Ingrese numeros mayores a 0 por favor");
        
        }
        
        
        
        
        
      
        System.out.println("La sumatoria total de todos los elementos del vector es igual a = " + acumulador);
        System.out.println("La cantidad de elementos que se ingresaron al vector en total es igual a = " + contador);
        System.out.println("El numero mayor es el  = " + mayor);
        System.out.println("El numero menor es el = " + menor);
        
        
        
        
        
        
    }
    
}
