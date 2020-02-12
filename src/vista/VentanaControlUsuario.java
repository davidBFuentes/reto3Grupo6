package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;

import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaControlUsuario {
	
	private JFrame frame;
	private JButton btnHistorial;
	private JButton btnVolver;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnSalir;
	private JPanel panel_3;
	private JButton btnCambiarPass;
	private JButton btnPerfil;
	private JLabel lblImagenFondo;
	
	public VentanaControlUsuario() {
		
		crearVentana();
		crearPaneles();
		crearBotones();
		crearFechaHora();
		
	}

	private void crearVentana() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
	}
	
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
		panel_1.setBounds(20, 458, 287, 155);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBounds(904, 458, 287, 155);
		panel.add(panel_2);
		
	}
	
	private void crearBotones() {
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(20, 20, 247, 115);
		panel_1.add(btnVolver);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setFocusPainted(false);
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(20, 20, 247, 115);
		panel_2.add(btnSalir);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBounds(20, 24, 1171, 155);
		panel.add(panel_3);
		
		btnHistorial = new JButton("Historial de compras");
		btnHistorial.setBounds(440, 23, 248, 108);
		panel_3.add(btnHistorial);
		btnHistorial.setFocusPainted(false);
		btnHistorial.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnHistorial.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnCambiarPass = new JButton("Cambiar Contrase\u00F1a");
		btnCambiarPass.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCambiarPass.setFocusPainted(false);
		btnCambiarPass.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCambiarPass.setBounds(893, 23, 248, 108);
		panel_3.add(btnCambiarPass);
		
		btnPerfil = new JButton("Ver perfil");
		btnPerfil.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPerfil.setFocusPainted(false);
		btnPerfil.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnPerfil.setBounds(21, 23, 248, 108);
		panel_3.add(btnPerfil);
		
		lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(VentanaControlUsuario.class.getResource("/imagenes/fondoPerfil.png")));
		lblImagenFondo.setBounds(20, 198, 1171, 415);
		panel.add(lblImagenFondo);
		
	}
	
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

	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public JButton getBtnHistorial() {
		return btnHistorial;
	}


	public void setBtnHistorial(JButton btnHistorial) {
		this.btnHistorial = btnHistorial;
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

	public JButton getBtnCambiarPass() {
		return btnCambiarPass;
	}

	public void setBtnCambiarPass(JButton btnCambiarPass) {
		this.btnCambiarPass = btnCambiarPass;
	}

	public JButton getBtnPerfil() {
		return btnPerfil;
	}

	public void setBtnPerfil(JButton btnPerfil) {
		this.btnPerfil = btnPerfil;
	}
}
