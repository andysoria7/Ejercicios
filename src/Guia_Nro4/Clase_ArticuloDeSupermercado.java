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
public class Clase_ArticuloDeSupermercado 
{
    String Codigo_Articulo;
    String Descripcion_Articulo;
    int Precio_Compra;
    int Precio_Venta;
    int Cantidad_Articulos_Stock;
    
public Clase_ArticuloDeSupermercado(String p1, String p2, int p3, int p4, int p5)   
{
    Codigo_Articulo = p1;
    Descripcion_Articulo = p2;
    Precio_Compra = p3;
    Precio_Venta = p4;
    Cantidad_Articulos_Stock = p5;
}

public void MostrarDatosSupermercado ()
{
    System.out.println("CODIGO DEL ARTICULO " + Codigo_Articulo);
    System.out.println("DESCRIPCION DEL ARTICULO " + Descripcion_Articulo);
    System.out.println("PRECIO DE COMPRA " + Precio_Compra);
    System.out.println("PRECIO DE VENTA " + Precio_Venta);
    System.out.println("CANTIDAD DE ARTICULOS EN STOCK " + Cantidad_Articulos_Stock);
}

public void setCodigo_Articulo(String p1)
{
    Codigo_Articulo = p1;
}
public void setDescripcion_Articulo(String p2)
{
    Descripcion_Articulo = p2;
}
public void setPrecio_Compra(int p3)
{
    Precio_Compra = p3;
}
public void setPrecio_Venta(int p4)
{
    Precio_Venta = p4;
}
public void setCantidad_Articulos_Stock(int p5)
{
    Cantidad_Articulos_Stock = p5;
}

public String getCodigo_Articulo()
{
    return (Codigo_Articulo);
}
public String getDescripcion_Articulo()
{
    return (Descripcion_Articulo);
}
public int getPrecio_Compra()
{
    return (Precio_Compra);
}
public int getPrecio_Venta()
{
    return (Precio_Venta);
}
public int getCantidad_Articulos_Stock()
{
    return (Cantidad_Articulos_Stock);
}        

}
