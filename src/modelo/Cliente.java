package modelo;

import controlador.Codificacion;

/**
 * Clase del objeto cliente
 *
 */
public class Cliente {
		
		//*** Atributos ***
		
		private String dni;
		private String nombre;
		private String apellido;
		private String nacimiento;
		private String sexo;
		private String contrasena;
		

		
		//*** Constructores ***
		
		/**
		 * Constructor del objeto cliente
		 */
		public Cliente(){
			
		}
		
		/**
		 * Constructor del objeto cliente que recibe una serie de parametros para crearlo
		 * @param pDni DNI 
		 * @param pNombre Nombre
		 * @param pApellido Apellido
		 * @param pNacimiento Fecha de nacimiento
		 * @param pSexo Sexo
		 * @param pContrasena Contrasenia
		 */
		public Cliente(String pDni, String pNombre, String pApellido, String pNacimiento, String pSexo, String pContrasena){
			
			this.dni = pDni.toUpperCase();
			this.nombre = pNombre;
			this.apellido = pApellido;
			this.nacimiento= pNacimiento;
			this.sexo = pSexo;
			this.contrasena = Codificacion.md5(pContrasena);
			
		}
		
		//*** Métodos get-set ***
		
		/**
		 * Metodo que devuelve el dni
		 * @return dni
		 */
		public String getDni() {
			return dni;
		}

		/**
		 * Metodo que establece el DNI
		 * @param dni
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}
		
		/**
		 * Metodo que devuelve el nombre
		 * @return nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Metodo que establece el nombre
		 * @param nombre
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * Metodo que devuelve el apellido
		 * @return apellido
		 */
		public String getApellido() {
			return apellido;
		}

		/**
		 * Metodo que establece el apellido
		 * @param apellido
		 */
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		/**
		 * Metodo que devuelve la fecha de nacimiento
		 * @return nacimiento
		 */
		public String getNacimiento() {
			return nacimiento;
		}

		/**
		 * Metodo que establece la fecha de nacimiento
		 * @param nacimiento
		 */
		public void setNacimiento(String nacimiento) {
			this.nacimiento = nacimiento;
		}
		
		/**
		 * Metodo que devuelve el sexo 
		 * @return sexo
		 */
		public String getSexo() {
			return sexo;
		}

		/**
		 * Metodo que establece el sexo 
		 * @param sexo
		 */
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		/**
		 * Metodo que devuelve la contrasenia
		 * @return contrasena
		 */
		public String getContrasena() {
			return contrasena;
		}

		/**
		 * Metodo que establece al contrasenia
		 * @param contrasena
		 */
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}
		
}
