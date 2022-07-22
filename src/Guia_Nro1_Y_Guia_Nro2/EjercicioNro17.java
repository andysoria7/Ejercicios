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
public class EjercicioNro17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double A = 0;
        double B = 0;
        double C = 0;
        
       System.out.println("INGRESE EL VALOR DE A");
       A = teclado.nextDouble();
       
       System.out.println("INGRESE VALOR DE B");
       B = teclado.nextDouble();
       
       System.out.println("INGRESE VALOR DE C");
       C = teclado.nextDouble();
       
       if(A != 0)
       {
           double x1 = 0,x2 = 0;
           
           x1 = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
           
           x2 = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
           
           System.out.println("LAS RAICES DEL POLINOMIO SON x1 := " + x1 + " x2 : = " + x2);
       }
           
           
     
       else
       
           System.out.println(" NO PODEMOS CALCULAR EL CALCULO PORQUE A ES IGUAL A CERO");
       
       }    
       
       
        
        // TODO code application logic here
    }
    

