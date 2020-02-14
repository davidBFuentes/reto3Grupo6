package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import metodosDAO.ClienteDAO;
import modelo.Billete;
import modelo.Cliente;
import vista.Ventana02Login;
import vista.Ventana03Registro;
import vista.Ventana04Trayectos;

/**
 * Clase Controlador02Login, gestiona el funcionamiento de la Ventana02Login
 *
 */
public class Controlador02Login implements KeyListener, MouseListener {
	
	// Atributo del constructor.
	
	private Ventana02Login ventanalogin;
	
	/**
	 * Constructor del controlador, que recibe los elementos de la ventana.
	 * @param pVentana02
	 */
	
	public Controlador02Login (Ventana02Login pVentana02) {
		
		this.ventanalogin = pVentana02;
		mInicializarControlador();
		
	}
	
	/**
	 * Metodo que a�ade listeners a los botones y les da nombre para identificarlos.
	 */
	
	private void mInicializarControlador () {
		
		this.ventanalogin.getbIdentificarse().addMouseListener(this);
		this.ventanalogin.getbIdentificarse().setName("Identificarse");
		this.ventanalogin.getbOmitir().addMouseListener(this);
		this.ventanalogin.getbOmitir().setName("Omitir");
		this.ventanalogin.getbRegistrarse().addMouseListener(this);
		this.ventanalogin.getbRegistrarse().setName("Registrarse");
		this.ventanalogin.getTxtDni().addKeyListener(this);
		this.ventanalogin.getTxtDni().setName("dni");
		this.ventanalogin.getTxtContrasena().addKeyListener(this);
		this.ventanalogin.getTxtContrasena().setName("pass");
					
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		/**
		 * Metodo que detecta la pulsacion de las teclas para que los campos tengan l�mite de car�cteres introducidos.
		 */
		
		e.getComponent().getName();
		
		switch (e.getComponent().getName()) {
		case "dni":
			if(this.ventanalogin.getTxtDni().getText().length()>8) {  
				   e.consume();
				 }
			break;

		case "pass":
			if(String.valueOf(this.ventanalogin.getTxtContrasena().getPassword()).length()>12) {  
				   e.consume();
				 }
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Metodo que controla las acciones de los botones
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		// Switch que diferencia las acciones dependiendo del bot�n que se pulse.
		
		switch (e.getComponent().getName()) {
		
		// Acciones del bot�n de identificarse.
		
		case "Identificarse":
			
				// Condiciones para que la identificaci�n del usuario se realice, si no se cumplen se muestran
				// al usuario mensajes . Las primera es que los campos no est�n vac�os.
			
				ValidadorDni dni = new ValidadorDni(this.ventanalogin.getTxtDni().getText());
				String.valueOf(this.ventanalogin.getTxtContrasena().getPassword().length);
			
				if (this.ventanalogin.getTxtDni().getText().length() == 0 || String.valueOf(this.ventanalogin.getTxtContrasena().getPassword()).length() == 0) {
					JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				
				// La segunda condici�n es que el Dni sea v�lido. Para ello se llama al m�todo de la clase que valida el Dni con el objeto dni que acabamos de
				// crear a partir del texto del campo. El m�todo devuelve un boolean.
							
				} else if (dni.validar() == false){
					JOptionPane.showMessageDialog(null, "Introduzca un DNI v�lido", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				
				} else {
					
					// Si los campos son correctos se crea un objeto cliente y se llama al m�todo DAO mand�ndole el dni y la contrase�a codificada. El m�todo rellena los atributos
					// del objeto con los datos de la fila de la tabla que coinciden con el dni y la contrase�a mandados. Si ninguno coincide los atributos ser�n null.
					
					Cliente cliente = new Cliente();
					cliente = ClienteDAO.mIdentificarCliente(this.ventanalogin.getTxtDni().getText(), Codificacion.md5(String.valueOf(this.ventanalogin.getTxtContrasena().getPassword())));
					
					// Si el atributo Dni del cliente no es null significa que el m�todo DAO ha recogido el DNI de la base de datos, con lo que la identificaci�n del cliente se ha realizado
					// con �xito. Se informa al cliente con un mensaje, se crea el objeto billete, se empieza a rellenar con atributos, se lanza la ventana trayectos con su controlador y se
					// cierra la actual ventana. 
					
					if (cliente.getDni() != null) {
				
							Billete billete = new Billete();
							billete.setDni(cliente.getDni());
							if (cliente.getSexo().contentEquals("V")) {
								JOptionPane.showMessageDialog(null, "Bienvenido, "+ cliente.getNombre(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null, "Bienvenida, "+ cliente.getNombre(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);

							}
							Ventana04Trayectos window4 = new Ventana04Trayectos();
							@SuppressWarnings("unused")
							Controlador04Trayectos controlador = new Controlador04Trayectos(window4, billete, cliente);
							window4.getFrame().setVisible(true);
							this.ventanalogin.getLogin().dispose();
							
						// Si el atributo es null significa que el m�todo DAO no ha encontrado ninguna coincidencia en la base de datos. Se muestra un 
						// mensaje al usuario inform�ndole de que los datos son incorrectos.
							
						} else {
							
							JOptionPane.showMessageDialog(null, "Datos incorrectos", "Mensaje", JOptionPane.ERROR_MESSAGE);
						}
				
				}
				
				break;
				
				
		case "Omitir":
				Cliente cliente1 = new Cliente();
				Ventana04Trayectos window4 = new Ventana04Trayectos();
				Billete billete = new Billete();
				@SuppressWarnings("unused") Controlador04Trayectos controlador = new Controlador04Trayectos(window4, billete, cliente1);
				window4.getFrame().setVisible(true);
				this.ventanalogin.getLogin().dispose();
				break;
				
		// Acciones para el bot�n de registro. Se lanza la ventana de registro con su controlador y se cierra la actual.
				
		case "Registrarse":
			
				Ventana03Registro window3 = new Ventana03Registro();
				@SuppressWarnings("unused") Controlador03Registro cRegistro = new Controlador03Registro(window3);
				window3.getFrame().setVisible(true);	
				this.ventanalogin.getLogin().dispose();
				break;
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
