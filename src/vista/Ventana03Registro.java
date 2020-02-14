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
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


public class Ventana03Registro {

	private JFrame frame;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JPasswordField passContrasena;
	private JPasswordField passContrasena2;
	private JButton btnRegistrarse;
	private JButton btnSalir;
	private JCheckBox CheckHombre;
	private JCheckBox CheckMujer;
	private JTextField txtFechaNacimiento;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtFormatoFecha;
	
	/**
	 * Constructor de la ventana de registro
	 */
	public Ventana03Registro() {
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearCheckBox();
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
		panel_1.setBounds(20, 20, 862, 593);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(901, 294, 293, 319);
		panel.add(panel_2);
		panel_2.setLayout(null);

	}
	
	/**
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnSalir = new JButton("Salir");
		btnSalir.setFocusPainted(false);
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 168, 251, 131);
		panel_2.add(btnSalir);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFocusPainted(false);
		btnRegistrarse.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnRegistrarse.setBounds(21, 20, 251, 131);
		panel_2.add(btnRegistrarse);
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 20));
	}
	
	/**
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblRepetir1 = new JLabel("Repetir contrase\u00F1a");
		lblRepetir1.setBounds(37, 477, 318, 75);
		panel_1.add(lblRepetir1);
		lblRepetir1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRepetir1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRepetir1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 129, 318, 78);
		panel_1.add(lblNombre);
		lblNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(37, 44, 318, 75);
		panel_1.add(lblDni);
		lblDni.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(37, 391, 318, 75);
		panel_1.add(lblContrasena);
		lblContrasena.setHorizontalTextPosition(SwingConstants.LEADING);
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 40));

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(37, 216, 318, 78);
		panel_1.add(lblApellidos);
		lblApellidos.setHorizontalTextPosition(SwingConstants.CENTER);
		lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 40));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ventana03Registro.class.getResource("/imagenes/barikVentana03.jpg")));
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setBounds(901, 22, 293, 254);
		panel.add(lblNewLabel_1);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(37, 305, 318, 75);
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
		txtDni.setBounds(355, 44, 300, 75);
		panel_1.add(txtDni);
		txtDni.setHorizontalAlignment(SwingConstants.CENTER);
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtDni.setColumns(10);
		txtDni.setBorder(new LineBorder(Color.BLACK, 2));
		
		txtNombre = new JTextField();
		txtNombre.setBounds(355, 130, 300, 75);
		panel_1.add(txtNombre);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNombre.setColumns(10);
		txtNombre.setBorder(new LineBorder(Color.BLACK, 2));
		
		txtApellido = new JTextField();
		txtApellido.setBounds(355, 216, 300, 75);
		panel_1.add(txtApellido);
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtApellido.setColumns(10);
		txtApellido.setBorder(new LineBorder(Color.BLACK, 2));
		
		passContrasena = new JPasswordField();
		passContrasena.setBounds(355, 391, 300, 75);
		panel_1.add(passContrasena);
		passContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		passContrasena.setFont(new Font("Tahoma", Font.PLAIN, 40));
		passContrasena.setColumns(10);
		passContrasena.setBorder(new LineBorder(Color.BLACK, 2));
		
		passContrasena2 = new JPasswordField();
		passContrasena2.setBounds(355, 477, 300, 75);
		panel_1.add(passContrasena2);
		passContrasena2.setHorizontalAlignment(SwingConstants.CENTER);
		passContrasena2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		passContrasena2.setColumns(10);
		passContrasena2.setBorder(new LineBorder(Color.BLACK, 2));
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(355, 305, 300, 75);
		panel_1.add(txtFechaNacimiento);
		txtFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		txtFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBorder(new LineBorder(Color.BLACK, 2));
		
	}
	
	/**
	 * Metodo que crea los checkBox de la ventana
	 */
	private void crearCheckBox() {
		
		CheckHombre = new JCheckBox("H");
		CheckHombre.setOpaque(false);
		CheckHombre.setHorizontalAlignment(SwingConstants.CENTER);
		CheckHombre.setBounds(684, 49, 50, 75);
		panel_1.add(CheckHombre);
		CheckHombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(CheckHombre);
		
		CheckMujer = new JCheckBox("M");
		CheckMujer.setOpaque(false);
		CheckMujer.setHorizontalAlignment(SwingConstants.CENTER);
		CheckMujer.setBounds(758, 49, 50, 75);
		panel_1.add(CheckMujer);
		CheckMujer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(CheckMujer);
		
		txtFormatoFecha = new JTextField();
		txtFormatoFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFormatoFecha.setBorder(null);
		txtFormatoFecha.setOpaque(false);
		txtFormatoFecha.setEditable(false);
		txtFormatoFecha.setHorizontalAlignment(SwingConstants.CENTER);
		txtFormatoFecha.setText("Formato aaaa/mm/dd");
		txtFormatoFecha.setBounds(654, 305, 198, 75);
		panel_1.add(txtFormatoFecha);
		txtFormatoFecha.setColumns(10);
			
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
	 * Metodo que devuelve el JFrame frame
	 * @return frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Metodo que establece el atributo frame como el JFrame que recibe como parametro
	 * @param frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Metodo que devuelve el JTextField txtDni
	 * @return txtDni
	 */
	public JTextField getTxtDni() {
		return txtDni;
	}

	/**
	 * Metodo que establece el atributo txtDni como el JTextField que recibe como parametro
	 * @param txtDni
	 */
	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}

