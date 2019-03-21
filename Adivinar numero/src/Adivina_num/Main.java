/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adivina_num;

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
        
        //System.out.println(Math.random()*100);// Num decimal entre 0 y 100
        
        int aleatorio= (int)(Math.random()*100);
        
        Scanner entrada= new Scanner(System.in);
        
        int num= 0;
        int intentos= 0;
        
        do
        {
            intentos ++;
            System.out.println("Introduzca un número ");
            
            num= entrada.nextInt();
            
            if(aleatorio< num)
            {
                System.out.println("Más bajo");
            }
            else if(aleatorio> num)
            {
                System.out.println("Más alto");
            }
        }while(num!= aleatorio);
        
        System.out.println("Ganaste!!! Adivinaste el numero en " + intentos + " intentos!");
    }
    
}
