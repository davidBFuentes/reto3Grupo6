package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import conexion.ConexionBus;
import modelo.Linea;

public class HorariosDAO {
	
	/**
	 * Metodo que hace una llamada a la base de datos y obtiene los horarios de la linea recibida como parametro
	 * @param linea
	 * @return
	 */
	public static ArrayList<LocalTime> mObtenerHorarios(Linea linea) {
		
		Connection co = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");	
		LocalTime horaFormateada = null;

		
		String sql= "SELECT distinct hora FROM linea_autobus where cod_linea = ? order by hora;";
		
		ArrayList<LocalTime> horarios = new ArrayList<LocalTime>();
		
		
		try {			

			co= ConexionBus.conectar();
			
			stmt = co.prepareStatement(sql);
			stmt.setString(1, linea.getCodLinea());
			rs = stmt.executeQuery();
			
			while (rs.next()) {	
				String horario;
				horario = (rs.getString(1));
				horaFormateada = LocalTime.parse(horario, formatoHora);
				horarios.add(horaFormateada);
			}
			
			stmt.close();
			rs.close();
			co.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase HorariosDAO, método mObtenerHorarios");
			e.printStackTrace();
		}
		//System.out.println(horarios);
		return horarios;
	}

}
