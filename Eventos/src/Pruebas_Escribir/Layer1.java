/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas_Escribir;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Mechu
 */
public class Layer1 extends JPanel{
    
    private Image _fondo;
    private String _letras_a_adivinar;
    private int respuesta;
    JTextArea _areaParaIngresarLetra;
    private String _palabra_a_adivinar; 
    private int _cuentaErrores;
    private int _cantFallosPermitidos;
    private final ArrayList<Character> _letrasIngresadasList;
    
    public Layer1()
    {
        this._palabra_a_adivinar= "MERCEDES";
        this._cuentaErrores= 0;
        this._cantFallosPermitidos= 6;
        this._letrasIngresadasList = new ArrayList<>();
        Palabra_a_Completar();
    }

    public String getLetras_a_adivinar() {
        return _letras_a_adivinar;
    }

    public void setLetras_a_adivinar(String _letras_a_adivinar) {
        this._letras_a_adivinar = _letras_a_adivinar;
    }

    public int getCuentaErrores() {
        return _cuentaErrores;
    }

    public void setCuentaErrores(int _cuentaErrores) {
        this._cuentaErrores = _cuentaErrores;
    }

    private void Palabra_a_Completar()
    {
        String caracteres= "";
        System.out.println("Cantidad de letras a adivinar: " + _palabra_a_adivinar.length());

        for (int i = 0; i < _palabra_a_adivinar.length(); i++)
        {
            caracteres+= "_";
        }
        
        this.setLetras_a_adivinar(caracteres);
        System.out.println("Letras a adivinar: " + this._letras_a_adivinar);
    }
    
    private void AgregarLetraIngresada(char letraIngresada)
    {
        this._letrasIngresadasList.add(letraIngresada);
    }
    
    public boolean noQuedanIntentos() 
    {
        boolean retorno;
        if (_cuentaErrores > _cantFallosPermitidos) 
        {
            retorno= true;
        }
        else 
        {
            retorno= false;
        }
        
        return retorno;
    }
    
    public boolean QuedanIntentos() 
    {
        boolean retorno;
        if (_cuentaErrores <= _cantFallosPermitidos) 
        {
            retorno= true;
        }
        else 
        {
            retorno= false;
        }
        
        return retorno;
    }
    
    
    private boolean MostrarLetra(char letraIngresada)
    {
        //char[] letrasConvert= _letras_a_adivinar.toCharArray();
        boolean retorno= false;
        
        for (int i = 0; i < _palabra_a_adivinar.length(); i++)//-1=????
        {
            System.out.println(" --- \nLetra a buscar: " + _palabra_a_adivinar.charAt(i) );
            System.out.println("Letra ingresada: " + letraIngresada);                      
                        
            if (_palabra_a_adivinar.charAt(i) == letraIngresada)
            {  
                if (_letras_a_adivinar.charAt(i) != '_')
                {
                    JOptionPane.showMessageDialog(null, "Ya ingresaste la letra " + letraIngresada);
                }
                //letrasConvert[i]= letraIngresada;
                else
                {
                    retorno= true;
                    
                    StringBuilder aux = new StringBuilder(this.getLetras_a_adivinar());
                    aux.setCharAt(i, letraIngresada);
                    
                    System.out.println("Palabra medio adivinada1: " + aux.toString());
                    
                    setLetras_a_adivinar(aux.toString());
               
                    System.out.println("Letras a adivinar seteadas: " + getLetras_a_adivinar());

                }
            }
        }
        
        return retorno;
    }
    

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        try{
        _fondo= ImageIO.read(new File("space.jpg"));
        
        }
        catch(IOException e)
        {
            System.out.println("No se encontró la imagen");
        }
        
        setLayout(null);
        
        g.drawImage(_fondo, 0, 0, null);
        
        Graphics2D titulo= (Graphics2D) g;
        
        Font miFuente= new Font("Happy Camper", Font.BOLD, 76);
        titulo.setFont(miFuente);
        titulo.setColor(Color.WHITE);
        titulo.drawString(_palabra_a_adivinar, 450, 100);
        
        Graphics2D palabra= (Graphics2D) g;
        
        palabra.setFont(new Font("Calibri", Font.BOLD, 62));
        palabra.setColor(new Color(65, 228, 195));
        palabra.drawString(this.getLetras_a_adivinar(), 250, 250);

        _areaParaIngresarLetra= new JTextArea(8, 20);
        _areaParaIngresarLetra.setLineWrap(true);//No tiene saltos de linea
        _areaParaIngresarLetra.setFont(new Font("Aharoni", Font.BOLD, 86));
        _areaParaIngresarLetra.setForeground(new Color(38, 74, 90));
        _areaParaIngresarLetra.setTabSize(1);
        _areaParaIngresarLetra.setToolTipText("Tipear letra");
        _areaParaIngresarLetra.setBounds(950, 340, 95, 95);
        _areaParaIngresarLetra.setBackground(new Color(237, 143, 196));
        //miArea.setPreferredSize(new Dimension (150,160));
        _areaParaIngresarLetra.setRequestFocusEnabled(true);
        add(_areaParaIngresarLetra);
        //miArea.setEditable(false);//no te deja escribir
        _areaParaIngresarLetra.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                char letra_ingresada= ke.getKeyChar();
                
                if(Character.isLetter(letra_ingresada))
                {
                    ke.consume();//no toma en cuanta las letras que se ingresen posteriormente
  
                    String cadena= String.valueOf(letra_ingresada).toUpperCase();
                    letra_ingresada= cadena.charAt(0);
                    
                    _areaParaIngresarLetra.setText(cadena);
                    
                    AgregarLetraIngresada(letra_ingresada);
                    
                    if(MostrarLetra(letra_ingresada))
                    {
                        repaint();//llama a paint hace update()
                        JOptionPane.showMessageDialog(null, "Correcto!!!");
                        System.out.println("Letra ingresada: " + _areaParaIngresarLetra.getText());
                        //.drawString(getLetras_a_adivinar(), 250, 250);
                        _areaParaIngresarLetra.setText("");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Incorrecto!!!");
                        System.out.println("Letra ingresada: " + _areaParaIngresarLetra.getText());
                        _cuentaErrores += 1;
                        System.out.println("Cantidad de errores: " + _cuentaErrores);
                        _areaParaIngresarLetra.setText("");
                    }
                    
                }
                else
                {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Solo pueden ingresar letras");
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
            
        });
        
        JButton boton_salir= new JButton(new ImageIcon("SalirBtn.png"));
        boton_salir.setBorder(null);
        boton_salir.setBorderPainted(false);
        boton_salir.setContentAreaFilled(false);
        boton_salir.setFocusPainted(false);
        boton_salir.setToolTipText("Abandonar partida");
        boton_salir.setActionCommand("Abandonar_partida");
        boton_salir.setBounds(80, 470, 250, 100);//x,y,tamaño
        
        boton_salir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                respuesta = JOptionPane.showConfirmDialog(null, "Desea salit?");
                if (respuesta == 0) {
                    System.exit(0);
                }
            }
        });
   
        add(boton_salir);
        
    }
    
 
}
