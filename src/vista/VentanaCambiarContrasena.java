package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class VentanaCambiarContrasena {

	private JFrame frame;
	private JPanel panel_1;
	private JPanel panel;
	private JTextField txtEscribaPass;
	private JTextField txtRepitePass;
	private JPasswordField passContrasena1;
	private JPasswordField passContrasena2;
	private JPanel panel_2;
	private JButton btnVolver;
	private JPanel panel_3;
	private JButton btnSalir;
	private JButton btnCambiarContrasena;
	
	/**
	 * Constructor de la ventana para cambiar contraseña
	 */
	public VentanaCambiarContrasena() {
		
		crearVentana();
		crearPaneles();
		crearEtiquetas();
		crearBotones();
		crearCamposDeTexto();
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
		panel_1.setBounds(20, 21, 1174, 419);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBounds(20, 458, 287, 155);
		panel.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBounds(907, 458, 287, 155);
		panel.add(panel_3);
		
	}
		
	/**
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnCambiarContrasena = new JButton("Cambiar contrase\u00F1a");
		btnCambiarContrasena.setFocusPainted(false);
		btnCambiarContrasena.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCambiarContrasena.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCambiarContrasena.setBounds(393, 316, 392, 78);
		panel_1.add(btnCambiarContrasena);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setBounds(20, 20, 247, 115);
		panel_2.add(btnVolver);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setFocusPainted(false);
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(20, 20, 247, 115);
		panel_3.add(btnSalir);
		
	}
	

	private void crearEtiquetas() {
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblImagen.setIcon(new ImageIcon(VentanaCambiarContrasena.class.getResource("/imagenes/imagenCambiarContrasena.jpg")));
		lblImagen.setBounds(325, 458, 560, 155);
		panel.add(lblImagen);

	}
	
	/**
	 * Metodo que crea los JTextField de la ventana
	 */
	private void crearCamposDeTexto() {
		
	
		txtEscribaPass = new JTextField();
		txtEscribaPass.setEditable(false);
		txtEscribaPass.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscribaPass.setBorder(null);
		txtEscribaPass.setOpaque(false);
		txtEscribaPass.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtEscribaPass.setText("Escriba la nueva contrase\u00F1a");
		txtEscribaPass.setBounds(0, 36, 602, 105);
		panel_1.add(txtEscribaPass);
		txtEscribaPass.setColumns(10);
		
		txtRepitePass = new JTextField();
		txtRepitePass.setEditable(false);
		txtRepitePass.setHorizontalAlignment(SwingConstants.CENTER);
		txtRepitePass.setBorder(null);
		txtRepitePass.setOpaque(false);
		txtRepitePass.setText("Repita la nueva contrase\u00F1a");
		txtRepitePass.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtRepitePass.setColumns(10);
		txtRepitePass.setBounds(0, 184, 602, 105);
		panel_1.add(txtRepitePass);
		
		passContrasena1 = new JPasswordField();
		passContrasena1.setHorizontalAlignment(SwingConstants.CENTER);
		passContrasena1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		passContrasena1.setColumns(10);
		passContrasena1.setBorder(new LineBorder(Color.BLACK, 2));
		passContrasena1.setBounds(601, 36, 485, 105);
		panel_1.add(passContrasena1);
		
		
		passContrasena2 = new JPasswordField();
		passContrasena2.setHorizontalAlignment(SwingConstants.CENTER);
		passContrasena2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		passContrasena2.setColumns(10);
		passContrasena2.setBorder(new LineBorder(Color.BLACK, 2));
		passContrasena2.setBounds(601, 184, 485, 105);
		panel_1.add(passContrasena2);
	}

	/**
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	private void crearFechaHora() {
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setBounds(30, 0, 100, 30);
		frame.getContentPane().add(labelFecha);
		labelFecha.setForeground(Color.BLACK);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setBounds(1144, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnCambiarContrasena() {
		return btnCambiarContrasena;
	}

	public void setBtnCambiarContrasena(JButton btnCambiarContrasena) {
		this.btnCambiarContrasena = btnCambiarContrasena;
	}

	public JPasswordField getPassContrasena1() {
		return passContrasena1;
	}

	public void setPassContrasena1(JPasswordField passContrasena1) {
		this.passContrasena1 = passContrasena1;
	}

	public JPasswordField getPassContrasena2() {
		return passContrasena2;
	}

	public void setPassContrasena2(JPasswordField passContrasena2) {
		this.passContrasena2 = passContrasena2;
	}
}