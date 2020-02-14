package metodosDAO;

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
	
	/**
	 * Metodo que hace una llamada a la base de datos y registra el cliente recibido como parametro
	 * @param cliente
	 * @return
	 */
	public static boolean mRegistrarCliente(Cliente cliente) {
		
		boolean registrar = false;
		
		Connection co =null;
		PreparedStatement stm= null;
		
		String sql = "INSERT INTO cliente (DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) VALUES(?,?,?,?,?,?);"; 
		
		try {
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, cliente.getDni());
			stm.setString(2, cliente.getNombre());
			stm.setString(3, cliente.getApellido());
			stm.setString(4, cliente.getNacimiento());
			stm.setString(5, cliente.getSexo());
			stm.setString(6, cliente.getContrasena());
			stm.execute();
		    registrar=true;
		    stm.close();
			co.close();
		    
		} catch (SQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(null, "Este DNI ya está registrado", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDAO, método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}
	
	/**
	 * Metodo que trae de la base de datos los datos del usuario introducido
	 * @param dni
	 * @param contrasena
	 * @return
	 */
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
			System.out.println("Error: Clase ClienteDAO, método mIdentificarCliente");
			e.printStackTrace();
		}
		
		return cliente;
	}
	
	/**
	 * Metodo que actualiza la contraseña del usuario introducido
	 * @param cliente
	 * @return
	 */
	public static boolean mCambiarContrasena(Cliente cliente) {
		
		boolean cambiar = false;
		
		Connection co =null;
		PreparedStatement stm= null;

		String sql = "UPDATE cliente set Contraseña = ? WHERE DNI = ?;"; 
		
		try {			
			co= ConexionBus.conectar();
			stm=co.prepareStatement(sql);
			stm.setString(1, cliente.getContrasena());
			stm.setString(2, cliente.getDni());
			stm.executeUpdate();
			cambiar = true;
			stm.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDAO, método mCambiarContrasena");
			e.printStackTrace();
		}
		
		return cambiar;
	}

}
