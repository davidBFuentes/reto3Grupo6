package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBus;

public class ClienteDao {
	
	//*** Métodos CRUD ***
	
	public static boolean mRegistrarCliente(Cliente cliente) {
		boolean registrar = false;
		
		Connection con=null;
		

		String sql = "{ CALL spInsertarCliente(?,?,?,?) }";
		
		try {
			con=ConexionBus.conectar();
			
		    CallableStatement cs = con.prepareCall(sql);
		    
		    cs.setString(1, cliente.getDni());
		    cs.setString(2, cliente.getNombre());
		    cs.setString(3, cliente.getApellido());
		    cs.setString(4, cliente.getSexo());
		    
		    cs.execute();
			
		
		    registrar=true;
		

		} catch (SQLException e) {
			System.out.println("Error: Clase Cliente, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	
	public static ArrayList<Cliente> mObtenerClientes() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="CALL spObtenerClientes()";
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c=new Cliente();
				c.setDNI(rs.getString(1));
				c.setNombre(rs.getString(2));
				c.setApellido(rs.getString(3));
				c.setSexo(rs.getString(4));
				listaClientes.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase Contacto, método mObtenerContactos");
			e.printStackTrace();
		}
		
		return listaClientes;
	}

}
