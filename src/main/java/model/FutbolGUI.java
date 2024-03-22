package model;

import javax.swing.*;
import java.awt.*;

public class FutbolGUI {
    public JPanel PanelPrincipalFutbol;
    private JPanel PanelDeporte;
    private JPanel PanelResto;
    private JLabel FÚTBOLLabel;
    private JLabel BALONCESTOLabel;
    private JLabel TENISLabel;
    private JLabel imagenLabel;


    public FutbolGUI() {

        // Inserción del icono
        Icon icon = new ImageIcon("src/main/java/images/iconoInicio (4).png");
        imagenLabel.setIcon(icon);


        // Tamaño altura del PanelResto
        PanelResto.setPreferredSize(new Dimension(0, 500));












    }// FIN DEL CONSTRUCOR
}
