/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event3;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameKeyboard extends JFrame{
    
    public FrameKeyboard()
    {
        setVisible(true);
        setBounds(300, 100, 500, 350);
        
        EventKeyboard tecla= new EventKeyboard();
        addKeyListener(tecla);//LA PONGO A ESCUCHAR
    }
    
}
