/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Timer;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Mechu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dame_la_hora oiga= new Dame_la_hora();
        
        Timer miTemporizador= new Timer(5000, oiga);
        
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Presiona aceptar para detener");
        
        System.exit(0);
        
        
    }
    
}
