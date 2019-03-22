/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event8;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class Frame1 extends JFrame{
    
    public Frame1()
    {
        setTitle("Multiples oyentes");
        setBounds(820, 50, 500, 300);
        
        MultipleListeners layer= new MultipleListeners();
        add(layer);
        
    }
    
    
}

