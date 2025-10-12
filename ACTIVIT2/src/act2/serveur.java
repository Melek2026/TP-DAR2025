package act2;

import java.io.*;
import java.net.*;

public class serveur {
    public static void main(String[] args) throws IOException {
       
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Serveur en attente de connexion...");

       
        Socket socket = serverSocket.accept();
        System.out.println("Un client est connecté.");

      
        DataInputStream in = new DataInputStream(socket.getInputStream());
        int x = in.readInt(); 
        System.out.println("Nombre reçu : " + x);

        
        int res = x * 5;

     
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(res); 
        System.out.println("Résultat envoyé au client.");
        System.out.println("hello");

       
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}
