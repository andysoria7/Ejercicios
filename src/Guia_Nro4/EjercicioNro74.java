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
public class EjercicioNro74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Clase_ArticuloDeSupermercado Objeto1 = new Clase_ArticuloDeSupermercado("7|790895|002656", "Coca cola de 375 ml ", 12, 20, 12 );
        Objeto1.MostrarDatosSupermercado();
        
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        
        System.out.println("El codigo del articulo es = " + Objeto1.getCodigo_Articulo());
        System.out.println("El articulo es una = " + Objeto1.getDescripcion_Articulo());
        System.out.println("El precio de compra es de = " + Objeto1.getPrecio_Compra());
        System.out.println("El precio de venta es de = " + Objeto1.getPrecio_Venta());
        System.out.println("La cantidad de articulos en stock es de = " + Objeto1.getCantidad_Articulos_Stock());
        
        
        
    }
    
}
