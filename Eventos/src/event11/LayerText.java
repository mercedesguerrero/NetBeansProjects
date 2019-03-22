/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event11;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mechu
 */
public class LayerText extends JPanel{
    
    public LayerText()
    {
        //JTextField campo1= new JTextField("_ _ _");
        //JTextField campo1= new JTextField(20);//columnas
        JTextField campo1= new JTextField("_ _ _ _ _ _ _", 30); //texto por defecto + columnas
        
        add(campo1);
        
        System.out.println(campo1.getText().trim());// trim para que no salgan los espacios vacios en la consola
    }
}
