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
public class EjercicioNro36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String Cadena1 = "";
        String Cadena2 = "";
        
        System.out.println("INGRESE CADENA");
        Cadena1 = teclado.nextLine();
        
        
        for (int i = Cadena1.length() -1; i >=0; i--) 
        {
            char caracter = Cadena1.charAt(i);
            
            Cadena2 = Cadena2 + caracter;
            
        }
        
        System.out.println(" LA CADENA INVERTIDA ES " + Cadena2);
        
        
            
        
        
    }
    
}
