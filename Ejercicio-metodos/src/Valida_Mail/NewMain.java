/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valida_Mail;

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
        
        int arroba= 0;
        boolean punto= false;
        
        String mail= JOptionPane.showInputDialog("Introduzca su mail ");
        
        for(int i=0; i< mail.length(); i++)
        {
            if(mail.charAt(i)== '@')
            {
                arroba ++;
            }
            if(mail.charAt(i)== '.')
            {
                punto= true;
            }
        }
        
        if(arroba== 1 && punto== true)
        {
            System.out.println("Es un mail");
        }
        else
        {
            System.out.println("No es un mail válido");
        }
    }
    
}
