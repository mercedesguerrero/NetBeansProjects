/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event12;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameForText extends JFrame{
    
    public FrameForText()
    {
        setBounds(200, 100, 800, 400);
        LayerText2 miLayer= new LayerText2();

        add(miLayer);
        
        setVisible(true);
    }
    
}
