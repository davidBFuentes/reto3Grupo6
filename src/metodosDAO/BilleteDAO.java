package metodosDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import conexion.ConexionBus;
import modelo.Billete;
import modelo.Cliente;

public class BilleteDAO {
	
	//*** Métodos CRUD ***
	
	public static boolean mRegistrarBillete(Billete billete) {
		boolean registrar = false;
		
		Connection con=null;
		

		String sql = "INSERT INTO cliente (Cod_Billete, Cod_Linea, Cod_Bus,	Cod_Parada_Inicio, Cod_Parada_Fin, Fecha, Hora, DNI, Precio" + 
				") VALUES(?,?,?,?,?,?,?,?,?);"; 
		
		try {
			con=ConexionBus.conectar();
			
		    CallableStatement cs = con.prepareCall(sql);
		    
		    cs.setString(1, billete.getCod_Billete());
		    cs.setString(2, billete.getCod_Linea());
		    cs.setString(3, billete.getCod_Bus());
		    cs.setInt(4, billete.getCod_Parada_Inicio());
		    cs.setInt(5, billete.getCod_Parada_Fin());
		    cs.setString(6, billete.getFecha());
		    cs.setString(5, billete.getHora());
		    cs.setString(6, billete.getDni());
		    cs.setDouble(6, billete.getPrecio());
		    
		    
		    cs.execute();
			
		
		    registrar=true;
		

		} catch (SQLException e) {
			System.out.println("Error: Clase Cliente, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

}
