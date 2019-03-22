/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event10;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class FrameCalculadora extends JFrame{
    
    public FrameCalculadora()
    {
        setTitle("Calculadora");
        setBounds(300, 100, 800, 500);
        
        LayerCalculadora miLayer= new LayerCalculadora();
        add(miLayer);
        
        //pack(); // el contenedor se tiene que adaptar al tamaño por defecto de lo que contiene
    }
    
}
