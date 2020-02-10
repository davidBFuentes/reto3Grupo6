package principal;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import controlador.Controlador01Bienvenida;
import vista.Ventana01Bienvenida;

public class Main {

	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		
		// Se crea la primera ventana.
		
		Ventana01Bienvenida ventana = new Ventana01Bienvenida();
		
		// Se crea el controlador de la primera ventana y se le mandan sus elementos.
		
		@SuppressWarnings("unused")
		Controlador01Bienvenida controlador = new Controlador01Bienvenida(ventana);
		
		// Se muestra el frame de la primera ventana.
		
		ventana.frame.setVisible(true);
		
	}

}
