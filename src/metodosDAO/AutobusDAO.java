package metodosDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import conexion.ConexionBus;
import modelo.Autobus;
import modelo.Billete;

public class AutobusDAO {
	
	//*** M�todos CRUD ***
	
	public static Autobus mObtenerBus(Billete billete) {
		
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		System.out.print(billete.getCod_Linea());
		System.out.println(billete.getHora());
		
		
		String sql = "SELECT * FROM autobus WHERE Cod_bus in (SELECT Cod_bus FROM linea_autobus WHERE Cod_Linea = '" + billete.getCod_Linea() + "' && Hora = '" + billete.getHora() + "');"; 
		
		Autobus autobus = new Autobus();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
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
			System.out.println("Error: Clase AutobusDAO, m�todo mObtenerBus");
			e.printStackTrace();
		}
		
		return autobus;
		
	}
	
	public boolean mComprobarAsientosLibres(Autobus autobus, Billete billete) {
		
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql = "SELECT max(Cod_Billete) from billete where Fecha = '" + billete.getFecha() + "' && Cod_Bus = '" + billete.getCod_Bus() + "' && Hora = '" + billete.getHora() + "';"; 
		int billetesvendidos = 0;
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				
				billetesvendidos = (rs.getInt(1)); 
					
			}
			
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AutobusDAO, m�todo mObtenerAsientosLibres");
			e.printStackTrace();
		}
		
		if (autobus.getNumPlazas() - billetesvendidos == 0) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	
}
