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
public class EjercicioNro11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double a = 0;
        double b = 0;
        
        System.out.println("INGRESE A ");
        a = teclado.nextDouble();
        
        System.out.println("INGRESE B ");
        b = teclado.nextDouble();
        
        double suma_de_ambos = 0;
        suma_de_ambos = a + b;
        
        if(suma_de_ambos > 500)
            System.out.println("LA SUMA DE AMBOS SUPERO LOS  500");
        if(suma_de_ambos < 500)
            System.out.println("LA SUMA DE A Y B ES MENOR A  500");
        
        else
            System.out.println("LA SUMA DE A Y B ES IGUAL A  500");
        // TODO code application logic here
    }
    
}
