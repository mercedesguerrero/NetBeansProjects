/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timer;

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
        
        Reloj miReloj= new Reloj(3000, true);//sonará cada 3 segundos
        miReloj.enMarcha();
        
        JOptionPane.showMessageDialog(null, "Presionar aceptar para terminar");
        System.exit(0);
        
    }   
}
