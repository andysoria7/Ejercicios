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
public class EjercicioNro03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int dias = 0;
        
        int segundos = 86400;
        
        System.out.println("INGRESE LA CANTIDAD DE DIAS QUE DESEE");
        
        dias = teclado.nextInt();
        
        int totalsegundos = 0;
        
        totalsegundos = dias * segundos;
        
        System.out.println("LA CANTIDAD DE SEGUNDOS ES " + totalsegundos);
        
        
        
        // TODO code application logic here
    }
    
}
