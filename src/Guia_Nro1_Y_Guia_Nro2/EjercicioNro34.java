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
public class EjercicioNro34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena = "";
        
        System.out.println("INGRESE UNA CADENA");
        cadena = teclado.nextLine();
        
        int largo = cadena.length();
        int contador_A = 0;
        int contador_E = 0;
        char caracter = ' ';
        
        for (int i = 0; i <= largo -1; i++) {
            
            caracter = cadena.charAt(i);
            
            if((caracter == 'a') || (caracter =='A'))
            {
                contador_A = contador_A + 1;
            
            }
            if((caracter == 'e') || (caracter == 'E'))
            {
                contador_E = contador_E +1;
            
            }
        }
        if(contador_A > contador_E)
        {
            System.out.println("LA LETRA A APARECE MAS VECES EN LA CADENA " + "CANTIDAD A = " + contador_A + " CANTIDAD DE E = " + contador_E);
        
        }
        else
        {
            if(contador_E > contador_A)
            {
                System.out.println("LA LETRA E APARECE MAS VECES EN LA CADENA " +  "CANTIDAD A = " + contador_A + " CANTIDAD DE E = " + contador_E);
            
            }
            else
            {
                System.out.println("AMBAS LETRAS SALEN LA MISMA CANTIDAD DE VECES EN LA CADENA " + "CANTIDAD A = " + contador_A + " CANTIDAD DE E = " + contador_E);
            
            }    
        
        }   
        
        
        
    }
    
}
