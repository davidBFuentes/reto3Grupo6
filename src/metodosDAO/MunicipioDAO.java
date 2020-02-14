package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.ConexionBus;
import modelo.Municipio;
import modelo.Parada;

public class MunicipioDAO {
	
	/**
	 * Metodo que hace una llamada a la base de datos y obtiene el municipio en funcion de la parada recibida como parametro
	 * @param parada
	 * @return
	 */
	public static Municipio mObtenerMunicipio(Parada parada) {
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;

		String sql = "SELECT * FROM municipios WHERE Cod_Municipio = ?"; 
		
		Municipio municipio = new Municipio();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, parada.getCodigoPostal());
			rs=stm.executeQuery();
			
			while (rs.next()) {
				municipio.setCodPostal(rs.getInt(1));
				municipio.setNombre(rs.getString(2)); 
				
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AutobusDAO, método mObtenerBus");
			e.printStackTrace();
		}
		
		mObtenerParadasMunicipio(municipio);
		
		return municipio;
		
	}
	
	/**
	 * Metodo que hace una llamada a la base de datos y obtiene las paradas del municipio recibido por parametro
	 * @param municipio
	 * @return
	 */
	public static Municipio mObtenerParadasMunicipio(Municipio municipio) {
		
		
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;

		String sql = "SELECT * FROM parada WHERE Cod_Muni = ?"; 
		
		ArrayList<Parada> paradasMunicipio = new ArrayList<Parada>();
		Parada paradaMunicipio = new Parada();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setInt(1, municipio.getCodPostal());
			rs=stm.executeQuery();
			
			while (rs.next()) {
				paradaMunicipio.setCodParada(rs.getInt(1));
				paradaMunicipio.setNombre(rs.getString(2));
				paradaMunicipio.setCalle(rs.getString(3));
				paradaMunicipio.setLatitud(rs.getFloat(4));
				paradaMunicipio.setLongitud(rs.getFloat(5));
				paradaMunicipio.setCodigoPostal(rs.getString(6));
				paradasMunicipio.add(paradaMunicipio);		
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AutobusDAO, método mObtenerBus");
			e.printStackTrace();
		}
		
		municipio.setParada(paradasMunicipio);
		
		return municipio;
			
	}

}
