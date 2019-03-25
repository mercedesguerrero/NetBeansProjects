/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Mechu
 */
public class LayerText extends JPanel{
    
    private JTextField campo1;
    private JPasswordField contraseña;
    private JLabel resultado;
    
    public LayerText()
    {
        //JTextField campo1= new JTextField("_ _ _");
        //JTextField campo1= new JTextField(20);//columnas
        setLayout(new BorderLayout());
        JPanel miLayer2= new JPanel();
        JPanel miLayer3= new JPanel();
        //miLayer2.setLayout(new FlowLayout());
        miLayer2.setLayout(new GridLayout(3, 2));
        miLayer3.setLayout(new GridLayout(2, 1));
        
        campo1= new JTextField("", 30); //texto por defecto + columnas
        JLabel texto1= new JLabel("Email ");
        
        Comprueba_password Evento= new Comprueba_password();
        
        contraseña= new JPasswordField(30);
        contraseña.getDocument().addDocumentListener(Evento);
        JLabel texto2= new JLabel("Contraseña ");
        resultado= new JLabel("", JLabel.CENTER);
        
        miLayer2.add(texto1);
        miLayer2.add(campo1);
        miLayer2.add(texto2);
        miLayer2.add(contraseña);
        //add(resultado, BorderLayout.CENTER);
        //System.out.println(campo1.getText().trim());// trim para que no salgan los espacios vacios en la consola
        
        JButton miBoton= new JButton("Comprobar");
        
        DameTexto miEvento= new DameTexto();
        
        miBoton.addActionListener(miEvento);
        
        miLayer3.add(miBoton);
        miLayer3.add(resultado);
        
        add(miLayer2, BorderLayout.NORTH);
        add(miLayer3, BorderLayout.CENTER);
    }    
        
    private class DameTexto implements ActionListener
    {
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String mail= campo1.getText().trim();
            int arroba= 0;
            boolean punto= false;
            
            System.out.println(campo1.getText().trim());

            for(int i=0; i< mail.length(); i++)
            {
                if(mail.charAt(i)== '@')
                {
                    arroba ++;
                }
                if(mail.charAt(i)== '.')
                {
                    punto= true;
                }
            }

            if(arroba== 1 && punto== true)
            {
                resultado.setText("Correcto");
                System.out.println("Es un mail");
            }
            else
            {
                resultado.setText("Incorrecto");
                System.out.println("No es un mail válido");
            }
            
        }
    }  
    
    private class Comprueba_password implements DocumentListener
    {

        @Override
        public void insertUpdate(DocumentEvent de) {
            
            char [] password;
            
            password= contraseña.getPassword();
            
            if(password.length< 8 || password.length>12)
            {
                contraseña.setBackground(Color.RED);
            }
            else
            {
                contraseña.setBackground(Color.WHITE);
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
