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
public class EjercicioNro10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n = 0;
        int m = 0;
        
        System.out.println("INGRESE VALOR DE N");
        n = teclado.nextInt();
        
        System.out.println("INGRESE M ");
        m = teclado.nextInt();
        
        int resto = 0;
        
        resto = n % m;
        
        if(resto == 0)
            System.out.println("N ES DIVISIBLE EN M");
        
        else
            System.out.println(" N NO ES DIVISIBLE EN M ");
            
        
        
        // TODO code application logic here
    }
    
}
