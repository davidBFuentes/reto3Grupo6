package controlador;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class controladorCorreo {
	Properties props;
	Session session;
	MimeMessage message;
	Transport t;
	public controladorCorreo() {

	}
	
	public void controladorEnviarCorreo() throws AddressException, MessagingException {
		crearProperties();
		crearSession();
		crearMensaje();
		mandarMensaje();
		
	}
	private void crearProperties() {
		props = new Properties();

		// Nombre del host de correo, es smtp.gmail.com
		props.setProperty("mail.smtp.host", "smtp.gmail.com");

		// TLS si está disponible
		props.setProperty("mail.smtp.starttls.enable", "true");

		// Puerto de gmail para envio de correos
		props.setProperty("mail.smtp.port","587");

		// Nombre del usuario
		props.setProperty("mail.smtp.user", "reto3termibus@gmail.com");

		// Si requiere o no usuario y password para conectarse.
		props.setProperty("mail.smtp.auth", "false");
	}
	
	private void crearSession() {
		session = Session.getDefaultInstance(props);
		//session.setDebug(true);
	}
	
	private void crearMensaje() throws AddressException, MessagingException {
		message = new MimeMessage(session);
		
		// Quien envia el correo
		message.setFrom(new InternetAddress("reto3termibus@gmail.com"));

		// A quien va dirigido
		message.addRecipient(Message.RecipientType.TO, new InternetAddress("villanueva.jon@hotmail.com"));
		
		//Cuerpo del mensaje
		message.setSubject("Hola");
		message.setText("Mensajito con Java Mail" + "de los buenos." + "poque si");
	}
	
	private void mandarMensaje() throws MessagingException {
		t = session.getTransport("smtp");

		//Ahora debemos establecer la conexión, dando el nombre de usuario y password.

		t.connect("reto3termibus@gmail.com","elorrieta");

		//y ahora simplemente enviamos el mensaje

		Transport.send(message,message.getAllRecipients());
		t.close();
	}
}
