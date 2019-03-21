/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class Fuentes extends JPanel{
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        
        Font miFuente= new Font("Happy Camper", Font.BOLD, 76);
        g2.setFont(miFuente);
        g2.setColor(Color.WHITE);
        g2.drawString("Mercedes", 100, 200);
        
        g2.setFont(new Font("Calibri", Font.ITALIC, 42));
        g2.setColor(new Color(65, 228, 195));
        g2.drawString("Programacion en JAVA", 100, 250);
    }
}
