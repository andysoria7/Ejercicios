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
public class EjercicioNro71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Clase_Persona_EjercicioNro71 Objeto1;
       
       Clase_Persona_EjercicioNro71 Objeto2;
       
       Clase_Persona_EjercicioNro71 Objeto3 = new Clase_Persona_EjercicioNro71(37167991, "Soria", "Andres", "3834231578", "asoria@institutosanmartin.edu.ar",true);
       
       Clase_Persona_EjercicioNro71 Objeto4 = new Clase_Persona_EjercicioNro71(37167991, "Maldonado", "Daniel", "3834402862", "dmaldonado@institutosanmartin.edu.ar",true);
       
       
       Objeto3.MostrarDatos();
       
       Objeto4.MostrarDatos();
       
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        
        System.out.println("El apellido del objeto 3 es = " + Objeto3.getApellido());
        
        System.out.println("El apellido del objeto 4 es = " + Objeto4.getApellido());
       
    }
    
}
