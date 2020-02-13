package modelo;

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
	 * Metodo constructor del objeto autobus
	 * @param codAutobus Codigo del autobus
	 * @param numPlazas Numero maxima de plazas
	 * @param consumo Consumo del autobus, dado en Litros/km
	 * @param color Color del autobus
	 */
	public Autobus (String codAutobus, int numPlazas, float consumo, String color) {
		
	}

	public String getCodAutobus() {
		return codAutobus;
	}

	public void setCodAutobus(String codAutobus) {
		this.codAutobus = codAutobus;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
