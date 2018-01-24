/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Panel;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Juego extends JFrame implements KeyListener
{
    private Panel panel;

    public Juego(Panel panel) {
        this.panel = panel;
        this.add(panel);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
        if(e.getKeyCode()==37)
        {
            panel.setX1(panel.getX1()-40);
            int posfinalX=panel.getX1()+110;
            if(posfinalX<0)
            {
                panel.setX1(674);
               
            }
            
            
        }
             
        if(e.getKeyCode()==39)
        {
           
            panel.setX1(panel.getX1()+40);
            
            if(panel.getX1()>800)
            {
                panel.setX1(0);
               
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
         
    }
    
   
    
}
