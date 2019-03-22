/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event7;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameAction extends JFrame{
    
    public FrameAction()
    {
        setTitle("Eventos multiples");
        setBounds(120, 50, 900, 500);
        
        EventosMultiples layer= new EventosMultiples();
        add(layer);
        
    }
    
}
