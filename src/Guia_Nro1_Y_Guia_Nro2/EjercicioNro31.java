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
public class EjercicioNro31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numero = 0;
        double contador = 0;
        double acumulador = 0;
        double promedio = 0;
        double mayor = 0;
        double menor = 0;
        
        for (int i = 1; i <= 10; i++) { 
            System.out.println("INGRESE UN NUMERO " + i);
            numero = teclado.nextDouble();
            
            if( i == 1)
            {
                mayor = numero;
                menor = numero;
            
            }
            
            if(numero > mayor)
            {
                mayor = numero;
            
            }
            
            if(numero < menor)
            {
                menor = numero;
            
            }   
            contador = contador + 1;
            acumulador = acumulador + numero;
            
                    
            
            
        }
        
        if(contador > 0)
        {
            promedio = acumulador / contador;
            System.out.println("EL PROMEDIO TOTAL ES =  " + promedio);
            System.out.println("SE CONTARON = " + contador);
            System.out.println("SE ACUMULARON = " + acumulador);
            
            
                    
        
        }
        
        if(promedio > 10)
        {
            double diez_por_ciento = 0;
            diez_por_ciento = mayor * 10 / 100;
            System.out.println("EL 10% DEL MAYOR VALOR ES = " + diez_por_ciento);
            
        
        }
        else
        {
            double quince_por_ciento = 0;
            quince_por_ciento = menor * 15 / 100;
            System.out.println("EL 15% DEL MENOR VALOR ES = " + quince_por_ciento);
        
        }       
        
        
        
        
    }
    
}
