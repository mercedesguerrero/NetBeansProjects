/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionLibre;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mechu
 */
public class Frame extends JFrame{
    
    public Frame()
    {
        setSize(1200, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Disposicion libre");
        
        Layer_Libre miLayer= new Layer_Libre();
        
        //setContentPane(new JLabel(new ImageIcon("space.jpg")));
        
        add(miLayer);
        
        setVisible(true);
        
        
    }
    
}
