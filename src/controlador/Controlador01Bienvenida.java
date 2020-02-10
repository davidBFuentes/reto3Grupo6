package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vista.Ventana01Bienvenida;
import vista.Ventana02Login;

/**
 * Clase Controlador01Bienvenida, gestiona el funcionamiento de la Ventana01VBienvenida
 *
 */
public class Controlador01Bienvenida implements MouseListener {
	
	// Atributo del constructor 
	
	private Ventana01Bienvenida ventanaBienvenida;
	
	/**
	 * Constructor del controlador, que recibe los elementos de la ventana
	 * @param pVentana01 
	 */
		
	public Controlador01Bienvenida (Ventana01Bienvenida pVentana01) {
		
		this.ventanaBienvenida = pVentana01;
		mInicializarControlador();
		
	}
	
	/**
	 *Metodo que añade un listener al botón y le da nombre.
	 */
	
	private void mInicializarControlador () {
		
		this.ventanaBienvenida.getBtnVentana02().addMouseListener(this);
		this.ventanaBienvenida.getBtnVentana02().setName("Ventana02");
		
	}
	
	/**
	 *Metodo que controla la acción de hacer click en la ventana, que lanza la siguiente ventana y oculta la actual.
	 */

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Ventana02Login ventana02 = new Ventana02Login();
		@SuppressWarnings("unused")
		Controlador02Login controladorLogin = new Controlador02Login(ventana02);
		ventana02.getLogin().setVisible(true);
		this.ventanaBienvenida.getFrame().dispose();
		
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
	
	public void mMostrarFrame() {
		
		this.ventanaBienvenida.getFrame().setVisible(true);
	}
	
}
