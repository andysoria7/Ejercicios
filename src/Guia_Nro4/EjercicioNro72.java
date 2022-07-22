/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro4;

/**
 *
 * @author Andrés Soria
 */
public class EjercicioNro72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Clase_ClubDePrimera_EjercicioNro72 Objeto1 = new Clase_ClubDePrimera_EjercicioNro72("San lorenzo de almagro", 3, 15, "https://sanlorenzowebsite.com.ar");
       
       Objeto1.MostrarDatosClub();
       
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        
        System.out.println("El nombre del club de primera es = " + Objeto1.Nombre_Club);
        System.out.println("La cantidad de titulos internacionales que tiene en total es de = " + Objeto1.Titulos_Internacionales);
        System.out.println("La cantidad de titulos nacionales que tiene en total es de =  " + Objeto1.Titulos_Nacionales);
        System.out.println("La pagina web del club es = " + Objeto1.getSitioWebOficial());
    }
    
}
