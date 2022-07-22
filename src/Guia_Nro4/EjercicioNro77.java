/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Nro4;

import java.util.Scanner;

/**
 *
 * @author Andrés Soria
 */
public class EjercicioNro77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner Teclado1 = new Scanner(System.in);
         Scanner Teclado2 = new Scanner(System.in);
         
         Clase_Libro_EjercicioNro73 [] Libros = new Clase_Libro_EjercicioNro73 [2];
         
         String Codigo_Libro = "";
         int Fecha_dia = 0;
         int Fecha_mes = 0;
         int Fecha_anio = 0;
         String Titulo_Libro = "";
         String Autor = "";
         
         for (int i = 0; i <=1; i++) 
         {
             System.out.println("Ingrese el codigo del libro en la posicion " + i);
             Codigo_Libro = Teclado2.nextLine();
             
             System.out.println("Ingrese la fecha del dia de edicion del libro de la posicion " + i);
             Fecha_dia = Teclado1.nextInt();
             
             System.out.println("Ingrese la fecha del mes de edicion del libro de la posicion " + i);
             Fecha_mes = Teclado1.nextInt();
             
             System.out.println("Ingrese la fecha del año de edicion del libro de  la posicion " +i);
             Fecha_anio = Teclado1.nextInt();
             
             System.out.println("Ingrese el titulo del libro de la posicion " +i);
             Titulo_Libro = Teclado2.nextLine();
             
             System.out.println("Ingrese el autor del libro de la posicion " + i);
             Autor = Teclado2.nextLine();
             
             Clase_Libro_EjercicioNro73 ObjetoAuxiliar = new Clase_Libro_EjercicioNro73(Codigo_Libro,Fecha_dia,Fecha_mes,Fecha_anio,Titulo_Libro,Autor);
             Libros[i] = ObjetoAuxiliar;
         }
         
         int libro = 0;
         int aux = 0;
         String viejo = "";
         
         
         
         
        
         for (int i = 0; i <=1; i++) 
         {
             
            
             libro =  Trabajo_Practico_Nro03.cantidad_dias_entre_dos_fechas(Libros[i].getFecha_Edicion_Dia(),Libros[i].getFecha_Edicion_Mes(),Libros[i].getFecha_Edicion_Año(), 20, 11, 2018 );
             
             if (libro > aux) 
             {
                 aux = libro;
                 
                 viejo = Libros[i].getTitulo_Libro();
                 
                 
                 
             }
             
             
         }
         System.out.println("EL LIBRO MAS VIEJO ES = " + viejo);
         
         
             
         }
    
}
