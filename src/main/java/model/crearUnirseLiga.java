package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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


        // Actiones de botones
        VolverButtonJlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFrame frame = new JFrame("Liga Manager");
                frame.setContentPane(new PrincipalGUI().PanelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500, 250, 1000, 600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(VolverButtonJlabel)).dispose();


            }
        });


        imagenCrearUnaLiga.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFrame frame = new JFrame("crearNuevaLiga");
                frame.setContentPane(new crearNuevaLiga().PanelPrincipalCrearNuevaLiga);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(750,250,500,600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(VolverButtonJlabel)).dispose();
            }
        });






    }
}
