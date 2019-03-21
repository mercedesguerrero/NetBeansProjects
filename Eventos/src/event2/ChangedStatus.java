/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 *
 * @author Mechu
 */
public class ChangedStatus implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent we) {
        
        System.out.println("La ventana cambio de estado");
        
        //System.out.println(we.getNewState());
        
        if(we.getNewState()== Frame.MAXIMIZED_BOTH)
        {
            System.out.println("La ventana está maximizada");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
