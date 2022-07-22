/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro4;

import java.util.Scanner;

/**
 *
 * @author Andrés Soria
 */
public class EjercicioNro70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        String [] VectorCadena = new String[5];
        
        for (int i = 0; i <=4; i++) 
        {
            VectorCadena[i] = "";
            
        }
        for (int j = 0; j <=4; j++) 
        {
            System.out.println("Ingrese la cadena de la posicion " +j);
            VectorCadena[j] = teclado.nextLine();
        }
        
        int acumulador_a = 0;
        
        for (int k = 0; k <=4; k++) 
        {
            acumulador_a = acumulador_a +Trabajo_Practico_Nro03.contadorA(VectorCadena[k]);
        }
        
        System.out.println("La cantidad de letras A acumuladas en el vector es igual a =  " + acumulador_a);
       
    }
    
}
