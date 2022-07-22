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
public class Final_Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner Teclado1 = new Scanner(System.in);
         Scanner Teclado2 = new Scanner(System.in);
         
         Clase_Restaurant [] Restaurant = new Clase_Restaurant [2];
         
         
         double precio_comida = 0;
         double precio_bebida = 0;
         double precio_postre = 0;
         double acumulador_comida = 0;
         double acumulador_bebida = 0;
         double acumulador_postre = 0;
         double acumulador_total = 0;
        
         
         
         
         for (int i = 0; i <=1; i++) 
         {
             
             System.out.println("Ingrese el precio del plato de comida que pidio el comensal de la mesa " +i);
             precio_comida = Teclado2.nextDouble();
             
             System.out.println("Ingrese el precio de la bebida que pidio el comensal de la mesa " +i);
             precio_bebida = Teclado2.nextDouble();
             
             System.out.println("Ingrese el precio del postre que pidio el comensal de la mesa " +i);
             precio_postre = Teclado2.nextDouble();
             
            Clase_Restaurant Objetos = new Clase_Restaurant(precio_comida, precio_bebida, precio_postre);
            Restaurant[i] = Objetos;
            
            
         }
         
         for (int i = 0; i <=1; i++) 
         {
             acumulador_comida = acumulador_comida + Restaurant[i].getprecio_comida();
             
             acumulador_bebida = acumulador_bebida + Restaurant[i].getprecio_bebida();
             
             acumulador_postre = acumulador_postre + Restaurant[i].getprecio_postre();
             
         }
         
        double mayor = Restaurant[0].getprecio_comida();
        double menor = Restaurant[0].getprecio_bebida();
        double mayor_postre = Restaurant[0].getprecio_postre();
        
        for (int i = 0; i <=1; i++) 
        {
            if (Restaurant[i].getprecio_comida() > mayor) 
            {
                mayor = Restaurant[i].getprecio_comida();
                
        
            }
            
            if (Restaurant[i].getprecio_bebida() < menor) 
            {
                menor = Restaurant[i].getprecio_bebida();
                
            }
            
            if (Restaurant[i].getprecio_postre() > mayor_postre) 
            {
                mayor_postre = Restaurant[i].getprecio_postre();
                
            }
            
        }
        
        
        acumulador_total = acumulador_bebida + acumulador_comida;
        
        System.out.println("El que mas gasto en comida es el comensal que pago = " + " $ " + mayor +  " Pesos ");
        System.out.println("El que menos gasto en bebida es el comensal que pago =  " + " $ " + menor +  " Pesos ");
        System.out.println("El que mas gasto en postre es el comensal que pago  =  " + " $ " + mayor_postre +  " Pesos ");
        System.out.println("Las ganancias que recaudo el restaurant en comida es en total de  = " + " $ " + acumulador_comida +  " Pesos ");
        System.out.println("Las ganancias que recaudo el restaurant en bebida es en total de  = " + " $ " + acumulador_bebida +  " Pesos ");
        System.out.println("Las ganancias que recaudo el restaurant en postres  es en total de  = " + " $ " + acumulador_postre +  " Pesos ");
        System.out.println("La ganancia total del restaurant es de = " + " $ " + acumulador_total +  " Pesos ");
        
        
        
         
         
         
         
         
         
         
    }
    
}
