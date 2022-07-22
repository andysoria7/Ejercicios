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
public class EjercicioNro75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)       
    {
        Scanner Teclado1 = new Scanner(System.in);
        
        Scanner Teclado2 = new Scanner(System.in);
        
        Scanner Teclado3 = new Scanner(System.in);
        
        // Defini el vector de personas
        Clase_Persona_EjercicioNro71 [] VectorDePersonas = new Clase_Persona_EjercicioNro71[2];
        
        // Vamos a recorrer el vector cargandolo de personas
        
        int DNI = 0;
        String Apellido = "";
        String Nombre = "";
        String Telefono = "";
        String Email = "";
        boolean Sexo = false;
        
        for (int i = 0; i <=1; i++) 
        {
            System.out.println("Cargando la persona numero " + i);
            
            System.out.println("Ingrese el DNI = ");
            
            DNI = Teclado1.nextInt();
            
            System.out.println("Ingrese el Apellido = ");
            
            Apellido = Teclado2.nextLine();
            
            System.out.println("Ingrese el Nombre = ");
            
            Nombre = Teclado2.nextLine();
            
            System.out.println("Ingrese el Telefono = ");
            
            Telefono = Teclado2.nextLine();
            
            System.out.println("Ingrese el Email = ");
            
            Email = Teclado2.nextLine();
            
            System.out.println("Ingrese el Sexo ");
            
            Sexo = Teclado3.nextBoolean();
            
            Clase_Persona_EjercicioNro71 ObjetoAuxiliar = new Clase_Persona_EjercicioNro71(DNI, Apellido, Nombre, Telefono, Email, Sexo);
            
            VectorDePersonas[i] = ObjetoAuxiliar;
            
          }
        
          // Vamos a recorrer el vector para contabilizar la cantidad de mujeres y de varones
          
          int ContadorDeVarones = 0;
          
          int ContadorDeMujeres = 0;
          
          for (int k = 0; k <=1; k++) 
          {
              if (VectorDePersonas[k].getSexo()== true) 
              {
                  ContadorDeVarones = ContadorDeVarones +1;
              }
              else
              {
                  ContadorDeMujeres = ContadorDeMujeres +1;
              }   
            
          }
          
          int ContadorEspeche = 0;
          
          
          for (int k = 0; k <=1; k++) 
          {
              if ("espeche".equals(VectorDePersonas[k].getApellido())) 
              {
                  ContadorEspeche = ContadorEspeche + 1;
              }
             
            
          }
          
          int contadorjorge = 0;
          
           for (int k = 0; k <=1; k++) 
           {
              if ("jorge".equals(VectorDePersonas[k].getNombre())) 
              {
                  contadorjorge = contadorjorge +1;
              }
             
            
           }
          
          
          System.out.println("La cantidad de hombres = " + ContadorDeVarones);
          
          System.out.println("La cantidad de mujeres = " + ContadorDeMujeres);
          
          System.out.println("La cantidad de espeches = " + ContadorEspeche);
          
          System.out.println("La cantidad de jorges = " + contadorjorge);
        
        
        
        
        
        
        
    }
    
}
