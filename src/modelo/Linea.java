package modelo;

public class Linea {
	
	private String codLinea;
	private Autobus autobus;
	private Municipio municipio;
	
	public Linea() {
		
	}
	
	public Linea(String codLinea, Autobus autobus, Municipio municipio) {
		
		this.codLinea = codLinea;
		this.autobus = autobus;
		this.municipio = municipio;
		
	}

	public String getCodLinea() {
		return codLinea;
	}

	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
	}

	public Autobus getAutobus() {
		return autobus;
	}

	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}


