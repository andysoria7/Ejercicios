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
public class RecordandoExitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena = "";
        
        int contadorA = 0;
        int contadorE = 0;
        
        System.out.println("POR FAVOR INGRESE UNA CADENA");
        cadena = teclado.nextLine();
        
        int LargoCadena = cadena.length();
        
        for (int i = 0; i <= LargoCadena -1; i++) {
            
            char caracterleido = ' ';
            
            if ((cadena.charAt(i)) == 'A' || (cadena.charAt(i) == 'a'))
            {
                contadorA = contadorA +1;
                
                
            }
            
            if ((cadena.charAt(i)) == 'E' || (cadena.charAt(i) == 'e'))
            {
                contadorE = contadorE +1;
                
            }
            
            
            
            
            
            
            
            
            
            
        }
        
        System.out.println(" LA CANTIDAD DE LETRAS A QUE HAY EN LA CADENA ES IGUAL A  " + contadorA);
        System.out.println("LA CANTIDAD DE LETRAS E QUE HAY EN LA CADENA ES IGUAL A " + contadorE);
        
        if ((contadorA > contadorE) && (contadorE < contadorA))
        {
            System.out.println("HAY MAS LETRAS A Y MENOS LETRAS E EN LA CADENA");
            
            
        }
        
        if (contadorE > contadorA && (contadorA < contadorE)) 
        {
            System.out.println("HAY MAS LETRAS E Y MENOS LETRAS A EN LA CADENA");
            
        }
        if (contadorA == contadorE) 
        {
            System.out.println(" ESTAN PAREJAS LAS LETRAS A Y E ");
            
        }
    }
    
}
