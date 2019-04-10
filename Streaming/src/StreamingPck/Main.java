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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Series TheGoodPlace= new Series("The Good Place", 2, 5);
        Series GameOfThrones= new Series("Game of Thrones", 3, 6);
        Peliculas Titanic= new Peliculas("Titanic", 5, 134, 1);
        Peliculas Shazam= new Peliculas("Shazam", 3, 90, Titanic.getSiguiente());
        Peliculas Avengers= new Peliculas("Avengers Endgame", 4, 125, Shazam.getSiguiente());
        
        TheGoodPlace.Reproducir(1, 3);
        
        System.out.println("-----------------------------------------------");
        
        GameOfThrones.Reproducir(2, 2);
        
        System.out.println("-----------------------------------------------");
        
        Titanic.Reproducir(4, 0);
        
        System.out.println("-----------------------------------------------");
        
        Shazam.Reproducir(2, 2);
        
        System.out.println("-----------------------------------------------");
   
        Avengers.Reproducir(1, 0);
    }
    
}
