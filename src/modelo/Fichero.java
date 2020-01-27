package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Fichero {
	
	public static void mCrearFichero (String dni, String contrasena) throws IOException {
		
		
		
		File datos = new File ("datos.txt");
		
		if (datos.exists()) {	
			FileWriter escritura = new FileWriter("datos.txt", true);	
			escritura.write(dni + " " + contrasena + "\n");	
			escritura.close();
			
		} else {
			datos.createNewFile();
			FileWriter escritura = new FileWriter("datos.txt");
			escritura.write(dni + " " + contrasena + "\n");	
			escritura.close();
			
		}	
		
	}
	
	public static boolean mComprobarFichero (String dni, String contrasena) throws FileNotFoundException {
		
		
		boolean login = false;
		File datos = new File ("datos.txt");
		String texto = dni + " " + contrasena;
		Scanner lector = new Scanner(datos);

		while (lector.hasNextLine()) {
			
			if (texto.equals(lector.nextLine())){
				login = true;
				
			}
		}
		
		lector.close();
		return login;
		
		
	}

}
