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
public class EjercicioNro32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena1 = "";
        
        System.out.println("INGRESE UNA CADENA ");
        cadena1 = teclado.nextLine();
        
        
        char PrimerCaracter = ' ';
        char UltimoCaracter = ' ';
        int largo = cadena1.length();
        
        PrimerCaracter = cadena1.charAt(0);
        UltimoCaracter = cadena1.charAt(largo-1);
        
        System.out.println("LA CADENA INGRESADA ES = " + cadena1);
        System.out.println(" EL PRIMER CARACTER DE LA CADENA  ES " + PrimerCaracter);
        System.out.println(" EL ULTIMO CARACTER  DE LA CADENA ES = " + UltimoCaracter);
        System.out.println(" EL LARGO DE LA CADENA ES = " + largo);
        
        
    }
    
}
