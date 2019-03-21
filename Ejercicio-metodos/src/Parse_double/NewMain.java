/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parse_double;

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
        
        String num1= JOptionPane.showInputDialog("Introducir un número: ");
        double num2= Double.parseDouble(num1);
        
        System.out.println("La raíz de " + num2 + " es");
        System.out.printf("%1.2f", Math.sqrt(num2));
        System.out.println("\n");
    }
    
}
