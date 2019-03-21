/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf2;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class Capa extends JPanel{
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Este es mi texto", 100, 100);//posicion del texto en el eje de coordenadas
    }
    
}
