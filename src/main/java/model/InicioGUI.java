package model;



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class InicioGUI {




    private String COLORAZULREGISTER = "#3F54F5";
    public JPanel PanelPrincipal;
    private JLabel iconoLabel;
    private JTextField correoElectronicoTextField;
    private JPasswordField contrasenaTextField;
    private JButton iniciarSesionButton;
    private JLabel contrasenaLabel;
    private JLabel correoElectronicoLabel;
    private JTextPane registrarseTextPane;
    private JButton registrarseButton;
    private JLabel iniciaSesionLabel;
    private JLabel managerLabel;
    private JPanel PanelDatos;
    private JPanel PanelBotones;
    private JPanel PanelPalabras;


    public InicioGUI() {

        // Inserción del icono
        Icon icon = new ImageIcon("src/main/java/images/iconoInicio (2).png");
        iconoLabel.setIcon(icon);


        // OPCIONES DEL BOTON DE INICIAR SESIÓN
        iniciarSesionButton.setPreferredSize(new Dimension(200, 30));
        iniciarSesionButton.setForeground(Color.black);

        // Agregar un MouseAdapter al botón para cambio de color
        iniciarSesionButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar el color del botón al pasar el cursor
                iniciarSesionButton.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restablecer el color del botón al salir del cursor
                iniciarSesionButton.setForeground(Color.black);
            }
        });

        // OPCIONES DEL BOTON DE REGISTRARSE
        registrarseButton.setPreferredSize(new Dimension(200, 30));
        registrarseButton.setForeground(Color.black);

        // Agregar un MouseAdapter al botón para cambio de color
        registrarseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar el color del botón al pasar el cursor
                registrarseButton.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restablecer el color del botón al salir del cursor
                registrarseButton.setForeground(Color.black);
            }
        });


        // APLICAR ESTILO A TEXTFIELDs DE CORREO Y CONTRASEÑA
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray);

        correoElectronicoTextField.setBorder(border);
        contrasenaTextField.setBorder(border);


/************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/
/********************************************* ACCIONES DE LOS BOTONES **************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/
/************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/

        // ACCION DE BOTÓN REGISTRAR
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones al hacer clic
                System.out.println("Abriendo pestaña de registro");

                // Descomentar para probar la pestaña de registro

                JFrame frame = new JFrame("RegisterGUI");
                frame.setContentPane(new RegisterGUI().PanelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500, 250, 1000, 600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(registrarseButton)).dispose();
            }
        });


        // ACCION DE BOTÓN DE INICIAR
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                // Acciones al hacer clic
                System.out.println("Abriendo pestaña de inicio de sesion");
                JFrame frame = new JFrame("Liga Manager");
                frame.setContentPane(new PrincipalGUI().PanelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500, 250, 1000, 600);
                frame.setVisible(true);

                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(iniciarSesionButton)).dispose();
            }


        });


    }//FIN CONSTRUCTOR






}









