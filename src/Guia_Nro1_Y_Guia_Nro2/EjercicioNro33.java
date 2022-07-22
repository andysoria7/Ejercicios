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
public class EjercicioNro33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String Cadena = "";
        
        System.out.println("INGRESE UNA CADENA DE TEXTO");
        Cadena = teclado.nextLine();
        
        int largo = Cadena.length();
        
        for (int i = 0; i <= largo - 1; i++) {
            char caracter = Cadena.charAt(i);
            
            System.out.println("EL CARACTER QUE SE ENCUENTRA EN LA POSICION " + i + " ES " + caracter);
            
            
        }
        
    }
    
}
