/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf3;

import java.awt.SystemColor;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class DrawFrame extends JFrame{
    
    public DrawFrame()
    {
        setVisible(true);
        setTitle("Dibujo");
        setSize(800, 600);
        setLocation(200, 100);
        
        CapaConFiguras miCapa= new CapaConFiguras();
        add(miCapa);
        
        //miCapa.setBackground(Color.CYAN);
        miCapa.setBackground(SystemColor.window);
    }
    
}
