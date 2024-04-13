package model;

import javax.swing.*;
import java.awt.*;
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
        selectDeporteComboBox.setPreferredSize(new Dimension(400,40));

        nombreEquipoTextField.setPreferredSize(new Dimension(800,40));




        selectDeporteComboBox.addItem("FUTBOL");
        selectDeporteComboBox.addItem("BALONCESTO");
        selectDeporteComboBox.addItem("TENIS");

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






















    }



}
