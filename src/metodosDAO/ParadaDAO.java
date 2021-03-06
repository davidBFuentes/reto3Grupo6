package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.ConexionBus;
import modelo.Linea;
import modelo.Parada;

public class ParadaDAO {

	/**
	 * Metodo que hace una llamada a la base de datos y obtiene las paradas de la linea recibida como parametro
	 * @param linea
	 * @return
	 */
	public static ArrayList<Parada> mObtenerParadas(Linea linea) {
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		
		String sql= "SELECT Cod_Parada, LEFT(nombre, CHAR_LENGTH(nombre) - LOCATE('(', REVERSE(nombre))) as Nombre, Calle, "
				+ "Latitud, Longitud, Cod_Muni from Parada where Cod_Parada in (select Cod_Parada from linea_parada where cod_linea = ?) ORDER BY Cod_Parada;";
		
		String sql2 = "SELECT Num_Parada FROM linea_parada WHERE Cod_Linea = ? ORDER BY Cod_Parada";
		ArrayList<Parada> listaParadas = new ArrayList<Parada>();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, linea.getCodLinea());
			rs=stm.executeQuery();
			while (rs.next()) {
				Parada parada=new Parada();
				parada.setCodParada(rs.getInt(1));
				parada.setNombre(rs.getString(2));
				parada.setCalle(rs.getString(3));
				parada.setLongitud(rs.getFloat(4));
				parada.setLatitud(rs.getFloat(5));
				parada.setCodigoPostal(rs.getString(6));
				listaParadas.add(parada);
			}
			
			stm=co.prepareStatement(sql2);
			stm.setString(1, linea.getCodLinea());
			rs=stm.executeQuery();
			int i = 0;
			while (rs.next()) {
				
				listaParadas.get(i).setNumParada(rs.getInt(1));
				i++;
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ParadaDAO, m�todo mObtenerParadas");
			e.printStackTrace();
		}
		
		return listaParadas;
	}
	

}
