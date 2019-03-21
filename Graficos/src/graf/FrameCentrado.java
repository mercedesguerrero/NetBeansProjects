/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameCentrado extends JFrame{
    
    public FrameCentrado() 
    {
        Toolkit miMonitor= Toolkit.getDefaultToolkit();
        
        Dimension tamanioMonitor= miMonitor.getScreenSize();
        
        int alturaMonitor= tamanioMonitor.height;
        int anchoMonitor= tamanioMonitor.width;
        
        setSize(anchoMonitor/2, alturaMonitor/2);
        setLocation(anchoMonitor/4, alturaMonitor/4);
        
        setTitle("Marco centrado");
        
        Image miIcono= miMonitor.getImage("src/graf/heart2.jpg");
        setIconImage(miIcono);
        
    }
    
}
