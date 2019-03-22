/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event6;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FocoVentana extends JFrame implements WindowFocusListener{
    
    FocoVentana frame1;
    FocoVentana frame2;
    
    
    public void Iniciar()
    {
        frame1= new FocoVentana();
        frame2= new FocoVentana();
        
        frame1.setVisible(true);
        frame2.setVisible(true);
        
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
        }
        else
        {
            frame2.setTitle("");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
