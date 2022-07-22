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
public class Final_Recuperatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Teclado1 = new Scanner(System.in);
        Scanner Teclado2 = new Scanner(System.in);
        
        Clase_personas [] personas = new Clase_personas[5];
        
        int DNICliente;
        int SexoCliente = 0;
        String ApellidoCliente;
        String NombreCliente;
        int Edad;
        int acumulador_joven = 0;
        int acumulador_viejo = 0;
        int ContadorHombres = 0;
        int Contador_Mujeres = 0;
        String Buscador = "";
        
        
        
        for (int i = 0; i <=4; i++) 
        {
            System.out.println("Ingrese el DNI del cliente en la posicion " +i);
            DNICliente = Teclado1.nextInt();
            
            System.out.println("Ingrese el sexo del cliente en la posicion " + i);
            SexoCliente = Teclado1.nextInt();
            
            System.out.println("Ingrese el apellido del cliente en la posicion " + i);
            ApellidoCliente = Teclado2.nextLine();
            
            System.out.println("Ingrese el nombre del cliente en la posicion " + i);
            NombreCliente = Teclado2.nextLine();
            
            System.out.println("Ingrese la edad del cliente en la posicion " + i);
            Edad = Teclado1.nextInt();
            
            Clase_personas Obj = new Clase_personas(DNICliente, SexoCliente, ApellidoCliente, NombreCliente, Edad);
            
            personas[i] = Obj;
        }
        
        for (int i = 0; i <=4; i++) 
        {
            if (SexoCliente == 0) 
            {
              
                ContadorHombres = ContadorHombres +1;
                
            }
            
            if (SexoCliente == 1) 
            {
                Contador_Mujeres = Contador_Mujeres + 1;
                
                
            }
            
        }
        
        for (int i = 0; i <=4; i++) 
        {
            acumulador_viejo = acumulador_viejo + personas[i].getEdad();
            acumulador_viejo = acumulador_viejo + personas[i].getEdad();
            
        }
        
        
        
        
        
        
        
         int clienteviejo = personas[0].getEdad();
         
         int clientejoven = personas[0].getEdad();
         
         for (int i = 0; i <=4; i++)
         {
             if (personas[i].getEdad() > clienteviejo)
             {
                 clienteviejo = personas[i].getEdad();
                 
             }
             
             if (personas[i].getEdad() < clientejoven) 
             {
                 clientejoven = personas[i].getEdad();
                 
             }
             
            
         }
         
         System.out.println("INGRESE EL APELLIDO QUE DESEA BUSCAR ");
         Buscador = Teclado2.nextLine();
        
         
        
         
         
         
         System.out.println("EL CLIENTE MAS VIEJO ES EL QUE POSEE LA EDAD DE = " + clienteviejo + " Años ");
         
         System.out.println("EL CLIENTE MAS JOVEN ES EL QUE POSEE LA EDAD DE = " + clientejoven + " Años ");
         
         System.out.println("La cantidad de hombres que hay es de " + ContadorHombres);
         
         System.out.println("La cantidad de mujeres que hay es de " + Contador_Mujeres);
         
         System.out.println(" La cantidad de personas de edad mayor en total es de = " + acumulador_viejo);
         
         System.out.println("La cantidad de personas de menor  edad en total es de = " + acumulador_joven);
         
        
         
         
         
         
         
         
        
    }
    
}
