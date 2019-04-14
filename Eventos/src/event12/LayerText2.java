/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event12;

import java.awt.Dimension;
import java.awt.Font;
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
        //setLayout(null);
        
        miArea= new JTextArea(8, 20);
        //JScrollPane layerBarras= new JScrollPane(miArea);
        miArea.setLineWrap(true);//No tiene saltos de linea
        miArea.setColumns(1);
        miArea.setRows(1);
        miArea.setFont(new Font("Aharoni", Font.BOLD, 76));
        miArea.setTabSize(1);
        miArea.setPreferredSize(new Dimension (50,60));
        miArea.setRequestFocusEnabled(true);
        //miArea.setEditable(false);//no te deja escribir
       
        //miArea.setMaximumSize(getMaximumSize());
        
        
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
