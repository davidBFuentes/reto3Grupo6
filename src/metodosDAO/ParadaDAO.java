package metodosDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBus;
import modelo.Linea;
import modelo.Parada;

public class ParadaDAO {
	
	public static Parada mObtenerParada(Parada parada) {
		
		String sql = "Select * from parada where Cod_Parada = ?;";
		
		return parada;
		
	}
	
	public static ArrayList<Parada> mObtenerParadas(Linea linea) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql= "SELECT * from parada where Cod_Parada in (select Cod_Parada from linea_parada where cod_linea = " + "'" + linea.getCodLinea() + "'" + ");";
		ArrayList<Parada> listaParadas = new ArrayList<Parada>();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
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
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ParadaDAO, método mObtenerParadas");
			e.printStackTrace();
		}
		
		return listaParadas;
	}
	

}
