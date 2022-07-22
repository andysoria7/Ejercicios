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
public class EjercicioNro44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       String cadena = "";
       
       char caracter = ' ';
       int letraC = 0;
       int letraD = 0;
       int letraF = 0;
       boolean boolean_C = false;
       boolean boolean_D = false;
       boolean boolean_F = false;
       
       System.out.println("INGRESE UNA CADENA");
       cadena = teclado.nextLine();
        
       for (int i = 0; i < cadena.length()-1; i++) 
        {
             caracter = cadena.charAt(i);
             
             if(((caracter == 'c') || (caracter == 'C')) && (boolean_C == false))
             {
                 letraC = i;
                 boolean_C = true;
             }
             if(((caracter == 'd') || (caracter == 'D')) && (boolean_D == false))
             {
                 letraD = i;
                 boolean_D = true;
             }
             if(((caracter == 'f') || (caracter == 'F')) && (boolean_F == false))
             {
                 letraF = i;
                 boolean_F = true;
             }
        }
       
        if(letraC < letraD){
            if (letraD < letraF){
                System.out.println("Las letras C D y F se encuentran en orden.");
            }
        }
        else
        {
            System.out.println("Las letras C D Y F no se encuentran en orden");
        
        }  
    }
    
}
