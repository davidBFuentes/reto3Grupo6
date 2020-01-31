package modelo;

import java.util.Comparator;


public class Parada implements Comparable<Parada> {
	
	private int codParada;
	private String calle;
	private String nombre;
	private Float latitud;
	private Float longitud;
	private String codigoPostal;
	private double distanciaATermibus;
	
	public Parada() {
		
	}
	
	public Parada(int pCodParada, String pCalle, String pNombre, Float pLatitud, Float pLongitud, String pCodigoPostal) {
		
		this.codParada = pCodParada;
		this.calle = pCalle;
		this.nombre = pNombre;
		this.latitud = pLatitud;
		this.longitud = pLongitud;
		this.codigoPostal = pCodigoPostal;
	}

	public int getCodParada() {
		return codParada;
	}

	public void setCodParada(int codParada) {
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

	public Float getLatitud() {
		return latitud;
	}

	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}

	public Float getLongitud() {
		return longitud;
	}

	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public void setDistanciaATermibus(double distanciaATermibus) {
		this.distanciaATermibus = distanciaATermibus;
	}
	
	public double getDistanciaATermibus() {
		return distanciaATermibus;
	}
	
	public String toString () {
		
		return this.getNombre();
	}
	



	@Override
	public int compareTo(Parada o) {
        if (this.distanciaATermibus < o.distanciaATermibus) {
            return -1;
        }
        if (this.distanciaATermibus > o.distanciaATermibus) {
            return 1;
        }
        return 0;
    }
}



    
	
	


	


