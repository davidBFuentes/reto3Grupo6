package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import metodosDAO.ClienteDAO;
import modelo.Billete;
import modelo.Cliente;
import modelo.Fichero;
import vista.Ventana01Bienvenida;
import vista.Ventana03Registro;
import vista.Ventana04Trayectos;

public class Controlador03Registro implements MouseListener, KeyListener {

	private Ventana03Registro ventana03registro;

	public Controlador03Registro(Ventana03Registro pVentana02) {

		this.ventana03registro = pVentana02;
		mInicializarControlador();
	}

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

		switch (e.getComponent().getName()) {

		case "Salir":
			Ventana01Bienvenida window = new Ventana01Bienvenida();
			Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
			window.getFrame().setVisible(true);
			this.ventana03registro.getFrame().dispose();

			break;

		case "Registrarse":
			
			if (this.ventana03registro.getTxtDni().getText().length() != 0
					&& this.ventana03registro.getTxtNombre().getText().length() != 0
					&& this.ventana03registro.getTxtApellido().getText().length() != 0
					&& this.ventana03registro.getPassContrasena().getText().length() != 0
					&& this.ventana03registro.getPassContrasena2().getText().length() != 0
					&& this.ventana03registro.getTxtFechaNacimiento().getText().length() != 0 
					&& (this.ventana03registro.getCheckHombre().isSelected()
					|| this.ventana03registro.getCheckMujer().isSelected())
					&& this.ventana03registro.getTxtDni().getText().length() == 9
					&& this.ventana03registro.getPassContrasena().getText().equals
					(this.ventana03registro.getPassContrasena2().getText())
					&& validarFecha(this.ventana03registro.getTxtFechaNacimiento().getText()) == true) {
				
					Cliente cliente;
	
					if (this.ventana03registro.getCheckHombre().isSelected()) {
						cliente = new Cliente(this.ventana03registro.getTxtDni().getText(),
								this.ventana03registro.getTxtNombre().getText(),
								this.ventana03registro.getTxtApellido().getText(), this.ventana03registro.getTxtFechaNacimiento().getText(), "V", this.ventana03registro.getPassContrasena().getText());
	
					} else {
						cliente = new Cliente(this.ventana03registro.getTxtDni().getText(),
								this.ventana03registro.getTxtNombre().getText(),
								this.ventana03registro.getTxtApellido().getText(), this.ventana03registro.getTxtFechaNacimiento().getText(), "M", this.ventana03registro.getPassContrasena().getText());
					}
	
					if (ClienteDAO.mRegistrarCliente(cliente)) {
	
						try {
							Fichero.mCrearFichero(cliente.getDni(),
									cliente.getContrasena());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						JOptionPane.showMessageDialog(null, "Registro realizado  con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
						Billete billete = new Billete();
						billete.setDni(cliente.getDni());
						Ventana04Trayectos window1 = new Ventana04Trayectos();
						Controlador04Trayectos controlador = new Controlador04Trayectos(window1, billete, cliente);
						window1.getFrame().setVisible(true);
						this.ventana03registro.getFrame().dispose();
					}
					

			} else {
				
				if (this.ventana03registro.getTxtDni().getText().length() == 0
					|| this.ventana03registro.getTxtNombre().getText().length() == 0
					|| this.ventana03registro.getTxtApellido().getText().length() == 0
					|| this.ventana03registro.getPassContrasena().getText().length() == 0
					|| this.ventana03registro.getPassContrasena2().getText().length() == 0
					|| this.ventana03registro.getTxtFechaNacimiento().getText().length() == 0 
					|| (!this.ventana03registro.getCheckHombre().isSelected()
					&&  !this.ventana03registro.getCheckMujer().isSelected())) {
					
					JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);
					
				} if (this.ventana03registro.getTxtDni().getText().length() < 9) {
					JOptionPane.showMessageDialog(null, "No ha introducido un DNI válido", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);
					
				} if (!this.ventana03registro.getPassContrasena().getText()
						.equals(this.ventana03registro.getPassContrasena2().getText())) {
					JOptionPane.showMessageDialog(null, "No ha repetido la contraseña", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);

				} if (validarFecha(this.ventana03registro.getTxtFechaNacimiento().getText()) == false) {
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
		
		e.getComponent().getName();
		
		switch (e.getComponent().getName()) {
		case "Dni":
			if(this.ventana03registro.getTxtDni().getText().length()>8) {  
				   e.consume();
				 }
			break;

		case "Nombre":
			 if(this.ventana03registro.getTxtNombre().getText().length()>10) {  
				   e.consume();
				 }
			break;
			
		case "Apellido":
			if(this.ventana03registro.getTxtApellido().getText().length()>10) {  
				   e.consume();
				 }
			break;
			
		case "Pass":
			if(this.ventana03registro.getPassContrasena().getText().length()>10) {  
				   e.consume();
				 }
			break;
			
		case "Pass2":
			if(this.ventana03registro.getPassContrasena2().getText().length()>10) {  
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
