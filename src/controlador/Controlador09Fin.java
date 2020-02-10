package controlador;

import java.awt.EventQueue;

import vista.Ventana01Bienvenida;
import vista.Ventana09Fin;

public class Controlador09Fin {

	private Ventana09Fin ventanaFin;

	/**
	 * Creamos el controlador al que le mandaremos la ventana final (Ventana09Fin pVentana09)
	 * @param pVentana09
	 */
	public Controlador09Fin(Ventana09Fin pVentana09) {
		
		this.ventanaFin = pVentana09;
		mIniciarControlador();
		
	}
	
	//Iniciamos el controlador
	private void mIniciarControlador() {
		
		//le decimos que despues de 2 segundos vovlera a la ventana de inicio
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread.sleep(2000);
					Ventana01Bienvenida window = new Ventana01Bienvenida();
					Controlador01Bienvenida controlador = new Controlador01Bienvenida(window);
					window.getFrame().setVisible(true);
					ventanaFin.getFrame().dispose();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


