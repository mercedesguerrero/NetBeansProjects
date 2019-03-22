/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class LayerCalculadora extends JPanel{
    
    private JPanel miLayer2;
    private JButton display;
    private boolean principio= false;
    
    public LayerCalculadora()
    {
        principio= true;
        
        setLayout(new BorderLayout());
        display= new JButton("0");
        display.setEnabled(false);
        
        add(display, BorderLayout.NORTH);
        
        miLayer2= new JPanel();
        
        miLayer2.setLayout(new GridLayout(4, 4));
        
        ActionListener insertar= new InsertaNumero();
        
        AgregarBoton("7", insertar);
        AgregarBoton("8", insertar);
        AgregarBoton("9", insertar);
        //AgregarBoton("/");
        AgregarBoton("4", insertar);
        AgregarBoton("5", insertar);
        AgregarBoton("6", insertar);
        //AgregarBoton("*");
        AgregarBoton("1", insertar);
        AgregarBoton("2", insertar);
        AgregarBoton("3", insertar);
        //AgregarBoton("-");
        AgregarBoton("0", insertar);
        AgregarBoton(".", insertar);
        //AgregarBoton("=");
        //AgregarBoton("+");
        
        add(miLayer2, BorderLayout.CENTER);
    }
    
    private void AgregarBoton(String rotulo, ActionListener oyente)// los agrega y los pone a la escucha
    {
        JButton boton= new JButton(rotulo);
        boton.addActionListener(oyente);
        
        miLayer2.add(boton);
    }
    
    private class InsertaNumero implements ActionListener
    {   
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String entrada= e.getActionCommand();
            
            if(principio)
            {
                display.setText("");
                principio= false;
            }
            
            display.setText(display.getText() + entrada);
                    
                    
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     
    }
}
