/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionLibre;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 *
 * @author Mechu
 */
public class Disposicion_Elementos implements LayoutManager{
    
    private int x;
    private int y=50;

    @Override
    public void addLayoutComponent(String string, Component cmpnt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component cmpnt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container miContenedor) {
        
        int d= miContenedor.getWidth();//ancho
        x= d/2;
        int contador=0;
        int numComponentes= miContenedor.getComponentCount();
        
        for (int i = 0; i < numComponentes; i++) 
        {
            contador ++;
            
            Component c= miContenedor.getComponent(i);
            
            c.setBounds(x-300, y, 200, 50);
            
            x+= 400;
            
            if (contador%2==0) 
            {
                x= d/2;
                y+=100;
            }
            
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
