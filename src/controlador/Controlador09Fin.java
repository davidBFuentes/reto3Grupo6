package controlador;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import vista.Ventana01Bienvenida;
import vista.Ventana09Fin;

public class Controlador09Fin {

	private Ventana09Fin ventanaFin;

	
	public Controlador09Fin(Ventana09Fin pVentanaImprimirBilletes) throws InterruptedException {
		
		this.ventanaFin = pVentanaImprimirBilletes;
		mIniciarControlador();
	
	}
	
	private void mIniciarControlador() throws InterruptedException {
		
		
		Ventana01Bienvenida window = new Ventana01Bienvenida();
		Controlador01Bienvenida controladorBienvenida = new Controlador01Bienvenida(window);
	
		
		window.getFrame().setVisible(true);
		ScheduledExecutorService es = Executors.newScheduledThreadPool(1);
		TimeUnit.SECONDS.sleep(4);


		this.ventanaFin.getFrame().dispose();
	}

}
