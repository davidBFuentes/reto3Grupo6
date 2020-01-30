package modelo;

public class Billete {
	
	private String cod_Billete;
	private String cod_Linea;
	private String cod_Bus;
	private int cod_Parada_Inicio;
	private String nombre_Parada_Origen;
	private int cod_Parada_Fin;
	private String nombre_Parada_Destino;
	private String fecha;
	private String hora;
	private String dni;
	private double precio;
	
	public Billete () {
		
	}
	
	public Billete (String pCod_Billete, String pCod_Linea, String pCod_Bus, int pCod_Parada_Inicio, 
			String pNombre_Parada_Origen, int pCod_Parada_Fin, String pNombre_Parada_Destino, String pFecha, String pHora, String pDni, double pPrecio) {
		
		this.cod_Billete = pCod_Billete;
		this.cod_Linea = pCod_Linea;
		this.cod_Bus = pCod_Bus;
		this.cod_Parada_Inicio = pCod_Parada_Inicio;
		this.nombre_Parada_Origen = pNombre_Parada_Origen;
		this.cod_Parada_Fin = pCod_Parada_Fin;
		this.nombre_Parada_Destino = pNombre_Parada_Destino;
		this.fecha = pFecha;
		this.hora = pHora;
		this.dni = pDni;
		this.precio = pPrecio;
		
	}

	public String getCod_Billete() {
		return cod_Billete;
	}

	public void setCod_Billete(String cod_Billete) {
		this.cod_Billete = cod_Billete;
	}

	public String getCod_Linea() {
		return cod_Linea;
	}

	public void setCod_Linea(String cod_Linea) {
		this.cod_Linea = cod_Linea;
	}

	public String getCod_Bus() {
		return cod_Bus;
	}

	public void setCod_Bus(String cod_Bus) {
		this.cod_Bus = cod_Bus;
	}

	public int getCod_Parada_Inicio() {
		return cod_Parada_Inicio;
	}

	public void setCod_Parada_Inicio(int cod_Parada_Inicio) {
		this.cod_Parada_Inicio = cod_Parada_Inicio;
	}

	public int getCod_Parada_Fin() {
		return cod_Parada_Fin;
	}

	public void setCod_Parada_Fin(int cod_Parada_Fin) {
		this.cod_Parada_Fin = cod_Parada_Fin;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre_Parada_Origen() {
		return nombre_Parada_Origen;
	}

	public void setNombre_Parada_Origen(String nombre_Parada_Origen) {
		this.nombre_Parada_Origen = nombre_Parada_Origen;
	}

	public String getNombre_Parada_Destino() {
		return nombre_Parada_Destino;
	}

	public void setNombre_Parada_Destino(String nombre_Parada_Destino) {
		this.nombre_Parada_Destino = nombre_Parada_Destino;
	}	
}
