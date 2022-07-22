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
public class Clase_personas {
    
    int DNICliente;
    int SexoCliente;
    String ApellidoCliente;
    String NombreCliente;
    int Edad;
    
    // Constructor
    
    public Clase_personas(int p1, int p2, String p3, String p4, int p5)
    {
        DNICliente = p1;
        SexoCliente = p2;
        ApellidoCliente = p3;
        NombreCliente = p4;
        Edad = p5;
    
    }

    
    
    // Metodos set
    
    public void setDNICliente(int p1)
    {
        DNICliente = p1;
    
    }
    
    public void setSexoCliente(int p2)
    {
        SexoCliente = p2;
    
    }
    
    public void setApellidoCliente(String p3)
    {
        ApellidoCliente = p3;
    
    }
    
    public void setNombreCliente (String p4)
    {
        NombreCliente = p4;
    
    }
    
    public void setEdad (int p5)
    {
        Edad = p5;
    
    }
    
    // Metodos get
    
    public int getDNICliente()
    {
        return (DNICliente);
    
    }
    
    public int getSexoCliente()
    {
        return (SexoCliente);
    
    }
    
    public String getApellidoCliente()
    {
        return (ApellidoCliente);
    
    }
    
    public String getNombreCliente()
    {
        return (NombreCliente);
    
    }
    
    public int getEdad()
    {
        return (Edad);
    
    }
    
}
