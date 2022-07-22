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
public class Trabajo_Practico_Nro03 {
    // PROCEDIMIENTO PARA EJERCICIO NRO 46
    public static void asteriscos_10 (int largo)
    {
        for (int i = 0; i <= 10; i++) 
        {
            System.out.println("**********");
            
        }
        
    
    }
    // PROCEDIMIENTO PARA EJERCICIO NRO 47
    public static void asteriscos_n(int as)
    {
        for (int i = 0; i <= as - 1; i++) 
        {
            System.out.print("*");
            
        }
    
    }
    
    // FUNCION PARA EJERCICIO NRO 48
    public static double suma(double p1,double p2)
    {
        double auxiliar = 0;
        auxiliar = p1 + p2 ;
        return (auxiliar);
    
    }
    // FUNCION PARA EJERCICIO NRO 49
    public static double cuadrado(double A)
    {
        double cuadradito = 0;
        cuadradito = A * A ;
        return (cuadradito);
    
    }
    // FUNCION PARA EJERCICIO NRO 50
    public static double porcentale_total(double x,double porcentaje)
    {
        double porcentajesirijillo = 0;
        porcentajesirijillo = (x * porcentaje) / 100;
        return (porcentajesirijillo);
    
    }
    // FUNCION PARA EJERCICIO NRO 51
    public static double menor_valor(double n1, double n2)
    {
        if (n1 < n2) 
        {
            return (n1);
            
        }
        else
        {
            if (n2 < n1) 
            {
                return (n2);
                
            }
            else
            {
                return (n1);
            
            }
        
        }
    
    }
    
