package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
/**
 * Metodo que crea la ventana de perfil del usuario
 */

public class VentanaPerfil {

	private JFrame frame;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JButton btnVolver;
	private JButton btnSalir;
	private JTextField txtFechaNacimiento;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_4;
	private JPanel panel_4_1;
	private JLabel lblImagen;
	
	/**
	 * Constructor de la ventana perfil
	 */
	public VentanaPerfil() {
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearFechaHora();
	}
		
	/**
	 * Metodo que crea la ventana
	 */
	private void crearVentana() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
	}
	
	/**
	 * Metodo que crea los paneles de la ventana
	 */
	private void crearPaneles() {
		
	    panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(29, 29, 1216, 633);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(20, 20, 1174, 411);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBackground(new Color(245, 245, 220));
		panel_4.setBounds(20, 458, 287, 155);
		panel.add(panel_4);
		
		panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4_1.setBackground(new Color(245, 245, 220));
		panel_4_1.setBounds(907, 458, 287, 155);
		panel.add(panel_4_1);
		
		lblImagen = new JLabel("");
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblImagen.setIcon(new ImageIcon(VentanaPerfil.class.getResource("/imagenes/perfil.jpg")));
		lblImagen.setBounds(325, 458, 560, 155);
		panel.add(lblImagen);

	}
	
	/**
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setBounds(20, 20, 247, 115);
		panel_4.add(btnVolver);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(20, 20, 247, 115);
		panel_4_1.add(btnSalir);
		btnSalir.setFocusPainted(false);
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	}
		
	/**
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(271, 106, 318, 78);
		panel_1.add(lblNombre);
		lblNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(271, 21, 318, 75);
		panel_1.add(lblDni);
		lblDni.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 40));

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(271, 193, 318, 78);
		panel_1.add(lblApellidos);
		lblApellidos.setHorizontalTextPosition(SwingConstants.CENTER);
		lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(271, 282, 318, 75);
		panel_1.add(lblFechaDeNacimiento);
		lblFechaDeNacimiento.setHorizontalTextPosition(SwingConstants.LEADING);
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 30));

	}
	
	/**
	 * Metodo que crea los JTextField de la ventana
	 */
	private void crearCamposTexto() {
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setOpaque(false);
		txtDni.setBounds(589, 21, 300, 75);
		panel_1.add(txtDni);
		txtDni.setHorizontalAlignment(SwingConstants.CENTER);
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtDni.setColumns(10);
		txtDni.setBorder(null);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setOpaque(false);
		txtNombre.setBounds(589, 107, 300, 75);
		panel_1.add(txtNombre);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setOpaque(false);
		txtApellido.setBounds(589, 193, 300, 75);
		panel_1.add(txtApellido);
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtApellido.setColumns(10);
		txtApellido.setBorder(null);
		
		
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setEditable(false);
		txtFechaNacimiento.setOpaque(false);
		txtFechaNacimiento.setBounds(589, 282, 300, 75);
		panel_1.add(txtFechaNacimiento);
		txtFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		txtFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBorder(null);
		
	}

	/**
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	public void crearFechaHora() {
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setBounds(30, 0, 100, 30);
		frame.getContentPane().add(labelFecha);
		labelFecha.setForeground(Color.BLACK);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setBounds(1145, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
	}
	/**
	 * metodo que devuelve el frame de la ventana
	 * @return frame de la ventan
	 */
	public JFrame getFrame() {
		return frame;
	}
	/**
	 * metodo que cambia el frame de la ventana por el que se le pasa por parametro
	 * @param nuevo frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	/**
	 * Metodo que devuelve el dni que esta escrito
	 * @return dni
	 */
	public JTextField getTxtDni() {
		return txtDni;
	}

	/**
	 * Metodo que cambia el dni por el que se le pasa por parametro
	 * @param nuevo dni
	 */
	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}
	/**
	 * Metodo que devuelve el nombre escrito
	 * @return nombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	/**
	 * Metodo que cambia el nombre escrito por el que se le pasa por parametro
	 * @param nuevo nombre
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * devuelve los apellidos escritos
	 * @return apellidos
	 */
	public JTextField getTxtApellido() {
		return txtApellido;
	}
	/**
	 * metodo que cambia los apellidos por los que se le pasa por parametro
	 * @param nuevos apellidos
	 */

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	/**
	 * devuelve el boton salir
	 * @return boton salir
	 */

	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * Metodo que devuelve la fecha de nacimiento escrita
	 * @return fecha de nacimiento
	 */

	public JTextField getTxtFechaNacimiento() {
		return txtFechaNacimiento;
	}
	/**
	 * Metodo que cambia la fecha de nacimiento por otra pasada por parametro
	 * @param nueva fecha de nacimiento
	 */
	public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
		this.txtFechaNacimiento = txtFechaNacimiento;
	}
	/**
	 * Metodo que devuelve el boton volver
	 * @return boton volver
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}


	
}
