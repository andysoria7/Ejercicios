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
public class EjercicioNro23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = 0;
        double contador = 0;
        double acumulador = 0;
        double promedio = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("INGRESE UN NUMERO DE A :" + i);
            A = teclado.nextDouble();
            
            if ((A > 0) && (A <=15)) {
            
            contador = contador + 1;
            acumulador = acumulador + A;
            
            }
            
            
        }
        if (contador > 0 ) {
            
            promedio = acumulador / contador;
            
            System.out.println(" EL PROMEDIO TOTAL ES " + promedio);
            
           
            
        }
        
        
    }
    
}
