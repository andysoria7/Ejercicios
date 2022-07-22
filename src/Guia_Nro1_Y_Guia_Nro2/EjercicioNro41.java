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
public class EjercicioNro41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena = "";
        
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int acumuladorA = 0;
        int acumuladorB = 0;
        int acumuladorC = 0;
        int acumuladorTotal = 0;
        
        
        System.out.println("INGRESE UNA CADENA");
        cadena = teclado.nextLine();
        
        for (int i = 0; i <= cadena.length()-1; i++) 
        {
            if ((cadena.charAt(i) == 'a' || (cadena.charAt(i)) == 'A'))
            {
                contadorA = contadorA +1;
                acumuladorA = acumuladorA + 10;
           
            }
            
            if ((cadena.charAt(i) == 'b' || (cadena.charAt(i)) == 'B'))
            {
                contadorB = contadorB +1;
                acumuladorB = acumuladorB + 20;
           
            }
            
            if ((cadena.charAt(i) == 'c' || (cadena.charAt(i)) == 'C')) 
            {
                contadorC = contadorC +1;
                acumuladorC = acumuladorC + 15;
                
                
            }
      
        }
        
         System.out.println("EL TOTAL DE PUNTOS DE LETRAS A ES = " +acumuladorA);
                
         System.out.println("LA CANTIDAD DE VECES QUE SE REPITIO LA LETRA A ES = " +contadorA);
         
         System.out.println("EL TOTAL DE PUNTOS DE LETRAS B ES = " +acumuladorB);
                
         System.out.println("LA CANTIDAD DE VECES QUE SE REPITIO LA LETRA B ES = " +contadorB);
          
         System.out.println("EL TOTAL DE PUNTOS DE LETRAS C ES = " +acumuladorC);
                
         System.out.println("LA CANTIDAD DE VECES QUE SE REPITIO LA LETRA C ES = " +contadorC);
                
        acumuladorTotal = acumuladorTotal + acumuladorA + acumuladorB + acumuladorC ;
        
         System.out.println("LA CANTIDAD DE PUNTOS TOTALES ES = " +acumuladorTotal);
        
    }
    
}
