package modelo;

/**
 * Clase del objeto billete
 *
 */
public class Billete {
	
	private int cod_Billete;
	private String cod_Linea;
	private String cod_Bus;
	private int num_Parada_Inicio;
	private int cod_Parada_Inicio;
	private String nombre_Parada_Origen;
	private int num_Parada_Fin;
	private int cod_Parada_Fin;
	private String nombre_Parada_Destino;
	private String fecha;
	private String hora;
	private String dni;
	private double precio;
	
	/**
	 * Constructor del objeto billete
	 */
	public Billete () {
		
	}
	
	/**
	 * Constructor del objeto autobus que recibe una serie de parametros para crearlo
	 * @param pCod_Billete Codigo del billete
	 * @param pCod_Linea Codigo de la linea elegida por el usuario
	 * @param pCod_Bus Codigo del autobus de la linea
	 * @param pNum_Parada_Inicio Numero de la parada de origen
	 * @param pCod_Parada_Inicio Codigo de la parada de origen
	 * @param pNombre_Parada_Origen Nombre de la parada de origen
	 * @param pNum_Parada_Fin Numero de la parada de destino
	 * @param pCod_Parada_Fin Codigo de la parada de destino
	 * @param pNombre_Parada_Destino Nombre de la parada de destino
	 * @param pFecha Fecha del viaje
	 * @param pHora Hora del viaje
	 * @param pDni DNI del usuario
	 * @param pPrecio Precio del billete/s
	 */
	public Billete (int pCod_Billete, String pCod_Linea, String pCod_Bus,int pNum_Parada_Inicio, int pCod_Parada_Inicio, 
			String pNombre_Parada_Origen, int pNum_Parada_Fin, int pCod_Parada_Fin, String pNombre_Parada_Destino, String pFecha, String pHora, String pDni, double pPrecio) {
		
		this.cod_Billete = pCod_Billete;
		this.cod_Linea = pCod_Linea;
		this.cod_Bus = pCod_Bus;
		this.num_Parada_Inicio = pNum_Parada_Inicio;
		this.cod_Parada_Inicio = pCod_Parada_Inicio;
		this.nombre_Parada_Origen = pNombre_Parada_Origen;
		this.num_Parada_Fin = pNum_Parada_Fin;
		this.cod_Parada_Fin = pCod_Parada_Fin;
		this.nombre_Parada_Destino = pNombre_Parada_Destino;
		this.fecha = pFecha;
		this.hora = pHora;
		this.dni = pDni;
		this.precio = pPrecio;
		
	}

	/**
	 * Metodo que devuelve el codigo del billete
	 * @return cod_billete
	 */
	public int getCod_Billete() {
		return cod_Billete;
	}

	/**
	 * Metodo que establece el codigo del billete
	 * @param cod_Billete
	 */
	public void setCod_Billete(int cod_Billete) {
		this.cod_Billete = cod_Billete;
	}
	
	/**
	 * Metodo que devuelve el codigo de linea
	 * @return cod_linea
	 */
	public String getCod_Linea() {
		return cod_Linea;
	}
	
	/**
	 * Metodo que establece el codigo de linea
	 * @param cod_Linea
	 */
	public void setCod_Linea(String cod_Linea) {
		this.cod_Linea = cod_Linea;
	}
	
	/**
	 * Metodo que devuelve el codigo de autobus
	 * @return cod_bus
	 */
	public String getCod_Bus() {
		return cod_Bus;
	}
	
	/**
	 * Metodo que establece el codigo de autobus
	 * @param cod_Bus
	 */
	public void setCod_Bus(String cod_Bus) {
		this.cod_Bus = cod_Bus;
	}
	
	/**
	 * Metodo que devuelve el numero de la parada de inicio
	 * @return num_Parada_Inicio
	 */
	public int getNum_Parada_Inicio() {
		return num_Parada_Inicio;
	}

	/**
	 * Metodo que establece el numero de la parada de inicio
	 * @param num_Parada_Inicio
	 */
	public void setNum_Parada_Inicio(int num_Parada_Inicio) {
		this.num_Parada_Inicio = num_Parada_Inicio;
	}	
	
	/**
	 * Metodo que devuelve el numero de la parada de inicio
	 * @return num_Parada_Fin
	 */
	public int getNum_Parada_Fin() {
		return num_Parada_Fin;
	}
	
	/**
	 * Metodo que establece el numero de la parada de fin
	 * @param num_Parada_Fin
	 */
	public void setNum_Parada_Fin(int num_Parada_Fin) {
		this.num_Parada_Fin = num_Parada_Fin;
	}

	/**
	 * Metodo que devuelve el codigo de la parada de inicio
	 * @return cod_Parada_Inicio
	 */
	public int getCod_Parada_Inicio() {
		return cod_Parada_Inicio;
	}

	/**
	 * Metodo que establece el codigo de la parada de inicio
	 * @param cod_Parada_Inicio
	 */
	public void setCod_Parada_Inicio(int cod_Parada_Inicio) {
		this.cod_Parada_Inicio = cod_Parada_Inicio;
	}

	/**
	 * Metodo que devuelve el codigo de la parada de destino
	 * @return cod_Parada_Fin
	 */
	public int getCod_Parada_Fin() {
		return cod_Parada_Fin;
	}

	/**
	 * Metodo que establece el codigo de parada de destino
	 * @param cod_Parada_Fin
	 */
	public void setCod_Parada_Fin(int cod_Parada_Fin) {
		this.cod_Parada_Fin = cod_Parada_Fin;
	}

	/**
	 * Metodo que devuelve la fecha del trayecto
	 * @return
	 */
	public String getFecha() {
		return fecha;
	}
	
	/**
	 * Metodo que establece la fecha del trayecto
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Metodo que devuelve la hora del trayecto
	 * @return hora
	 */
	public String getHora() {
		return hora;
	}
	
	/**
	 * Metodo que establece la hora del trayecto
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	/**
	 * Metodo que devuelve el dni del usuario
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo que establece el dni del usuario
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Metodo que devuelve el precio 
	 * @return precio
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Metodo que establece el precio del billete
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo que devuelve el nombre de la parada de origen
	 * @return nombre_Parada_Origen
	 */
	public String getNombre_Parada_Origen() {
		return nombre_Parada_Origen;
	}

	/**
	 * Metodo que establece el nombre de la parada de origen
	 * @param nombre_Parada_Origen
	 */
	public void setNombre_Parada_Origen(String nombre_Parada_Origen) {
		this.nombre_Parada_Origen = nombre_Parada_Origen;
	}

	/**
	 * Metodo que devuelve el nombre de la parada de destino
	 * @return nombre_Parada_Destino
	 */
	public String getNombre_Parada_Destino() {
		return nombre_Parada_Destino;
	}

	/**
	 * Metodo que establece el nombre de la parada de destino
	 * @param nombre_Parada_Destino
	 */
	public void setNombre_Parada_Destino(String nombre_Parada_Destino) {
		this.nombre_Parada_Destino = nombre_Parada_Destino;
	}
}
