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
public class EjercicioNro13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = 0;
        double B = 0;
        double C = 0;
        double D = 0;
        
        System.out.println("INGRESE VALOR DE A ");
        A = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DE B");
        B = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DE C");
        C = teclado.nextDouble();
        
        System.out.println("INGRESE VALOR DE D");
        D = teclado.nextDouble();
        
        double suma1 = 0;
        double suma2 = 0;
        suma1 = A + B ;
        suma2 = C + D ;
        if(suma1 > suma2){
            System.out.println("SUMA 1 ES MAYOR A SUMA 2 " +  suma1);
        }else
            System.out.println("SUMA 2 ES MAYOR A SUMA 1 ");
        }
        
        
        
       
    }
    

