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
public class EjercicioNro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
       
        int Variable1 = 0;
        
        Persona Objeto1 = new Persona("Carolina", "Plumez", " 12/6/93", 37607999, "Avenida ocampo 881");
        
        Persona Objeto2 = new Persona("Andres", "Soria", "9/2/1993", 37167991, "Junin 50");

        */
        
        Materia M1 = new Materia("Taller De Software 1", "Daniel Maldonado", "Lunes de 19 a 20hs", 2019, "Lunes y viernes");
        
        M1.MuestraAtributo();
        
        Materia M5;
        
        Materia M2 = new Materia("Ingles 2", "Omar mazud", "Martes 19 a 20 hs", 2019, " Martes a viernes");
        
        M2.MuestraAtributo();
        
        
    }
    
}
