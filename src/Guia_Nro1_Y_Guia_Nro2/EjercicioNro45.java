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
public class EjercicioNro45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena = "";
        char caracter =' ';
        int letraA = 0;
        int letraE= 0;
        int letraI = 0;
        int letraO = 0;
        int letraU = 0;
        boolean boolean_A = false;
        boolean boolean_E = false;
        boolean boolean_I = false;
        boolean boolean_O = false;
        boolean boolean_U = false;
       
        
        System.out.println("SEÑOR/A INGRESE UNA CADENA DE TIPO CARACTER");
        cadena = teclado.nextLine();
        
        for (int i = 0; i <= cadena.length()-1; i++) 
        {
            caracter = cadena.charAt(i);
             
             if(((caracter == 'a') || (caracter == 'A')) && (boolean_A == false))
             {
                 letraA = i;
                 boolean_A = true;
             }
             if(((caracter == 'e') || (caracter == 'E')) && (boolean_E == false))
             {
                 letraE = i;
                 boolean_E = true;
             }
             if(((caracter == 'i') || (caracter == 'I')) && (boolean_I == false))
             {
                 letraI = i;
                 boolean_I = true;
             }
             
             if(((caracter == 'o') || (caracter == 'O')) && (boolean_O == false))
             {
                 letraO = i;
                 boolean_O = true;
             }
             
            if(((caracter == 'u') || (caracter == 'U')) && (boolean_U == false))
             {
                 letraU = i;
                 boolean_U = true;
             }
            
          }
        
        if ((boolean_A == true) &&(boolean_E == true) && (boolean_I == true)&& (boolean_O == true) && (boolean_U == true))
        {
            System.out.println("SE ENCUENTRAN LAS VOCALES PRESENTES EN CUALQUIER ORDEN ");
            
        }
        else
        {
            System.out.println(" NO SE ENCUENTRA NINGUNA VOCAL");
        
        }  
        
        
        
        
    
}}
