package modelo;

import java.util.ArrayList;

public class Municipio {
	
	private String nombre;
	private int codPostal;
	private ArrayList<Parada> Parada;
	
	public Municipio() {
		
	}
	
	public Municipio(String nombre, int codPostal, ArrayList<Parada> Parada) {
		
		this.nombre = nombre;
		this.codPostal = codPostal;
		this.Parada = Parada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public ArrayList<Parada> getParada() {
		return Parada;
	}

	public void setParada(ArrayList<Parada> Parada) {
		this.Parada = Parada;
	}
	
}

