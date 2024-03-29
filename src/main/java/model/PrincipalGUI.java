package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalGUI {



    public JPanel PanelPrincipal;
    private JLabel futbolLabel;
    private JLabel baloncestoLabel;
    private JLabel tenisLabel;
    private JPanel PanelDeporte;
    private JPanel PanelResto;
    private JLabel imageLabel;


    public PrincipalGUI() {

        // Inserción del icono
        Icon icon = new ImageIcon("src/main/java/images/iconoInicio (4).png");
        imageLabel.setIcon(icon);

        // Tamaño altura del PanelResto
        PanelResto.setPreferredSize(new Dimension(0, 500));




        /*********************************************************************************************************/
        /**************************  FUNCIONAMIENTO DE BOTONES / LABELS  *****************************************/

        //FUNCION DEL BOTON/TEXTPANE *FUTBOL*
        futbolLabel.addMouseListener(new MouseAdapter() {
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
                ((JFrame) SwingUtilities.getWindowAncestor(futbolLabel)).dispose();
            }
        });



        //FUNCION DEL BOTON/TEXTPANE *BALONCESTO*
        baloncestoLabel.addMouseListener(new MouseAdapter() {
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
                ((JFrame) SwingUtilities.getWindowAncestor(baloncestoLabel)).dispose();
            }
        });


        //FUNCION DEL BOTON/TEXTPANE *TENIS*
        tenisLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFrame frame = new JFrame("Liga Manager");
                frame.setContentPane(new TenisGUI().PanelPrincipalTenis);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500,250,1000,600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(tenisLabel)).dispose();
            }
        });









    }//FIN DEL CONSTRUCTOR
}
