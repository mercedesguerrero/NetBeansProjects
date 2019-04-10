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
public class Musica implements Streaming{
    
    private String _nombreCancion;
    private int _idCancion;
    private String _artista;
    
    public Musica(String nombre, int id, String artista)
    {
        this._nombreCancion= nombre;
        this._idCancion= id;
        this._artista= artista;
    }

    public String getNombreCancion() {
        return _nombreCancion;
    }

    public void setNombreCancion(String _nombreCancion) {
        this._nombreCancion = _nombreCancion;
    }

    public int getIdCancion() {
        return _idCancion;
    }

    public void setIdCancion(int _idCancion) {
        this._idCancion = _idCancion;
    }

    public String getArtista() {
        return _artista;
    }

    public void setArtista(String _artista) {
        this._artista = _artista;
    }

    @Override
    public int getSiguiente() {
        
        int cancionSiguiente= this.getIdCancion();
        
        return cancionSiguiente ++;
        
    }

    @Override
    public void Reproducir(int id, int aleatorio) {
        
        if(aleatorio== 0)
        {
            this.getSiguiente();
        }
        
    }
    
}
