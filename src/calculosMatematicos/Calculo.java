package calculosMatematicos;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

import modelo.Autobus;
import modelo.Billete;
import modelo.Parada;

public class Calculo {
	
	ArrayList<Parada> listaParadas;
	//ArrayList<Parada> paradasBillete;
	Billete billete;
	Autobus autobus;
	
	public static double calcularDistanciaEuclidea(double lon1, double lat1, double lon2, double lat2) {
		
		double distanciaEuclidea = Math.hypot((lon2-lon1), (lat2 - lat1));
		
		return distanciaEuclidea;
		
	}
 	
 	public static Double calcularDistanciaEntreParadas(double lon1, double lat1, double lon2, double lat2) {
 	
 		final int R = 6371; // Radio de la tierra
 
 		Double latDistancia = toRad(lat2-lat1);
 		Double lonDistancia = toRad(lon2-lon1);
 		Double a = Math.sin(latDistancia / 2) * Math.sin(latDistancia / 2) + Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * Math.sin(lonDistancia / 2) * Math.sin(lonDistancia / 2);
 		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
 		Double distancia = R * c;
 		 
		return distancia;
 	}
 	
	private static Double toRad(Double value) {
		return value * Math.PI / 180;
	}
	
	public static ArrayList<Parada> calcularOrdenParadas(ArrayList<Parada> listaParadas) {
		
		
		Parada paradaTermibus = listaParadas.get(0);
		for (Parada parada : listaParadas) {
			parada.setDistanciaATermibus(Calculo.calcularDistanciaEuclidea(paradaTermibus.getLongitud(), paradaTermibus.getLatitud(), parada.getLongitud(), parada.getLatitud()));
		}
		Collections.sort(listaParadas);
		
		for(Parada parada : listaParadas) {
			System.out.println(parada.getNombre() + " " + parada.getDistanciaATermibus());
			
		}
		return listaParadas;	
		 
	}
	
	public static ArrayList<Parada> filtrarParadas(ArrayList<Parada> listaParadas, Billete billete){
	
		ArrayList<Parada> paradasBillete = new ArrayList<>();
		
		for(Parada parada : listaParadas) {
			if (parada.getCodParada() >= billete.getCod_Parada_Inicio() && parada.getCodParada() <= billete.getCod_Parada_Fin() 
					|| parada.getCodParada() <= billete.getCod_Parada_Inicio() && parada.getCodParada() >= billete.getCod_Parada_Fin()) {
				
				paradasBillete.add(parada);
			}
		}
		return paradasBillete;
	}
	
	public static double calcularDistanciaBillete(ArrayList<Parada> paradasBillete) {
	
	
		double distanciaTotal = 0;
		double distancia;
	
		
		Parada parada1 = paradasBillete.get(0);

		for(Parada parada : paradasBillete) {
			
			distancia = Calculo.calcularDistanciaEntreParadas(parada1.getLongitud(), parada1.getLatitud(), parada.getLongitud(), parada.getLatitud());
	 		parada1 = parada;
	 		distanciaTotal = distancia + distanciaTotal;
		}
		
		return distanciaTotal; 	
			
	}
	
	public static void calcularPrecioBillete(Billete billete, ArrayList<Parada> paradasBillete, Autobus autobus) {
		
		double costeTotal = calcularDistanciaBillete(paradasBillete) * autobus.getConsumo() * Autobus.PRECIO_DIESEL;
		double beneficioTotal = costeTotal * 0.2;
		double beneficioPorBillete = beneficioTotal / autobus.getNumPlazas();
		double costePorBillete = (calcularDistanciaBillete(paradasBillete) * autobus.getConsumo() * Autobus.PRECIO_DIESEL) + beneficioPorBillete;
		
		DecimalFormat formatoPrecio = new DecimalFormat("#,##");
 		
		billete.setPrecio(Double.parseDouble(formatoPrecio.format(costePorBillete)));
	}
	
	
}
