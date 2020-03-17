package vista;

import java.awt.Color;
import javax.swing.JFrame;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
/**
 * clase que crea la ventana de despedida
 */
public class Ventana09Fin {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblMensaje1;

	/**
	 * Metodo que inicializa todos los objetos que contendra todos los objetos de la VentanaFin
	 */
	public Ventana09Fin() {
		
		crearVentana();
		crearPaneles();
		crearEtiquetas();
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
	 * Metodo que crea los botones de la ventana 
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
		panel_1.setBounds(20, 436, 1174, 178);
		panel.add(panel_1);
		panel_1.setLayout(null);
	}
	
	/**
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
	
		JLabel lblMensaje = new JLabel("\u00A1Gracias por su compra!");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMensaje.setBounds(0, 0, 1174, 106);
		panel_1.add(lblMensaje);
		
		lblMensaje1 = new JLabel("");
		lblMensaje1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMensaje1.setBounds(0, 54, 1174, 100);
		panel_1.add(lblMensaje1);
		
		JLabel lblCabeceraTermibus = new JLabel("");
		lblCabeceraTermibus.setBorder(new LineBorder(Color.BLACK, 2));
		lblCabeceraTermibus.setIcon(new ImageIcon(Ventana01Bienvenida.class.getResource("/imagenes/cabeceraVentana01.jpg")));
		lblCabeceraTermibus.setBounds(20, 20, 1174, 397);
		panel.add(lblCabeceraTermibus);
	}
	
	/**
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	private void crearFechaHora() {
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1145, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(29, 0, 100, 30);
		frame.getContentPane().add(labelFecha);
		
	}
	
	/**
	 * Metodo que devuelve el frame de la ventana 
	 * @return frame de la ventana
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Metodo que cambia el frame que se le pasa por parametro
	 * @param nuevo frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	/**
	 * metodo que devuelve el label 
	 * @return label
	 */
	public JLabel getLblMensaje1() {
		return lblMensaje1;
	}

	/**
	 * Metodo que cambia el label por otro que se le pasa por parametro
	 * @param lblMensaje1
	 */
	public void setLblMensaje1(JLabel lblMensaje1) {
		this.lblMensaje1 = lblMensaje1;
	}

}
