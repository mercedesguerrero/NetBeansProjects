/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

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
        
        String [] matriz2= new String[4];
        
        for (int i=0; i< matriz2.length; i++) 
        {
            matriz2[i]= JOptionPane.showInputDialog("Introduce un pais ");
        }
        
        
        for (String elemento : matriz2) 
        {
            System.out.println("Pais: " + elemento);
        }
    }
    
}
