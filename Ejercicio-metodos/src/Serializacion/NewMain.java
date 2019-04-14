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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado[] misEmpleados= new Empleado[5];
        
        misEmpleados[0]= new Empleado("Ana Perez", 80000, 2003, 10, 26);
        misEmpleados[1]= new Empleado("Alberto Gonzalez", 68000, 2000, 3, 15);
        misEmpleados[2]= new Empleado("Martin Guzman", 72000, 2001, 6, 19);
        misEmpleados[3]= new Jefe("Mercedes", 90000, 2002, 12, 7, 8000);
        
        Empleado jefe_RRHH= new Jefe("Tomas", 85000, 2001, 11, 14, 5500);
        misEmpleados[4]= jefe_RRHH;
        
        Serializando miSerial= new Serializando(misEmpleados);
        
        miSerial.Serializar();
    }
    
}
