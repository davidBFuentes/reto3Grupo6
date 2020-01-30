package modelo;

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
	
	public static double calcularDistanciaEuclidea(double lon1, double lat1, double lon2, double lat2) {
		
		double distanciaEuclidea = Math.hypot((lon2-lon1), (lat2 - lat1));
		
		return distanciaEuclidea;
		
	}
	


 	public static int calcularDistanciaEntreParadas(double lon1, double lat1, double lon2, double lat2) {

		double earthRadius = 6371; // km
		
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);
		
		double dLon = (lon2 - lon1);
		double dLat = (lat2 - lat1);
		
		double sinLat = Math.sin(dLat / 2);
		double sinLon = Math.sin(dLon / 2);
		
		double a = (sinLat * sinLat) + Math.cos(lat1)*Math.cos(lat2)*(sinLon*sinLon);
		double c = 2 * Math.asin (Math.min(1.0, Math.sqrt(a)));
		
		double distanceInKM = earthRadius * c;
		
		return (int)distanceInKM;
	
	 }
 	
 	public int calcularDistanciaBillete() {
	
 		return 0;
 		
 		
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


