/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class Ventana_Emergente extends JFrame{
    
    private static int _contador;
    
    public Ventana_Emergente(JButton botonDeFrame1)
    {
        _contador ++;
        setTitle("Ventana " + _contador);
        
        setBounds(40* _contador, 40* _contador, 500, 300);
        
        CierraTodo oyenteCerrar= new CierraTodo();
        botonDeFrame1.addActionListener(oyenteCerrar);
    }
    
    private class CierraTodo implements ActionListener
    {    
        
        @Override
        public void actionPerformed(ActionEvent e) {
                
            dispose();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
