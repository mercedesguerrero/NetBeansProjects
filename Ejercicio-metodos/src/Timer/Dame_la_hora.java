/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author Mechu
 */
public class Dame_la_hora implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Date ahora= new Date();
        
        System.out.println("Doy la hora cada 5 segundos  --> " + ahora);
        Toolkit.getDefaultToolkit().beep();//hace ruidito de windows
    
    }
    
    
}
