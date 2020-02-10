package metodosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.ConexionBus;
import modelo.Autobus;
import modelo.Billete;

public class AutobusDAO {
	
	//*** Métodos CRUD ***
	/**
	 * Metodo que obtiene que hace una llamada a la base de datos y obtiene los atributos del objeto autobus en funcion de la linea escogida en el billete
	 * @param billete
	 * @return
	 */
	public static Autobus mObtenerBus(Billete billete) {
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		

		
		
		String sql = "SELECT * FROM autobus WHERE Cod_bus = (SELECT Cod_bus FROM linea_autobus WHERE Cod_Linea = ? && Fecha = ? && Hora = ?);"; 
		
		Autobus autobus = new Autobus();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, billete.getCod_Linea());
			stm.setString(2, billete.getFecha());
			stm.setString(3, billete.getHora());
			rs=stm.executeQuery();
			
			while (rs.next()) {
				autobus.setCodAutobus((rs.getString(1))); 
				autobus.setNumPlazas((rs.getInt(2))); 
				autobus.setConsumo((rs.getDouble(3))); 
				autobus.setColor((rs.getString(4))); 
				
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AutobusDAO, método mObtenerBus");
			e.printStackTrace();
		}
		
		return autobus;
		
	}
	
	/**
	 * 
	 * @param autobus
	 * @param billete
	 * @return
	 */
	public static boolean mComprobarAsientosLibres(Autobus autobus, Billete billete) {
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		
		String sql = "SELECT count(Cod_Billete) from billete where Fecha = ? && Cod_Bus = ? && Hora = ?;"; 
		int billetesvendidos = 0;
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, billete.getFecha());
			stm.setString(2, billete.getCod_Bus());
			stm.setString(3, billete.getHora());
			rs=stm.executeQuery();
			while (rs.next()) {
				
				billetesvendidos = (rs.getInt(1)); 
					
			}
			
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AutobusDAO, método mObtenerAsientosLibres");
			e.printStackTrace();
		}
		System.out.println(autobus.getNumPlazas());
		System.out.println(billetesvendidos);
		if (autobus.getNumPlazas() - billetesvendidos == 0) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	
}
