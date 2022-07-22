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
public class EjercicioNro78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner Teclado1 = new Scanner(System.in);
        Scanner Teclado2 = new Scanner(System.in);
        
        Clase_ArticuloDeSupermercado [] Articulos = new Clase_ArticuloDeSupermercado [2];
        
        String Codigo_Articulo = "";
        String Descripcion_Articulo = "";
        int Precio_Compra = 0;
        int Precio_Venta = 0;
        int Cantidad_Articulos_Stock = 0;
        
        for (int i = 0; i <=1; i++) 
        {
            System.out.println("Ingrese el codigo del articulo de la posicion " + 1);
            Codigo_Articulo = Teclado2.nextLine();
            
            System.out.println("Ingrese la descripcion del articulo de la posicion " + i);
            Descripcion_Articulo = Teclado2.nextLine();
            
            System.out.println("Ingrese el precio de compra del articulo de la posicion " + i);
            Precio_Compra = Teclado1.nextInt();
            
            System.out.println("Ingrese el precio de venta del articulo de la posicion " + i);
            
            Precio_Venta = Teclado1.nextInt();
            
            System.out.println("Ingrese la cantidad de articulos en stock del articulo de la posicion " + i);
            Cantidad_Articulos_Stock = Teclado1.nextInt();
            
            Clase_ArticuloDeSupermercado ObjetoAuxiliar = new Clase_ArticuloDeSupermercado(Codigo_Articulo,Descripcion_Articulo,Precio_Compra,Precio_Venta,Cantidad_Articulos_Stock);
            
            Articulos[i] = ObjetoAuxiliar;
        }
        
        int contador = 0;
        double PrecioCompraTotal = 0;
        double PrecioVentaTotal = 0;
        
        for (int i = 0; i <=1; i++) 
        {
            contador = contador +1;
            
            PrecioCompraTotal = PrecioCompraTotal + Articulos[i].getPrecio_Compra();
            PrecioVentaTotal = PrecioVentaTotal + Articulos[i].getPrecio_Venta();
        }
        
        if (contador > 0) 
        {
            double PromedioCompra = 0;
            double PromedioVenta = 0;
            
            PromedioCompra = PrecioCompraTotal / contador;
            PromedioVenta = PrecioVentaTotal / contador;
            
            System.out.println("El precio de compra promedio es igual a = " + PromedioCompra);
            System.out.println("El precio de venta promedio es igual a = " + PromedioVenta);
            
        }
        
        
        
        
        
        
        
        
        
    }
    
}
