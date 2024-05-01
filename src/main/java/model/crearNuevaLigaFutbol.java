package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class crearNuevaLigaFutbol {
    public JPanel PanelPrincipal;
    private JPanel PanelJugadores;
    private JLabel DefensaDerecha;
    private JLabel DefensaIzquierda;
    private JLabel LaterialIzquierda;
    private JLabel LateralDerecha;
    private JLabel Portero;
    private JLabel MedioCentroIzquiero;
    private JLabel MedioCentroDerecho;
    private JLabel MedioCentro;
    private JLabel ExtremoIzquiero;
    private JLabel Delantero;
    private JLabel ExtremoDerecho;
    private JTabbedPane tabbedPane;
    private JPanel PanelSecundarioCampo;
    private JPanel PanelSecundarioJugadores;
    private JPanel PanelCampo;
    private JPanel PanelInfo;
    private JComboBox seleccionBox;
    private JLabel EILabel;
    private JLabel DCLabel;
    private JLabel EDLabel;
    private JLabel MCILabel;
    private JLabel MCDLabel;
    private JLabel MCLabel;
    private JLabel LILabel;
    private JLabel DFILabel;
    private JLabel PorLabel;
    private JLabel DCDLabel;
    private JLabel LDLabel;



    /* quitar cuando se termine de usar */
    public static void main(String[] args) {
        JFrame frame = new JFrame("crearNuevaLigaFutbol");
        frame.setContentPane(new crearNuevaLigaFutbol().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500, 250, 1000, 600);
        frame.setVisible(true);
    }


    public crearNuevaLigaFutbol() {

        // Inserción de jugadores
        Icon icon = new ImageIcon("src/main/java/images/camisetaFutbol.png");
        Portero.setIcon(icon);
        LaterialIzquierda.setIcon(icon);
        LateralDerecha.setIcon(icon);
        DefensaIzquierda.setIcon(icon);
        DefensaDerecha.setIcon(icon);
        MedioCentroIzquiero.setIcon(icon);
        MedioCentro.setIcon(icon);
        MedioCentroDerecho.setIcon(icon);
        ExtremoIzquiero.setIcon(icon);
        Delantero.setIcon(icon);
        ExtremoDerecho.setIcon(icon);



        // Añadimos los items de los box
        seleccionBox.addItem("");
        seleccionBox.addItem("Aficionado +18 años");
        seleccionBox.addItem("Juvenil 14-17 años");
        seleccionBox.addItem("Discapacitados");




        // Funcionamiento del seleccionBox y de la ventana de jugadores
        seleccionBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedOption = (String) combo.getSelectedItem();
                // Verificar si la opción seleccionada es "hola"
                if (selectedOption.equals("Discapacitados")) {
                    Delantero.setVisible(false);
                    DCLabel.setVisible(false);
                    MedioCentro.setVisible(false);
                    MCLabel.setVisible(false);
                    LaterialIzquierda.setVisible(false);
                    LILabel.setVisible(false);
                    LateralDerecha.setVisible(false);
                    LDLabel.setVisible(false);
                    combo.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "hola mi br");

                } else if (selectedOption.equals("Aficionado +18 años")) {
                    combo.setEnabled(false);

                } else if (selectedOption.equals("Juvenil 14-17 años")) {
                    combo.setEnabled(false);
                }
            }
        });



        // Creación del campo de fútbol
        JButton botones[][];
        botones = new JButton[11][23];
        PanelCampo.setLayout(new GridLayout(11,23));
        for (int i = 0; i < 11; i++){
            for (int j = 0; j< 23; j++){
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.decode("#00BC32"));
                botones[i][j].setBorder(null); // Eliminar borde
                botones[i][j].setFocusPainted(false); // Quitar borde de enfoque
                PanelCampo.add(botones[i][j], i,j);
            }
        }
        /**[1][2]**
         *
         * [1] --> alto
         * [2] --> ancho
         */

        botones[0][11].setBackground(Color.white);
        botones[1][11].setBackground(Color.white);
        botones[2][11].setBackground(Color.white);
        botones[3][11].setBackground(Color.white);
        botones[4][11].setBackground(Color.white);
            botones[4][10].setBackground(Color.white);
            botones[4][12].setBackground(Color.white);
        botones[5][11].setBackground(Color.white);
            botones[5][13].setBackground(Color.white);
            botones[5][9].setBackground(Color.white);
            botones[6][12].setBackground(Color.white);
            botones[6][10].setBackground(Color.white);
        botones[6][11].setBackground(Color.white);
        botones[7][11].setBackground(Color.white);
        botones[8][11].setBackground(Color.white);
        botones[9][11].setBackground(Color.white);
        botones[10][11].setBackground(Color.white);

        botones[5][0].setBackground(Color.white);
        botones[7][0].setBackground(Color.white);
        botones[7][1].setBackground(Color.white);
        botones[7][2].setBackground(Color.white);
        botones[6][2].setBackground(Color.white);
        botones[5][2].setBackground(Color.white);
        botones[4][2].setBackground(Color.white);
        botones[3][2].setBackground(Color.white);
        botones[3][1].setBackground(Color.white);
        botones[3][0].setBackground(Color.white);
            botones[3][22].setBackground(Color.white);
            botones[5][22].setBackground(Color.white);
            botones[7][22].setBackground(Color.white);
            botones[3][21].setBackground(Color.white);
            botones[3][20].setBackground(Color.white);
            botones[4][20].setBackground(Color.white);
            botones[5][20].setBackground(Color.white);
            botones[6][20].setBackground(Color.white);
            botones[7][20].setBackground(Color.white);
            botones[7][21].setBackground(Color.white);



        // Cambio de color a los botones segun el deporte seleccionado
        String selectedSport = (String) seleccionBox.getSelectedItem();

        switch (selectedSport) {

            case "Aficionado +18":
                JOptionPane.showMessageDialog(null, "+18");
                break;

            case "Juvenil 14-17 años":
                JOptionPane.showMessageDialog(null, "14-17");
                break;

            case "Discapacitados":
                JOptionPane.showMessageDialog(null, "Discapacitados");
                break;
        }












        // Personalizar la apariencia de las pestañas
        Icon iconTabbedPane1 = new ImageIcon("src/main/java/images/Jugadores.png");
        Icon iconTabbedPane0 = new ImageIcon("src/main/java/images/MiClub.png");

        tabbedPane.setBackgroundAt(1, Color.decode("#FAC414"));
        tabbedPane.setBackgroundAt(0, Color.decode("#29B2C2"));

        tabbedPane.setFont(new Font("Arial", Font.BOLD, 14));
        tabbedPane.setTabPlacement(JTabbedPane.TOP);


        tabbedPane.setIconAt(1, iconTabbedPane1);
        tabbedPane.setIconAt(0, iconTabbedPane0);





        // Accion de jugadores
        Delantero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JFrame frame = new JFrame("verJugador");
                frame.setContentPane(new verJugador().panelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500, 250, 1000, 600);
                frame.setVisible(true);






            }
        });










    } // Fin del constructor








}



