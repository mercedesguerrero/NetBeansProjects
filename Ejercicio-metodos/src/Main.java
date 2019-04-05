
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mechu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------SCANNER + LENGHT -------------------------------------------
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre_usuario= entrada.nextLine();
        
        System.out.println("Edad: ");
        
        try{
            int edad= entrada.nextInt();
            //entrada.close();
            
            System.out.println("Hola " + nombre_usuario + " el próximo año vas a tener " + (edad+1) + " años\n");
        
            System.out.println("Tu nombre tiene " + nombre_usuario.length() + " letras.");
        
        }catch(Exception e)
        {
            System.out.println("Error");
            e.printStackTrace();
            
        }finally{//se ejecuta SIEMPRE SUCEDA O NO LA EXCEPCION
            entrada.close();
        }
        
    }
    
}
