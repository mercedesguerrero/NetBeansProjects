/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf2;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class WriteFrame extends JFrame{
    
    public WriteFrame()
    {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Mi titulo");
        
        Capa miCapa= new Capa();
        add(miCapa);
    }
    
    
    
    
    
}
