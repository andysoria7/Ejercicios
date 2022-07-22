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
public class EjercicioNro06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double pesos = 0;
        
        double valor_dolar = 0;
        
        double valor_euro = 0;
        
        double valor_real = 0;
        
        System.out.println("INGRESE PESOS QUE DESEA CONVERTIR");
        
        pesos = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DEL DOLAR");
        
        valor_dolar = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DEL EURO");
        
        valor_euro = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DEL REAL");
        
        valor_real = teclado.nextDouble();
        
        double dolar = 0;
        
        double euro = 0;
        
        double real = 0;
        
        if(pesos > 0)
            
            dolar = pesos / valor_dolar;
            euro = pesos / valor_euro;
            real = pesos / valor_real;
            
            System.out.println("LA CANTIDAD DE DOLARES QUE TE CORRESPONDEN SON " + dolar);
            
            System.out.println("LA CANTIDAD DE EUROS QUE TE CORRESPONDEN " + euro);
            
            System.out.println(" LA CANTIDAD DE REALES QUE TE CORRESPONDEN " + real);
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
