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
public class EjercicioNro02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double a = 0;
        
        double b = 0;
        
        System.out.println("INGRESE VALOR DE A");
        
        a = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DE B ");
        
        b = teclado.nextDouble();
        
        double suma = 0;
        
        double resta = 0;
        
        double multiplicacion = 0;
        
        double division = 0;
        
        suma = a + b;
        
        resta = a - b;
        
        multiplicacion = a * b;
        
        System.out.println(" LA SUMA DE A Y B ES " + suma);
        
        System.out.println("LA RESTA DE A Y B ES " + resta);
        
        System.out.println(" LA MULTIPLICACION DE A Y B ES " + multiplicacion);
        
        
        if(b != 0 )
        {
            
            division = a / b;
        
            System.out.println("LA DIVISION DE A Y B ES " + division);
        }
        else
            System.out.println("NO SE PUDO REALIZAR LA OPERACION");
       
        
        
        
        
       
        
        
                    
                    
                   
        
        
                
        
        
        
        // TODO code application logic here
    }
    
}
