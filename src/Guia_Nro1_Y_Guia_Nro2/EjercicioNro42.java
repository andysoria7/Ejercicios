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
public class EjercicioNro42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int bandera = 0;
        int recibido = 0;
        
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("INGRESE NUMERO " + (i+1));
            recibido = teclado.nextInt();
            
            if (i == 0) 
            {
                numero = recibido;
                
                
            }
            else
            {
                if (numero > recibido) 
                {
                    bandera = 1 ;
                    
                }
                else
                {
                    numero = recibido ;
                
                }  
            
            }  
            
        }
        
        if (bandera == 0) 
        {
            System.out.println("LOS NUMEROS SE INGRESARON DE MENOR A MAYOR");
            
        }
        else
        {
            System.out.println("LOS NUMEROS NO SE INGRESARON DE FORMA CORRECTA , VUELVA A INTENTAR");
        
        }  
        
       
        
        
    }
    
}
