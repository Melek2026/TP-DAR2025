package tpb;
import java.io.*;
import java.net.*;
public class client {

	public static void main(String[] args) throws  IOException {
		/*1éré étape création de l'objet Soket */
		Socket socket=new Socket("0.0.0.0",3000);
		/*le moment ou le client connecte au serveur*/
		System.out.println("je suis connecté");
		System.out.println("test");
		System.out.println("aloo");		
	
	
		
	}

}
