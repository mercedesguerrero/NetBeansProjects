/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class Panel_Layout extends JPanel{
    
    public Panel_Layout()
    {
        //setLayout(new FlowLayout(FlowLayout.RIGHT, 80, 100));// MAYOR SEPARACION ENTRE LOS BOTONES VALOR 1: ENTRE BOTONES VALOR 2: DISTANCIA CON EL BORDE SUPERIOR
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new Button("Amarillo"));
        add(new Button("Rojo"));
        
        /**
        add(new Button("Amarillo"), BorderLayout.NORTH);//admite un 2do argumento
        add(new Button("Rojo"), BorderLayout.SOUTH);
        
        add(new Button("Azul"), BorderLayout.WEST); 
        add(new Button("Verde"), BorderLayout.EAST);
        add(new Button("Blanco"), BorderLayout.CENTER);
        */
    }
    
}
