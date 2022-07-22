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
public class EjercicioNro25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int ingreso_de_numeros = 0;
        
        double numero = 0;
        
        int contadortotal = 0;
        double acumuladortotal = 0;
        
        int contador_numeros_de_0a25 = 0;
        double acumulador_numeros_de_0a25 = 0;
        double promedio_0a25 = 0;
        
        int contador_numeros_de_25a50 = 0;
        double acumulador_numeros_de_25a50 = 0;
        double promedio_25a50 = 0;
        
        System.out.println("¿CUANTOS NUMEROS DESEA INGRESAR? ");
        ingreso_de_numeros = teclado.nextInt();
        
        for (int i = 1; i <= ingreso_de_numeros; i++) {
            System.out.println("INGRESE UN NUMERO" + i);
            numero = teclado.nextDouble();
            
            if((numero >= 0) && (numero < 25))
            {
                contador_numeros_de_0a25 = contador_numeros_de_0a25 +1;
                acumulador_numeros_de_0a25 = acumulador_numeros_de_0a25 + numero;
            
            }
            if((numero >=25) && (numero <= 50))
            {
                contador_numeros_de_25a50 = contador_numeros_de_25a50 +1;
                acumulador_numeros_de_25a50 = acumulador_numeros_de_25a50 + numero;
                
                
            
            }
            contadortotal = contadortotal + 1;
            acumuladortotal = acumuladortotal + contadortotal;
            
        }
        if(contador_numeros_de_0a25 == 0)
        {
            System.out.println("NO SE CONTO NINGUN NUMERO DE 0 A 25");
        
        }
        else
        {
            System.out.println(" LA CANTIDAD DE NUMEROS DE 0 A 25 ES :  " + contador_numeros_de_0a25);
            System.out.println(" LA SUMA DE NUMEROS DE 0 A 25 ES :  " + acumulador_numeros_de_0a25);
            promedio_0a25 = acumulador_numeros_de_0a25 / contador_numeros_de_0a25;
            System.out.println("EL PROMEDIO GENERAL DE 0 A 25 ES :  " + promedio_0a25);
            
        
        }
        if(contador_numeros_de_25a50 == 0)
        {
            System.out.println(" NO SE REGISTRARON NUMEROS DE 25 A 50");
        
        }
        else
        {
             System.out.println(" LA CANTIDAD DE NUMEROS DE 25 50 ES :  " + contador_numeros_de_25a50);
            System.out.println(" LA SUMA DE NUMEROS DE 25 A 50 ES :  " + acumulador_numeros_de_25a50);
            promedio_25a50 = acumulador_numeros_de_25a50 / contador_numeros_de_25a50;
            System.out.println(" EL PROMEDIO GENERAL DE 25 A 50 ES : " + promedio_25a50);
            
        
        }   
    }
    
}
