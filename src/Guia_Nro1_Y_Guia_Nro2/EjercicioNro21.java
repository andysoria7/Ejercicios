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
public class EjercicioNro21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double A = 0;
        double B = 0;
        double C = 0;
        
        System.out.println("INGRESE A");
        A = teclado.nextDouble();
        System.out.println("INGRESE B");
        B = teclado.nextDouble();
        System.out.println("INGRESE C");
        C = teclado.nextDouble();
        
        if(( A > B) && (B > C))
        {
            System.out.println("A , B , C");
        
        
        }
        if((A > B) && (B < C))
        {
            System.out.println(" A  C , B");
        
        }
        if((A > B) && (B == C))
        {
            System.out.println("A ,B=C");
        
        
        }
        if((B > A) && (A > C))
        {
            System.out.println("B , A , C ");
            
         }
        if(( B > A) && ( A < C))
        {
            System.out.println(" B , C , A");
        
        }
        if((B > A ) && (A ==C))
        {
            System.out.println("B , A=C");
            
        
        }
        if((A == B) && (B==C))
        {
            System.out.println("LOS TRES NUMEROS SON IGUALES");
        
        }
    }
    
}
