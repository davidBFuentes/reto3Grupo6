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
	private JPanel panel_1;
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
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
	}
	
	private void crearPaneles() {
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(29, 29, 1216, 633);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(20, 20, 862, 98);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JButton btnControlUsuario = new JButton("");
		btnControlUsuario.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnControlUsuario.setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/pefilChico.jpg")));
		btnControlUsuario.setBounds(1059, 20, 135, 135);
		panel.add(btnControlUsuario);
		
	}
	
	private void crearEtiquetas() {
		
		JLabel lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoTrayectos.png")));
		lblImagenFondo.setBounds(20, 20, 1174, 593);
		panel.add(lblImagenFondo);
		
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void crearCombobox() {
		
		comboLineas = new JComboBox<Linea>();
		comboLineas.setBounds(20, 20, 822, 59);
		panel_1.add(comboLineas);
		comboLineas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comboLineas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		comboLineas.setMaximumRowCount(10);
		comboLineas.setModel(new DefaultComboBoxModel(new String[] {"Elija su l\u00EDnea"}));
		comboLineas.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
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
}
