/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event2;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameStatus extends JFrame{
    
    public FrameStatus()
    {
        setVisible(true);
        setBounds(300, 100, 500, 350);
        
        ChangedStatus new_status= new ChangedStatus();
        
        addWindowStateListener(new_status);
        
    }
    

}
