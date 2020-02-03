package vista;

import java.awt.Color;
import javax.swing.JFrame;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Ventana09Fin {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;

	public Ventana09Fin() {
		
		crearVentana();
		crearPaneles();
		crearEtiquetas();
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
		panel_1.setBounds(20, 436, 1174, 178);
		panel.add(panel_1);
		panel_1.setLayout(null);
	}

	private void crearEtiquetas() {
	
		JLabel lblMensaje = new JLabel("\u00A1Gracias por su compra!");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMensaje.setBounds(0, 0, 1174, 106);
		panel_1.add(lblMensaje);
		
		JLabel lblMensaje1 = new JLabel("Disfrute del viaje");
		lblMensaje1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblMensaje1.setBounds(0, 54, 1174, 100);
		panel_1.add(lblMensaje1);
		
		JLabel lblCabeceraTermibus = new JLabel("");
		lblCabeceraTermibus.setBorder(new LineBorder(Color.BLACK, 2));
		lblCabeceraTermibus.setIcon(new ImageIcon(Ventana01Bienvenida.class.getResource("/imagenes/cabeceraVentana01.jpg")));
		lblCabeceraTermibus.setBounds(20, 20, 1174, 397);
		panel.add(lblCabeceraTermibus);
	}
	
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

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
