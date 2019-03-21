/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.util.Arrays;

/**
 *
 * @author Mechu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado[] misEmpleados= new Empleado[5];
        
        /**
        Empleado emp1= new Empleado("Ana Perez", 80000, 2003, 10, 26);
        Empleado emp2= new Empleado("Alberto Gonzalez", 68000, 2000, 3, 15);
        Empleado emp3= new Empleado("Martin Guzman", 72000, 2001, 6, 19);
        */
        
        misEmpleados[0]= new Empleado("Ana Perez", 80000, 2003, 10, 26);
        misEmpleados[1]= new Empleado("Alberto Gonzalez", 68000, 2000, 3, 15);
        misEmpleados[2]= new Empleado("Martin Guzman", 72000, 2001, 6, 19);
        misEmpleados[3]= new Jefe("Mercedes", 90000, 2002, 12, 7, 8000);
        
        Empleado jefe_RRHH= new Jefe("Tomas", 85000, 2001, 11, 14, 5500);
        misEmpleados[4]= jefe_RRHH;
        
        Comparable ejemplo= new Empleado("Andy", 45000, 2010, 4, 14);
        //misEmpleados[5]= ejemplo;
        
        if(jefe_RRHH instanceof Jefe)
        {
            System.out.println("Es de tipo Jefe");
        }
        
        if(misEmpleados[3] instanceof Interface1)
        {
            System.out.println("Implementa la interfaz");
        }
        
        //jefe_RRHH.establece_bonus(500);
        System.out.println("El jefe: " + jefe_RRHH.getNombre() + " recibe un bonus de $" + jefe_RRHH.establece_bonus(500));
        System.out.println("El empleado: " + misEmpleados[2].getNombre() + " recibe un bonus de $" + misEmpleados[2].establece_bonus(300));
        
        Arrays.sort(misEmpleados);//ORDENA POR SUELDO
        
        for (Empleado unEmpleado : misEmpleados) 
        {
            unEmpleado.SubirSueldo(5);
            System.out.println("Sueldo de " + unEmpleado.getNombre() + " " + unEmpleado.getSueldo() +
                " | " + "Id: " + unEmpleado.getId() +  " | " + "Fecha de ingreso: " + unEmpleado.getFecha_alta());
        }
        
        System.out.println("Id siguiente: " + Empleado.getIdSiguiente());
        
    }
    
}
