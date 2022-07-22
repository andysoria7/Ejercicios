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
public class EjercicioNro38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena1 = "HOLA";
        String cadena2 = "ALOH";
        
        boolean Distinto = false ;
        
        if(cadena1.length() == cadena2.length())
        {
            int j = cadena2.length() - 1 ;
            for (int i = 0; i <= cadena1.length() - 1; i++) 
            {
                if (cadena1.charAt(i) != cadena2.charAt(j)) 
                {
                    Distinto = true;
                    break;
                    
                }
                j = j -1 ;
              
            }
             if(Distinto == true)
        {
            System.out.println("SON DIFERENNTES , SE ENCONTRO UN CARACTER QUE ERA DISTINTO");
        
        }
        else
        {
            System.out.println("AMBAS CADENAS SON IGUALES  , NO SE ENCONTRO  UN CARACTER DISTINTO ");
        
        }  
        
        }
        else
        {
            System.out.println("SON DIFERENTES PORQUE TIENEN DISTINTO LARGO");
        
        }
       
     
    }
    
}
