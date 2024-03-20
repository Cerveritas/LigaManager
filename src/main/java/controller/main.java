package controller;

import model.InicioGUI;
import javax.swing.*;



public class main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Liga Manager");
        // Cargar el icono
        ImageIcon icon = new ImageIcon("src/main/java/images/iconoAPP.PNG");

// Establecer el icono en la ventana

        frame.setIconImage(icon.getImage());

// Mostrar la ventana
        frame.setVisible(true);

        frame.setContentPane(new InicioGUI().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,250,1000,600);
        frame.setVisible(true);





    }
}

