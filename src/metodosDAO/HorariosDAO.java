package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.ConexionBus;
import modelo.Linea;

public class HorariosDAO {
	
	public static ArrayList<String> mObtenerHorarios(Linea linea) {
		
		Connection co = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		
		String sql= "SELECT distinct hora FROM linea_autobus where cod_linea = ? order by hora;";
		
		ArrayList<String> horarios = new ArrayList<String>();
		
		
		try {			

			co= ConexionBus.conectar();
			
			stmt = co.prepareStatement(sql);
			stmt.setString(1, linea.getCodLinea());
			rs = stmt.executeQuery();
			
			while (rs.next()) {	
				String horario;
				horario = (rs.getString(1));
				horarios.add(horario);
			}
			
			stm.close();
			rs.close();
			co.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase HorariosDAO, método mObtenerHorarios");
			e.printStackTrace();
		}
		System.out.println(horarios);
		return horarios;
	}

}
