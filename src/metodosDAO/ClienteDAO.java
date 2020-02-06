package metodosDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

import conexion.ConexionBus;
import modelo.Cliente;

public class ClienteDAO {
	
	//*** Métodos CRUD ***
	
	public static boolean mRegistrarCliente(Cliente cliente) {
		boolean registrar = false;
		
		Connection con=null;
		

		String sql = "INSERT INTO cliente (DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) VALUES(upper(?),?,?,?,?,?);"; 
		
		try {
			con=ConexionBus.conectar();
			
		    CallableStatement cs = con.prepareCall(sql);
		    
		    cs.setString(1, cliente.getDni());
		    cs.setString(2, cliente.getNombre());
		    cs.setString(3, cliente.getApellido());
		    cs.setString(4, cliente.getNacimiento());
		    cs.setString(5, cliente.getSexo());
		    cs.setString(6, cliente.getContrasena());
		    
		    cs.execute();
			
		
		    registrar=true;
		    
		} catch (SQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(null, "Este DNI ya está registrado", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase Cliente, método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}
	
	public static Cliente mIdentificarCliente(String dni, String contrasena) {
		
		Connection co =null;
		PreparedStatement stm= null;
		ResultSet rs=null;
		
		
		Cliente cliente = new Cliente();
		
		String sql="SELECT * from cliente where dni = ? and contraseña = ?;";

		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, dni);
			stm.setString(2, contrasena);
			rs=stm.executeQuery();
			while (rs.next()) {
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setNacimiento(rs.getString(4));
				cliente.setSexo(rs.getString(5));
				cliente.setContrasena(rs.getString(6));
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase LineaDAO, método mObtenerLineas");
			e.printStackTrace();
		}
		
		return cliente;
	}

}
