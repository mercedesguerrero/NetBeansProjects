/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Frame miFrame1= new Frame();
        
        miFrame1.setVisible(true);
        
        miFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit on close es una contante de clase, termina el programa cuando se cierra la ventana
        
        
        FrameCentrado miFrame2= new FrameCentrado();
        
        miFrame2.setVisible(true);
        miFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
