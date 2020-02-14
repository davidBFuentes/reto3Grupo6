package controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Billete;

public class Fichero {
	
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
			texto = "Código Billete: " + String.valueOf(billete.getCod_Billete()) + "\n" +
			"Código Linea: " + billete.getCod_Linea() + "\n" +
			"Código de autobús: " + billete.getCod_Bus() + "\n" +
			"Código de la parada de origen: " + billete.getCod_Parada_Inicio() + "\n" +
			"Parada de origen: " + billete.getNombre_Parada_Origen() + "\n" +
			"Código de la parada de destino: " + billete.getCod_Parada_Fin() + "\n" +
			"Parada de destino: " + billete.getNombre_Parada_Destino() + "\n" +
			"Fecha: " + billete.getFecha() + "\n" +
			"Hora: " + billete.getHora() + "\n" +
			"DNI: " + billete.getDni() + "\n" +
			"Precio: " + String.valueOf(billete.getPrecio()) + " € \n" +
			"\n" +
			"Código Billete: " + String.valueOf(billete2.getCod_Billete()) + "\n" +
			"Código Linea: " + billete2.getCod_Linea() + "\n" +
			"Código de autobús: " + billete2.getCod_Bus() + "\n" +
			"Código de la parada de origen: " + billete2.getCod_Parada_Inicio() + "\n" +
			"Parada de origen: " + billete2.getNombre_Parada_Origen() + "\n" +
			"Código de la parada de destino: " + billete2.getCod_Parada_Fin() + "\n" +
			"Parada de destino: " + billete2.getNombre_Parada_Destino() + "\n" +
			"Fecha: " + billete2.getFecha() + "\n" +
			"Hora: " + billete2.getHora() + "\n" +
			"DNI: " + billete2.getDni() + "\n" +
			"Precio: " + String.valueOf(billete2.getPrecio() + "€");
			
		} else {
			
			texto = "Código Billete: " + String.valueOf(billete.getCod_Billete()) + "\n" +
			"Código Linea: " + billete.getCod_Linea() + "\n" +
			"Código de autobús: " + billete.getCod_Bus() + "\n" +
			"Código de la parada de origen: " + billete.getCod_Parada_Inicio() + "\n" +
			"Parada de origen: " + billete.getNombre_Parada_Origen() + "\n" +
			"Código de la parada de destino: " + billete.getCod_Parada_Fin() + "\n" +
			"Parada de destino: " + billete.getNombre_Parada_Destino() + "\n" +
			"Fecha: " + billete.getFecha() + "\n" +
			"Hora: " + billete.getHora() + "\n" +
			"DNI: " + billete.getDni() + "\n" +
			"Precio: " + String.valueOf(billete.getPrecio() + "€");
			
		}
		
		return texto;
		
	}

}
