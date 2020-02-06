package principal;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import controlador.Controlador01Bienvenida;
import vista.Ventana01Bienvenida;

public class Main {

	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		
		Ventana01Bienvenida ventana01 = new Ventana01Bienvenida();
		Controlador01Bienvenida controladorBienvenida = new Controlador01Bienvenida(ventana01);
		ventana01.getFrame().setVisible(true);

	}

}
