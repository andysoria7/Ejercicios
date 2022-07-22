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
public class EjercicioNro07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int base = 0;
        
        int altura = 0;
        
        System.out.println(" INGRESE LA BASE");
        base = teclado.nextInt();
        
        System.out.println("INGRESE LA ALTURA ");
        altura = teclado.nextInt();
        
        int superficie = 0;
        if((base > 0) && (altura > 0))
            
            superficie = base * altura ;
        
        System.out.println("LA SUPERFICIE TOTAL DEL RECTANGULO ES " + superficie);
        
        
        
        
        
        
        
        
        
        
                
                
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
