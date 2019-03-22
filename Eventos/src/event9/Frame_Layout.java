/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event9;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class Frame_Layout extends JFrame{
    
    public Frame_Layout()
    {
        setTitle("Mercedes");
        setBounds(820, 50, 500, 300);
        
        Panel_Layout layer= new Panel_Layout();
        
        //FlowLayout disposicion= new FlowLayout(FlowLayout.RIGHT);
        //layer.setLayout(new FlowLayout(FlowLayout.RIGHT));// ALINEACIÓN DERECHA
        
        add(layer, BorderLayout.NORTH);
        
        Panel_Layout2 layer2= new Panel_Layout2();
        add(layer2, BorderLayout.SOUTH);
        
    }
}
