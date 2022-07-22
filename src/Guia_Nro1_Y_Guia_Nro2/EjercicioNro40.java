/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro1_Y_Guia_Nro2;

/**
 *
 * @author Andrés Soria
 */
public class EjercicioNro40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena = "SAN LORENZO TIENE UNA COPA LIBERTADORES";
        
        boolean LetraA = false;
        boolean LetraE = false;
        boolean LetraI = false;
        boolean LetraO = false;
        boolean LetraU = false;
        
        for (int i = 0; i <= cadena.length()-1; i++) 
        {
            if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'A'))
            {
                LetraA = true;
                
            }
            
            if ((cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'E')) 
            {
                LetraE = true;
                
            }
            
            if ((cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'I')) 
            {
             LetraI = true;
             
            }
            
            if ((cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'O')) 
            {
                LetraO = true;
                
            }
            
            if ((cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'U'))
            {
                LetraU = true;
                
            }
            
            
           }
        
        if ((LetraA == true) && (LetraE == true) && (LetraI == true) && (LetraO == true) && (LetraU == true))
        {
            System.out.println(" LA CADENA TIENE TODAS LAS VOCALES");
            
            
        }
        
        else
        {
            System.out.println("LA CADENA NO TIENE TODAS LAS VOCALES");
        
        }  
        
        
        
        
        
          
        
        
                
        
        
    }
    
}
