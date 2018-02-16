import java.io.*;
import java.net.*;

class Client {

    Socket clientUno = null;
    int porta = 5000;
    DataInputStream in;
    DataOutputStream out;

    public Socket connetti() {

        System.out.println("Test di connessione...");
        try {
            clientUno = new Socket(InetAddress.getLocalHost(), porta);
            System.out.println("Connessione stabilita sulla porta " + porta);

            in = new DataInputStream(clientUno.getInputStream());
            out = new DataOutputStream(clientUno.getOutputStream());

        } catch (ConnectException connExc) {
            System.err.println("Host non trovato");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return clientUno;
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.connetti();
    }
}
