/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas_Escribir;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 *
 * @author Mechu
 */
public class FramePpal extends javax.swing.JFrame {

    /**
     * Creates new form FramePpal
     */
    public FramePpal() {
        setTitle("Jugar Angry Cats");
        setVisible(true);
        setSize(1200, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        
        Layer1 miLayer= new Layer1();
        
        
        miLayer.addComponentListener(new ComponentListener()
        {
            @Override
            public void componentResized(ComponentEvent e)
            {
              
            }

            @Override
            public void componentMoved(ComponentEvent e)
            {
             
            }

            @Override
            public void componentShown(ComponentEvent e)
            {
             
            }

            @Override
            public void componentHidden(ComponentEvent e)
            {
                setVisible(false);
                dispose();
            }
        });

        add(miLayer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}