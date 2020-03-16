package modelo;

/**
 * Clase del objeto linea
 *
 */
public class Linea {
	
	private String codLinea;
	private String nombre;
	
	/**
	 * Constructor del objeto linea
	 */
	public Linea() {
		
	}
	
	/**
	 * Constructor del objeto linea que recibe una serie de parametros para crearlo
	 * @param codLinea
	 * @param nombre
	 */
	public Linea(String codLinea, String nombre) {
		
		this.codLinea = codLinea;
		this.nombre = nombre;
		
	}

	/**
	 * Metodo que devuelve el codigo de la linea
	 * @return codLinea
	 */
	public String getCodLinea() {
		return codLinea;
	}
	
	/**
	 * Metodo que establece el codigo de la linea
	 * @param codLinea
	 */
	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
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
	 * Metodo que devuelve el codigo linea y el nombre en un string
	 */
	public String toString() {
		
		return this.getCodLinea() + " " + this.getNombre();
		
	}

}


