/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class MultipleListeners extends JPanel{
    
    JButton boton_cerrar;
    
    public MultipleListeners()
    {
        JButton botonNuevo= new JButton("Nuevo");
        
        add(botonNuevo);
        
        boton_cerrar= new JButton("Cerrar todo");
        
        add(boton_cerrar);
        
        NewListener oyente= new NewListener();
        botonNuevo.addActionListener(oyente);

    }
    
    private class NewListener implements ActionListener{// CLASE INTERNA

        @Override
        public void actionPerformed(ActionEvent e) {

            Ventana_Emergente frame= new Ventana_Emergente(boton_cerrar);
            
            frame.setVisible(true);

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }

}
