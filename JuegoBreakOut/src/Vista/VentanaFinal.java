
package Vista;

import Controlador.EventoVentanaFinal;
import Controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaFinal extends JFrame {
    private JLabel im, ima, imag, imgFondo;
    private JButton boton1, boton2 , boton3;
    private JPanel panelPrincipal;
    private GestionDato gD;

    public VentanaFinal(String title,GestionDato gD) throws HeadlessException {
        super(title);
        this.setSize(800, 500);
        
        this.setDefaultCloseOperation(3);
        this.gD=gD;
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        this.boton1 = new JButton("Reiniciar");
        this.boton2 = new JButton("Salir");
        this.boton3 = new JButton("Lista de Jugadores");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        Color color = new Color(14,20,45);
        this.panelPrincipal.setBackground(color);
        
        this.imag = new JLabel(new ImageIcon(getClass().getResource("/ImagenesSonidos/gameover.gif")));
        this.panelPrincipal.add(imag);
        this.getContentPane().setBackground(Color.BLACK);
      
        
        this.boton1.setBounds(100, 350, 90, 26);
        this.boton1.setBackground(Color.WHITE);
        this.boton1.setForeground(Color.black);
        this.getContentPane().add(this.boton1);
        
        this.boton2.setBounds(300, 350, 90, 26);
        this.boton2.setBackground(Color.WHITE);
        this.boton2.setForeground(Color.black);
        this.getContentPane().add(this.boton2);
        
        this.boton3.setBounds(500, 350, 150, 26);
        this.boton3.setBackground(Color.WHITE);
        this.boton3.setForeground(Color.black);
        this.getContentPane().add(this.boton3);
        
        this.boton1.addActionListener(new EventoVentanaFinal(this));
        this.boton2.addActionListener(new EventoVentanaFinal(this));
        this.boton3.addActionListener(new EventoVentanaFinal(this));
        
        this.add(this.imag);
    }

    public JLabel getIm() {
        return im;
    }

    public void setIm(JLabel im) {
        this.im = im;
    }

    public JLabel getIma() {
        return ima;
    }

    public void setIma(JLabel ima) {
        this.ima = ima;
    }

    public JLabel getImag() {
        return imag;
    }

    public void setImag(JLabel imag) {
        this.imag = imag;
    }

    public JLabel getImgFondo() {
        return imgFondo;
    }

    public void setImgFondo(JLabel imgFondo) {
        this.imgFondo = imgFondo;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JButton getBoton3() {
        return boton3;
    }

    public void setBoton3(JButton boton3) {
        this.boton3 = boton3;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
}
