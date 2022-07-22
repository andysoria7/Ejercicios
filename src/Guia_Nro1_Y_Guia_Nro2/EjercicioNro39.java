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
public class EjercicioNro39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena1 = "CHILE NO CLASIFICO MUNDIAL";
         int contador_O = 0;
        
        for (int i = 0; i <= cadena1.length() - 1 ; i++) 
        {
            if ((cadena1.charAt(i) == 'O') || (cadena1.charAt(i) == 'o'))
            {
                contador_O = contador_O + 1 ;
                
                if( contador_O ==2)
                {
                    System.out.println("SE ENCONTRO LA SEGUNDA LETRA O  , SE DETUVO EL PROGRAMA " + i);
                    break ; 
                
                }
            }
            
        }
    }
    
}
