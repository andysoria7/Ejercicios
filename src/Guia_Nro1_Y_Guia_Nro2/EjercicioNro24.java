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
public class EjercicioNro24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = 0;
        double contador_pares = 0;
        double contador_impares = 0;
        double acumulador_pares = 0;
        double acumulador_impares = 0;
        double promedio_pares = 0;
        double promedio_impares = 0;
        double cantidad_total = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("INGRESE UN NUMERO DE A " + i);
            A = teclado.nextDouble();
            
            double resto = 0;
            resto = A % 2;
            
            if(resto == 0)
            {
                contador_pares = contador_pares +1;
                acumulador_pares = acumulador_pares + A;
            
            }
            else
            {
                contador_impares = contador_impares +1;
                acumulador_impares = acumulador_impares + A;
                        
            
            }
            
            
        }
        if(contador_pares == 0)
        {
            System.out.println("NO SE INGRESARON NUMEROS PARES ");
        
        }
        else
        {
            promedio_pares = acumulador_pares / contador_pares ;
            
            System.out.println(" CONTADOR PARES = " + contador_pares);
            System.out.println("ACUMULADOR PARES = " + acumulador_pares);
            System.out.println("PROMEDIO DE PARES = " + promedio_pares);
        
        }
        if(contador_impares == 0)
        {
            System.out.println("NO SE INGRESARON NUMEROS IMPARES");
        
        }
        else
        {
            promedio_impares = acumulador_impares / contador_impares;
            
            System.out.println("CONTADOR IMPARES = " + contador_impares);
            System.out.println("ACUMULADOR IMPARES = " + acumulador_impares);
            System.out.println("PROMEDIO IMPARES =  " + promedio_impares);
            
        
        }
        cantidad_total = contador_pares + contador_impares;
        System.out.println("LA CANTIDAD TOTAL ES =  " +  cantidad_total);
        
    }
    
}
