package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBus;
import modelo.Linea;

public class LineaDAO {
	
	public static ArrayList<Linea> mObtenerLineas() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT cod_linea, upper(nombre) FROM linea;";
		
		ArrayList<Linea> listalineas = new ArrayList<Linea>();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
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
			System.out.println("Error: Clase LineaDAO, método mObtenerLineas");
			e.printStackTrace();
		}
		
		return listalineas;
	}
	
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
			System.out.println("Error: Clase LineaDAO, método mObtenerLinea");
			e.printStackTrace();
		}
		
		
		return linea;
	}

}
