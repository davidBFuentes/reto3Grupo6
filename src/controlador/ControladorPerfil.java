package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Billete;
import modelo.Cliente;
import vista.Ventana01Bienvenida;
import vista.VentanaControlUsuario;
import vista.VentanaPerfil;

public class ControladorPerfil implements MouseListener {
	
	private VentanaPerfil ventanaperfil;
	private Cliente cliente;
	private Billete billete;
	
	/**
	 * Constructor del controlador que recibe los parametros de la ventana
	 * @param pVentanaPerfil
	 * @param pCliente
	 * @param pBillete
	 */
	public ControladorPerfil (VentanaPerfil pVentanaPerfil, Cliente pCliente, Billete pBillete) {
		
		this.ventanaperfil = pVentanaPerfil;
		this.cliente = pCliente;
		this.billete = pBillete;
		iniciarControlador();
	}
	
	/**
	 *  Método que añade los listeners a los botones y les da nombre para identificarlos.
	 */
	private void iniciarControlador() {
		
		this.ventanaperfil.getBtnVolver().addMouseListener(this);
		this.ventanaperfil.getBtnVolver().setName("Volver");
		this.ventanaperfil.getBtnSalir().addMouseListener(this);
		this.ventanaperfil.getBtnSalir().setName("Salir");
		this.ventanaperfil.getTxtDni().setText(cliente.getDni());
		this.ventanaperfil.getTxtNombre().setText(cliente.getNombre());
		this.ventanaperfil.getTxtApellido().setText(cliente.getApellido());
		this.ventanaperfil.getTxtFechaNacimiento().setText(cliente.getNacimiento());
		
	}
	
	/**
	 * Metodo que controla las acciones de los botones
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		e.getComponent().getName();
		
		switch (e.getComponent().getName()) {
		case "Volver":
			VentanaControlUsuario ventanaControl = new VentanaControlUsuario();
			@SuppressWarnings("unused") ControladorControlUsuario controlUsuario = new ControladorControlUsuario(ventanaControl, cliente, billete);
			ventanaControl.getFrame().setVisible(true);
			this.ventanaperfil.getFrame().dispose();
			
			break;
			
		case "Salir":
			Ventana01Bienvenida ventanaBienvenida = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(ventanaBienvenida);
			ventanaBienvenida.getFrame().setVisible(true);
			this.ventanaperfil.getFrame().dispose();
			
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

}
