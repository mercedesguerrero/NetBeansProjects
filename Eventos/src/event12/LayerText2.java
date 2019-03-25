/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mechu
 */
public class LayerText2 extends JPanel{
    
    private JTextArea miArea;
    
    public LayerText2()
    {
        miArea= new JTextArea(8, 20);
        //JScrollPane layerBarras= new JScrollPane(miArea);
        
        miArea.setLineWrap(true);//No tiene saltos de linea
        
        add(miArea);
        //add(layerBarras);// BARRA DE DESPLAZAMIENTO
        
        JButton miBoton= new JButton("OK");
        
        miBoton.addActionListener(new GestionaArea());
        
        add(miBoton);
    }
    
    private class GestionaArea implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println(miArea.getText());
        }
    }
    
}
