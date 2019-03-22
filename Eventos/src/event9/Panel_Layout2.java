/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event9;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class Panel_Layout2 extends JPanel{
    
    public Panel_Layout2()
    {
        setLayout(new BorderLayout());
        add(new Button("Azul"), BorderLayout.WEST);
        add(new Button("Verde"), BorderLayout.EAST);
        add(new Button("Blanco"), BorderLayout.CENTER);
    }
    
}
