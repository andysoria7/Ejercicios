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
public class EjercicioNro28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double Y = 0;
        double A = 0;
        double B =0;
        
        System.out.println("INGRESE  A ");
        A = teclado.nextDouble();
        
        System.out.println("INGRESE B ");
        B = teclado.nextDouble();
        
        for (int x = 0; x <= 400; x = x +1) {
            
            
            Y = A * x + B;
            
            System.out.println("X = " + x + " Y = " +Y );
            
            
            
        }
        
    }
    
}
