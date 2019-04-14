/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Mechu
 */
public class Serializando {
    
    private Empleado [] misEmpleados;
    
    public Serializando(Empleado [] Empleados)
    {
        this.misEmpleados= Empleados;
    }
    
    public void Serializar()
    {
        try{
            
            ObjectOutputStream escribiendo_fichero= new ObjectOutputStream(new FileOutputStream("empleado.xml"));
            escribiendo_fichero.writeObject(misEmpleados);
            escribiendo_fichero.close();
            
            ObjectInputStream recuperar_fichero= new ObjectInputStream(new FileInputStream("empleado.xml"));
            Empleado[] personalRecuperado= (Empleado[]) recuperar_fichero.readObject();
            recuperar_fichero.close();
            
            for (Empleado empleado : personalRecuperado) 
            {
                System.out.println(empleado.toString());
            }
            
        }catch(Exception e){
            
            System.out.println("No se pudo escribir en el archivo");
        }
    }
}
