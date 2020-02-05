package metodosDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import conexion.ConexionBus;
import modelo.Linea;

public class HorariosDAO {
	
	public static ArrayList<String> mObtenerHorarios(Linea linea, int dia, int año, int mes) {
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		
		
		String sql= "SELECT distinct hora FROM linea_autobus where cod_linea = ? and fecha = ?-?-? order by hora;";
		
		ArrayList<String> horarios = new ArrayList<String>();
		
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, linea.getCodLinea());
			stm.setInt(2, año);
			stm.setInt(3, mes);
			stm.setInt(2, dia);
			rs=stm.executeQuery(sql);
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
