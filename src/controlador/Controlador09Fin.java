package controlador;

import java.awt.EventQueue;

import modelo.Municipio;
import vista.Ventana01Bienvenida;
import vista.Ventana09Fin;

public class Controlador09Fin {

	private Ventana09Fin ventanaFin;
	private Municipio municipioOrigen;
	private Municipio municipioDestino;

	
	public Controlador09Fin(Ventana09Fin pVentana09, Municipio pMunicipioOrigen, Municipio pMunicipioDestino) {
		
		this.ventanaFin = pVentana09;
		this.municipioOrigen = pMunicipioOrigen;
		this.municipioDestino = pMunicipioDestino;
		mIniciarControlador();
		
	}
	
	private void mIniciarControlador() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread.sleep(2000);
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


