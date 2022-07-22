/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro3;

import java.util.Scanner;

/**
 *
 * @author Andrés Soria
 */
public class ProcedimientoYfunciones {
    public static double cuadrado(double E)
    {
        double auxiliar = 0;
        auxiliar = E*E;
        
        return(auxiliar);
    
    }
    public static double PromedioDe2(double p1,double p2)
    {
        double resultadoPromedio = (p1 + p2) / 2;
        
         return(resultadoPromedio);
                
        
    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 10 ;
        int b = 400;
        
        // EJEMPLO 1 
        
        System.out.println(" EL CUADRADO DE 5 ES "+ cuadrado(5));
        
        // EJEMPLO 2 
        
        double resultado = cuadrado(10);
        
        // EJEMPLO 3
        
        double prueba = cuadrado(2) + cuadrado(4);
        
        // ES DIFERENTE DE : 
        
        double prueba2 = cuadrado(2+4);
        
        // EJEMPLO 4 
        
        double prueba3 = cuadrado(cuadrado(2)) + cuadrado(cuadrado(4));
        
        double resultadoPromedio = PromedioDe2(7,9);
        
        System.out.println("EL PROMEDIO ES IGUAL A = " + resultadoPromedio);
        
        double numero1 = 0;
        double numero2 = 0;
        
        System.out.println(" INGRESE EL NUMERO 1 ");
        numero1 = teclado.nextDouble();
        
        System.out.println("INGRESE EL NUMERO 2");
        numero2 = teclado.nextDouble();
        
        System.out.println("EL PROMEDIO DE : " + PromedioDe2(numero1,numero2));
        
        double resultadoPromedio1 = cuadrado(PromedioDe2(5,7));
        
        
        
        
        
        
    }
    
}
