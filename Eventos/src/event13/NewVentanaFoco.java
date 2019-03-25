/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event13;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mechu
 */
public class NewVentanaFoco extends JFrame implements WindowFocusListener{
    
    NewVentanaFoco frame1;
    NewVentanaFoco frame2;
    
    
    public void Iniciar()
    {
        frame1= new NewVentanaFoco();
        frame2= new NewVentanaFoco();
        
        frame1.setVisible(true);
        frame2.setVisible(true);
        
        frame1.setContentPane(new JLabel(new ImageIcon("nyan_cat.gif")));
        frame2.setContentPane(new JLabel(new ImageIcon("nyan_cat.gif")));
        
        frame1.setBounds(100, 100, 600, 350);
        frame2.setBounds(750, 100, 600, 350);
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame1.addWindowFocusListener(this);
        frame2.addWindowFocusListener(this);
        
    }   
        
    @Override
    public void windowGainedFocus(WindowEvent we) {
        
        if(we.getSource()== frame1)
        {
            frame1.setTitle("Tengo el foco!");
        }
        else
        {
            frame2.setTitle("Tengo el foco!!");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
        
        if(we.getSource()== frame1)
        {
            frame1.setTitle("");
            frame1.setEnabled(false);//PARA QUE QUEDE DESHABILITADA!!!!
        }
        else
        {
            frame2.setTitle("");
            frame2.setEnabled(false);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
