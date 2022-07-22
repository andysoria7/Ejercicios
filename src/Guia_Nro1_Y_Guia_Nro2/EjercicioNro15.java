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
public class EjercicioNro15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double Y = 0;
        double  x = 0;
        
        System.out.println("INGRESE UN VALOR DE X");
        x = teclado.nextDouble();
        
        Y = 2 * Math.pow(x, 2) * x - 1;
        
        System.out.println(" EL VALOR DE Y ES IGUAL A : " + Y);
        
        
        // TODO code application logic here
    }
    
}
