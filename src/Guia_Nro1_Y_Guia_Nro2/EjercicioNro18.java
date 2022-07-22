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
public class EjercicioNro18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double Hora_llegada = 0;
        double Hora_salida = 0;
        double Distancia = 0;
        
        System.out.println(" INGRESE LA HORA DE LLEGADA");
        Hora_llegada = teclado.nextDouble();
        
        System.out.println("INGRESE LA HORA DE SALIDA");
        Hora_salida = teclado.nextDouble();
        
        System.out.println(" INDIQUE LA DISTANCIA RECORRIDA");
        Distancia = teclado.nextDouble();
        
        if(Hora_llegada > Hora_salida)
        {
            double Velocidad = 0;
            
            Velocidad = Distancia / (Hora_llegada - Hora_salida);
            
            System.out.println(" SEÑOR/A VIAJO A UNA VELOCIDAD EQUIVALENTE A : " + Velocidad  );
        
        
        }
        else
        {
            System.out.println(" ERROR , EL HORARIO DE LLEGADA DEBE SER MAYOR AL HORARIO DE SALIDA");
        }   
        
        
        
        
        
        // TODO code application logic here
    }
    
}
