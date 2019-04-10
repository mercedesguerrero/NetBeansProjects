/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingPck;

/**
 *
 * @author Mechu
 */
public class Peliculas implements Streaming{
    
    private String _nombre;
    private int _rate;
    private double _duracion;
    private int _id;
    
    public Peliculas(String nombre, int rate, double duracion, int id)
    {
        this._nombre= nombre;
        this._rate= rate;
        this._duracion= duracion;
        this._id= id;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getRate() {
        return _rate;
    }

    public void setRate(int _rate) {
        this._rate = _rate;
    }

    public double getDuracion() {
        return _duracion;
    }

    public void setDuracion(double _duracion) {
        this._duracion = _duracion;
    }

    
    @Override
    public int getSiguiente() {
        
        int peliSiguiente= this.getId();
        
        return peliSiguiente ++;
    }

    @Override
    public void Reproducir(int idioma, int from) {
        
        if(from == 0)
        {
            System.out.println("Reproducir desde el principio");
        }
        else
        {
            System.out.println("Reproducir desde la última escena");
        }
        
        switch(idioma)
        {
            case 1:
                System.out.println("Reproduciendo " + this.getNombre() + " | Idioma: INGLÉS  | Rate: " + this.getRate() + " estrellas");
                break;
            case 2:
                System.out.println("Reproduciendo " + this.getNombre() + " | Idioma: PORTUGUÉS  | Rate: " + this.getRate() + " estrellas");
                break;
            default:
                System.out.println("Reproduciendo " + this.getNombre() + " | Idioma: ESPAÑOL  | Rate: " + this.getRate() + " estrellas");
     
        }
        
        
        
        
    }
    
}
