package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Billete;
import modelo.Cliente;
import vista.Ventana01Bienvenida;
import vista.Ventana04Trayectos;
import vista.VentanaCambiarContrasena;
import vista.VentanaControlUsuario;
import vista.VentanaHistorial;
import vista.VentanaPerfil;

public class ControladorControlUsuario implements MouseListener {
	
	private VentanaControlUsuario ventanaControl;
	private Cliente cliente;
	private Billete billete;
	
	public ControladorControlUsuario (VentanaControlUsuario pVentana, Cliente pCliente, Billete pBillete) {
		
		this.ventanaControl = pVentana;
		this.cliente = pCliente;
		this.billete = pBillete;
		mIniciarControlador();
		
	}
	
	private void mIniciarControlador() {
		
		this.ventanaControl.getBtnVolver().addMouseListener(this);
		this.ventanaControl.getBtnVolver().setName("Volver");
		this.ventanaControl.getBtnSalir().addMouseListener(this);
		this.ventanaControl.getBtnSalir().setName("Salir");
		this.ventanaControl.getBtnHistorial().addMouseListener(this);
		this.ventanaControl.getBtnHistorial().setName("Historial");
		this.ventanaControl.getBtnCambiarPass().addMouseListener(this);
		this.ventanaControl.getBtnCambiarPass().setName("Pass");
		this.ventanaControl.getBtnPerfil().addMouseListener(this);
		this.ventanaControl.getBtnPerfil().setName("Perfil");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
		case "Volver":
			Ventana04Trayectos ventanaTrayectos = new Ventana04Trayectos();
			@SuppressWarnings("unused") Controlador04Trayectos controlador04 = new Controlador04Trayectos(ventanaTrayectos, billete, cliente);
			ventanaTrayectos.getFrame().setVisible(true);
			this.ventanaControl.getFrame().dispose();
			break;
			
		case "Salir":
			Ventana01Bienvenida ventanaBienvenida = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(ventanaBienvenida);
			ventanaBienvenida.getFrame().setVisible(true);
			this.ventanaControl.getFrame().dispose();
			break;
			
		case "Perfil":
			VentanaPerfil ventanaPerfil = new VentanaPerfil();
			@SuppressWarnings("unused") ControladorPerfil controladorPerfil = new ControladorPerfil(ventanaPerfil, cliente, billete);
			ventanaPerfil.getFrame().setVisible(true);
			this.ventanaControl.getFrame().dispose();
			break;
		
		case "Historial":
			VentanaHistorial ventanaHistorial = new VentanaHistorial();
			@SuppressWarnings("unused") ControladorHistorial controladorHistorial = new ControladorHistorial(ventanaHistorial, cliente, billete);
			ventanaHistorial.getFrame().setVisible(true);
			this.ventanaControl.getFrame().dispose();
			break;
			
		case "Pass":
			VentanaCambiarContrasena ventanaContrasena = new VentanaCambiarContrasena();
			@SuppressWarnings("unused") ControladorCambiarContrasena controladorContrasena = new ControladorCambiarContrasena(ventanaContrasena, cliente, billete);
			ventanaContrasena.getFrame().setVisible(true);
			this.ventanaControl.getFrame().dispose();
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


