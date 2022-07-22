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
public class EjercicioNro68_Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        
        int []VectorDiezPosEnt = new int[10];
        
        for (int i = 0; i <= 9; i++) 
        {
            VectorDiezPosEnt[i] = 0;
            
            
        }
        
        for (int i = 0; i <= 9; i++) 
        {
            System.out.println("Ingrese un numero entero en la posicion " + i);
            
            VectorDiezPosEnt[i]= teclado.nextInt();
            
        }
        
        for (int j = 0; j <=9; j++) 
        {
            System.out.println(" El valor de la posicion " + j + " Es: " + VectorDiezPosEnt[j] );
            
        }
        
        
        
        
        
        
        
    }
    
}