    // FUNCION PARA EJERCICIO NRO 52
    public static boolean Es_par(double numero)
    {
        if (numero % 2 == 0) 
        {
            return true;
            
        }
        else
        {
            return false ;
        
        }    
    
    }
    // FUNCION PARA EJERCICIO NRO 53
    public static int contadorA(String cadena)
    {
       String cade = "";
       char caracter = ' ';
       int contador = 0;
       
        for (int i = 0; i <= cadena.length()-1; i++) 
        {
            caracter = cadena.charAt(i);
            
            if ((caracter == 'a') || (caracter == 'A'))
            {
                contador = contador +1 ;
                
                
            }
            
        }
         return (contador);
        
      
     }
    // FUNCION PARA EJERCICIO NRO 54
    public static int vocales(String cadenal)
    {
        String cadenitas = "";
        char caracteres = ' ';
        int contadorDeVocales = 0;
        
        for (int i = 0; i <= cadenal.length()-1; i++) 
        {
            caracteres = cadenal.charAt(i);
            
            if (caracteres == 'a' || (caracteres == 'e') || (caracteres == 'i') || (caracteres == 'o') || (caracteres == 'u')) 
            {
                contadorDeVocales = contadorDeVocales + 1 ;
                
                
            }
            
        }
        
        return (contadorDeVocales);
        
        
        
    
    }
    // FUNCION PARA EJERCICIO NRO 55
    public static int contador_letra_cadena(String cadena_magica, char caracterLocalizado)
    {
        int cantidad_totalitaria = 0;
        
        for (int i = 0; i <= cadena_magica.length()-1; i++) 
        {
            if (cadena_magica.charAt(i) == caracterLocalizado) 
            {
                cantidad_totalitaria = cantidad_totalitaria +1 ;
                
            }
            
        }
        
        return (cantidad_totalitaria);
        
       
    }
    // FUNCION PARA EJERCICIO NRO 56
    public static int points (char letra)
    {
        if ((letra == 'a') || (letra == 'A'))
        {
            return 1 ;
            
        }
        
        if ((letra == 'b') || (letra == 'B'))
        {
            return 2 ;
            
        }
        
        if ((letra == 'c') || (letra == 'C'))
        {
            return 3 ;
            
        }
        
        if ((letra == 'd') || (letra == 'D'))
        {
            return 4 ;
            
        }
        
        if ((letra == 'e') || (letra == 'E'))
        {
            return 5 ;
            
        }
        
        if ((letra == 'f') || (letra == 'F'))
        {
            return 6 ;
            
        }
        
        if ((letra == 'g') || (letra == 'G'))
        {
            return 7 ;
            
        }
        
        if ((letra == 'h') || (letra == 'H'))
        {
            return 8 ;
            
        }
        
        if ((letra == 'i') || (letra == 'I'))
        {
            return 9 ;
            
        }
        
        if ((letra == 'j') || (letra == 'J'))
        {
            return 10 ;
            
        }
        
        if ((letra == 'k') || (letra == 'K'))
        {
            return 11 ;
            
        }
        
        if ((letra == 'l') || (letra == 'L'))
        {
            return 12;
            
        }
        
        if ((letra == 'm') || (letra == 'M'))
        {
            return 13;
            
        }
        
        if ((letra == 'n') || (letra == 'N'))
        {
            return 14;
            
        }
        
        if ((letra == 'ñ') || (letra == 'Ñ'))
        {
            return 15;
            
        }
        
        if ((letra == 'o') || (letra == 'O'))
        {
            return 16;
            
        }
        
        if ((letra == 'p') || (letra == 'P'))
        {
            return 17;
            
        }
        
        if ((letra == 'q') || (letra == 'Q'))
        {
            return 18;
            
        }
        
        if ((letra == 'r') || (letra == 'R'))
        {
            return 19;
            
        }
        
        if ((letra == 's') || (letra == 'S'))
        {
            return 20;
            
        }
        
        if ((letra == 't') || (letra == 'T'))
        {
           return 21;
            
        }
        
        if ((letra == 'u') || (letra == 'U'))
        {
            return 22;
            
        }
        
        if ((letra == 'v') || (letra == 'V'))
        {
            return 23;
            
        }
        
        if ((letra == 'w') || (letra == 'W'))
        {
            return 24;
            
        }
        
        if ((letra == 'x') || (letra == 'X'))
        {
            return 25;
            
        }
        
        if ((letra == 'y') || (letra == 'Y'))
        {
            return 26;
            
        }
        
        if ((letra == 'z') || (letra == 'Z'))
        {
            return 27;
            
        }
        
        return 0;
        
        
    
    }
    public static int acumulador_puntos (String cadena_lunar)
    {
       int acumulador_points = 0;
       
        for (int i = 0; i <= cadena_lunar.length()-1; i++) 
        {
            acumulador_points = acumulador_points + points(cadena_lunar.charAt(i));
            
        }
        return (acumulador_points);
    
    }
         
      
    
