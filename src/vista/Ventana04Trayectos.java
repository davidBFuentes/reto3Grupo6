package vista;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import modelo.Linea;

import java.awt.Font;


import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import java.awt.Color;
import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;


public class Ventana04Trayectos {

	private JFrame frame;
	private JButton btnSalir;
	private JButton btnContinuar;
	private JComboBox <Linea> comboLineas;
	private JPanel panel;
	private JPanel panel_2;
	private JLabel lblFondoVentana04;
	
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
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(901, 294, 293, 319);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
	}
		
	private void crearBotones() {
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnContinuar.setBounds(21, 20, 251, 131);
		panel_2.add(btnContinuar);
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnSalir = new JButton("Salir");
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 168, 251, 131);
		panel_2.add(btnSalir);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	}
	
	private void crearEtiquetas() {
		
		lblFondoVentana04 = new JLabel("");
		lblFondoVentana04.setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoBilbaoVentana04.png")));
		lblFondoVentana04.setBounds(20, 20, 1174, 593);
		panel.add(lblFondoVentana04);
		
	}

	public void crearFechaHora() {
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setBounds(29, 0, 100, 30);
		frame.getContentPane().add(labelFecha);
		labelFecha.setForeground(Color.BLACK);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setBounds(1145, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
		
	}
	
	public void crearCombobox() {
		
		comboLineas = new JComboBox<Linea>();
		comboLineas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comboLineas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		comboLineas.setMaximumRowCount(5);
		comboLineas.setModel(new DefaultComboBoxModel(new String[] {"Elija su l\u00EDnea"}));
		comboLineas.setBounds(20, 20, 355, 62);
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

	public JComboBox<Linea> getComboLineas() {
		return comboLineas;
	}

	public void setComboLineas(JComboBox<Linea> comboLineas) {
		this.comboLineas = comboLineas;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLblFondoVentana04() {
		return lblFondoVentana04;
	}

	public void setLblFondoVentana04(JLabel lblFondoCiudad) {
		this.lblFondoVentana04 = lblFondoCiudad;
	}
}
