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
public class EjercicioNro05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x = 0;
        
        System.out.println("INGRESE VALOR DE X ");
        
        x = teclado.nextInt();
        
        int resto = 0;
        
        resto = x % 2;
        
        if(resto == 0)
            
            System.out.println("EL NUMERO INGRESADO ES PAR");
        
        else
            
            System.out.println(" EL NUMERO INGRESADO NO ES PAR");
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
