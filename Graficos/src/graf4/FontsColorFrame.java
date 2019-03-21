/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf4;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FontsColorFrame extends JFrame{
    
    public FontsColorFrame()
    {
        setVisible(true);
        setTitle("Fuentes");
        setSize(800, 600);
        setLocation(200, 100);
        
        Fuentes miFrameTexto= new Fuentes();
        add(miFrameTexto);
        
        //miCapa.setBackground(Color.CYAN);
        miFrameTexto.setBackground(Color.GRAY.brighter());
        
        //miFrameTexto.setForeground(Color.GRAY.brighter()); ESTABLECE EL COLOR POR DEFECTO EN TODO LO QUE ESCRIBAMOS Y DIBUJEMOS
    }
    
}
