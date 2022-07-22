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
public class EjercicioNro76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner Teclado1 = new Scanner(System.in);
        
         Scanner Teclado2 = new Scanner(System.in);
         
         Clase_ClubDePrimera_EjercicioNro72 [] Equipos = new Clase_ClubDePrimera_EjercicioNro72 [3];
         
         String Nombre = "";
         int Titulos_I = 0;
         int Titulos_N = 0;
         String pagina = "";
         
         for (int i = 0; i <=2; i++) 
         {
             System.out.println("Ingrese nombre del equipo en la posicion " + i);
             Nombre = Teclado2.nextLine();
             
             System.out.println("Ingrese la pagina web del equipo en la posicion " + i);
             pagina = Teclado2.nextLine();
             
             System.out.println("Ingrese la cantidad de titulos internacionales del equipo en la posicion " + i);
             Titulos_I = Teclado1.nextInt();
             
             System.out.println("Ingrese la cantidad de titulos nacionales del equipo en la posicion " + i);
             Titulos_N = Teclado1.nextInt();
             
             Clase_ClubDePrimera_EjercicioNro72 ObjetoAuxiliar = new Clase_ClubDePrimera_EjercicioNro72(Nombre, Titulos_I, Titulos_N,pagina);
             
             Equipos[i] = ObjetoAuxiliar;
             
         }
         
         int mayor_titulosI = 0;
         int mayor_titulosN = 0;
         
         Clase_ClubDePrimera_EjercicioNro72 EquipoMayor = new Clase_ClubDePrimera_EjercicioNro72("",0,0,"");
         
         for (int j = 0; j <=2; j++) 
         {
             if (j == 0) 
             {
                 // ESTO PARA UNA SOLA VES UNICAMENTE PARA EL PRIMER EQUIPO CARGADO EN EL VECTOR
                 
                 mayor_titulosI = Equipos[j].getTitulos_Internacionales();
                 
                 mayor_titulosN = Equipos[j].getTitulos_Nacionales();
               
                 EquipoMayor = Equipos[j];
             }
             
             if (Equipos[j].getTitulos_Internacionales() > mayor_titulosI) 
             {
                 mayor_titulosI = Equipos[j].getTitulos_Internacionales();
                 
                 EquipoMayor = Equipos[j];
             }
             if (Equipos[j].getTitulos_Nacionales() > mayor_titulosN)
             {
                  mayor_titulosN = Equipos[j].getTitulos_Nacionales();
                  EquipoMayor = Equipos[j];
                 
             }
            
         }
         
         System.out.println("EL EQUIPO QUE TIENE MAS TITULOS INTERNACIONALES ES = ");
         
         EquipoMayor.MostrarDatosClub();
         
         System.out.println("------------------------------------------");
         
         System.out.println("EL EQUIPO QUE TIENE MAS TITULOS NACIONALES ES = ");
         
         EquipoMayor.MostrarDatosClub();
    }
    
}
