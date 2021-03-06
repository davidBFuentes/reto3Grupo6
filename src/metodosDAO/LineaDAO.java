package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.ConexionBus;
import modelo.Linea;

public class LineaDAO {
	
	/**
	 * Metodo que hace una llamada a la base de datos y obtiene las lineas
	 * @return
	 */
	public static ArrayList<Linea> mObtenerLineas() {
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT cod_linea, upper(nombre) FROM linea;";
		
		ArrayList<Linea> listalineas = new ArrayList<Linea>();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			rs=stm.executeQuery();
			while (rs.next()) {
				Linea l=new Linea();
				l.setCodLinea(rs.getString(1));
				l.setNombre(rs.getString(2));
				listalineas.add(l);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase LineaDAO, m�todo mObtenerLineas");
			e.printStackTrace();
		}
		
		return listalineas;
	}
	
	/**
	 * M�todo que hace una llamada a la base de datos y obtiene la l�nea solicitada a partir de su c�digo
	 * @param linea
	 * @return
	 */
	public static Linea mObtenerLinea(Linea linea) {
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM linea where Cod_Linea = ?;";
		
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, linea.getCodLinea());
			rs=stm.executeQuery();
			while (rs.next()) {
				Linea l=new Linea();
				l.setCodLinea(rs.getString(1));
				l.setNombre(rs.getString(2));
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase LineaDAO, m�todo mObtenerLinea");
			e.printStackTrace();
		}
		
		return linea;
	}

}
