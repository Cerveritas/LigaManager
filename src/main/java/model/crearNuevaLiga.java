package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


public class crearNuevaLiga {

    public JPanel PanelPrincipalCrearNuevaLiga;
    private JLabel TITULOcreaTuNuevaLigaLabel;
    private JLabel TITULOmanagerLabel;
    private JLabel seleccionaElDeporteLabel;
    private JLabel numeroDeJugadoresLabel;
    private JLabel nombreDelEquipoLabel;
    private JButton crearLigaButton;
    private JComboBox selectDeporteComboBox;
    private JLabel numJugadoresMostrar;
    private JTextField nombreEquipoTextField;


    private final Map<String, Integer> numJugadoresPorDeporte = new HashMap<>();


    public crearNuevaLiga() {

        // Seleccion de dimension de diferentes items
        selectDeporteComboBox.setPreferredSize(new Dimension(400, 40));

        nombreEquipoTextField.setPreferredSize(new Dimension(800, 40));


        selectDeporteComboBox.addItem("FUTBOL");
        selectDeporteComboBox.addItem("BALONCESTO");
        selectDeporteComboBox.addItem("TENIS");

        // Al iniciar la aplicación, establece el primer elemento como seleccionado (índice 0)
        selectDeporteComboBox.setSelectedIndex(0);
        // Cambia la propiedad "selected" a false para que no se muestre la primera opción
        selectDeporteComboBox.setSelectedItem(null);

        // Initialize number of players for each sport
        numJugadoresPorDeporte.put("FUTBOL", 11);
        numJugadoresPorDeporte.put("BALONCESTO", 5);
        numJugadoresPorDeporte.put("TENIS", 1);

        // Add ActionListener to ComboBox for selection changes
        selectDeporteComboBox.addActionListener(e -> {
            String selectedSport = (String) selectDeporteComboBox.getSelectedItem();
            Integer numJugadores = numJugadoresPorDeporte.get(selectedSport);

            if (numJugadores != null) {
                numJugadoresMostrar.setText(String.format("%d", numJugadores));
            } else {
                numJugadoresMostrar.setText("Número no disponible");
            }
        });


        // Boton de accion para crear la Liga
        crearLigaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSport = (String) selectDeporteComboBox.getSelectedItem();

                switch (selectedSport) {

                    case "FUTBOL":
                        if (JOptionPane.showConfirmDialog(null, "Has seleccionado la opción de Fútbol, ¿estas seguro/a?") == 0){
                            metodoMainFutbol();
                        }
                        break;

                    case "BALONCESTO":
                        if (JOptionPane.showConfirmDialog(null, "Has seleccionado la opción de Baloncesto, ¿estas seguro/a?") == 0) {
                            metodoMainBaloncesto();
                        }
                        break;

                    case "TENIS":
                        if (JOptionPane.showConfirmDialog(null, "Has seleccionado la opción de Tenis, ¿estas seguro/a?") == 0){
                            metodoMainTenis();
                        }
                        break;
                }
            }
        });











    } // FIN DEL CONSTRUCTOR













    private void metodoMainFutbol() {
        JFrame frame = new JFrame("crearNuevaLigaFutbol");
        frame.setContentPane(new crearNuevaLigaFutbol().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500, 250, 1000, 600);
        frame.setVisible(true);
        //Cierra el frame donde esta situado el boton que es pulsado en ese momento
        ((JFrame) SwingUtilities.getWindowAncestor(crearLigaButton)).dispose();
    }

    private void metodoMainBaloncesto() {

    }

    private  void metodoMainTenis() {

    }


}
