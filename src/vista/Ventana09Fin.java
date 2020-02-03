package vista;

import java.awt.Color;
import javax.swing.JFrame;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana09Fin{

	private JFrame Ventana8Fin;

	/**
	 * Metodo que inicializa todos los objetos que contendra todos los objetos de la VentanaFin
	 */
	public Ventana09Fin() {
		
		crearVentana();
		crearBotones();
		crearEtiquetas();
		crearFechaHora();
	}
	
	/**
	 * Metodo que crea una ventana
	 */
	private void crearVentana() {
		
		Ventana8Fin = new JFrame();
		Ventana8Fin.getContentPane().setBackground(Color.WHITE);
		Ventana8Fin.setBounds(100, 100, 1280, 720);
		Ventana8Fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana8Fin.getContentPane().setLayout(null);
		Ventana8Fin.setLocationRelativeTo(null);
	}
	
	
	/**
	 * Metodo que crea los botones de la VentanaFin 
	 */
	private void crearBotones() {
		
		JButton btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(Ventana09Fin.class.getResource("/imagenes/cabeceraVentana01.jpg")));
		btnLogo.setBounds(117, 82, 988, 362);
		Ventana8Fin.getContentPane().add(btnLogo);
	}
	
	/**
	 * Metodo que crea las etiquetas de la VentanaFin
	 */
	private void crearEtiquetas() {
	
		JLabel lblMensaje = new JLabel("\u00A1Gracias por su compra!");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMensaje.setBounds(454, 453, 298, 106);
		Ventana8Fin.getContentPane().add(lblMensaje);
		
		JLabel lblMensaje1 = new JLabel("Disfrute del viaje");
		lblMensaje1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblMensaje1.setBounds(489, 517, 492, 100);
		Ventana8Fin.getContentPane().add(lblMensaje1);
	}
	
	/**
	 * Metodo que carga la fecha y hora
	 */
	private void crearFechaHora() {
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1050, 13, 200, 40);
		Ventana8Fin.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(12, 13, 200, 40);
		Ventana8Fin.getContentPane().add(labelFecha);
	}
	
	/**
	 * Metodo que devuelve la ventana
	 *
	 */
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return Ventana8Fin;
	}
}
