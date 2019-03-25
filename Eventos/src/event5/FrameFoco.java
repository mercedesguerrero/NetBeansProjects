/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mechu
 */
public class FrameFoco extends JFrame{
    
    public FrameFoco()
    {
        setVisible(true);
        setBounds(300, 100, 500, 350);
        
        TextFieldss campos= new TextFieldss();
        
        add(campos);
    }
    
}
