package vista;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
/**
 * clase que crea la ventana de bienvenida
 */
public class Ventana01Bienvenida {

	public JFrame frame;
	private JPanel panel_1;
	private JPanel panel;
	private JButton btnVentana02;
	
	/**
	 * Contructor de la ventana de bienvenida
	 */
	public Ventana01Bienvenida() {
		
		crearVentana();
		crearPaneles();
		crearEtiquetas();
		crearBotones();
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
		panel_1.setBounds(20, 436, 1174, 178);
		panel.add(panel_1);
		panel_1.setLayout(null);
	
	}
	
	/**
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnVentana02 = new JButton("");
		btnVentana02.setContentAreaFilled(false);
		btnVentana02.setBorderPainted(false);
		btnVentana02.setBounds(0, 0, 1274, 691);
		frame.getContentPane().add(btnVentana02);
		
	}
	
	/**
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblBienvenido = new JLabel("Bienvenido a Termibus ");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(0, 40, 1174, 37);
		panel_1.add(lblBienvenido);
		
		JLabel lblBienvenido2 = new JLabel("Pulse en la pantalla para proceder a la compra de billetes");
		lblBienvenido2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido2.setBounds(0, 97, 1174, 37);
		panel_1.add(lblBienvenido2); 
		
		JLabel lblCabeceraTermibus = new JLabel("");
		lblCabeceraTermibus.setBorder(new LineBorder(Color.BLACK, 2));
		lblCabeceraTermibus.setIcon(new ImageIcon(Ventana01Bienvenida.class.getResource("/imagenes/cabeceraVentana01.jpg")));
		lblCabeceraTermibus.setBounds(20, 20, 1174, 397);
		panel.add(lblCabeceraTermibus);
		
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
		labelHora.setBounds(1144, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
		
		
	}

	/**
	 * Metodo que devuelve el JButton btnVentana2
	 * @return btnVentana02
	 */
	public JButton getBtnVentana02() {
		return btnVentana02;
	}

	/**
	 * Metodo que establece el atributo btnVentana02 como el JButton que recibe como parametro
	 * @param btnVentana02
	 */
	public void setBtnVentana02(JButton btnVentana02) {
		this.btnVentana02 = btnVentana02;
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
}
