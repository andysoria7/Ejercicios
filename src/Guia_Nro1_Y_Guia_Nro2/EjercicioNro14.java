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
public class EjercicioNro14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x = 0;
        double y = 0;
        
        System.out.println("INGRESE UN VALOR DE  X ");
        x = teclado.nextDouble();
        
        y = 2 * x + 1 ;
        System.out.println(" Y ES IGUAL A : " + y);
        
        
        
    }
    
}
