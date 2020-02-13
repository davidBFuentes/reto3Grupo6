package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import metodosDAO.ClienteDAO;
import modelo.Billete;
import modelo.Cliente;
import vista.Ventana01Bienvenida;
import vista.Ventana03Registro;
import vista.Ventana04Trayectos;

public class Controlador03Registro implements MouseListener, KeyListener {
	
	// Atributo del constructor.

	private Ventana03Registro ventana03registro;
	
	/**
	 * Constructor del controlador, que recibe los elementos de la ventana.
	 * @param pVentana02
	 */
	public Controlador03Registro(Ventana03Registro pVentana02) {

		this.ventana03registro = pVentana02;
		mInicializarControlador();
	}
	
	/**
	 *  Método que añade los listeners a los botones y les da nombre para identificarlos.
	 */
	
	private void mInicializarControlador() {

		this.ventana03registro.getBtnSalir().addMouseListener(this);
		this.ventana03registro.getBtnSalir().setName("Salir");
		this.ventana03registro.getBtnRegistrarse().addMouseListener(this);
		this.ventana03registro.getBtnRegistrarse().setName("Registrarse");
		this.ventana03registro.getTxtDni().addKeyListener(this);
		this.ventana03registro.getTxtDni().setName("Dni");
		this.ventana03registro.getTxtNombre().addKeyListener(this);
		this.ventana03registro.getTxtNombre().setName("Nombre");
		this.ventana03registro.getTxtApellido().addKeyListener(this);
		this.ventana03registro.getTxtApellido().setName("Apellido");
		this.ventana03registro.getPassContrasena().addKeyListener(this);
		this.ventana03registro.getPassContrasena().setName("Pass");
		this.ventana03registro.getPassContrasena2().addKeyListener(this);
		this.ventana03registro.getPassContrasena2().setName("Pass2");
		this.ventana03registro.getTxtFechaNacimiento().addKeyListener(this);
		this.ventana03registro.getTxtFechaNacimiento().setName("Nacimiento");
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		// Acciones de los distintos botones
		
		switch (e.getComponent().getName()) {
		
		// Acciones del botón de salir. Carga la primera ventana con su controlador, la muestra y cierra la actual.

		case "Salir":
			Ventana01Bienvenida window = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
			window.getFrame().setVisible(true);
			this.ventana03registro.getFrame().dispose();

			break;
			
		// Acciones del botón de registro. Antes de hacer comprobaciones crea un objeto dni con el constructor del validador
		// para validarlo después.

		case "Registrarse":
			
			ValidadorDni dni = new ValidadorDni(this.ventana03registro.getTxtDni().getText());
			
			// Para que el registro se realice ningún campo tiene que estar vacío y el Dni ha de ser válido
			
			if (this.ventana03registro.getTxtDni().getText().length() != 0
			&& this.ventana03registro.getTxtNombre().getText().length() != 0
			&& this.ventana03registro.getTxtApellido().getText().length() != 0
			&& String.valueOf(this.ventana03registro.getPassContrasena().getPassword()).length() != 0
			&& String.valueOf(this.ventana03registro.getPassContrasena2().getPassword()).length() != 0
			&& this.ventana03registro.getTxtFechaNacimiento().getText().length() != 0 
			&& (this.ventana03registro.getCheckHombre().isSelected()
			|| this.ventana03registro.getCheckMujer().isSelected())
			&& this.ventana03registro.getTxtDni().getText().length() == 9
			&& String.valueOf(this.ventana03registro.getPassContrasena().getPassword()).equals
			(String.valueOf(this.ventana03registro.getPassContrasena2().getPassword()))
			&& dni.validar()
			&& validarFecha(this.ventana03registro.getTxtFechaNacimiento().getText())) {
				   
				// Si las condiciones se cumplen se crea un objeto cliente con la información introducida por el usuario y se registra en la base de datos
				
					Cliente cliente;
	
					if (this.ventana03registro.getCheckHombre().isSelected()) {
						cliente = new Cliente(this.ventana03registro.getTxtDni().getText(),
								this.ventana03registro.getTxtNombre().getText(),
								this.ventana03registro.getTxtApellido().getText(), this.ventana03registro.getTxtFechaNacimiento().getText(), "V",
								String.valueOf(this.ventana03registro.getPassContrasena().getPassword()));
	
					} else {
						cliente = new Cliente(this.ventana03registro.getTxtDni().getText(),
								this.ventana03registro.getTxtNombre().getText(),
								this.ventana03registro.getTxtApellido().getText(), this.ventana03registro.getTxtFechaNacimiento().getText(), "M", 
								String.valueOf(this.ventana03registro.getPassContrasena().getPassword()));
					}
	
					if (ClienteDAO.mRegistrarCliente(cliente)) {
						
						JOptionPane.showMessageDialog(null, "Registro realizado  con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
						Billete billete = new Billete();
						billete.setDni(cliente.getDni());
						Ventana04Trayectos window1 = new Ventana04Trayectos();
						@SuppressWarnings("unused")
						Controlador04Trayectos controlador = new Controlador04Trayectos(window1, billete, cliente);
						window1.getFrame().setVisible(true);
						this.ventana03registro.getFrame().dispose();
					}
					
			// En el caso de que no se pueda realizar el registro los siguientes ifs dan distintos mensajes de error
			// dependiendo de la razón
					
			} else {
				
				if (this.ventana03registro.getTxtDni().getText().length() == 0
					|| this.ventana03registro.getTxtNombre().getText().length() == 0
					|| this.ventana03registro.getTxtApellido().getText().length() == 0
					|| String.valueOf(this.ventana03registro.getPassContrasena().getPassword()).length() == 0
					|| String.valueOf(this.ventana03registro.getPassContrasena2().getPassword()).length() == 0
					|| this.ventana03registro.getTxtFechaNacimiento().getText().length() == 0 
					|| (!this.ventana03registro.getCheckHombre().isSelected()
					&&  !this.ventana03registro.getCheckMujer().isSelected())) {
					
					JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);
					
				} if (!dni.validar()) {
					JOptionPane.showMessageDialog(null, "No ha introducido un DNI válido", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);
					
				} if (!String.valueOf(this.ventana03registro.getPassContrasena().getPassword())
						.equals(String.valueOf(this.ventana03registro.getPassContrasena2().getPassword()))) {
					JOptionPane.showMessageDialog(null, "No ha repetido la contraseña", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);

				} if (!validarFecha(this.ventana03registro.getTxtFechaNacimiento().getText())) {
					JOptionPane.showMessageDialog(null, "Formato de fecha inválido, ha de ser aaaa/mm/dd", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);
				}
		
			}
	
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		// Cada vez que se pulsa una tecla hay que pasar por este switch. Si el campo de texto tiene ya una cantidad de carácteres
		// determinada, la acción se descarta. De esta manera se limita la cantidad de texto que se puede escribir en un campo.
		
		e.getComponent().getName();
		
		switch (e.getComponent().getName()) {
		case "Dni":
			if(this.ventana03registro.getTxtDni().getText().length()>8) {  
				   e.consume();
				 }
			break;

		case "Nombre":
			 if(this.ventana03registro.getTxtNombre().getText().length()>12) {  
				   e.consume();
				 }
			break;
			
		case "Apellido":
			if(this.ventana03registro.getTxtApellido().getText().length()>12) {  
				   e.consume();
				 }
			break;
			
		case "Pass":
			if(String.valueOf(this.ventana03registro.getPassContrasena().getPassword()).length()>12) {  
				   e.consume();
				 }
			break;
			
		case "Pass2":
			if(String.valueOf(this.ventana03registro.getPassContrasena2().getPassword()).length()>12) {  
				   e.consume();
				 }
			break;
			
		case "Nacimiento":
			if(this.ventana03registro.getTxtFechaNacimiento().getText().length()>10) {  
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
	 *  Método que valida si la fecha introducida tiene formato correcto.
	 * @param fecha
	 * @return
	 */
	
	public static boolean validarFecha(String fecha) {
		
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
		
}