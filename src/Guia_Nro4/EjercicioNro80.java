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
public class EjercicioNro80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner Teclado1 = new Scanner(System.in);
         Scanner Teclado2 = new Scanner(System.in);
                
        
        
        int acumuladorfila = 0;
        int acumuladorcolumna = 0;
        int acumuladortotal = 0;
        
        int matriz [][] = new int [3][6];
        
        for (int i = 0; i <=2; i++) 
        {
            for (int j = 0; j <=5; j++) 
            {
                matriz [i][j] = 0;
            }
            
        }
        
        for (int i = 0; i <=2; i++) 
        {
            for (int j = 0; j <=5; j++) 
            {
                System.out.println("Ingrese el elemento de la fila " + i + " Columna " + j);
                matriz[i][j] = Teclado1.nextInt();
                
            }
            
        }
        
        for (int i = 0; i <=2; i++) 
        {
            for (int j = 0; j <=5; j++) 
            {
               acumuladorfila = acumuladorfila + matriz[i][j];
               
               
                
            }
            
        }
        
        for (int i = 0; i <=2; i++) 
        {
            for (int j = 0; j <=5; j++) 
            {
               acumuladorcolumna = acumuladorcolumna + matriz[i][j];
               
               
                
            }
            
        }
        
        for (int i = 0; i <=2; i++) 
        {
            for (int j = 0; j <=5; j++) 
            {
               acumuladortotal = acumuladorfila + acumuladorcolumna;
               
               
                
            }
            
        }
        
        
        
        System.out.println("acumulador fila  = " + acumuladorfila);
        System.out.println("acumulador columna = " + acumuladorcolumna);
        System.out.println("acumulador total = " + acumuladortotal);
        
        
    }
    
}
