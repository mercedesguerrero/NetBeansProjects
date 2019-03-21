/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerado;

import Enumerado.Uso_Talles.Talle;
import java.util.Scanner;

/**
 *
 * @author Mechu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Introduce tu talle: SMALL | MEDIUM |LARGE | EXTRA_LARGE ");
        String entrada_talle= entrada.next().toUpperCase();
   
        Talle el_talle= Enum.valueOf(Talle.class, entrada_talle);//devuelve el nombre de la constante enumerada
        
        System.out.println("Tu talle es: " + el_talle + " | Abreviatura: " + el_talle.getAbreviatura());
        
    }
    
    
}
