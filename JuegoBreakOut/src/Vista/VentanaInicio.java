
package Vista;

import Controlador.EventoVentanaInicio;
import Controlador.GestionDato;
import java.awt.*;
import javax.swing.*;

public class VentanaInicio extends JFrame {
    
    private JLabel imgFondo,letra;
    private JButton boton;
    private JPanel panelPrincipal;
    private GestionDato gD;

    public VentanaInicio(String title,GestionDato gD) throws HeadlessException {
        super(title);
        this.setSize(700, 500);
        this.setLocation(30, 1);
        this.setDefaultCloseOperation(3);
        this.gD=gD;
        this.iniciaComponentes();
        this.setBackground(Color.BLACK);
    }
    
    public void iniciaComponentes(){
        
        this.boton = new JButton("Jugar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        this.panelPrincipal.setBackground(Color.BLACK);
        
        this.letra=new JLabel("BREAKOUT");
        this.imgFondo = new JLabel(new ImageIcon(getClass().getResource("/ImagenesSonidos/breakout.jpg")));
        this.panelPrincipal.add(imgFondo);
        
        this.boton.setBounds(530, 320, 90, 26);
        this.boton.setBackground(Color.WHITE);
        this.boton.setForeground(Color.black);
        this.getContentPane().add(this.boton);
        this.getContentPane().setBackground(Color.BLACK);
        this.boton.addActionListener(new EventoVentanaInicio(this));
        this.add(this.imgFondo);
        
        
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
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

