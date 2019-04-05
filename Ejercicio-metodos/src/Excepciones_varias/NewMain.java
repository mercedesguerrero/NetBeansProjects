/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones_varias;

import javax.swing.JOptionPane;

/**
 *
 * @author Mechu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            division();
            
        }catch(ArithmeticException e){
            
            System.out.println("No se puede dividir por 0");
            
        }catch(NumberFormatException e)
        {
            System.out.println("Debes introducir un numero entero");
            System.out.println(e.getMessage());
            System.out.println("Se ha generado un error de tipo: " + e.getClass().getName());
        }
        
    }
    
    static void division()
    {
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Introducir el dividendo"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Introducir el divisor"));
        
        System.out.println("El resultado es: " + num1/num2);
    }
    
}
