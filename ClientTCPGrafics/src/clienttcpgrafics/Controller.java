package clienttcpgrafics;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    Socket clientUno = null;
    int porta = 7777;
    ClientTCP connessione = new ClientTCP();

    String ricevuta;
    String messaggio;

    DataInputStream in;
    DataOutputStream out;
    BufferedReader tastiera;

    String s = "";

    String a[][] = new String[5][3];
    String b[][] = new String[5][3];
    String c[][] = new String[5][3];
    String d[][] = new String[5][3];

    String mail[] = new String[5];

    @FXML
    private TextField unouno;

    @FXML
    private TextField dueuno;

    @FXML
    private TextField unodue;

    @FXML
    private TextField duedue;

    @FXML
    private TextField unotre;

    @FXML
    private TextField duetre;

    @FXML
    private TextField unoquattro;

    @FXML
    private TextField duequattro;

    @FXML
    private TextField unocinque;

    @FXML
    private TextField duecinque;

    @FXML
    private TextField unosei;

    @FXML
    private TextField duesei;
    
    @FXML
    private Button buttonuno;

    @FXML
    private Button buttondue;

    @FXML
    private Button buttontre;

    @FXML
    private Button buttonquattro;

    @FXML
    private Button buttoncinque;


    @FXML
    private TextField visualizzatore;

    @FXML
    void ricevute(ActionEvent event) {
        for (int z = 0; z < 5; z++) {
            mail[z] = a[z][2];
        }

        if (connessione.connetti() == true) {
            connessione.Comunica();
        }

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    s = a[0][0];
                    unouno.setText("gianni");
                    break;
                case 1:
                    s = a[1][0];
                    unodue.setText(s);
                    break;
                case 2:
                    s = a[2][0];
                    unotre.setText(s);
                    break;
                case 3:
                    s = a[3][0];
                    unoquattro.setText(s);
                    break;
                case 4:
                    s = a[4][0];
                    unocinque.setText(s);
                    break;
                case 5:
                    s = a[5][0];
                    unosei.setText(s);
                    break;
            }
        }
        for (int j = 0; j < 5; j++) {

            switch (j) {
                case 0:
                    s = a[0][1];
                    duedue.setText(s);
                    break;
                case 1:
                    s = a[1][1];
                    duedue.setText(s);
                    break;
                case 2:
                    s = a[2][1];
                    duetre.setText(s);
                    break;
                case 3:
                    s = a[3][1];
                    duequattro.setText(s);
                    break;
                case 4:
                    s = a[4][1];
                    duecinque.setText(s);
                    break;
                case 5:
                    s = a[5][1];
                    duesei.setText(s);
                    break;
            }

        }
    }

    @FXML
    void inviate(ActionEvent event) {

        for (int z = 0; z < 5; z++) {
            mail[z] = b[z][2];
        }

        if (connessione.connetti() == true) {
            connessione.Comunica();
        }
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    s = b[0][0];
                    unouno.setText(s);
                    break;
                case 1:
                    s = a[1][0];
                    unodue.setText(s);
                    break;
                case 2:
                    s = a[2][0];
                    unotre.setText(s);
                    break;
                case 3:
                    s = a[3][0];
                    unoquattro.setText(s);
                    break;
                case 4:
                    s = a[4][0];
                    unocinque.setText(s);
                    break;
                case 5:
                    s = a[5][0];
                    unosei.setText(s);
                    break;
            }
        }
        for (int j = 0; j < 5; j++) {

            switch (j) {
                case 0:
                    s = b[0][1];
                    duedue.setText(s);
                    break;
                case 1:
                    s = b[1][1];
                    duedue.setText(s);
                    break;
                case 2:
                    s = b[2][1];
                    duetre.setText(s);
                    break;
                case 3:
                    s = b[3][1];
                    duequattro.setText(s);
                    break;
                case 4:
                    s = b[4][1];
                    duecinque.setText(s);
                    break;
                case 5:
                    s = b[5][1];
                    duesei.setText(s);
                    break;
            }
        }
    }

    @FXML
    void bozze(ActionEvent event) {

        for (int z = 0; z < 5; z++) {
            mail[z] = c[z][2];
        }

        if (connessione.connetti() == true) {
            connessione.Comunica();
        }
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    s = c[0][0];
                    unouno.setText(s);
                    break;
                case 1:
                    s = c[1][0];
                    unodue.setText(s);
                    break;
                case 2:
                    s = c[2][0];
                    unotre.setText(s);
                    break;
                case 3:
                    s = c[3][0];
                    unoquattro.setText(s);
                    break;
                case 4:
                    s = c[4][0];
                    unocinque.setText(s);
                    break;
                case 5:
                    s = c[5][0];
                    unosei.setText(s);
                    break;
            }
        }
        for (int j = 0; j < 5; j++) {

            switch (j) {
                case 0:
                    s = c[0][1];
                    duedue.setText(s);
                    break;
                case 1:
                    s = c[1][1];
                    duedue.setText(s);
                    break;
                case 2:
                    s = c[2][1];
                    duetre.setText(s);
                    break;
                case 3:
                    s = c[3][1];
                    duequattro.setText(s);
                    break;
                case 4:
                    s = c[4][1];
                    duecinque.setText(s);
                    break;
                case 5:
                    s = c[5][1];
                    duesei.setText(s);
                    break;
            }
        }
    }

    @FXML
    void cestino(ActionEvent event) {

        for (int z = 0; z < 5; z++) {
            mail[z] = d[z][2];
        }

        if (connessione.connetti() == true) {
            connessione.Comunica();
        }
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    s = d[0][0];
                    unouno.setText(s);
                    break;
                case 1:
                    s = d[1][0];
                    unodue.setText(s);
                    break;
                case 2:
                    s = d[2][0];
                    unotre.setText(s);
                    break;
                case 3:
                    s = d[3][0];
                    unoquattro.setText(s);
                    break;
                case 4:
                    s = d[4][0];
                    unocinque.setText(s);
                    break;
                case 5:
                    s = d[5][0];
                    unosei.setText(s);
                    break;
            }
        }
        for (int j = 0; j < 5; j++) {

            switch (j) {
                case 0:
                    s = d[0][1];
                    duedue.setText(s);
                    break;
                case 1:
                    s = d[1][1];
                    duedue.setText(s);
                    break;
                case 2:
                    s = d[2][1];
                    duetre.setText(s);
                    break;
                case 3:
                    s = d[3][1];
                    duequattro.setText(s);
                    break;
                case 4:
                    s = d[4][1];
                    duecinque.setText(s);
                    break;
                case 5:
                    s = d[5][1];
                    duesei.setText(s);
                    break;
            }
        }
    }

    @FXML
    void bottonuno(ActionEvent event) {
        visualizzatore.setText("meme");
    }

    @FXML
    void bottondue(ActionEvent event) {
        visualizzatore.setText(mail[1]);
    }

    @FXML
    void bottontre(ActionEvent event) {
        visualizzatore.setText(mail[2]);
    }

    @FXML
    void bottonquattro(ActionEvent event) {
        visualizzatore.setText(mail[3]);
    }

    @FXML
    void bottoncinque(ActionEvent event) {
        visualizzatore.setText(mail[4]);
    }

    @FXML
    void bottonsei(ActionEvent event) {
        visualizzatore.setText(mail[5]);
    }
    

    class ClientTCP {

        public void Comunica() {
            try {

                tastiera = new BufferedReader(new InputStreamReader(System.in));
                messaggio = tastiera.readLine();
                out.writeBytes(messaggio + "\n");
                ricevuta = in.readLine();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        public boolean connetti() {
            try {

                clientUno = new Socket(InetAddress.getLocalHost(), porta);

                in = new DataInputStream(clientUno.getInputStream());
                out = new DataOutputStream(clientUno.getOutputStream());
                return true;

            } catch (ConnectException connExc) {
                return false;
            } catch (Exception e) {
                return false;
            }
        }
    }
}
