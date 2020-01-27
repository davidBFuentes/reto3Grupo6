package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexionBus {
	
	public static Connection conectar() {
		Connection con = null;
		
		String password = "";
		String usuario = "root"; //root@localhost
		String url = "jdbc:mysql://localhost:3306/termibus?user=" + usuario
				                                     + "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return con;
	}

}
