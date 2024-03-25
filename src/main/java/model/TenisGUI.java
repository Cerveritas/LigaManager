package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TenisGUI {
    public JPanel PanelPrincipalTenis;
    private JPanel PanelDeporte;
    private JPanel PanelResto;
    private JLabel FUTBOLLabel;
    private JLabel BALONCESTOLabel;
    private JLabel TENISLabel;
    private JLabel imagenLabel;


    public TenisGUI() {

        // Inserción del icono
        Icon icon = new ImageIcon("src/main/java/images/iconoInicio (4).png");
        imagenLabel.setIcon(icon);


        // Tamaño altura del PanelResto
        PanelResto.setPreferredSize(new Dimension(0, 500));



        // BOTON LOGO
        imagenLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFrame frame = new JFrame("Liga Manager");
                frame.setContentPane(new PrincipalGUI().PanelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500,250,1000,600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(imagenLabel)).dispose();

            }
        });

        /********************************************************************************************************/
        /******************************  ACCIONES DE BOTONES / LABEL DEPORTES  **********************************/


        BALONCESTOLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFrame frame = new JFrame("Liga Manager");
                frame.setContentPane(new BaloncestoGUI().PanelPrincipalBaloncesto);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500,250,1000,600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(imagenLabel)).dispose();
            }
        });

        FUTBOLLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFrame frame = new JFrame("Liga Manager");
                frame.setContentPane(new FutbolGUI().PanelPrincipalFutbol);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500,250,1000,600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(TENISLabel)).dispose();
            }
        });














    }// FIN DEL CONSTRUCTOR
}

