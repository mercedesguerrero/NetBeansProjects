/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Mechu
 */
public class Empleado implements Comparable, Serializable{
    
    private String _nombre;
    private double _sueldo;
    private Date _fecha_alta;
    private int _id; 
    private static int _idSiguiente= 1;//queda en cursiva porq pertenece a la propia clase
    
    public Empleado()
    {
        
    }
    
    public Empleado(String nom, double sue, int anio, int mes, int dia)
    {
        this._nombre= nom;
        this._sueldo= sue;
        this._id= _idSiguiente;
        _idSiguiente ++;
        GregorianCalendar calendario= new GregorianCalendar(anio, mes-1, dia);
        this._fecha_alta= calendario.getTime();
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public double getSueldo() {
        return _sueldo;
    }

    public void setSueldo(double _sueldo) {
        this._sueldo = _sueldo;
    }

    public Date getFecha_alta() {
        return _fecha_alta;
    }

    public void setFecha_alta(Date _fecha_alta) {
        this._fecha_alta = _fecha_alta;
    }

    public int getId() {
        return _id;
    }
    
    public static int getIdSiguiente()
    {
        return _idSiguiente;
    }
    
    @Override
    public int compareTo(Object un_objeto)
    {
        Empleado otro_empleado= (Empleado) un_objeto;
        int retorno= 0;
        
        if(this.getSueldo()< otro_empleado.getSueldo())
        {
            retorno= -1;
        }
        if(this.getSueldo()> otro_empleado.getSueldo())
        {
            retorno= 1;
        }
        
        return retorno;
    }
    
    @Override
    public String toString()
    {
        return "Nombre: " + this.getNombre() + " | Sueldo: " + this.getSueldo() + " | Fecha ingreso: " + this.getFecha_alta();
    }
    
    public void SubirSueldo(double porcentaje)
    {
        double aumento= _sueldo*porcentaje/100;
        
        _sueldo+=aumento;
    }
    
}
