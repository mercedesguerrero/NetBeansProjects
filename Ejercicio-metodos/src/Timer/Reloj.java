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
import javax.swing.Timer;
/**
 *
 * @author Mechu
 */
public class Reloj {
    
    private int _intervalo;
    private boolean _sonido;
    
    public Reloj(int intervalo, boolean sonido)
    {
        this._intervalo= intervalo;
        this._sonido= sonido;
    }
    
    public void enMarcha()
    {
        ActionListener oiga= new Dame_la_Hora2();
        Timer miTemporizador= new Timer(this._intervalo, oiga);
        miTemporizador.start();
    }
    
    private class Dame_la_Hora2 implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent ae) {
            
                Date ahora= new Date();

                System.out.println("Doy la hora cada 3 segundos  -->  " + ahora);

                if(_sonido)
                {
                    Toolkit.getDefaultToolkit().beep();
                }
        }
    }
   
}
