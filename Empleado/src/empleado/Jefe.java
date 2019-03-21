/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Mechu
 */
public class Jefe extends Empleado implements Interface1{
    
    private double _incentivo;
    
    public Jefe()
    {
        
    }
    
    public Jefe(String nombre, double sue, int anio, int mes, int dia, double incentivo)
    {
        super(nombre, sue, anio, mes, dia);
        this._incentivo= incentivo;
    }

    public double getIncentivo() {
        return _incentivo;
    }

    public void setIncentivo(double _incentivo) {
        this._incentivo = _incentivo;
    }
    
    @Override
    public double getSueldo(){
        double sueldoJefe= super.getSueldo();
        
        return sueldoJefe + getIncentivo();
    }

    @Override
    public String controlar_empleados(String controlar) 
    {
        return "Control de empleados: " + controlar;
        
    }

    @Override
    public double establece_bonus(double gratificacion) 
    {
        double bonus_extra= 2000;
        
        return Trabajadores.bonus_base + gratificacion + bonus_extra;
    }
    
    
}
