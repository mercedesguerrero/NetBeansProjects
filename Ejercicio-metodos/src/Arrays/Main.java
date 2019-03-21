/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Mechu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**  
        int [] mi_matriz= new int[5];
        
        mi_matriz[0]= 5;
        mi_matriz[1]= 38;
        mi_matriz[2]= 46;
        mi_matriz[3]= 10;
        mi_matriz[4]= -15;
        mi_matriz[5]= 32;
        * 
        */
      
      int [] mi_matriz={5, 38, -15, 36, 45};
      String [] matriz2= {"Argentina", "Ecuador", "Panama", "Brasil", "Mexico", "Colombia", "Chile"};
      int [] matriz_aleatorios= new int[20];
      
        System.out.println("Mi matriz tiene " + mi_matriz.length + " elementos\n");
        
        for(int i=0; i<mi_matriz.length; i++)
        {
            System.out.print("Valor: " + mi_matriz[i] + " | ");
        }
        System.out.println("\n");
        
        for (String elemento : matriz2) 
        {
            System.out.print("Pais: " + elemento + " | ");
        }
        
        System.out.println("\n");
        
        for(int n=0; n< matriz_aleatorios.length; n++)
        {
            matriz_aleatorios[n]= (int) Math.round(Math.random()*100);
        }
        
        for (int numeros : matriz_aleatorios) 
        {
            System.out.print(numeros + " ");
        }
        
        //------------MATRIZ BIDIMENSIONAL------------------------------------
        System.out.println("\n-------------------------------------");
        
        //int [][] matrix= new int [4][5];
        int [][] matrix= {
            {10,15,20,30,40},
            {72,3,44,5,96},
            {21,22,23,24,05},
            {34,35,36,45,67}
        };
        
        for(int m= 0; m<4; m++)
        {
            System.out.println();
            for(int j=0; j<5; j++)
            {
                System.out.print(matrix[m][j] + " | ");
            }
        }
        
        System.out.println("\n-------------------------------------");
        
        for (int[] fila : matrix) {
            System.out.println();
            
            for (int columna : fila) {
                
                System.out.print(columna + " | ");
            }
            
        }
        System.out.println("\n-------------------------------------");
    }
    
}
