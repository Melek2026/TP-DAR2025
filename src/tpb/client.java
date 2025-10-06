package tpb;
import java.io.*;
import java.net.*;
public class client {

	public static void main(String[] args) throws  IOException {
		/*1éré étape création de l'objet Soket */
		Socket socket=new Socket("localhost",3000);
		System.out.println("je suis connecté");
		

	}

}
