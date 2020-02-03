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
	
	public static void mImprimirBillete (Billete billete, Billete billete2) throws IOException {
		
		File ficheroBillete = new File ("billete.txt");
		
		if (ficheroBillete.exists()) {	
			FileWriter escritura = new FileWriter("billete.txt");	
			escritura.write(toString(billete, billete2));	
			escritura.close();
			
		} else {
			ficheroBillete.createNewFile();
			FileWriter escritura = new FileWriter("billete.txt");
			escritura.write(toString(billete, billete2));	
			escritura.close();
			
		}	
		
		
	}
	
	public static String toString (Billete billete, Billete billete2) {
		
		String texto = "";
		
		if (billete2.getCod_Billete() != 0) {
			texto = "Código Billete: " + String.valueOf(billete.getCod_Billete()) + "\n " +
			"Código Linea: " + billete.getCod_Linea() + "\n" +
			"Código de autobús: " + billete.getCod_Bus() + "\n" +
			"Código de la parada de origen: " + billete.getCod_Parada_Inicio() + "\n" +
			"Parada de origen: " + billete.getNombre_Parada_Origen() + "\n" +
			"Código de la parada de destino: " + billete.getCod_Parada_Fin() + "\n" +
			"Parada de destino: " + billete.getNombre_Parada_Destino() + "\n" +
			"Fecha: " + billete.getFecha() + "\n" +
			"Hora: " + billete.getHora() + "\n" +
			"DNI: " + billete.getDni() + "\n" +
			"Precio: " + String.valueOf(billete.getPrecio()) + "\n" +
			"\n" +
			"Código Billete: " + String.valueOf(billete2.getCod_Billete()) + "\n " +
			"Código Linea: " + billete2.getCod_Linea() + "\n" +
			"Código de autobús: " + billete2.getCod_Bus() + "\n" +
			"Código de la parada de origen: " + billete2.getCod_Parada_Inicio() + "\n" +
			"Parada de origen: " + billete2.getNombre_Parada_Origen() + "\n" +
			"Código de la parada de destino: " + billete2.getCod_Parada_Fin() + "\n" +
			"Parada de destino: " + billete2.getNombre_Parada_Destino() + "\n" +
			"Fecha: " + billete2.getFecha() + "\n" +
			"Hora: " + billete2.getHora() + "\n" +
			"DNI: " + billete2.getDni() + "\n" +
			"Precio: " + String.valueOf(billete2.getPrecio());
			
		} else {
			
			texto = "Código Billete: " + String.valueOf(billete.getCod_Billete()) + "\n " +
			"Código Linea: " + billete.getCod_Linea() + "\n" +
			"Código de autobús: " + billete.getCod_Bus() + "\n" +
			"Código de la parada de origen: " + billete.getCod_Parada_Inicio() + "\n" +
			"Parada de origen: " + billete.getNombre_Parada_Origen() + "\n" +
			"Código de la parada de destino: " + billete.getCod_Parada_Fin() + "\n" +
			"Parada de destino: " + billete.getNombre_Parada_Destino() + "\n" +
			"Fecha: " + billete.getFecha() + "\n" +
			"Hora: " + billete.getHora() + "\n" +
			"DNI: " + billete.getDni() + "\n" +
			"Precio: " + String.valueOf(billete.getPrecio());
			
		}
		
		return texto;
		
	}

}
