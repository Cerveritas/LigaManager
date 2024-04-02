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
    private JLabel misLigasLabel;
    private JLabel imagenLabel;
    private JLabel managerLabel;
    private JButton verTodasMisLigasButton;
    private JButton crearUnirmeAUnaButton;
    private JButton ligaFinalBoton;


    public PrincipalGUI() {

        // Inserción del icono
        Icon icon = new ImageIcon("src/main/java/images/iconoInicio (4).png");
        imageLabel.setIcon(icon);
        imagenLabel.setIcon(icon);

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


        // FUNCION DEL BOTON *VER TODAS MIS LIGAS*
        verTodasMisLigasButton.setPreferredSize(new Dimension(300, 60));
        verTodasMisLigasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                verTodasMisLigasButton.setBackground(Color.decode("#827296"));
                verTodasMisLigasButton.setFont(new Font("Calibri", Font.BOLD, 20));
                verTodasMisLigasButton.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                verTodasMisLigasButton.setBackground(Color.decode("#595269"));
                verTodasMisLigasButton.setFont(new Font("Calibri", Font.BOLD, 20));
                verTodasMisLigasButton.setForeground(Color.white);
            }
        });


        // FUNCION DEL BOTON *CREAR/UNIRME A UNA LIGA*
        crearUnirmeAUnaButton.setPreferredSize(new Dimension(300, 60));
        crearUnirmeAUnaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                crearUnirmeAUnaButton.setBackground(Color.decode("#A0780B"));
                crearUnirmeAUnaButton.setFont(new Font("Calibri", Font.BOLD, 20));
                crearUnirmeAUnaButton.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                crearUnirmeAUnaButton.setBackground(Color.decode("#FAC014"));
                crearUnirmeAUnaButton.setFont(new Font("Calibri", Font.BOLD, 20));
                crearUnirmeAUnaButton.setForeground(Color.white);
            }
        });

        // FUNCION DEL BOTON *LIGA FINAL*
        ligaFinalBoton.setPreferredSize(new Dimension(400, 90));
        ligaFinalBoton.setForeground(Color.black);

        ligaFinalBoton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ligaFinalBoton.setForeground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ligaFinalBoton.setForeground(Color.gray);
            }
        });








    }//FIN DEL CONSTRUCTOR

}
