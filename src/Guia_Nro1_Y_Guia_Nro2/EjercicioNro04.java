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
public class EjercicioNro04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double a = 0;
        
        double b = 0;
        
        double c = 0;
        
        System.out.println("INGRESE A");
        
        a = teclado.nextDouble();
        
        System.out.println("INGRESE B");
        
        b = teclado.nextDouble();
        
        System.out.println(" INGRESE VALOR DE C");
        
        c = teclado.nextDouble();
        
        double suma = 0;
        
        suma = a + b;
        
        if(a + b == c)
            
            System.out.println("LA SUMA DE A Y B ES IGUAL A C" + suma);
        
        else
            
            System.out.println("LA SUMA DE A Y B NO ES IGUAL A C");
        
        
        
        
        // TODO code application logic here
    }
    
}
