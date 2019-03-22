/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

/**
 *
 * @author Mechu
 */

public class EventMouse extends MouseAdapter
{
    
    @Override
    public void mousePressed(MouseEvent e)
    {
        System.out.println(e.getModifiersEx());// te dice si resionaste clic derecho, izquierdo o la ruedita
        
        if(e.getModifiersEx()== 4096)
        {
            System.out.println("Presionaste el clic derecho");
        }
        
        else if(e.getModifiersEx()== MouseEvent.BUTTON1_DOWN_MASK)
        {
            System.out.println("Presionaste el clic izquierdo");
        }
    }
    /**
    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Coordenada X: " + e.getX() + " |  Coordenada Y: " + e.getY());
        System.out.println(e.getClickCount());
    }
    */
/**
public class EventMouse implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        
        System.out.println("Hiciste clic");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
        System.out.println("Presionaste");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
        System.out.println("Soltaste el boton");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
        System.out.println("Saliste");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
