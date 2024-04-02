package model;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.cloud.FirestoreClient;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;






public class RegisterGUI {


    Firestore firestore;

    public JPanel PanelPrincipal;
    private JPanel PanelPalabras;
    private JLabel registrateLabel;
    private JLabel conTuCuentaManagerLabel;
    private JTextField textFieldUsuario;
    private JTextField textFieldCorreo;
    private JTextField textFieldCotrasena;
    private JPanel PanelDatos;
    private JCheckBox aceptarLasCondicionesYCheckBox;
    private JButton registerButton;
    private JLabel usuarioLabel;
    private JLabel correoElectronicoLabel;
    private JLabel contrasenaLabel;
    private JLabel edadLabel;
    private JComboBox comboEdad;


    public RegisterGUI() {

        // OPCIONES DEL BOTON DE REGISTRARSE
        registerButton.setPreferredSize(new Dimension(200, 30));
        registerButton.setForeground(Color.black);

        // Agregar un MouseAdapter al botón para cambio de color
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar el color del botón al pasar el cursor
                registerButton.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restablecer el color del botón al salir del cursor
                registerButton.setForeground(Color.black);
            }
        });


        // APLICAR ESTILO A TEXTFIELDs DE CORREO Y CONTRASEÑA
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray);

        textFieldUsuario.setBorder(border);
        textFieldCorreo.setBorder(border);
        textFieldCotrasena.setBorder(border);

        // activacion de buttonRegister segun estado de CheckBox
        aceptarLasCondicionesYCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aceptarLasCondicionesYCheckBox.isEnabled()) {
                    // Si el checkbox está seleccionado
                    if (aceptarLasCondicionesYCheckBox.isSelected()) {
                        // Establecemos el estado actual a true
                        registerButton.setEnabled(true);
                    } else {
                        // Establecemos el estado actual a false
                        registerButton.setEnabled(false);
                    }
                }
            }
        });

        /********************************************************************************************************************************/
                                                        // EDAD DE COMBOBOX

        comboEdad.addItem("1-17 años");
        comboEdad.addItem("18-99 años");






        /********************************************************************************************************************************/
                                                // CONEXIÓN CON BASE DE DATOS FIREBASE


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                createConection();

                Map<String, Object> data = new HashMap<>();
                data.put("name", textFieldCorreo.getText());
                data.put("password", textFieldCotrasena.getText());

                insertData("names", data);







                // Mostrar la ventana
                JFrame frame = new JFrame("Liga Manager");
                ImageIcon icon = new ImageIcon("src/main/java/images/iconoAPP.PNG");

                frame.setIconImage(icon.getImage());

                frame.setVisible(true);
                frame.setContentPane(new InicioGUI().PanelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setBounds(500,250,1000,600);
                frame.setVisible(true);
                //Cierra el frame donde esta situado el boton que es pulsado en ese momento
                ((JFrame) SwingUtilities.getWindowAncestor(registerButton)).dispose();
            }
        });











    }// FIN DEL CONSTRUCTOR


    private void createConection() {

        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("liga-manager-24ab5-firebase-adminsdk-s07gw-688099d3ee.json");

            GoogleCredentials googleCredentials = GoogleCredentials.fromStream(inputStream);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(googleCredentials)
                    .build();

            FirebaseApp.initializeApp(options);
            firestore = FirestoreClient.getFirestore();

            System.out.println("Carga json firebase");

        } catch (IOException e) {
            System.out.println("" + e);
        } catch (java.lang.IllegalStateException i) {

        }
    }


    private void insertData(String coleccion,
                            Map<String, Object> data){

        try {
            if (firestore != null){
                DocumentReference docRef = firestore.collection(coleccion).document();
                ApiFuture<WriteResult> result = docRef.set(data);
                System.out.println("" + result.get().getUpdateTime());
            }
        } catch (InterruptedException | ExecutionException e){

        }
    }








}
