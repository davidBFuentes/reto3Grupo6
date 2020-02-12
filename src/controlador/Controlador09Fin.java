package controlador;

import java.awt.EventQueue;

import modelo.Municipio;
import vista.Ventana01Bienvenida;
import vista.Ventana09Fin;

public class Controlador09Fin {

	private Ventana09Fin ventanaFin;
	private Municipio municipioOrigen;
	private Municipio municipioDestino;


	/**
	 * Creamos el controlador al que le mandaremos la ventana final (Ventana09Fin pVentana09)
	 * @param pVentana09
	 */
	
	public Controlador09Fin(Ventana09Fin pVentana09, Municipio pMunicipioOrigen, Municipio pMunicipioDestino) {

		this.ventanaFin = pVentana09;
		this.municipioOrigen = pMunicipioOrigen;
		this.municipioDestino = pMunicipioDestino;
		mIniciarControlador();
		
	}
	
	
	//Iniciamos el controlador
	private void mIniciarControlador() {
		
		if (municipioOrigen.getNombre().equals(municipioDestino.getNombre())) {
			
			this.ventanaFin.getLblMensaje1().setText("Disfrute de su viaje por " + municipioOrigen.getNombre());
		} else {
		
			this.ventanaFin.getLblMensaje1().setText("Disfrute de su viaje de " + municipioOrigen.getNombre() + " a " + municipioDestino.getNombre() );
		}
		
		//le decimos que despues de 4 segundos volverá a la ventana de inicio
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread.sleep(4000);
					Ventana01Bienvenida window = new Ventana01Bienvenida();
					@SuppressWarnings("unused")
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


