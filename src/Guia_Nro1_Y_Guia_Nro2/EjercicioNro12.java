/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro1_Y_Guia_Nro2;

import java.util.Scanner;

/**
 *
 * @author Andrés Soria
 */
public class EjercicioNro12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = 0;
        double B = 0;
        
        System.out.println("INGRESE VALOR DE A ");
        A = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DE B ");
        B = teclado.nextDouble();
        
        double producto = 0;
        double diez_porciento = 0;
        double cinco_porciento = 0;
        
        producto = A * B;
        if(producto > 100)
        {
            diez_porciento = producto * 10 / 100;
        System.out.println("EL 10 PORCIENTO DEL RESULTADO ES " + diez_porciento);
        }
        else
        {
            cinco_porciento = producto *5 / 100;
            System.out.println(" EL 5 PORCIENTO DEL RESULTADO ES " + cinco_porciento);
            
        }
        
            
            
            
                
            
            
                
            
        
        
           
            
        
           
           
        
        
        
        
        
            
            
         
        
            
            
        
        
    }
    
}
