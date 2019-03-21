/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equals;

import java.util.Scanner;

/**
 *
 * @author Mechu
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String alumno1, alumno2;
        String genero= "";
        Scanner entrada= new Scanner(System.in);
        
        alumno1= "David";
        alumno2= "david";
        
        System.out.println(alumno1.equals(alumno2));
        
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
        do
        {
            System.out.println("Introduzca su género ");
            genero= entrada.nextLine();
            
        }while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);
        
        if(genero.equalsIgnoreCase("H"))
        {
            System.out.println("Hola man");
        }
        else if(genero.equalsIgnoreCase("M"))
        {
            System.out.println("Hola mujer");
        }
        
        
        
        
        
        
        
    }
    
}
