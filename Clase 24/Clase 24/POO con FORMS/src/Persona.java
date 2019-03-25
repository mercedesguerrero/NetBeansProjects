/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Persona {
    
     int dni;
     String nombre;
     int edad;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.dni + "-");
        sb.append(this.nombre + "-");
        sb.append(this.edad);
        
                
        return sb.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
}