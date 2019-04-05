/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisposicionLibre;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class Layer_Libre extends JPanel{
    
    public Layer_Libre()
    {
        //setLayout(null);
        setLayout(new Disposicion_Elementos());
        
        JButton botonCerrar= new JButton("Cerrar");
        //botonCerrar.setBounds(400, 500, 150, 50);//x,y,tamaño
        add(botonCerrar);
        
        JButton botonJugar= new JButton("Jugar");
        //botonJugar.setBounds(600, 500, 150, 50);
        add(botonJugar);
        
        JButton boton1= new JButton("Boton 1");
        //botonCerrar.setBounds(400, 500, 150, 50);//x,y,tamaño
        add(boton1);
        
        JButton boton2= new JButton("Boton 2");
        //botonJugar.setBounds(600, 500, 150, 50);
        add(boton2);
    }
    
}
