package calculosMatematicos;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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
	
	/**
	 * Metodo que recibe las longitudes y latitudes de dos ubicaciones y calcula la distancia euclidea entre ambas
	 * @param lon1 Longitud de la ubicacion 1
	 * @param lat1 Latitud de la ubicacion 1
	 * @param lon2 Longitud de la ubicacion 2
	 * @param lat2 Latitud de la ubicacion 2
	 * @return Devuelve la distancia euclidea entre las ubicaciones introducidas
	 */
	public static double calcularDistanciaEuclidea(double lon1, double lat1, double lon2, double lat2) {
		
		double distanciaEuclidea = Math.hypot((lon2-lon1), (lat2 - lat1));
		
		return distanciaEuclidea;
		
	}
 	
	
	/**
	 * Metodo que recibe las longitudes y latidudes de dos ubicaciones y calcula la distancia en Km entre ambas
	 * @param lon1 Longitud de la ubicacion 1
	 * @param lat1 Latitud de la ubicacion 1
	 * @param lon2 Longitud de la ubicacion 2
	 * @param lat2 Latitud de la ubicacion 2
	 * @return Devuelve la distancia en Km entre las ubicaciones introducidas
	 */
 	public static Double calcularDistanciaEntreParadas(double lon1, double lat1, double lon2, double lat2) {
 	
 		final int R = 6371; // Radio de la tierra
 
 		Double latDistancia = toRad(lat2-lat1);
 		Double lonDistancia = toRad(lon2-lon1);
 		Double a = Math.sin(latDistancia / 2) * Math.sin(latDistancia / 2) + Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * Math.sin(lonDistancia / 2) * Math.sin(lonDistancia / 2);
 		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
 		Double distancia = R * c;
 		 
		return distancia;
 	}
 	
 	/**
 	 * Metodo que convierte los grados introducidos a radianes
 	 * @param grados Los grados a convertir
 	 * @return Devuelve los grados introducidos convertidos a radianes
 	 */
	private static Double toRad(Double grados) {
		return grados * Math.PI / 180;
	}
	
	/**
	 * Metodo que recibe un arraylist de paradas y las ordena en funcion de la distancia euclidea 
	 * @param listaParadas Arraylist que contiene las paradas a ordenar
	 * @return Devuelve el arraylist recibido con las paradas ordenadas
	 */
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
	
	
	/** 
	 * Metodo que recibe un arraylist de paradas y excluye las paradas que no estan en el recorrido del billete
	 * @param listaParadas Arraylist que contiene todas las paradas de la linea seleccionada
	 * @param billete Objeto billete que contiene todos los datos del trayecto
	 * @return Devuelve el arraylist filtrado
	 */
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
	
	/**
	 * Metodo que recibe un arraylist de paradas y calcula la distancia entre la primera y la ultima parada contenida
	 * @param paradasBillete Arraylist que contiene las paradas a calcular 
	 * @return Devuelve la distancia entre la primera y la ultima parada
	 */
	public static double calcularDistanciaBillete(ArrayList<Parada> paradasBillete) {
	
	
		double distanciaTotal = 0;
		double distancia;
	
		//Cargamos la primera parada para poder hacer el primer calculo
		Parada parada1 = paradasBillete.get(0);

		//Calculamos en orden la distancia entre dos paradas y la sumamos a un acumulador para calcular la distancia total entre lasa paradas seleccionadas
		for(Parada parada : paradasBillete) {
			
			distancia = Calculo.calcularDistanciaEntreParadas(parada1.getLongitud(), parada1.getLatitud(), parada.getLongitud(), parada.getLatitud());
	 		parada1 = parada;
	 		distanciaTotal = distancia + distanciaTotal;
		}
		
		return distanciaTotal; 	
			
	}
	
	/**
	 * Metodo que calcula el precio del billete habiendo recibido el objeto billete, autobus y el arraylist con las paradas
	 * @param billete 
	 * @param paradasBillete Arraylist 
	 * @param autobus Objeto autobus del trayecto seleccionado
	 */
	public static double calcularPrecioBillete(Billete billete, ArrayList<Parada> paradasBillete, Autobus autobus) {
		
		//Calculamos el precio del billete
		double costeTotal = calcularDistanciaBillete(paradasBillete) * autobus.getConsumo() * Autobus.PRECIO_DIESEL;
		double beneficioTotal = costeTotal * 0.2;
		double beneficioPorBillete = beneficioTotal / autobus.getNumPlazas();
		double costePorBillete = (calcularDistanciaBillete(paradasBillete) * autobus.getConsumo() * Autobus.PRECIO_DIESEL) + beneficioPorBillete;

		 double precioBillete = Calculo.formatearPrecio(costePorBillete);
		
		return precioBillete;
	
	}
	
	/**
	 * Metodo que formatea un numero de tipo double con la precision y el redondeo escogido
	 * @param numeroSinFormatear Numero de tipo double
	 * @return Devuelve el numero de tipo double formateado
	 */
	public static double formatearPrecio(double numeroSinFormatear) {
		
		//Creamos un objeto Mathcontext al que le pasaremos como parametro la precision que deseamos y redondeara 
		MathContext formatoPrecio = new MathContext(3, RoundingMode.HALF_UP);
	
		//Creamos un objeto Bigdecimal pasandole la variable a formatear y el formato creado previamente
		BigDecimal precioFormateado = new BigDecimal(numeroSinFormatear, formatoPrecio);
		
		return precioFormateado.doubleValue();
		
	}
	
	
}
