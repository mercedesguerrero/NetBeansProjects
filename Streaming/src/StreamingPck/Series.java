/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingPck;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mechu
 */
public class Series implements Streaming{
    
    private String _nombre;
    private int _temporada;
    private int _cantTemporadas;
    private int _episodio;
    private int _cantEpisodios;
    
    public Series(String nombre, int cantTemporadas, int cantEpisodios)
    {
        this._nombre= nombre;
        this._temporada= 1;
        this._cantTemporadas= cantTemporadas;
        this._episodio= 1;
        this._cantEpisodios= cantEpisodios;
    }

    public String getNombre() {
        return _nombre;
    }

    public int getEpisodio() {
        return _episodio;
    }

    public void setEpisodio(int _episodio) {
        this._episodio = _episodio;
    }

    public int getCantEpisodios() {
        return _cantEpisodios;
    }

    public void setCantEpisodios(int _cantEpisodios) {
        this._cantEpisodios = _cantEpisodios;
    }

    public int getTemporada() {
        return _temporada;
    }

    public void setTemporada(int _temporada) {
        this._temporada = _temporada;
    }

    public int getCantTemporadas() {
        return _cantTemporadas;
    }

    public void setCantTemporadas(int _cantTemporadas) {
        this._cantTemporadas = _cantTemporadas;
    }
    
    @Override
    public int getSiguiente() {
        
        int episodioSiguiente= 0;
        
        if(this.getEpisodio() == this.getCantEpisodios())
        {
            episodioSiguiente= 1;
            this.setEpisodio(1);
            if(this.getTemporada()<= this.getCantTemporadas())
            {
                this.setTemporada(this.getTemporada()+ 1);
            } 
        }
        else
        {
            episodioSiguiente= this.getEpisodio() + 1;
            this.setEpisodio(episodioSiguiente);
        }
        
        return episodioSiguiente;
    }

    @Override
    public void Reproducir(int temporada, int episodio) {
        
        this.setTemporada(temporada);
        this.setEpisodio(episodio);

        do{
            System.out.println("Reproduciendo " + this.getNombre() + " | Episodio: " + this.getEpisodio() +
                " | Temporada: " + this.getTemporada());
          
                this.setEpisodio(this.getSiguiente());
                
        }while(this.getTemporada()<= this.getCantTemporadas() && this.getEpisodio()<= this.getCantEpisodios());
 
    }
}
