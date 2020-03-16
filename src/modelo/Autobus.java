package modelo;

/**
 * Clase del objeto autobus
 *
 */
public class Autobus {
	
	public static final double PRECIO_DIESEL = 0.8;
	
	private String codAutobus;
	private int numPlazas;
	private double consumo;
	private String color;
	
	/**
	 *  Metodo constructor del objeto autobus
	 */
	public Autobus() {
		
	}
	
	/**
	 * Constructor del objeto autobus que recibe una serie de parametros para crearlo
	 * @param codAutobus Codigo del autobus
	 * @param numPlazas Numero maxima de plazas
	 * @param consumo Consumo del autobus, dado en Litros/km
	 * @param color Color del autobus
	 */
	public Autobus (String codAutobus, int numPlazas, float consumo, String color) {
		
	}
	
	/**
	 * Metodo que devuelve el codigo del autobus
	 * @return codAutobus
	 */
	public String getCodAutobus() {
		return codAutobus;
	}

	/**
	 * Metodo que establece el codigo del autobus
	 * @param codAutobus
	 */
	public void setCodAutobus(String codAutobus) {
		this.codAutobus = codAutobus;
	}
	
	/**
	 * Metodo que devuelve el numero de plazas
	 * @return numPlazas
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * Metodo que establece el numero de plazas
	 * @param numPlazas
	 */
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * Metodo que devuelve el consumo
	 * @return
	 */
	public double getConsumo() {
		return consumo;
	}

	/**
	 * Metodo que establece el consumo
	 * @param consumo
	 */
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	/**
	 * Metodo que devuelve el color 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Metodo que esablece el color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
