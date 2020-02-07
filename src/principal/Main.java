package principal;

import controlador.Controlador01Bienvenida;
import vista.Ventana01Bienvenida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se crea la primera ventana
		
		Ventana01Bienvenida ventana01 = new Ventana01Bienvenida();
		
		// Se crea el controlador de la primera ventana y se le mandan sus elementos
		
		Controlador01Bienvenida controladorBienvenida = new Controlador01Bienvenida(ventana01);
		
		// Se muestra el frame de la primera ventana llamando al método del controlador
		
		controladorBienvenida.mMostrarFrame();
		
	}

}
