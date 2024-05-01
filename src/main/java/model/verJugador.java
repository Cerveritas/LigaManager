package model;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class verJugador  {

    private JTextField nombre;
    public JPanel panelPrincipal;
    private JTextField apellido2;
    private JTextField apellido1;
    private JButton button1;



    private jugadoresFutbol jugadoresFutbol;

    public verJugador() {



        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombreJugador = nombre.getText();
                String apellido1Jugador = apellido1.getText();
                String apellido2Jugador = apellido2.getText();


                 jugadoresFutbol = new jugadoresFutbol(nombreJugador, apellido1Jugador, apellido2Jugador);








            }
        });
    } // Fin del constructor


}
