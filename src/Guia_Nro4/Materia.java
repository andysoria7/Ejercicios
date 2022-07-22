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
public class Materia // ESTE ES EL NOMBRE DE LA CLASE
{
    // ESTOS SON LOS ATRIBUTOS
    
     String Nombre_materia;
     String Nombre_profesor;
     String Horario;
     int anio_materia;
     String fecha;
     
     // ESTE ES EL CONSTRUCTOR
     public Materia(String n1, String n2, String n3, int n4, String n5)
     {
         Nombre_materia = n1;
         Nombre_profesor = n2;
         Horario = n3;
         anio_materia = n4;
         fecha = n5;
         
     
     }
     
     // VOY A CREAR UN PROCESO QUE PERMITA MOSTRAR LOS ATRIBUTOS
     
     public void MuestraAtributo()
     {
         System.out.println("Nombre = " + Nombre_materia);
         System.out.println("Profesor = " + Nombre_profesor);
         System.out.println("Horario = " + Horario);
         System.out.println("Anio de la materia" + anio_materia);
         System.out.println("Dias de cursado" + fecha);
     
     }        
    
    
}
