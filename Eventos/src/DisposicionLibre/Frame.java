/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionLibre;

import javax.swing.JFrame;

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
        add(miLayer);
        
        setVisible(true);
        
        
    }
    
}
