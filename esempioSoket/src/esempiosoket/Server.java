package esempiosoket;

import java.io.*;
import java.net.*;

public class Server {

    ServerSocket myServer = null;
    Socket socketClient = null;

    int porta = 7777;
    String letto;

    DataInputStream in;
    DataOutputStream out;

    public void Comunica() {
        try {

            System.out.println("Aspetto un messaggio dal client...");
            letto = in.readLine();
            System.out.println("Messaggio ricevuto correttamente");

            if("meme".equals(letto)) {
                    letto = "Sei un memino";
                    System.out.println("Sei un memino");
            }else{
                if("errore qualsiasi".equals(letto)) {
                    letto = "Non fotti con me bro";
                    System.out.println("Non fotti con me bro");
                }
            else {
                letto = "Questo server è inutile cosa pensavi di fare \nConnessione terminata";
                System.out.println("Questo server è inutile cosa pensavi di fare \nConnessione terminata");
            }

            out.writeBytes(letto + "\n");
            System.out.println("Il server risponde: " + letto);
            socketClient.close();
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Errore nella trasmissione");
        }
    }

    public void attendi() {
        try {

            System.out.println("Inizializzo il soket...");
            myServer = new ServerSocket(porta);

            System.out.println("La porta " + porta + " è in attesa per una connessione");
            socketClient = myServer.accept();
            System.out.println("Connessione stabilita");

            myServer.close();

            in = new DataInputStream(socketClient.getInputStream());
            out = new DataOutputStream(socketClient.getOutputStream());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server s = new Server();
        s.attendi();
        s.Comunica();
    }
}
