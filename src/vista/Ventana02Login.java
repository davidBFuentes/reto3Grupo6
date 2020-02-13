package vista;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.ImageIcon;

public class Ventana02Login {

	private JFrame frame;
	private JTextField txtDni;
	private JPasswordField txtContrasena;
	private JButton bIdentificarse;
	private JButton bRegistrarse;
	private JPanel panel;
	private JPanel panel_1;
	private JButton bOmitir;
	
	/*
	 * Constructor de la ventana de login
	 */
	public Ventana02Login() {
	
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearFechaHora();

	}
	
	/*
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
	
	/*
	 * Metodo que crea los paneles de la ventana
	 */
	private void crearPaneles() {
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(29, 29, 1216, 633);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		bOmitir = new JButton("Omitir");
		bOmitir.setVisible(false);
		bOmitir.setFont(new Font("Tahoma", Font.PLAIN, 69));
		bOmitir.setBounds(415, 33, 406, 213);
		panel.add(bOmitir);
		
		JLabel lblCabecera = new JLabel("");
		lblCabecera.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCabecera.setIcon(new ImageIcon(Ventana02Login.class.getResource("/imagenes/cabeceraVentana02.jpg")));
		lblCabecera.setBounds(20, 20, 1174, 257);
		panel.add(lblCabecera);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(20, 294, 1174, 319);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
	}
	
	/*
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {	
		
		bIdentificarse = new JButton("Iniciar sesi\u00F3n");
		bIdentificarse.setFocusPainted(false);
		bIdentificarse.setHorizontalAlignment(SwingConstants.CENTER);
		bIdentificarse.setBounds(835, 30, 296, 116);
		panel_1.add(bIdentificarse);
		bIdentificarse.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		bIdentificarse.setFont(new Font("Tahoma", Font.BOLD, 20));
	}
	
	/*
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(0, 30, 395, 116);
		panel_1.add(lblDni);
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setHorizontalTextPosition(SwingConstants.LEADING);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 50));
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(0, 174, 395, 116);
		panel_1.add(lblContrasena);
		lblContrasena.setHorizontalTextPosition(SwingConstants.LEADING);
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 50));
	}
	
	/*
	 * Metodo que crea los JTextField de la ventana
	 */
	private void crearCamposTexto() {
		
		txtContrasena = new JPasswordField();
		txtContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		txtContrasena.setMargin(new Insets(0, 5, 5, 0));
		txtContrasena.setBounds(390, 175, 395, 116);
		panel_1.add(txtContrasena);
		txtContrasena.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtContrasena.setColumns(10);
		txtContrasena.setBorder(new LineBorder(Color.BLACK, 2));		
		
		txtDni = new JTextField();
		txtDni.setBorder(new LineBorder(Color.BLACK, 2));
		txtDni.setHorizontalAlignment(SwingConstants.CENTER);
		txtDni.setMargin(new Insets(0, 5, 0, 5));
		txtDni.setBounds(390, 30, 395, 116);
		panel_1.add(txtDni);
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtDni.setColumns(10);
		
		bRegistrarse = new JButton("Registrarse");
		bRegistrarse.setFocusPainted(false);
		bRegistrarse.setBounds(835, 175, 296, 116);
		panel_1.add(bRegistrarse);
		bRegistrarse.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		bRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 20));
	}
	
	/*
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	public void crearFechaHora() {
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setBounds(30, 0, 100, 30);
		frame.getContentPane().add(labelFecha);
		labelFecha.setForeground(Color.BLACK);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setBounds(1144, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}

	public JPasswordField getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtContrasena(JPasswordField txtContrasena) {
		this.txtContrasena = txtContrasena;
	}

	public JButton getbIdentificarse() {
		return bIdentificarse;
	}

	public void setbIdentificarse(JButton bIdentificarse) {
		this.bIdentificarse = bIdentificarse;
	}

	public JButton getbOmitir() {
		return bOmitir;
	}

	public void setbOmitir(JButton bOmitir) {
		this.bOmitir = bOmitir;
	}

	public JButton getbRegistrarse() {
		return bRegistrarse;
	}

	public void setbRegistrarse(JButton bRegistrarse) {
		this.bRegistrarse = bRegistrarse;
	}

	public JFrame getLogin() {
		return frame;
	}

	public void setLogin(JFrame login) {
		this.frame = login;
	}
}
