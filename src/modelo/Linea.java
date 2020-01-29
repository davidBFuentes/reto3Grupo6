package modelo;

public class Linea {
	
	private String codLinea;
	private String nombre;
	
	public Linea() {
		
	}
	
	public Linea(String codLinea, String nombre) {
		
		this.codLinea = codLinea;
		this.nombre = nombre;
		
	}

	public String getCodLinea() {
		return codLinea;
	}

	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}


