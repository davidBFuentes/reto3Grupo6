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
import java.awt.SystemColor;


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
	
	
	public Ventana03Registro() {
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearCheckBox();
		crearFechaHora();
	}
		
	private void crearVentana() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
	}
	
	private void crearPaneles() {
		
	    panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(32, 25, 1198, 623);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(18, 22, 856, 584);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(896, 287, 285, 319);
		panel.add(panel_2);
		panel_2.setLayout(null);

	}
	
	private void crearBotones() {
		
		btnSalir = new JButton("Salir");
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 167, 247, 115);
		panel_2.add(btnSalir);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnRegistrarse.setBounds(21, 30, 247, 115);
		panel_2.add(btnRegistrarse);
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 20));
	}
		
	private void crearEtiquetas() {
		
		JLabel lblRepetir1 = new JLabel("Repetir contrase\u00F1a");
		lblRepetir1.setBounds(48, 465, 318, 75);
		panel_1.add(lblRepetir1);
		lblRepetir1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblRepetir1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRepetir1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(48, 117, 318, 78);
		panel_1.add(lblNombre);
		lblNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(48, 32, 318, 75);
		panel_1.add(lblDni);
		lblDni.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(48, 379, 318, 75);
		panel_1.add(lblContrasena);
		lblContrasena.setHorizontalTextPosition(SwingConstants.LEADING);
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 40));

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(48, 204, 318, 78);
		panel_1.add(lblApellido);
		lblApellido.setHorizontalTextPosition(SwingConstants.CENTER);
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 40));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ventana03Registro.class.getResource("/imagenes/barik.jpg")));
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setBounds(896, 21, 285, 244);
		panel.add(lblNewLabel_1);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(48, 293, 318, 75);
		panel_1.add(lblFechaDeNacimiento);
		lblFechaDeNacimiento.setHorizontalTextPosition(SwingConstants.LEADING);
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 30));

	}
	
	private void crearCamposTexto() {
		
		txtDni = new JTextField();
		txtDni.setBounds(366, 32, 300, 75);
		panel_1.add(txtDni);
		txtDni.setHorizontalAlignment(SwingConstants.CENTER);
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtDni.setColumns(10);
		txtDni.setBorder(new LineBorder(Color.BLACK, 2));
		
		txtNombre = new JTextField();
		txtNombre.setBounds(366, 118, 300, 75);
		panel_1.add(txtNombre);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNombre.setColumns(10);
		txtNombre.setBorder(new LineBorder(Color.BLACK, 2));
		
		txtApellido = new JTextField();
		txtApellido.setBounds(366, 204, 300, 75);
		panel_1.add(txtApellido);
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtApellido.setColumns(10);
		txtApellido.setBorder(new LineBorder(Color.BLACK, 2));
		
		passContrasena = new JPasswordField();
		passContrasena.setBounds(366, 379, 300, 75);
		panel_1.add(passContrasena);
		passContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		passContrasena.setFont(new Font("Tahoma", Font.PLAIN, 40));
		passContrasena.setColumns(10);
		passContrasena.setBorder(new LineBorder(Color.BLACK, 2));
		
		passContrasena2 = new JPasswordField();
		passContrasena2.setBounds(366, 465, 300, 75);
		panel_1.add(passContrasena2);
		passContrasena2.setHorizontalAlignment(SwingConstants.CENTER);
		passContrasena2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		passContrasena2.setColumns(10);
		passContrasena2.setBorder(new LineBorder(Color.BLACK, 2));
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(366, 293, 300, 75);
		panel_1.add(txtFechaNacimiento);
		txtFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		txtFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBorder(new LineBorder(Color.BLACK, 2));
		
	}
	
	private void crearCheckBox() {
		
		CheckHombre = new JCheckBox("H");
		CheckHombre.setOpaque(false);
		CheckHombre.setHorizontalAlignment(SwingConstants.CENTER);
		CheckHombre.setBounds(695, 37, 50, 75);
		panel_1.add(CheckHombre);
		CheckHombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(CheckHombre);
		
		CheckMujer = new JCheckBox("M");
		CheckMujer.setOpaque(false);
		CheckMujer.setHorizontalAlignment(SwingConstants.CENTER);
		CheckMujer.setBounds(769, 37, 50, 75);
		panel_1.add(CheckMujer);
		CheckMujer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(CheckMujer);
			
	}
	
	public void crearFechaHora() {
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setBounds(48, 0, 82, 26);
		frame.getContentPane().add(labelFecha);
		labelFecha.setForeground(Color.BLACK);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setBounds(1120, 0, 95, 26);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JPasswordField getPassContrasena() {
		return passContrasena;
	}

	public void setPassContrasena(JPasswordField passContrasena) {
		this.passContrasena = passContrasena;
	}

	public JPasswordField getPassContrasena2() {
		return passContrasena2;
	}

	public void setPassContrasena2(JPasswordField passContrasena2) {
		this.passContrasena2 = passContrasena2;
	}

	public JButton getBtnRegistrarse() {
		return btnRegistrarse;
	}

	public void setBtnRegistrarse(JButton btnRegistrarse) {
		this.btnRegistrarse = btnRegistrarse;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JCheckBox getCheckHombre() {
		return CheckHombre;
	}

	public void setCheckHombre(JCheckBox checkHombre) {
		CheckHombre = checkHombre;
	}

	public JCheckBox getCheckMujer() {
		return CheckMujer;
	}

	public void setCheckMujer(JCheckBox checkMujer) {
		CheckMujer = checkMujer;
	}

	public JTextField getTxtFechaNacimiento() {
		return txtFechaNacimiento;
	}

	public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
		this.txtFechaNacimiento = txtFechaNacimiento;
	}
}