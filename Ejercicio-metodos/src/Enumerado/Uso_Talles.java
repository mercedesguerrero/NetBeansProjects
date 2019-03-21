/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerado;

/**
 *
 * @author Mechu
 */
public class Uso_Talles {
    
    enum Talle{
        
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
        
        private String _abreviatura;
        
        
        private Talle(String abreviatura)
        {
            this._abreviatura= abreviatura;
        }

        public String getAbreviatura() {
            return _abreviatura;
        }
       
    }
    
}
