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

public class Ventana01Bienvenida {

	private JFrame frame;
	private JButton btnVentana02;
	private JPanel panel_1;
	private JPanel panel;
	
	public Ventana01Bienvenida() {
		
		crearVentana();
		crearPaneles();
		crearEtiquetas();
		crearBotones();
		crearFechaHora();
	}
	
	private void crearVentana() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
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
		panel_1.setBounds(18, 424, 1162, 180);
		panel.add(panel_1);
		panel_1.setLayout(null);
	
	}
	
	private void crearBotones() {
		
		btnVentana02 = new JButton("New button");
		btnVentana02.setContentAreaFilled(false);
		btnVentana02.setBorderPainted(false);
		btnVentana02.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(btnVentana02);
		
	}
	
	private void crearEtiquetas() {	
		
		JLabel lblBienvenido = new JLabel("Bienvenido a Termibus ");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(0, 27, 1162, 37);
		panel_1.add(lblBienvenido);
		
		JLabel lblBienvenido2 = new JLabel("Pulse en la pantalla para proceder a la compra de billetes");
		lblBienvenido2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBienvenido2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido2.setBounds(0, 97, 1162, 37);
		panel_1.add(lblBienvenido2);
		
		JLabel lblTermibus = new JLabel("");
		lblTermibus.setBorder(new LineBorder(Color.BLACK, 2));
		lblTermibus.setIcon(new ImageIcon(Ventana01Bienvenida.class.getResource("/imagenes/cabeceraBienvenida.jpg")));
		lblTermibus.setBounds(18, 20, 1163, 386);
		panel.add(lblTermibus);
		
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

	public JButton getBtnVentana02() {
		return btnVentana02;
	}

	public void setBtnVentana02(JButton btnVentana02) {
		this.btnVentana02 = btnVentana02;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
