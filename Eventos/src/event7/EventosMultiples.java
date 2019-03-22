/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class EventosMultiples extends JPanel{//CLASE OYENTE
    
    public EventosMultiples()
    {
        
        ColorAction accionAmarillo= new ColorAction("Amarillo", new ImageIcon("botonAmarillo.png"), Color.YELLOW);
        ColorAction accionAzul= new ColorAction("Azul", new ImageIcon("botonAzul.png"), Color.BLUE);
        ColorAction accionRojo= new ColorAction("Rojo", new ImageIcon("botonRojo.png"), Color.RED);
        
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        
        /**
        JButton botonAmarillo= new JButton("Amarillo");
        JButton botonAzul= new JButton("Azul");
        JButton botonRojo= new JButton("Rojo");
        
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
        */
    }
    
    private class ColorAction extends AbstractAction{// CLASE INTERNA
    
        public ColorAction(String nombre, Icon icono, Color color_boton)
        {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Pone una capa de color" + nombre);
            putValue("color_de_fondo", color_boton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color miColor= (Color)getValue("color_de_fondo");// rescata del objeto del evento el valor correspondiente a la clave

            setBackground(miColor);
            
            System.out.println("Botón: " + getValue(Action.NAME) + " | Descripción: " + getValue(Action.SHORT_DESCRIPTION));

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }

    
}
