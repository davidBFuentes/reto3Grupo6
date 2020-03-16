package modelo;

/**
 * Clase del objeto parada
 *
 */
public class Parada implements Comparable<Parada> {
	private int numParada;
	private int codParada;
	private String calle;
	private String nombre;
	private Float latitud;
	private Float longitud;
	private String codigoPostal;
	//ATRIBUTO EN DESUSO
	private double distanciaATermibus;
	
	/**
	 * Constructor del objeto parada
	 */
	public Parada() {
		
	}
	
	/**
	 * Constructor del objeto parada que recibe una serie de parametros para crearlo
	 * @param pNumParada Numero de parada
	 * @param pCodParada Codigo de parada
	 * @param pCalle Calle de la parada
	 * @param pNombre Nombre de la parada
	 * @param pLatitud Latitud de la parada
	 * @param pLongitud Longitud de la parada
	 * @param pCodigoPostal Codigo de la parada
	 */
	public Parada(int pNumParada, int pCodParada, String pCalle, String pNombre, Float pLatitud, Float pLongitud, String pCodigoPostal) {
		
		this.numParada = pNumParada;
		this.codParada = pCodParada;
		this.calle = pCalle;
		this.nombre = pNombre;
		this.latitud = pLatitud;
		this.longitud = pLongitud;
		this.codigoPostal = pCodigoPostal;
	}

	/**
	 * Metodo que devuelve el numero de la parada
	 * @return
	 */
	public int getNumParada() {
		return numParada;
	}

	/**
	 * Metodo que establece el numero de la parada
	 * @param numParada
	 */
	public void setNumParada(int numParada) {
		this.numParada = numParada;
	}
	
	/**
	 * Metodo que devuelve el codigo de la parada
	 * @return codParada
	 */
	public int getCodParada() {
		return codParada;
	}

	/**
	 * Metodo que establece el codigo de la parada
	 * @param codParada
	 */
	public void setCodParada(int codParada) {
		this.codParada = codParada;
	}

	/**
	 * Metodo que devuelve la calle
	 * @return
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Metodo que establece la calle
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
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
	 * Metodo que devuelve la coordenada latitud
	 * @return latitud
	 */
	public Float getLatitud() {
		return latitud;
	}

	/**
	 * Metodo que establece la coordenada latitud
	 * @param latitud
	 */
	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}

	/**
	 * Metodo que devuelve la coordenada longitud
	 * @return longitud
	 */
	public Float getLongitud() {
		return longitud;
	}

	/**
	 * Metodo que establece la coordenada longitud 
	 * @param longitud
	 */
	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}

	/**
	 * Metodo que devuelve el codigo postal
	 * @return codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Metodo que establece el codigo postal
	 * @param codigoPostal
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	//METODOS EN DESUSO
	
	/**
	 * Metodo que establece la distancia de la parada respecto a termibus
	 * @param distanciaATermibus
	 */
	public void setDistanciaATermibus(double distanciaATermibus) {
		this.distanciaATermibus = distanciaATermibus;
	}
	
	/**
	 * Metodo que devuelve la distancia de la parada respecto a termibus
	 * @return distanciaATermibus
	 */
	public double getDistanciaATermibus() {
		return distanciaATermibus;
	}
	
	/**
	 * Metodo que devuelve el nombre de la parada en un string
	 */
	public String toString () {
		
		return this.getNombre();
	}
	
	/**
	 * Metodo implementado por la interfaz COMPARABLE, define el modo en el que se compararan los numParada
	 */
	@Override
	public int compareTo(Parada o) {
        if (this.numParada < o.numParada) {
            return -1;
        }
        if (this.numParada > o.numParada) {
            return 1;
        }
        return 0;
    }

}



    
	
	


	


