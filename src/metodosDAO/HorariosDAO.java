package metodosDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import conexion.ConexionBus;
import modelo.Linea;

public class HorariosDAO {
	
	public static ArrayList<String> mObtenerHorarios(Linea linea) {
		
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql= "SELECT distinct hora FROM linea_autobus where cod_linea = '" + linea.getCodLinea() +"';";
		
		ArrayList<String> horarios = new ArrayList<String>();
		
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
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
