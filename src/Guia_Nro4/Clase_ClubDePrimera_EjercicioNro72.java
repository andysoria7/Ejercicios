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
public class Clase_ClubDePrimera_EjercicioNro72 
{
    String Nombre_Club;
    int Titulos_Internacionales;
    int Titulos_Nacionales;
    String SitioWebOficial;
    
    public Clase_ClubDePrimera_EjercicioNro72(String p1, int p2, int p3, String p4)
    {
        Nombre_Club = p1;
        Titulos_Internacionales = p2;
        Titulos_Nacionales = p3;
        SitioWebOficial = p4;
    }
    
    public void MostrarDatosClub()
    {
        System.out.println("NOMBRE DEL CLUB = " + Nombre_Club);
        System.out.println("CANTIDAD DE TITULOS INTERNACIONALES = " + Titulos_Internacionales);
        System.out.println("CANTIDAD DE TITULOS NACIONALES = " + Titulos_Nacionales);
        System.out.println("SITIO WEB = " + SitioWebOficial);
        
    }
    
    public void setNombre_Club(String p1)
    {
        Nombre_Club = p1;
    }
    public void setTitulos_Internacionales(int p2)
    {
        Titulos_Internacionales = p2; 
    }
    public void setTitulos_Nacionales(int p3)
    {
        Titulos_Nacionales = p3;
    }
    public void setSitioWebOficial(String p4)
    {
        SitioWebOficial = p4;
    }
    
    public String getNombre_Club()
    {
        return (Nombre_Club);
    }
    public int getTitulos_Internacionales()
    {
        return (Titulos_Internacionales);
    }
    public int getTitulos_Nacionales()
    {
        return (Titulos_Nacionales);
    }
    public String getSitioWebOficial()
    {
        return (SitioWebOficial);
    }
    
    
    
}
