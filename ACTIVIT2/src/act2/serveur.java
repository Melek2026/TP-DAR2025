package act2;

import java.io.*;
import java.net.*;

public class serveur {
    public static void main(String[] args) throws IOException {
        // 1. Créer le serveur sur le port 3000
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Serveur en attente de connexion...");

        // 2. Attendre la connexion du client
        Socket socket = serverSocket.accept();
        System.out.println("Un client est connecté.");

        // 3. Lire la valeur envoyée par le client
        DataInputStream in = new DataInputStream(socket.getInputStream());
        int x = in.readInt(); // 🔸 ici on lit un entier complet
        System.out.println("Nombre reçu : " + x);

        // 4. Calculer le résultat
        int res = x * 5;

        // 5. Envoyer le résultat au client
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(res); // 🔸 envoi de l'entier complet
        System.out.println("Résultat envoyé au client.");
        System.out.println("hello");

        // 6. Fermer les flux et le socket
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}
