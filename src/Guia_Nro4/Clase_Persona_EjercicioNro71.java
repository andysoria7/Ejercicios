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
public class Clase_Persona_EjercicioNro71 
{
    int DNI;
    String Apellido;
    String Nombre;
    String Telefono;
    String Email;
    boolean Sexo;
    
    public Clase_Persona_EjercicioNro71(int p1, String p2, String p3, String p4, String p5, boolean p6)
    {
       DNI = p1;
       Apellido = p2;
       Nombre = p3;
       Telefono = p4;
       Email = p5;
       Sexo = p6;
    
    }
    public void MostrarDatos()
    {
        System.out.println("DNI = " + DNI);
        System.out.println("APELLIDO = " + Apellido);
        System.out.println("NOMBRE =  " + Nombre);
        System.out.println("TELEFONO = " + Telefono);
        System.out.println("EMAIL = " + Email);
        System.out.println("SEXO = " + Sexo);
        
    }
    
    // METODO SET DNI QUE ME PERMITE FIJAR UN VALOR EN EL ATRIBUTO DNI
    public void setDNI(int p1)
    {
        DNI = p1;
    
    }
    // ESTO ME PERMITE DEVOLVER EL VALOR DEL ATRIBUTO DNI
    public int getDNI()
    {
      return(DNI);  
    
    }
    public void setApellido(String p2)
    {
        Apellido = p2;
    
    }
    public String getApellido()
    {
        return (Apellido);
    
    }
    public  void setNombre(String p3)
    {
        Nombre = p3;
    }
    public String getNombre()
    {
        return (Nombre);
    }        
    public void setSexo(boolean p6)
    {
        Sexo = p6;
    }
    public boolean getSexo()
    {
        return (Sexo);
    }        
}
