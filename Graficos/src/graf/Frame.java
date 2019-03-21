/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

import javax.swing.JFrame;

/**
 *
 * @author Mechu
 */
public class Frame extends JFrame{
    
    public Frame()
    {
        //setSize(500, 300);//TAMAÑO
        //setLocation(500, 300);//POSICION
        
        setBounds(500, 300, 250, 250);//TAMAÑO Y POSICION DE LA VENTANA
        
        //para que no se pueda redimensionar el marco:
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);//VENTANA MAXIMIZADA
        
        setTitle("Mi ventana");//TÍTULO DE LA VENTANA
        
        /**PARA SETEAR LA VENTANA CENTRADA EN EL MONITOR
         * 
         * USAMOS LA CLASE TOOLKIT 
         */
        
        
    }
    
}
