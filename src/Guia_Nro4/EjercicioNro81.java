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
public class EjercicioNro81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner Teclado1 = new Scanner(System.in);
        Scanner Teclado2 = new Scanner(System.in);
        
        int A = 0;
        
        System.out.println("Ingrese el tamaño del vector ");
        A = Teclado1.nextInt();
        
        int burbuja [] = new int [A];
        
        for (int i = 0; i < burbuja.length -1; i++) 
        {
            burbuja [i] = 0;
            
        }
        
        for (int i = 0; i < burbuja.length -1 ; i++) 
        {
            
            
            System.out.println("INGRESE NUMEROS");
            burbuja[i] = Teclado1.nextInt();
            
        }
        
        int orden = 0;
        
        for (int i = 0; i < burbuja.length -1 ; i++) 
        {
            orden = burbuja[+1];
            burbuja[i+1] = burbuja[i];
            burbuja[i] = orden;
            
            
        }
        
        for (int i = 0; i < burbuja.length -1; i++) 
        {
            System.out.print(burbuja[i]+ "\n");
            
        }
        
        
        
        
    }
    
}
