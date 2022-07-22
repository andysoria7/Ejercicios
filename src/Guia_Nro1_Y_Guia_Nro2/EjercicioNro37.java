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
public class EjercicioNro37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String Cadena1 = "";
        String Cadena2 = "";
        
        System.out.println("INGRESE CADENA 1");
        Cadena1 = teclado.nextLine();
        
        System.out.println("INGRESE CADENA 2");
        Cadena2 = teclado.nextLine();
        
        boolean Diferente = false ;
        
        if(Cadena1.length() == Cadena2.length())
        {
            for (int i = 0; i <= Cadena1.length() -1 ; i++) 
            {
                if(Cadena1.charAt(i) != Cadena2.charAt(i))
                {
                    Diferente = true ;
                    break;
                    
                   }
                
                
            }
        
        }
        else
        {
            System.out.println("NO SON IGUALES PORQUE NO TIENEN EL MISMO LARGO");
        
        }
        
        if(Diferente == true)
        {
            System.out.println("SON DIFERENTES , ENCONTRAMOS UN CARACTER DIFERENTE ");
        
        }
        else
        {
            System.out.println("SON IGUALES AMBAS CADENAS , NO SE ENCONTRO  DIFERENCIAS");
        
        }   
        
        
        
                
        
    }
    
}
