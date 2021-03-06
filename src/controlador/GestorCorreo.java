package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import modelo.Billete;

public class GestorCorreo {
	
	/**
	 * Metodo que recibe la direccion de correo electronico y los billetes a mandar. Llama al metodo enviarConGmail y envia el correo
	 * @param correoElectronico
	 * @param billete
	 * @param billete2
	 * @throws AddressException
	 */
	public static void enviarCorreo(String correoElectronico, Billete billete, Billete billete2) throws AddressException {
		
		System.out.println(correoElectronico);
		//String destinatarioString =  "emailPrueba@server.com"; //A quien le quieres escribir.
		
		InternetAddress destinatario = new InternetAddress(correoElectronico);
	    String asunto = "No reply - " + "Billete n�" + billete.getCod_Billete();
	    if (billete2.getCod_Billete() != 0) {
	    	 asunto = "No reply - " + "Billete n�" + billete.getCod_Billete() + " y  billete n�" + billete2.getCod_Billete();
	    }
	    String cuerpo = Fichero.toString(billete, billete2);

	    enviarConGMail(destinatario, asunto, cuerpo);
		
	}
	
	/**
	 * Metodo que configura las opciones para enviar el correo
	 * @param destinatario
	 * @param asunto
	 * @param cuerpo
	 */
	public static void enviarConGMail(InternetAddress destinatario, String asunto, String cuerpo) {
	    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente tambi�n.
		
		File archivoConexion = new File("datosconexion.txt");
		Scanner lector;
		String remitente = "";
		String password = "";
		
		try {
			lector = new Scanner(archivoConexion);
			lector.nextLine();
			lector.nextLine();
			remitente = lector.nextLine();
			password = lector.nextLine();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	    // String remitente = "reto3termibus@gmail.com";  //Para la direcci�n nomcuenta@gmail.com

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.clave", password);    //La clave de la cuenta
	    props.put("mail.smtp.auth", "true");    //Usar autenticaci�n mediante usuario y clave
	    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
	    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);

	    try {
	        message.setFrom(new InternetAddress(remitente));
			message.addRecipient(Message.RecipientType.TO, destinatario);
	        message.setSubject(asunto);
	        message.setText(cuerpo);
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", remitente, "elorrieta");
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();   //Si se produce un error
	    }
	}
	
	/**
	 * Metodo que valida si el correo introducido es correcto
	 * @param pEmail
	 * @return
	 */
	public static boolean validarEmail(String pEmail) {
		   // Patr�n para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = pEmail;

        Matcher matcher = pattern.matcher(email);

        if (matcher.find() == true) {
            System.out.println("El email ingresado es v�lido.");
            return true;
        } else {
            System.out.println("El email ingresado es inv�lido.");
            return false;
        }
	}
}
