package clienttcp;

import java.io.*;
import java.net.*;

class ClientTCP {

    Socket clientUno = null;
    int porta = 7777;
    
    DataInputStream in;
    DataOutputStream out;
    BufferedReader tastiera;

    public void Comunica() {
        try {

            tastiera = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Messaggio da inviare al server: ");
            String messaggio = tastiera.readLine();
            System.out.println("Invio: " + messaggio);
            out.writeBytes(messaggio + "\n");
            System.out.println("In attesa della risposta del server...");
            String ricevuta = in.readLine();
            System.out.println("Risposta del server: " + ricevuta);
            System.out.println("Connessione termintata");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public boolean connetti() {
        try {

            System.out.println("Test di connessione...");

            clientUno = new Socket(InetAddress.getLocalHost(), porta);
            System.out.println("Connessione stabilita sulla porta " + porta);

            in = new DataInputStream(clientUno.getInputStream());
            out = new DataOutputStream(clientUno.getOutputStream());
            return true;

        } catch (ConnectException connExc) {
            System.err.println("Host non trovato");
            return false;
        } catch (Exception e) {
            System.err.println("Connessione non riuscita");
            return false;
        }
}

    public static void main(String[] args) {
        ClientTCP c = new ClientTCP();
        if(c.connetti()==true){
            c.Comunica();
        }
    }
}
