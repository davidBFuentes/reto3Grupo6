package modelo;

public class Parada {
	
	private String codParada;
	private String calle;
	private String nombre;
	private Float[] coordenadas;
	
	public Parada() {
		
	}
	
	public Parada(String codParada, String calle, String nombre, Float[] coordenadas) {
		
		this.codParada = codParada;
		this.calle = calle;
		this.nombre = nombre;
		this.coordenadas = coordenadas;
	}

	public String getCodParada() {
		return codParada;
	}

	public void setCodParada(String codParada) {
		this.codParada = codParada;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float[] getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Float[] coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public String toString() {
		
		return nombre;	
	}
	
	
}
