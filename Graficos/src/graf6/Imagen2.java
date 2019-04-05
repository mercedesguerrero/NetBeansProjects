/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf6;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Mechu
 */
public class Imagen2 extends JPanel{
    
    private Image _imagen;

    public Image getImagen() {
        return _imagen;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        try{
        this._imagen= ImageIO.read(new File("BELOVED.jpg"));//checked exception
        }
        catch(IOException e)
        {
            System.out.println("No se encontró la imagen");
        }
        
        //SI NO SE EL TAMAÑO DE LA IMAGEN:
        int anchoImagen= this.getImagen().getWidth(this);
        int alturaImagen= this.getImagen().getHeight(this);
        
        if(this.getImagen()==null)//unchecked exception
        {
            g.drawString("No se puede cargar la imagen", 10, 10);
        }
        else
        {
            g.drawImage(this.getImagen(), 0, 0, null); //OBSERVER= informar el progreso de conversion de la imagen
        
            for(int i=0; i<800 ; i++)
            {
                for(int j=0; j<600 ; j++)
                {
                    //g.copyArea(0, 0, 225, 225, 225*i, 225*j);//IMAGEN REPETIDA EN MOSAICO 225= TAMAÑO DE LA IMAGEN EN PIXELES(ANCHO Y ALTO)
                    if(i+j>0)//para que no la vuelva a copiar en la primera posición
                    {
                        g.copyArea(0, 0, anchoImagen, alturaImagen, anchoImagen*i, alturaImagen*j);
                    }
                }
            }

            //g.copyArea(0, 0, 225, 225, 200, 50);
        }
        
        
    } 
    
}
