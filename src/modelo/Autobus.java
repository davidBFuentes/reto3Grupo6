package modelo;

public class Autobus {
	
	private String codAutobus;
	private int numPlazas;
	private float consumo;
	private String color;
	
	public Autobus() {
		
	}
	
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

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
