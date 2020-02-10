package controlador;
import calculosMatematicos.Calculo;
public class ControladorVueltas {
	public static String adevolver(double restante) {
		//Función para la devolución exacta de dinero al cliente, calculando la cantidad de billetes y monedas
		
		
		restante = Calculo.formatearPrecio(restante);
		Double totaldevolver = (double) 0;
		String devolver="Te sobra " + restante + "€ \n";
		int bmdevolver = 0;
		if (restante != 0) {
			if (restante >= 500f) {
				totaldevolver = restante / 500;
				totaldevolver =  (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 500;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 500€ \n");
			}
			
			if (restante >= 200f) {
				totaldevolver = restante / 200;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 200;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 200€ \n");
			}
			
			if (restante >= 100f) {
				totaldevolver = restante / 100;
				totaldevolver =  (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 100;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 100€ \n");

			}
			
			if (restante >= 50f) {
				totaldevolver = restante / 50;
				totaldevolver =  (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 50;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 50€ \n");

			}
			
			if (restante >= 20f) {
				totaldevolver = restante / 20;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 20;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 20€ \n");

			}
			
			if (restante >= 10f) {
				totaldevolver = restante / 10;
				totaldevolver = (Math.floor(totaldevolver));
				bmdevolver =(int) Math.round(totaldevolver) ;
				restante = restante % 10;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 10€ \n");

			}
			
			if (restante >= 5f) {
				totaldevolver = restante / 5;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 5;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 5€ \n");

			}
			
			if (restante >= 2f) {
				totaldevolver = restante / 2;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 2;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 2€ \n");

			}
			
			if (restante >= 1f) {
				totaldevolver = restante / 1;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver =(int) Math.round(totaldevolver) ;
				restante = restante % 1;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 1€ \n");
			}
			
			if (restante >= 0.50f) {
				totaldevolver = restante / 0.50f;
				totaldevolver =  (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 0.50f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.50€ \n");

			}
			
			if (restante >= 0.20f) {
				totaldevolver = restante / 0.20f;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 0.20f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.20€ \n");

			}
			
			if (restante >= 0.10f) {
				totaldevolver = restante / 0.10f;
				totaldevolver =  (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 0.10f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.10€ \n");

			}
			
			if (restante >= 0.05f) {
				totaldevolver = restante / 0.05f;
				totaldevolver =  (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) Math.round(totaldevolver) ;
				restante = restante % 0.05f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.05€ \n");
			}
			
			if (restante >= 0.02f) {
				totaldevolver = restante / 0.02f;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver =(int) Math.round(totaldevolver) ;
				restante = restante % 0.02f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.02€ \n");

			}
			
			if (restante >= 0.01f) {
				totaldevolver = restante / 0.01f;
				totaldevolver = (Math.floor(totaldevolver*1)/1);
				bmdevolver =(int) Math.round(totaldevolver) ;
				restante =  restante % 0.01f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.01€ \n");

			}


		} else {
			//si se paga el dinero exacto se le dara las gracias 
			System.out.println("Gracias por su compra");
		}

		return devolver;

	}
}
