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
public class EjercicioNro27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double Y = 0;
        
        for (int x = 0; x <= 400; x = x+1) {
            
            Y = -2 * x + 3;
            
            System.out.println("X = " + x + "Y =  " +Y);
            
        }
        
       
    }
    
}
