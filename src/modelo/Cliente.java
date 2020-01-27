package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBus;

public class Cliente {
		
		//*** Atributos ***
		
		private String dni;
		private String nombre;
		private String apellido;
		private String sexo;
		

		
		//*** Constructores ***
		
		public Cliente(){
			
		}
		
		public Cliente(String pDni, String pNombre, String pApellido1, String pSexo){
			
			this.dni = pDni;
			this.nombre = pNombre;
			this.apellido = pApellido1;			
			this.sexo = pSexo;
			
		}
		
		
		//*** Métodos get-set ***
		
		public String getDni() {
			return dni;
		}

		public void setDNI(String dNI) {
			dni = dNI;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido1) {
			this.apellido = apellido1;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		


}
