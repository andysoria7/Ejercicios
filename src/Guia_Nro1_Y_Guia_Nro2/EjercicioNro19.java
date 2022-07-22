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
public class EjercicioNro19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double Numero = 0;
        double Acumulador = 0; // ACUMULADOR
        int Contador = 0;
        double Promedio = 0;
        
        for(int i = 1;i <= 10; i = i+1)
         {
             System.out.println("INGRESE UN NUMERO " +  i);
             Numero = teclado.nextDouble();
             
             Acumulador = Acumulador + Numero; // ACUMULADOR
             
             Contador = Contador + 1; // CONTADOR
            
        }
        System.out.println("EL TOTAL DE LOS NUMEROS INGRESADOS ES " + Acumulador);
        
        if(Contador !=0)
        {
            System.out.println("EL PROMEDIO DE LOS NUMEROS INGRESADOS ES " + Acumulador/Contador);
        
        
        }    
        
        
        // TODO code application logic here
    }
    
}
