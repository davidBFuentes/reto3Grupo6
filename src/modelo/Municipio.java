package modelo;

import java.util.ArrayList;

/**
 * Clase del objeto municipio
 *
 */
public class Municipio {
	
	private String nombre;
	private int codPostal;
	private ArrayList<Parada> Parada;
	
	/**
	 * Constructor del objeto municipio
	 */
	public Municipio() {
		
	}
	
	/**
	 * Constructor del objeto municipio que recibe una serie de parametros para crearlo
	 * @param nombre Nombre
	 * @param codPostal Codigo Postal
	 * @param Parada Arraylist con las paradas del trayecto en funcion de la linea seleccionada por el usuario
	 */
	public Municipio(String nombre, int codPostal, ArrayList<Parada> Parada) {
		
		this.nombre = nombre;
		this.codPostal = codPostal;
		this.Parada = Parada;
	}

	/**
	 * Metodo que devuelve el nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que establece el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el codigo postal
	 * @return codPostal
	 */
	public int getCodPostal() {
		return codPostal;
	}

	/**
	 * Metodo que establece el codigo postal
	 * @param codPostal
	 */
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * Metodo que devuelve el Arraylist parada
	 * @return Parada
	 */
	public ArrayList<Parada> getParada() {
		return Parada;
	}
	
	/**
	 * Metodo que establece el Arrayalist parada
	 * @param Parada
	 */
	public void setParada(ArrayList<Parada> Parada) {
		this.Parada = Parada;
	}
	
}