	/**
	 * Metodo que devuelve el JTextField txtNombre
	 * @return txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * Metodo que establece el atributo txtNombre como el JTextField que recibe como parametro
	 * @param txtNombre
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * Metodo que devuelve el JTextField txtApelllido
	 * @return txtApellido
	 */
	public JTextField getTxtApellido() {
		return txtApellido;
	}

	/**
	 * Metodo que establece el atributo txtApellido como el JTextField que recibe como parametro
	 * @param txtApellido
	 */
	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	/**
	 * Metodo que devuelve el JPasswordField passContrasena
	 * @return passContrasena
	 */
	public JPasswordField getPassContrasena() {
		return passContrasena;
	}

	/**
	 * Metodo que establece el atributo passContrasena como el JPasswordField que recibe como parametro
	 * @param passContrasena
	 */
	public void setPassContrasena(JPasswordField passContrasena) {
		this.passContrasena = passContrasena;
	}

	/**
	 * Metodo que devuelve el JPasswordField passContrasena2
	 * @return frame
	 */
	public JPasswordField getPassContrasena2() {
		return passContrasena2;
	}

	/**
	 * Metodo que establece el atributo passContrasena2 como el JPasswordField que recibe como parametro
	 * @param passContrasena2
	 */
	public void setPassContrasena2(JPasswordField passContrasena2) {
		this.passContrasena2 = passContrasena2;
	}

	/**
	 * Metodo que devuelve el JButton btnRegistrarse
	 * @return btnRegistrarse
	 */
	public JButton getBtnRegistrarse() {
		return btnRegistrarse;
	}

	/**
	 * Metodo que establece el atributo btnRegistrarse como el JButton que recibe como parametro
	 * @param btnRegistrarse
	 */
	public void setBtnRegistrarse(JButton btnRegistrarse) {
		this.btnRegistrarse = btnRegistrarse;
	}

	/**
	 * Metodo que devuelve el JButton btnSalir
	 * @return btnSalir
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * Metodo que establece el atributo btnSalir como el JButton que recibe como parametro
	 * @param btnSalir
	 */
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	/**
	 * Metodo que devuelve el CheckBox CheckHombre
	 * @return frame
	 */
	public JCheckBox getCheckHombre() {
		return CheckHombre;
	}

	/**
	 * Metodo que establece el atributo CheckHombre como el JCheckBox que recibe como parametro
	 * @param CheckHombre
	 */
	public void setCheckHombre(JCheckBox checkHombre) {
		CheckHombre = checkHombre;
	}
	
	/**
	 * Metodo que devuelve el JCheckBox CheckMujer
	 * @return frame
	 */
	public JCheckBox getCheckMujer() {
		return CheckMujer;
	}

	/**
	 * Metodo que establece el atributo CheckMujer como el JCheckBoX que recibe como parametro
	 * @param CheckMujer
	 */
	public void setCheckMujer(JCheckBox checkMujer) {
		CheckMujer = checkMujer;
	}

	/**
	 * Metodo que devuelve el JTextField txtFechaNacimiento
	 * @return txtFechaNacimiento
	 */
	public JTextField getTxtFechaNacimiento() {
		return txtFechaNacimiento;
	}

	/**
	 * Metodo que establece el atributo txtFechaNacimiento como el JTextField que recibe como parametro
	 * @param txtFechaNacimiento
	 */
	public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
		this.txtFechaNacimiento = txtFechaNacimiento;
	}
}