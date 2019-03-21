/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf4;

import graf2.WriteFrame;
import graf3.DrawFrame;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mechu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       FontsColorFrame miFrame= new FontsColorFrame();
       miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    }
}

/** PARA SABER SI UNA FUENTE ESTÁ INSTALADA    
 * 
 String fuente= JOptionPane.showInputDialog("Introduce fuente: ");
        boolean estaLaFuente= false;
        
        String [] nombresDeFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        for (String nombresDeFuente : nombresDeFuentes) 
        {
            //System.out.println(nombresDeFuente);
            if(nombresDeFuente.equalsIgnoreCase(fuente))
            {
                estaLaFuente= true;
            }
        }
        
        if(estaLaFuente)
        {
            System.out.println("Fuente instalada");
        }
        else
        {
            System.out.println("No esta instalada");
        }
    }
*/