    // FUNCION PARA EJERCICIO NRO 57
    public static boolean EsAnioBisiesto(int Anio)
	{
		int resto4 = 0;
		int resto100 = 0;
		int resto400 = 0;
		if (Anio >= 0)
		{
			resto4 = Anio%4;
			resto100 = Anio%100;
			resto400 = Anio%400;
			if ((resto4 == 0) && ((resto100 != 0) || (resto400 == 0)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
			
	}
     // FUNCION PARA EJERCICIO NRO 58
    public static  int dimesañ ( int mes, int anionio)
    {
        
        if (mes == 1) 
        {
            return 31;
        }
        
        if ((EsAnioBisiesto(anionio)) && (mes == 2))
        {
            return 29;
        }
        
        if (mes ==2) 
        {
            return 28;
            
        }
        
        if (mes ==3) 
        {
            return 31;
            
        }
        
        if (mes ==4) 
        {
            return 30;
            
        }
        
        if (mes ==5) 
        {
            return 31;
            
        }
        
        if (mes==6) 
        {
            return 30;
            
        }
        
        if (mes==7) 
        {
            return 31;
            
        }
        
        if (mes==8) 
        {
            return 31;
            
        }
        
        if (mes==9) 
        {
            return 30;
            
        }
        
        if (mes==10) 
        {
            return 31;
            
        }
        
        if (mes ==11) 
        {
            return 30;
            
        }
        
        if (mes==12) 
        {
            return 31;
            
        }
        
        return 0;
        
        
    
    }
    // FUNCION PARA EJERCICIO NRO 59
    public static boolean Diacoorecto(int day, int month, int year)
    {
        if ((day >=1) && (day <=dimesañ(month,year)))
        {
            return true;
            
        }
        else
        {
            return false;
        
        }   
        
        
        
    }
    // FUNCION PARA EJERCICIO NRO 60
    public static boolean mes_valido (int day_d, int month_m, int year_y)
    {
        if ((month_m >=1) && (month_m <= 12))
        {
            return true;
            
        }
        else
        {
           return false; 
        
        }   
    
    }
    // FUNCION PARA EJERCICIO NRO 61
    public static boolean año_valido (int d, int m , int y)
    {
        if (y > 0) 
        {
            return true ;
            
        }
        else
        {
            return false ;
        
        }    
    
    }
    // FUNCION PARA EJERCICIO NRO 62
    public static boolean Fecha_valida (int dd, int mm, int yy)
    {
        if ((Diacoorecto(dd,mm,yy)) && (mes_valido(dd,mm,yy)) && (año_valido(dd,mm,yy)))
        {
            return true ;
            
        }
        else
        {
            return false ;
        
        }    
 
    
    }
    // FUNCION PARA EJERCICIO NRO 63
    public static int Cantidad_dias(int diia, int mess, int annio)
    {
        int calculo = diia -1 ;
        
        if (Fecha_valida(diia, mess, annio)) 
        {
            return calculo ;
            
        }
        else
        {
            return 0;
        
        }    
        
        
    }
    // FUNCION PARA EJERCICIO NRO 64
    public static int Cantidad_dias_fin_mes (int ddd, int mmm, int aaa)
    {
        int calculo = 0;
        
        if (Fecha_valida(ddd,mmm,aaa)) 
        {
            calculo =  dimesañ(mmm, aaa) - ddd ;
            
              return calculo ;
            
        }
        else
        {
            return 0;
        
        }
        
        
        
      
        
        
        
        
        
        
    
    }
    // FUNCION PARA EJERCICIO NRO 65
    public static int Cantidad_dias_año (int annitos, int diass, int mesess)
    {
        if (Fecha_valida(diass,mesess,annitos)) 
        {
            
        if (EsAnioBisiesto(annitos))
            
        {
            return (366) ;
            
        }
             
          else
        {
            return (365) ;
        
        }
             
        }
        else
        {
            return 0;
        
        }   
       
       
        
        
    
    }
    // FUNCION PARA EJERCICIO NRO 66
    public static int cont_dias_fin_año (int daay, int moonth, int yeear)
    {
        int n1 = 0;
        
        n1 = Cantidad_dias_fin_mes(daay, moonth, yeear);
        int acumulador = 0;
        
        if (Fecha_valida(daay,moonth,yeear)) 
        {
             for (int i = moonth + 1; i <= 12; i++) 
        {
            
            acumulador = acumulador + dimesañ(i,yeear);  
            
        }
        return (acumulador + n1);
            
        }
        else
        {
            return 0;
        
        }   
       
    
    }
    // FUNCION PARA EJERCICIO NRO 67
    public static int cantidad_dias_principio_año_a_esa_fecha(int didi, int meme, int yeye)
    {
         if (Fecha_valida(didi,meme,yeye)) 
        {
             int  acumulacion = 0;
        
        for (int i = 1 ; i <= meme-1  ; i++) 
        {
            acumulacion = acumulacion + dimesañ(i, yeye);
            
        }
        return acumulacion + Cantidad_dias(didi,meme,yeye) ;
            
        }
        else
        {
            return 0;
        
        }   
        
        
        
    
    }
    // FUNCION PARA EJERCICIO NRO 68
    
    public static int cantidad_dias_entre_dos_fechas(int dia, int mes, int year, int dia1, int mes1, int anio1)
    {
        int acumulador_final = 0;        
        int p1 = Cantidad_dias(dia1,mes1,anio1) + 1 ; // 63
        int p2 = Cantidad_dias_fin_mes(dia,mes,year); //64
        int z1 = cont_dias_fin_año(dia,mes,year);
        int z2 = cantidad_dias_principio_año_a_esa_fecha(dia1,mes1,anio1);
        int acumulador_final_2 = 0;
        int p3 = Cantidad_dias_año(dia1,mes1,anio1); // 65
        
        
         if ((Fecha_valida(dia,mes,year)) && (Fecha_valida(dia1,mes1,anio1)))
         {
             if (year == anio1) 
            {
                for (int i = mes + 1 ; i <= mes1 - 1; i++) 
                {
                    acumulador_final = acumulador_final + dimesañ(i,year);  
                }
                
                return acumulador_final + p2 + p1 ;
            }
            
            
             if (anio1 > year) 
            {
                for (int i = year +1; i <= anio1 - 1; i++) 
                {
                    acumulador_final_2 = acumulador_final_2 + p3;
                    
                }
                
                return acumulador_final_2 + z1 +z2 +1;
                
                
            }
             
             
            
            }
            
            return 0;
         
          }
    
    
    
    
  
    // PORCEDIMIENTO FRACCCIONES
    public static void SumaFracciones(double nume_1, double nume_2, double deno_1, double deno_2 )
    {
        
        if (deno_1 == deno_2) 
        {
            double suma = 0;
            suma = nume_1 + nume_2;
            
            System.out.println(suma);
            System.out.println("-");
            System.out.println(deno_1);
            
            
        }
        if (deno_1 != deno_2) 
        {
            double denominador_0 = 0;
            denominador_0 = deno_1 * deno_2;
            
            double denominador_1 = 0;
            denominador_1 = denominador_0 / deno_1;
            
            double denominador_2 = 0;
            
            denominador_2 = denominador_0 / deno_2;
            
            double numerador_1 = 0;
            numerador_1 = nume_1 * denominador_1;
            
            double numerador_2 = 0;
            numerador_2 = nume_2 * denominador_2;
            
            double suma_final = 0;
            suma_final = numerador_1 + numerador_2;
            
            System.out.println(suma_final);
            System.out.println("---");
            System.out.println(denominador_0);
            
            
            
            
        }
        
    
    }
    // FUNCION DE EJERCICIO NRO 1 PARCIAL
            
            public static int contador_total_vocal(String cadenaa1, String cadenaa2, String cadenaa3, String cadenaa4)
            {
                
                
                int cadee1 = 0;
                int cadee2 = 0;
                int cadee3 = 0;
                int cadee4 = 0;
                int acumi =  0;
                
                        
                
               cadee1 = vocales(cadenaa1);
               cadee2 = vocales(cadenaa2);
               cadee3 = vocales(cadenaa3);
               cadee4 = vocales(cadenaa4);
               
               acumi = acumi + cadee1 + cadee2 + cadee3 + cadee4 ;
               
               return (acumi);
                
               
             }
            
    // PROCEDIMIENTO DE EJERCICIO NRO 2 ( PARCIAL )       
    public static void Calculo_fecha(int diaa1, int mess1, int anioo1, int diaa2, int mess2, int anioo2)
    {
        if ((diaa1 > diaa2) && (mess1 > mess2) && (anioo1 > anioo2))
        {
            System.out.println("La fecha uno es mayor");
            
        }
        
        if ((diaa1 > diaa2) && ( mess1 < mess2) && (anioo1 > anioo2))
        {
            System.out.println("La fecha uno es mayor");
            
        }
        
        if ((diaa1 > diaa2) && ( mess1 > mess2) && (anioo1 < anioo2))
        {
            System.out.println("la fecha dos es mayor");
            
        }
        
        if ((diaa2 > diaa1) && (mess2 > mess1) && (anioo2 > anioo1))
        {
            System.out.println("La fecha dos es mayor");
            
        }
        
        if ((diaa2 == diaa1) && (mess2 == mess1) && (anioo1 > anioo2)) 
        {
            System.out.println("La fecha uno es mayor");
            
        }
        if ((diaa2 == diaa1) && (mess2 < mess1) && (anioo1 == anioo2))
        {
            System.out.println("La fecha uno es mayor");
            
        }
        
        if ((diaa2 == diaa1) && (mess2 > mess1) && (anioo1 == anioo2))  
        {
            System.out.println("La fecha dos es mayor ");
            
        }
        
        if ((diaa2 == diaa1) && (mess2 == mess1) && (anioo1 < anioo2)) 
        {
            System.out.println("La fecha dos es mayor ");
            
        }
        
        if ((diaa2 == diaa1) && (mess2 == mess1) && (anioo1 > anioo2))
        {
            System.out.println("La fecha uno es mayor ");
            
        }
        
        
        else
        {
            if ((diaa2 == diaa1) && (mess2 == mess1) && (anioo1 == anioo2)) 
            {
                System.out.println("son iguales ");
                
            }
            
        
        }   
        
        
       }
    
    // Procedimiento ejercicio nro 3 ( parcial )
    
    public static void agregado_dias_fecha (int diaaa, int messs, int aniooo , int N)
    {
        int diaaux = 0;
        int mesaux = 0;
        int anioaux = 0;
        
        
        
        for (int i = 1; i <= N; i++) 
        {
           diaaa = diaaa + 1 ;
            
            if (Fecha_valida(diaaa,messs,aniooo) == false) 
            {
                diaaa = 1 ;
                messs = messs + 1 ;
                
                if (Fecha_valida(diaaa,messs,aniooo) == false)
                {
                    diaaa = 1 ;
                    messs = 1;
                    aniooo = aniooo + 1 ;
                    
                    if (Fecha_valida(diaaa,messs,aniooo) == false)
                    {
                        
                       
                        
                    }
                    else
                    {
                        System.out.println(diaaa + "/"+messs +"/"+ aniooo);
                    
                    }   
                
                }
                else
                {
                    System.out.println(diaaa + "/"+messs +"/"+ aniooo);
                    
                
                }  
               
                
            }
            else
            {
                System.out.println(diaaa + "/"+messs +"/"+ aniooo);
                
            
            }   
            
           
            
        }
        
         
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        // EJERCICIO NRO 46
        
        /*
        int asterisco = 0;
        
        System.out.println("Los 10 asteriscos por pantalla");
        
        asteriscos_10(asterisco);
        
         System.out.println("------------------------------------------------");
       
        */
        
        
        // EJERCICIO NRO 47
        
        /*
        
        int asteriscos_numerales = 0;
        
        System.out.println("Ingrese la cantidad de asteriscos que usted quiera");
        asteriscos_numerales = teclado.nextInt();
        
        System.out.println("Esta es la cantidad de asteriscos que ingreso");
        
        asteriscos_n(asteriscos_numerales);
        
        */
        
        // EJERCICIO NRO 48
        
        /*
        
        double A = 0;
        double B = 0;
        
        System.out.println("Ingrese un valor para A");
        A = teclado.nextDouble();
        
        System.out.println("Ingrese un valor para B");
        B = teclado.nextDouble();
        
        double resultado = 0;
        resultado = suma(A,B);
        
        System.out.println("La suma de A + B es igual a = " + resultado);
        
         System.out.println("------------------------------------------------");
        
         */
        // EJERCICIO NRO 49
        
        /*
        
        double C = 0;
      
        System.out.println("Ingrese un numero mayor a cero para calcular su cuadrado");
        C = teclado.nextDouble();
        
        double resultado_cuadrado = 0;
        resultado_cuadrado = cuadrado(C);
        
        System.out.println("El cuadrado del numero ingresado es igual a = " + resultado_cuadrado);
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 50
        
        /*
        
        double numero = 0;
        double porcentaje = 0;
        System.out.println("Ingrese un numero para calcular su porcentaje");
        numero = teclado.nextDouble();
        
        System.out.println("Ingrese el porcentaje para el numero anteriormente");
        porcentaje = teclado.nextDouble();
        
        double resultado_porcentaje = 0;
        resultado_porcentaje = porcentale_total(numero, porcentaje);
        
        System.out.println("El procentaje del numero que usted ingreso es = " + resultado_porcentaje);
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 51
        
        /*
        
        System.out.println("El menor valor es = " + menor_valor(50,100));
        
        System.out.println("------------------------------------------------");
        
        // EJERCICIO NRO 52
        
        System.out.println("Este numero es par " + Es_par(10));
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 53
        
        /*
        
        
        
        
        String cadena = " ";
        
        System.out.println("Ingrese una cadena ");
        cadena = teclado2.nextLine();
        
        int res = 0;
        res = contadorA(cadena);
        
        System.out.println("La cantidad de letras A que se contaron es igual a = " + res);
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 54
        
        /*
        
        String cadenagloriosa = "";
        
        
        System.out.println("Ingrese una cadena");
        
        cadenagloriosa = teclado2.nextLine();
        
         
        
        int contador_sinigual = 0;
        
        contador_sinigual = vocales(cadenagloriosa);
        
        System.out.println("La cantidad de vocales que tiene la cadena es en total de =  " + contador_sinigual);
        
        System.out.println("------------------------------------------------");
        
        */
        
        
        // EJERCICIO NRO 55
        
        /*
        
        System.out.println("La cantidad de caracteres encontrados en la cadena es igua a = " + contador_letra_cadena("San lorenzo de almagro", 'o') );
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 56
        
        /*
        
        String cacadena = "";
        
        System.out.println("Señor/a ingrese una cadena");
        cacadena = teclado2.nextLine();
        
        System.out.println("La cantidad de puntos en total es = " +acumulador_puntos(cacadena) );
        
        System.out.println("------------------------------------------------");
        
        */
        
        
        // EJERCICIO NRO 57
        
        /*
        
        if (EsAnioBisiesto(2016)) 
        {
            System.out.println("Es año bisiesto");
            
        }
        else
        {
            System.out.println("No es año bisiesto");
        
        }
        
         System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 58
        
        /*
        
        int messi = 0;
        int añoño = 0;
        
        System.out.println("Ingrese el mes");
        messi = teclado.nextInt();
        
        System.out.println("Ingrese el año");
        añoño = teclado.nextInt();
        
        System.out.println("La cantidad de dias  que tiene el mes es = " + dimesañ(messi,añoño));
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 59
        
        /*
        
        int dayday = 0;
        int monthi = 0;
        int yearyear = 0;
        
        System.out.println("Ingrese dia");
        dayday = teclado.nextInt();
        
        System.out.println("Ingrese el mes");
        monthi = teclado.nextInt();
        
        System.out.println("Ingrese el año");
        yearyear = teclado.nextInt();
        
        System.out.println("El dia de la fecha ingresada es = " + Diacoorecto(dayday,monthi,yearyear));
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 60
        
        /*
        
        int payday = 0;
        int paymonth = 0;
        int payyear = 0;
        
        System.out.println("Ingrese el dia");
        payday = teclado.nextInt();
        
        System.out.println("Ingrese el mes");
        paymonth = teclado.nextInt();
        
        System.out.println("Ingrese el año");
        payyear = teclado.nextInt();
        
        
        System.out.println("El mes de la fecha ingresada es = "+ mes_valido(payday, paymonth, payyear));
        
        System.out.println("------------------------------------------------");
        
        */
        
        
        // EJERCICIO NRO 61
        
        /*
        
        System.out.println("El año de la fecha ingresado es = " +año_valido(2, 1,2012) );
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 62
        
        /*
        
        System.out.println("La fecha ingresada es = " + Fecha_valida(99,99,0) );
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 63
        
        if (Fecha_valida(15,10,2018) == true)
        {
            
          System.out.println("La cantidad de dias que transcurrieron desde el principio de ese mes hasta la fecha ingresada son = " + Cantidad_dias(15,10,2018) );
            
        }
        else
        {
            System.out.println("Esta ingresando una fecha inexistente , por favor vuelva a intentar");
        
        }   
        
       System.out.println("------------------------------------------------");
        
        
        
        // EJERCICIO NRO 64
        
        /*
        
        if (Fecha_valida(5,5,2018) == true) 
        {
            System.out.println("La cantidad de dias que faltan para llegar a fin de mes " + Cantidad_dias_fin_mes(5, 5, 2018) );
            
        }
        else
        {
            System.out.println("Ingrese una fecha valida por favor");
        
        }   
        
        
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 65
        
        /*
        
        if (Fecha_valida(9,2,2016) == true) 
        {
            System.out.println("La cantidad de dias que tiene dicho año es igual a = " + Cantidad_dias_año(9,2,2016) );
            
        }
        else
        {
            System.out.println("Fecha incorrecta , intente de nuevo");
        
        }   
        
        
        
       System.out.println("------------------------------------------------");
        
        */
        
        
        
        // EJERCICIO NRO 66
        
        /*
        
        if (Fecha_valida(9,2,2018) == true) 
        {
            System.out.println("La cantidad de dias que faltan para llegar a fin de año es igual a = " + cont_dias_fin_año(9,2,2018));
            
            
        }
        else
        {
            System.out.println("Fecha invalida , vuelva a intentarlo");
        
        }   
        
        
        
        System.out.println("------------------------------------------------");
        
        */
        
        // EJERCICIO NRO 67
        
        /*
        
        if (Fecha_valida(9,2,18) == true) 
        {
            System.out.println("La cantidad de dias que hay desde principio de año hasta la fecha ingresada es igual a =  " + cantidad_dias_principio_año_a_esa_fecha(9,2,2018));
            
        }
        
        
        */
        
        // EJERCICIO NRO 68
        
        
        
        System.out.println("La cantidad de dias que hay entre la fecha 1 y la fecha 2 es igual a = " + cantidad_dias_entre_dos_fechas( 30,6,2018,9,2,2019));
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
         
       
        
        
        
        
        
        
        
       
        
        
        
       
        
        
        
        
        
        
        
       
        
        
        
        // EJERCICIO DE FRACCION
        
        /*
        
        double num1 = 0;
        double num2 = 0;
        double deno1 = 0;
        double deno2 = 0;
        
        System.out.println(" INGRESE NUMERADOR 1");
        num1 = teclado.nextDouble();
        
        System.out.println("INGRESE DENOMINADOR 1 ");
        deno1 = teclado.nextDouble();
        
        System.out.println(" INGRESE NUMERADOS 2");
        num2 = teclado.nextDouble();
        
        System.out.println("INGRESE DENOMINADOR 2 ");
        deno2 = teclado.nextDouble();
       
        
       System.out.println("LA SUMA DE AMBAS FRACCIONES ES IGUAL A = ") ;
       SumaFracciones(num1,num2,deno1,deno2);
        
       */
        
        // EJERCICIO NRO 1 (PARCIAL)
        
        /*
        
       
        System.out.println(" La cantidad de vocales totales de las 4 cadenas es igual a =  " + contador_total_vocal(("San lorenzo de almagro"),("boca"),("racing"),("independiente")));
        
        */
                      
        
        // Ejercicio Nro 2 (parcial)
        
        /*
        
        
        
        System.out.println("en resultado la cantidad de dias ");
        
        Calculo_fecha(9,3,2020,9,3,2020);

        */

        
        // Ejercicio Nro 3 (parcial)
        
        /*
        
        System.out.println("la fecha a la que se llegaria seria ");
        
        agregado_dias_fecha(9,2 ,2018 ,30);

        */
        
        
        
        
        
       
        
        
        
        

        

        
        
        
        
        
       
  
        
                
        }
    
}
