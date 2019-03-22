/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event11;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameText extends JFrame{
    
    public FrameText()
    {
        setBounds(200, 100, 800, 400);
        LayerText miLayer= new LayerText();

        add(miLayer);
        
        setVisible(true);
    }
    
}
