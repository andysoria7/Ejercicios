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
public class EjercicioNro08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         double x = 0;
        
        System.out.println("INGRESE UN VALOR DE X");
        x = teclado.nextDouble();
        
        double cuadrado = 0 ;
        double raiz_cuadrada = 0;
        double cubo = 0;
        
        cuadrado = Math.pow(x, 2);
        System.out.println("EL CUADRADO DE X ES " + cuadrado);
        
        cubo = Math.pow(x, 3);
        System.out.println("EL CUBO DE X ES " + cubo);
        
        
        if(x > 0)
            raiz_cuadrada = Math.sqrt(x);
          System.out.println("LA RAIZ CUADRADA DE X ES " + raiz_cuadrada);
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
