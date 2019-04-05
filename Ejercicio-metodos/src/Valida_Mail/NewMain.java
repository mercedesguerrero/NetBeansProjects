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
        
        String mail= JOptionPane.showInputDialog("Introduzca su mail ");
        
        try
        {
            evalua_mail(mail);
        }catch(Exception e)
        {
            System.out.println("La direccion no es correcta");
            e.printStackTrace();//imprime el error
        }
        
    }
    
    static void evalua_mail(String mail) throws Minima_longitud_mail
    {
        int arroba= 0;
        boolean punto= false;

        if(mail.length()<=3)
        {
            //ArrayIndexOutOfBoundsException mi_excepcion= new ArrayIndexOutOfBoundsException();
            throw new Minima_longitud_mail("El mail es muy corto");
        }

        else
        {
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
}

