/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

/**
 *
 * @author Mechu
 */
public class Jefe extends Empleado{
    
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
    public String toString()
    {
        return "Nombre: " + this.getNombre() + " | Sueldo: " + this.getSueldo() + " | Icentivo: " + this.getIncentivo() +
                " | Fecha ingreso: " + this.getFecha_alta();
    }
    
    @Override
    public double getSueldo(){
        double sueldoJefe= super.getSueldo();
        
        return sueldoJefe + getIncentivo();
    }

    
}
