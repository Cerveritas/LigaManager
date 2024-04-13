package model;

import javax.swing.*;
import java.awt.*;

public class crearNuevaLigaFutbol {
    private JPanel PanelPrincipal;
    private JPanel PanelIZQ;
    private JPanel PanelDER;


    public static void main(String[] args) {
        JFrame frame = new JFrame("crearNuevaLigaFutbol");
        frame.setContentPane(new crearNuevaLigaFutbol().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500, 250, 1000, 600);
        frame.setVisible(true);
    }

    public crearNuevaLigaFutbol() {

        /*Icon icon = new ImageIcon("src/main/java/images/campoFutbol.jpg");
        imagenLabel.setIcon(icon);
*/

        JButton botones[][];



        botones = new JButton[11][23];
        PanelIZQ.setLayout(new GridLayout(11,23));
        for (int i = 0; i < 11; i++){
            for (int j = 0; j< 23; j++){
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.decode("#00BC32"));
                botones[i][j].setBorder(null); // Eliminar borde
                botones[i][j].setFocusPainted(false); // Quitar borde de enfoque
                PanelIZQ.add(botones[i][j], i,j);
            }
        }

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






    }
}



