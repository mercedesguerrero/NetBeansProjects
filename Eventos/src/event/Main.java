/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

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
        
        FrameButtons miFrame= new FrameButtons();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FrameButtons miFrame2= new FrameButtons();
        miFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        miFrame.setTitle("Ventana 1");
        miFrame.setBounds(200, 100, 500, 350);//POSITION - SIZE
        
        miFrame2.setTitle("Ventana 2");
        miFrame2.setBounds(800, 100, 500, 350);
        
    }
    
}
