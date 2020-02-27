/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.regex.Pattern;
/**
 *
 * @author VRPatrick
 */
public class Automatas {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
       String name1,name2;
       Scanner nc= new Scanner(System.in);
       System.out.println("-----Esta ingresando el Primer nombre completo----- ");
       //Llamada al metodo recibirNombre para el ingreso del primer nombre 
       name1 = recibirNombre();
       System.out.println("-----Esta ingresando el Segundo nombre completo----- ");
       //Llamada al metodo recibirNombre para el ingreso del segundo nombre 
       name2 = recibirNombre();
       verificarParentesco(name1,name2);
    
   }
   //Metodo para ingresar los nombres solicitados
    public static String recibirNombre()
    {
        String ExpRegular="([A-Z][a-z]+\\s{1})?[A-Z][a-z]+\\s{1}[A-Z][a-z]+\\s{1}[A-Z][a-z]+";
        String name;
        Scanner nc= new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        name = nc.nextLine();
       
        //Varificación que la cadena se ingreso correctamente
        if(name.matches(ExpRegular))
        {
            System.out.println("El nombre es correcto: ");
        }
        else
        {
            System.out.println("El nombre ingresado no es correcto: ");
            name=recibirNombre();
        }
        return name;
    }
    
    //Metodo de verificación de parentesco entre los dos nombres ingresados
    public static void verificarParentesco(String n1, String n2){
        
        //expreción para eliminar los espacios en blanco
        String ElimEsp ="\\s";
        Pattern pattern1 = Pattern.compile(ElimEsp, Pattern.CASE_INSENSITIVE);
        boolean tocayo=false,pariente=false;
        String[] Cadenas = pattern1.split(n1);
        
        //conteo de la cantidad de cadenas guardadas
        int totalC = Cadenas.length;
        
        //Verificar si los nombres y apellidos coinciden en la segunda cadena
        switch (totalC){
            case 3:
                if (Pattern.matches(".*"+Cadenas[0]+".*", n2))
                {
                    tocayo=true;
                    
                }
                if (Pattern.matches(".*"+Cadenas[1]+".*", n2)||Pattern.matches(".*"+Cadenas[2]+".*", n2))
                {
                    pariente=true;
                }
            break;
            case 4:
                if (Pattern.matches(".*"+Cadenas[0]+".*", n2)||Pattern.matches(".*"+Cadenas[1]+".*", n2))
                {
                    tocayo=true;
                    
                }
                if (Pattern.matches(".*"+Cadenas[2]+".*", n2)||Pattern.matches(".*"+Cadenas[3]+".*", n2))
                {
                    pariente=true;
                }
               
            break;
            default:
            break;
        }
        
        //muestra los resultados finales si son parientes o tocayos
        if(pariente && tocayo)
        {
            System.out.println("son parientes tocayos");
        }
        else
        {
            if(pariente)
            {
                System.out.println("Es pariente");
            }
            if(tocayo)
            {
                System.out.println("Es tocayo");
            }
        }
        
        
    }




}