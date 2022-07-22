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
public class Clase_Restaurant {
    
   
    double precio_comida;
    double precio_bebida;
    double precio_postre;
    
    
    public Clase_Restaurant(double p1, double p2, double p3)
    {
        
        precio_comida = p1;
        precio_bebida = p2;
        precio_postre = p3;
        
    }

    
    
    

    
  
  public void setprecio_comida(double p1)
  {
      precio_comida = p1;
  }
  public void setprecio_bebida(double p2)
  {
      precio_bebida = p2;
  }
  
  public void setprecio_postre(double p3)
  {
      precio_postre = p3;
  
  }
  
  public double getprecio_comida()
  {
      return(precio_comida);
  }
    public double getprecio_bebida()
  {
      return(precio_bebida);
  }
    
  public double getprecio_postre()
  {
      return (precio_postre);
  
  } 
 
  
    
}
