/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event4;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameMouse extends JFrame{
    
    public FrameMouse()
    {
        setVisible(true);
        setBounds(300, 100, 500, 350);
        
        EventMouse clic= new EventMouse();
        addMouseListener(clic);
        
    }
    
}
