package act2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
      
        Socket socket = new Socket("localhost", 3000);
        System.out.println("Je suis connecté au serveur.");

  
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = input.nextInt();
 
        
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(nombre);

  
        DataInputStream in = new DataInputStream(socket.getInputStream());
        int resultat = in.readInt(); 

        System.out.println("Résultat reçu du serveur : " + resultat);
        System.out.println("hello");

        
        in.close();
        out.close();
        socket.close();
    }
}
