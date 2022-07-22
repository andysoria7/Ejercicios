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
public class EjercicioNro35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena1 = "";
        String cadena2 = "";
        int contador_vocales1 = 0;
        int contador_vocales2 = 0;
        
        System.out.println("INGRESE LA CADENA NUMERO 1 ");
        cadena1 = teclado.nextLine();
        
        System.out.println("INGRESE LA CADENA 2 ");
        cadena2 = teclado.nextLine();
        
        for (int i = 0; i <= cadena1.length() -1; i++) 
        {
            char Caracter1 = cadena1.charAt (i);
            
            if((Caracter1 == 'a') || (Caracter1 == 'e') || (Caracter1 == 'i') || (Caracter1 == 'o') || (Caracter1 =='u'))
            {
                contador_vocales1 = contador_vocales1 +1;
            
            }
            
            
        }
        for (int j = 0; j <= cadena2.length() - 1; j++) 
        {
            char Caracter2 = cadena2.charAt(j);
            
            if((Caracter2== 'a') || (Caracter2 == 'e') || (Caracter2 == 'i') || (Caracter2 == 'o') || (Caracter2 == 'u'))
            {
                contador_vocales2 = contador_vocales2 + 1;
            
            }
            
            
            
        }
        
        if(contador_vocales1 > contador_vocales2)
        {
            System.out.println("LA CADENA 1 TIENE MAS VOCALES QUE LA CADENA 2");
        
        }
        else
        {
           if(contador_vocales2 > contador_vocales1)
           {
               System.out.println(" LA CADENA 2 TIENE MAS VOCALES QUE LA CADENA 1");
           
           }
           else
           {
               System.out.println("LAS DOS CADENAS TIENEN LA MISMA CANTIDAD DE VOCALES");
           
           }   
        
        }
        
        
        
        
       
    }
    
}
