package metodosDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBus;
import modelo.Billete;
import modelo.Cliente;

public class BilleteDAO {
	
	//*** Métodos CRUD ***
	
	public static boolean mRegistrarBillete(Billete billete) {
		boolean registrar = false;
		
		Connection con=null;
		

		String sql = "INSERT INTO billete (Cod_Billete, Cod_Linea, Cod_Bus,	Cod_Parada_Inicio, Cod_Parada_Fin, Fecha, Hora, DNI, Precio" + 
				") VALUES(?,?,?,?,?,?,?,?,?);"; 
		
		try {
			con=ConexionBus.conectar();
			
		    CallableStatement cs = con.prepareCall(sql);
		    
		    cs.setInt(1, billete.getCod_Billete());
		    cs.setString(2, billete.getCod_Linea());
		    cs.setString(3, billete.getCod_Bus());
		    cs.setInt(4, billete.getCod_Parada_Inicio());
		    cs.setInt(5, billete.getCod_Parada_Fin());
		    cs.setString(6, billete.getFecha());
		    cs.setString(7, billete.getHora());
		    cs.setString(8, billete.getDni());
		    cs.setDouble(9, billete.getPrecio());
		    
		    
		    cs.execute();
			
		
		    registrar=true;
		

		} catch (SQLException e) {
			System.out.println("Error: Clase Cliente, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	
	public static int mObtenerCodigoBillete(Billete billete) {
		
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		int codigoBillete = 0;
		
		String sql="SELECT max(cod_billete) FROM billete;";
			
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				codigoBillete = (rs.getInt(1));
				
				if (codigoBillete > 0){
					
					codigoBillete = (rs.getInt(1)+1);
					
				}else {
					
					codigoBillete = 1;
				}
			}
			stm.close();
			rs.close();
			co.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase BilleteDAO, método mObtenerCodigoBillete");
			e.printStackTrace();
		}
		
		return codigoBillete;
		
	}

}
