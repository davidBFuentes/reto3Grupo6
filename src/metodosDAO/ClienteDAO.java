package metodosDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public static boolean mIdentificarCliente(Cliente cliente) {
		
		boolean login = false;
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		listaClientes = mObtenerClientes();
		
		for(Cliente cliente1: listaClientes) {
			if (cliente1.getDni().equals(cliente.getDni()) && cliente1.getContrasena().equals(cliente.getContrasena())) {
				cliente.setNombre(cliente1.getNombre());
				cliente.setApellido(cliente1.getApellido());
				cliente.setDni(cliente1.getDni());
				cliente.setNacimiento(cliente1.getNacimiento());
				cliente.setSexo(cliente1.getSexo());
				login = true;		
			}
		}
		
		return login;
	}
	
	
	
	public static ArrayList<Cliente> mObtenerClientes() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM cliente;";
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		try {			
			co= ConexionBus.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c=new Cliente();
				c.setDni(rs.getString(1));
				c.setNombre(rs.getString(2));
				c.setApellido(rs.getString(3));
				c.setNacimiento(rs.getString(4));
				c.setSexo(rs.getString(5));
				c.setContrasena(rs.getString(6));
				listaClientes.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase Cliente, método mObtenerClientes");
			e.printStackTrace();
		}
		
		return listaClientes;
	}

}
