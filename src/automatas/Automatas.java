/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author VRPatrick
 */
public class Automatas {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
        
        Scanner nc= new Scanner(System.in);
        String name="";
        System.out.println("Ingrese su nombre completo: ");
        name = nc.nextLine();
        
        System.out.println(name);
       
        System.out.println("Validad los datos de su nombre(si inicia con mayuscula y luego continua con minuscula): "
                +name+";  "+name.matches("([A-Z][a-z]+\\s{1})*[A-Z][a-z]+\\s{1}[A-Z][a-z]+\\s{1}[A-Z][a-z]+"));
        

    
}
}