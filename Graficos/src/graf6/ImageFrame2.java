/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf6;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class ImageFrame2 extends JFrame{
    
    public ImageFrame2()
    {
        setVisible(true);
        setTitle("Mis imágenes");
        setSize(800, 600);
        setLocation(200, 100);
        
        Imagen2 miFrameImagen= new Imagen2();
        add(miFrameImagen);
        
        //miCapa.setBackground(Color.CYAN);
        miFrameImagen.setBackground(Color.GRAY.brighter().brighter());
        
        //miFrameTexto.setForeground(Color.GRAY.brighter()); ESTABLECE EL COLOR POR DEFECTO EN TODO LO QUE ESCRIBAMOS Y DIBUJEMOS
    }
    
}
