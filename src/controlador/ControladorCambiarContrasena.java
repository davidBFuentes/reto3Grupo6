package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import metodosDAO.ClienteDAO;
import modelo.Billete;
import modelo.Cliente;
import modelo.Codificacion;
import vista.Ventana01Bienvenida;
import vista.VentanaCambiarContrasena;
import vista.VentanaControlUsuario;

public class ControladorCambiarContrasena implements MouseListener, KeyListener {
	
	private VentanaCambiarContrasena ventanaContrasena;
	private Cliente cliente;
	private Billete billete;
	
	/**
	 * Constructor del controlador, que recibe los parametros de la ventana
	 * @param pVentanaContrasena
	 * @param pCliente
	 * @param pBillete
	 */
	public ControladorCambiarContrasena (VentanaCambiarContrasena pVentanaContrasena, Cliente pCliente, Billete pBillete) {
		
		this.ventanaContrasena = pVentanaContrasena;
		this.cliente = pCliente;
		this.billete = pBillete;
		iniciarControlador();
	}
	
	/**
	 *  Método que añade los listeners a los botones y les da nombre para identificarlos.
	 */
	private void iniciarControlador() {
		
		this.ventanaContrasena.getBtnCambiarContrasena().addMouseListener(this);
		this.ventanaContrasena.getBtnCambiarContrasena().setName("Cambiar");
		this.ventanaContrasena.getBtnVolver().addMouseListener(this);
		this.ventanaContrasena.getBtnVolver().setName("Volver");
		this.ventanaContrasena.getBtnSalir().addMouseListener(this);
		this.ventanaContrasena.getBtnSalir().setName("Salir");
		this.ventanaContrasena.getPassContrasena1().addKeyListener(this);
		this.ventanaContrasena.getPassContrasena1().setName("Pass");
		this.ventanaContrasena.getPassContrasena2().addKeyListener(this);
		this.ventanaContrasena.getPassContrasena2().setName("Pass2");
		
	}

	/**
	 * Metodo que controla las acciones de los botones
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
		case "Cambiar":
			if (String.valueOf(this.ventanaContrasena.getPassContrasena1().getPassword()).equals(String.valueOf(this.ventanaContrasena.getPassContrasena2().getPassword())) 
				&& String.valueOf(this.ventanaContrasena.getPassContrasena1().getPassword()).length() != 0 && String.valueOf(this.ventanaContrasena.getPassContrasena2().getPassword()).length() != 0) {
				
				cliente.setContrasena(Codificacion.md5(String.valueOf(this.ventanaContrasena.getPassContrasena1().getPassword())));		
				boolean cambio = ClienteDAO.mCambiarContrasena(cliente);
				if (cambio == true) {
					JOptionPane.showMessageDialog(null, "Contraseña cambiada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
					VentanaControlUsuario ventanaControl = new VentanaControlUsuario();
					@SuppressWarnings("unused") ControladorControlUsuario controlUsuario = new ControladorControlUsuario(ventanaControl, cliente, billete);
					ventanaControl.getFrame().setVisible(true);
					this.ventanaContrasena.getFrame().dispose();
					
				} 
			
			} else {
					
				if (!String.valueOf(this.ventanaContrasena.getPassContrasena1().getPassword()).equals(String.valueOf(this.ventanaContrasena.getPassContrasena2().getPassword()))) {
					JOptionPane.showMessageDialog(null, "No ha repetido la contraseña", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				}
				
				if (String.valueOf(this.ventanaContrasena.getPassContrasena1().getPassword()).length() == 0 || String.valueOf(this.ventanaContrasena.getPassContrasena2().getPassword()).length() == 0) {
					JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				}
			}

			break;
			
		case "Volver":
			VentanaControlUsuario ventanaControl = new VentanaControlUsuario();
			@SuppressWarnings("unused") ControladorControlUsuario controlUsuario = new ControladorControlUsuario(ventanaControl, cliente, billete);
			ventanaControl.getFrame().setVisible(true);
			this.ventanaContrasena.getFrame().dispose();
			
			break;
			
		case "Salir":
			Ventana01Bienvenida ventanaBienvenida = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(ventanaBienvenida);
			ventanaBienvenida.getFrame().setVisible(true);
			this.ventanaContrasena.getFrame().dispose();
			
			break;

		default:
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

	/**
	 * Metodo que controla la pulsacion de las teclas
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		e.getComponent().getName();
		
		switch (e.getComponent().getName()) {
		
		case "Pass":
			if(String.valueOf(this.ventanaContrasena.getPassContrasena1().getPassword()).length()>12) {  
				   e.consume();
				 }
			break;
			
		case "Pass2":
			if(String.valueOf(this.ventanaContrasena.getPassContrasena2().getPassword()).length()>12) {  
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
