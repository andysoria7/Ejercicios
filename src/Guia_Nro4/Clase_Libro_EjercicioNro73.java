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
public class Clase_Libro_EjercicioNro73 
{
    String Codigo_Libro;
    int Fecha_Edicion_Dia;
    int Fecha_Edicion_Mes;
    int Fecha_Edicion_Año;
    String Titulo_Libro;
    String Autor;
    
  public Clase_Libro_EjercicioNro73(String p1, int p2, int p3, int p4, String p5, String p6)
  {
      Codigo_Libro = p1;
      Fecha_Edicion_Dia = p2;
      Fecha_Edicion_Mes = p3;
      Fecha_Edicion_Año = p4;
      Titulo_Libro = p5;
      Autor = p6;
  }

  public void MostrarDatosLibro()
  {
      System.out.println("CODIGO DEL LIBRO " + Codigo_Libro);
      System.out.println("DIA DE SU EDICION " + Fecha_Edicion_Dia);
      System.out.println("MES DE SU EDICION " + Fecha_Edicion_Mes);
      System.out.println("AÑO DE SU EDICION " + Fecha_Edicion_Año);
      System.out.println("TITULO DEL LIBRO " + Titulo_Libro);
      System.out.println("AUTOR DEL LIBRO " + Autor);
  }

  public void setCodigo_Libro(String p1)
  {
      Codigo_Libro = p1;
  
  }
  public void setFecha_Edicion_Dia(int p2)
  {
      Fecha_Edicion_Dia = p2;
  }
  public void setFecha_Edicion_Mes(int p3)
  {
      Fecha_Edicion_Mes = p3;
  }
  public void setFecha_Edicion_Año(int p4)
  {
      Fecha_Edicion_Año = p4;
  }
  public void setTitulo_Libro(String p5)
  {
      Titulo_Libro = p5;
  }
  public void setAutor(String p6)
  {
      Autor = p6;
  }
  
  
  public String getCodigo_Libro()
  {
      return(Codigo_Libro);
  }
  public int getFecha_Edicion_Dia()
  {
      return(Fecha_Edicion_Dia);
  }
    public int getFecha_Edicion_Mes()
  {
      return(Fecha_Edicion_Mes);
  }
    public int getFecha_Edicion_Año()
  {
      return(Fecha_Edicion_Año);
  }
  public String getTitulo_Libro()
  {
      return(Titulo_Libro);
  }
  public String getAutor()
  {
      return(Autor);
  }
    
  
}
