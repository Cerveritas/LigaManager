package model;

import javax.swing.*;
import java.awt.*;

public class crearUnirseLiga {
    public JPanel PanelPrincipal;
    private JLabel tituloLabel;
    private JLabel imagenUneteAUnaLiga;
    private JLabel imagenCrearUnaLiga;
    private JPanel PanelBotones;
    private JLabel VolverButtonJlabel;
    private JLabel empiezaLabel;


    public crearUnirseLiga() {

        Icon iconCrear = new ImageIcon("src/main/java/images/CrearLiga.png");
        Icon iconUnise = new ImageIcon("src/main/java/images/UneteAUnaLiga.png");
        Icon iconoVolver = new ImageIcon("src/main/java/images/BotonVolver.png");

        imagenUneteAUnaLiga.setIcon(iconUnise);
        imagenUneteAUnaLiga.setIcon(iconUnise);

        imagenCrearUnaLiga.setIcon(iconCrear);
        imagenCrearUnaLiga.setIcon(iconCrear);

        VolverButtonJlabel.setIcon(iconoVolver);

        tituloLabel.setMinimumSize(new Dimension(0,90));
        empiezaLabel.setMinimumSize(new Dimension(0,90));







    }
}
