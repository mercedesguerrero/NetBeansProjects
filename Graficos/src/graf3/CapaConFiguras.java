/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class CapaConFiguras extends JPanel{
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 200);
        
        Graphics2D g2= (Graphics2D) g;
        
        Rectangle2D rectangulo= new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.RED);//cambia el color del borde(contorno)
        g2.draw(rectangulo);
        Color miColor= new Color(237, 228, 167);
        g2.setPaint(miColor);
        g2.fill(rectangulo);
        
        Ellipse2D elipse= new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        //g2.setPaint(Color.BLUE);
        g2.setPaint(new Color(238, 176, 208));// se puede usar .darker() o .brighter()
        g2.fill(elipse);
        
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        
        double centroenX= rectangulo.getCenterX();
        double centroenY= rectangulo.getCenterY();
        double radio= 150;
        
        Ellipse2D circulo= new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
        
        g2.draw(circulo);
        
     
    }
    
}
