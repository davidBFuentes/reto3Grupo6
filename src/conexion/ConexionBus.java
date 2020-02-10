package conexion;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConexionBus {
	
	/**
	 * Metodo que
	 *  crea la conexion con la base de datos
	 * @return Devuelve la conexion con la base de datos
	 */
	public static Connection conectar() {
		Connection con = null;
		String password = null;
		String usuario = null; 
		
			File archivoConexion = new File("datosconexion.txt");
			Scanner lector;
			try {
				lector = new Scanner(archivoConexion);
				usuario = lector.nextLine();
				password = lector.nextLine();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				

		
		
		String url = "jdbc:mysql://localhost:3306/reto3dam?user=" + usuario
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
