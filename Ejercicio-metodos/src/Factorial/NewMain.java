/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

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
        
        Long resultado= 1L;
        
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                
        for(int i= numero; i>0; i--)
        {
            resultado= resultado*i;
        }
        
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
    
}
