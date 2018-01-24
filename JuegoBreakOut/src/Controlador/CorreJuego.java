/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Panel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class CorreJuego extends java.lang.Thread
{
    private Panel p;

    public CorreJuego(String string, Panel p) {
        super(string);
        this.p=p;
    }
    
    public void Movimientos()
    {
        boolean band;
        
       
        do
        {
            band=true;
            
            try {
                Thread.sleep(100);
                this.p.repaint();
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(CorreJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.p.MovPelota();
            band=this.p.isBand();
            
        }while(band==true);
    }
    
    
    @Override
    public void run() 
    {
        super.run();
        
        Movimientos();
    }
    
}
