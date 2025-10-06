package act2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        // 1. Connexion au serveur
        Socket socket = new Socket("localhost", 3000);
        System.out.println("Je suis connecté au serveur.");

        // 2. Demander un nombre à l'utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = input.nextInt();
 
        // 3. Envoyer le nombre au serveur
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(nombre); // 🔸 envoi de l'entier complet

        // 4. Recevoir le résultat du serveur
        DataInputStream in = new DataInputStream(socket.getInputStream());
        int resultat = in.readInt(); // 🔸 lecture correcte d’un entier

        System.out.println("Résultat reçu du serveur : " + resultat);
        System.out.println("hello");

        // 5. Fermer les flux
        in.close();
        out.close();
        socket.close();
    }
}
