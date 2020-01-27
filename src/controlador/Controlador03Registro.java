package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Fichero;
import vista.Ventana01Bienvenida;
import vista.Ventana03Registro;

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
			
			if (this.ventana03registro.getTxtDni().getText().length() == 0
					|| this.ventana03registro.getTxtNombre().getText().length() == 0
					|| this.ventana03registro.getTxtApellido().getText().length() == 0
					|| this.ventana03registro.getPassContrasena().getText().length() == 0
					|| this.ventana03registro.getPassContrasena2().getText().length() == 0
					|| (!this.ventana03registro.getCheckHombre().isSelected()
							&& !this.ventana03registro.getCheckMujer().isSelected())) {

				JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Mensaje de error",
						JOptionPane.ERROR_MESSAGE);

			} else {

				if (this.ventana03registro.getTxtDni().getText().length() < 9) {
					JOptionPane.showMessageDialog(null, "No ha introducido un DNI válido", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);
					
				} if (!this.ventana03registro.getPassContrasena().getText()
						.equals(this.ventana03registro.getPassContrasena2().getText())) {
					JOptionPane.showMessageDialog(null, "No ha repetido la contraseña", "Mensaje de error",
							JOptionPane.ERROR_MESSAGE);

				} else {

					Cliente cliente;

					if (this.ventana03registro.getCheckHombre().isSelected()) {
						cliente = new Cliente(this.ventana03registro.getTxtDni().getText(),
								this.ventana03registro.getTxtNombre().getText(),
								this.ventana03registro.getTxtApellido().getText(), "H");

					} else {
						cliente = new Cliente(this.ventana03registro.getTxtDni().getText(),
								this.ventana03registro.getTxtNombre().getText(),
								this.ventana03registro.getTxtApellido().getText(), "M");
					}

					if (ClienteDao.mRegistrarCliente(cliente)) {

						try {
							Fichero.mCrearFichero(this.ventana03registro.getTxtDni().getText(),
									this.ventana03registro.getPassContrasena().getText());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
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
}
