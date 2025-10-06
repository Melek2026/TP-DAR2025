package tpb;
import java.io.*;
import java.net.*;
public class servuer {

	public static void main(String[] args) throws IOException {
		/*1éré étape création de l'objet ServerSoket */
		ServerSocket Soketserveur=new ServerSocket(3000);
		System.out.println("le servuer attend a la connexion d'un client");
		/*2 éme étape :attendre la connexion du client*/
		Socket socket =Soketserveur.accept();
		System.out.println("un client est connecté");
		/*prendre la main pur lire de flux de communication*/
		InputStream is=socket.getInputStream();
		int nb=is.read();
		
		int x=nb*2;
		System.out.println(x);
		OutputStream out=socket.getOutputStream();
		out.write(x);

	}

}
