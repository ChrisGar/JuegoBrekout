/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.VentanaFinal;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Base;
import modelo.Ladrillo;
import modelo.Participante;
import modelo.Pelota;

/**
 *
 * @author USER
 */
public class Panel extends JPanel
{
    private AudioClip sonidoBase=java.applet.Applet.newAudioClip(getClass().getResource("/ImagenesSonidos/bump.wav"));
    private AudioClip sonidoLadrillo=java.applet.Applet.newAudioClip(getClass().getResource("/ImagenesSonidos/ping.wav"));
    private AudioClip gameOver=java.applet.Applet.newAudioClip(getClass().getResource("/ImagenesSonidos/Gameover.wav"));
    private AudioClip youWin=java.applet.Applet.newAudioClip(getClass().getResource("/ImagenesSonidos/youwin.wav"));
    private Ladrillo ladrilloList[]=new Ladrillo[30];
    private int valx[];
    private int valy[];
    private int cont=0;
    int numLadrillos=0;
    private int x1=350;
    private int x2=320;
    private int y1=420;
    private int y2=380;
    private int y3;
    private int y4;
    private int alto1=110;
    private int alto2=20;
    private int alto3;  
    private int ancho1=18;
    private int ancho2=20;
    private int ancho3=9;
    private boolean band=true;
    private int incrementox=20;
    private int incrementoy=20;
    private int contador;
    private int contador2;
    private GestionDato gD;
    private int puntaje;
    private Participante p;
   
    
    public Panel() 
    {
        this.setBackground(Color.BLACK);
        
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) 
    {
        super.paintComponent(grphcs);
        int contX=150;
        int contY=0;
        
        contador=contador+1;
        x2=x2+incrementox;
        y2=y2+incrementoy;
        
        Base b=new Base(x1,y1,alto1,ancho1);
        b.paintComponent(grphcs);
             
        Pelota p=new Pelota(x2,y2,alto2,ancho2);
        p.paintComponent(grphcs);
        
       
        numLadrillos=0;
        
        for(int i=0;i<6;i++)
        {
            
            contY=100;
            
            for(int j=0;j<5;j++)
            {
                if(contador==1)
                {
                    ladrilloList[numLadrillos]=new Ladrillo(contX,contY,70,15);
                }
                
                if(ladrilloList[numLadrillos].visible==true)
                {
                    ladrilloList[numLadrillos].paintComponent(grphcs);
                }
                
                contY=contY+20;
                numLadrillos++;
               
            }
            contX=contX+75; 
        }
        
       
    }
   
    
    public void MovPelota()
    {
        
        if((x2>this.getWidth()-20)||(x2<0))
        {
            incrementox=incrementox*-1;
            
        }
       
        if(y2<0)
        {
            incrementoy=incrementoy*-1;
            
        }
            
        int posBasefinalx=0;
        posBasefinalx=x1;
        posBasefinalx=posBasefinalx+110;
            
        int posBasefinaly=0;
        posBasefinaly=y1;
        posBasefinaly=posBasefinaly+18;
            
        if((x2>=x1-20)&&(x2<=posBasefinalx)&&(y2==y1-20))
        {
           
            incrementoy=incrementoy*-1;
            sonidoBase.play();
            
        }
        
        int posLadrillofinalx=0;
        int posLadrillofinaly=0;
            
        for(Ladrillo ladrillo: ladrilloList)
        {
            
            posLadrillofinalx=ladrillo.getX()+70;
            posLadrillofinaly=ladrillo.getY()+15;
           
            if((x2>=ladrillo.getX())&&(x2<=posLadrillofinalx)&&(y2>=ladrillo.getY()-20)&& (y2<=posLadrillofinaly))
            {
                   
                incrementoy=incrementoy*-1;
                ladrillo.setVisible(false);
                ladrillo.setX(-50);
                ladrillo.setY(600);
                contador++;
                contador2++;
                puntaje++;
                sonidoLadrillo.play();
               
            }
                
        }
       
        if(((x2<x1)||(x2>posBasefinalx))&&(y2>posBasefinaly))
        {
            VentanaFinal vP = new VentanaFinal("BREAKOUT",gD);
            vP.setVisible(true);
            gameOver.play();
            p.setPuntaje(puntaje);
            band=false;
            
        }
        
        if(contador2==30)
        {
            youWin.play();
            JOptionPane.showMessageDialog(this,"Haz ganado!");
            band=false;
            System.exit(WIDTH);
        }
          
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public boolean isBand() {
        return band;
    }

    public void setBand(boolean band) {
        this.band = band;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    
    
    
 
}

