package vista;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Font;


import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import java.awt.Color;
import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;


public class Ventana04Trayectos {

	private JFrame frame;
	private JButton btnSalir;
	private JButton btnContinuar;
	private JComboBox<String> comboLineas;
	private JLabel lblFondoCiudad;
	private JPanel panel;
	private JPanel panel_2;
	
	public Ventana04Trayectos() {
		
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearFechaHora();
		crearCombobox();

	}
	
	private void crearVentana() {
		
		frame = new JFrame();
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
		panel.setBounds(32, 25, 1198, 623);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(896, 287, 285, 319);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
	}
		
	private void crearBotones() {
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnContinuar.setBounds(21, 30, 247, 115);
		panel_2.add(btnContinuar);
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnSalir = new JButton("Salir");
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 167, 247, 115);
		panel_2.add(btnSalir);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	}
	
	private void crearEtiquetas() {
		
		lblFondoCiudad = new JLabel("");
		lblFondoCiudad.setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoBilbao.png")));
		lblFondoCiudad.setBounds(21, 24, 1160, 582);
		panel.add(lblFondoCiudad);
		
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
	
	public void crearCombobox() {
		
		comboLineas = new JComboBox<String>();
		comboLineas.setBounds(21, 24, 396, 62);
		panel.add(comboLineas);
		comboLineas.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
	
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}

	public JComboBox<String> getComboLineas() {
		return comboLineas;
	}

	public void setComboLineas(JComboBox<String> comboLineas) {
		this.comboLineas = comboLineas;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLblFondoCiudad() {
		return lblFondoCiudad;
	}

	public void setLblFondoCiudad(JLabel lblFondoCiudad) {
		this.lblFondoCiudad = lblFondoCiudad;
	}
}
