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
public class EjercicioNro20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double numero = 0;
        int contador = 0;
        double acumulador = 0;
        double promedio = 0;
        
        for (int i = 1; i <= 6; i++) 
        {
            
            System.out.println(" INGRESE UN NUMERO " + i);
            numero = teclado.nextDouble();
            
            if((numero >= 0) &&(numero <=6))
            {
                contador = contador + 1;
                acumulador = acumulador + numero;
                
            }    
                
            
            
            }
            
            if(contador > 0)
            {
                promedio = acumulador/contador;
                System.out.println(" EL PROMEDIO GENERAL ES " + promedio);
            
            
            }
            
                    
            
        
        // TODO code application logic here
    
    
    }
}
