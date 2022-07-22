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
public class EjercicioNro73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Clase_Libro_EjercicioNro73 Objeto1 = new Clase_Libro_EjercicioNro73("9 ||789506 ||442323 ", 9, 3, 2012, "Choque de reyes ", "George R.R Martin");
      
      Objeto1.MostrarDatosLibro();
      
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        
        System.out.println("El codigo de barra del libro es = " + Objeto1.getCodigo_Libro());
        System.out.println("El Dia en el que se edito el libro fue el = " + Objeto1.getFecha_Edicion_Dia());
        System.out.println("El mes en el que se edito el libro fue el = " + Objeto1.getFecha_Edicion_Mes());
        System.out.println("El año en el que se edito el libro fue en el = " + Objeto1.getFecha_Edicion_Año());
        System.out.println("Titulo del libro = " + Objeto1.getTitulo_Libro());
        System.out.println("El autor que lo escribio es = " + Objeto1.getAutor());
        
    }
    
}
