package modelo;

import controlador.Codificacion;

public class Cliente {
		
		//*** Atributos ***
		
		private String dni;
		private String nombre;
		private String apellido;
		private String nacimiento;
		private String sexo;
		private String contrasena;
		

		
		//*** Constructores ***
		
		public Cliente(){
			
		}
		
		public Cliente(String pDni, String pNombre, String pApellido, String pNacimiento, String pSexo, String pContrasena){
			
			this.dni = pDni.toUpperCase();
			this.nombre = pNombre;
			this.apellido = pApellido;
			this.nacimiento= pNacimiento;
			this.sexo = pSexo;
			this.contrasena = Codificacion.md5(pContrasena);
			
		}
		
		//*** Métodos get-set ***

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
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

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getNacimiento() {
			return nacimiento;
		}

		public void setNacimiento(String nacimiento) {
			this.nacimiento = nacimiento;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getContrasena() {
			return contrasena;
		}

		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}
		
}
