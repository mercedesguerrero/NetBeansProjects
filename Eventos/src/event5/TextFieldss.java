/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event5;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mechu
 */
public class TextFieldss extends JPanel{
    
    JTextField cuadro1;
    JTextField cuadro2;
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        setLayout(null);
        
        cuadro1= new JTextField();
        cuadro2= new JTextField();
        
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        
        add(cuadro1);
        add(cuadro2);
            
        EventFoco elfoco= new EventFoco();
        cuadro1.addFocusListener(elfoco);
  
    }
    
    private class EventFoco implements FocusListener{//CLASE INTERNA

    @Override
    public void focusGained(FocusEvent fe) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent fe) {
        
        //System.out.println("Perdió el foco");
        
        String mail= cuadro1.getText();
        
        int arroba= 0;
        boolean punto= false;
        
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
