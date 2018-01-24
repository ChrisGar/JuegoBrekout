/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class Pelota {
    
    private int x;
    private int y;
    private int alto;
    private int ancho;

    public Pelota(int x, int y, int alto, int ancho) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

   
    public void paintComponent(Graphics grphcs) 
    {
        ImageIcon Img=new ImageIcon(getClass().getResource("/ImagenesSonidos/ball.png"));
        grphcs.drawImage(Img.getImage(), x, y, alto, ancho,null);
    }
    
}
