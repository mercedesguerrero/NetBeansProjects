/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameButtons extends JFrame{
    
    public FrameButtons()
    {
        setVisible(true);
        //setTitle("Botones y eventos");
        //setBounds(200, 100, 800, 600);//POSITION - SIZE
        
        //LayerButtons oiga_frame= new LayerButtons();
        //addWindowListener(oiga_frame);
        
        addWindowListener(new LayerButtons());
       
        //miFrameButton.setBackground(Color.GRAY.brighter());
       
    }
    
}
