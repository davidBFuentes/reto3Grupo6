package vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;

import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JTextField;

public class Ventana06Desglose{

	public JFrame Ventana06Desglose;

	private JTextField txtNbillete;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtNAutobus;
	private JTextField txtFecha;
	private JTextField txtDestino;
	private JTextField txtOrigen;
	public JFrame frame;
	private JButton btnSalir;
	private JButton btnProcederPago;


	public Ventana06Desglose() {
		
		crearVentana();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearFechaHora();
		
		
	}
	private void crearVentana() {
		Ventana06Desglose = new JFrame();
		Ventana06Desglose.getContentPane().setBackground(Color.WHITE);
		Ventana06Desglose.setBounds(100, 100, 1280, 720);
		Ventana06Desglose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana06Desglose.getContentPane().setLayout(null);
		Ventana06Desglose.setLocationRelativeTo(null);
	}
	
	private void crearBotones() {
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(64, 558, 137, 58);
		Ventana06Desglose.getContentPane().add(btnSalir);
		
		btnProcederPago = new JButton("Proceder al pago");
		btnProcederPago.setBounds(1037, 558, 137, 58);
		Ventana06Desglose.getContentPane().add(btnProcederPago);
	}
	
	private void crearEtiquetas() {
		
		JLabel lblBillete = new JLabel("N\u00BA Billete");
		lblBillete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBillete.setBounds(91, 92, 110, 27);
		Ventana06Desglose.getContentPane().add(lblBillete);
	
		JLabel lblDatosPasajero = new JLabel("Datos del pasajero");
		lblDatosPasajero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPasajero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDatosPasajero.setBounds(254, 163, 225, 36);
		Ventana06Desglose.getContentPane().add(lblDatosPasajero);
		
		JLabel lblLinea1 = new JLabel("--------------------------");
		lblLinea1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinea1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLinea1.setBounds(249, 185, 230, 14);
		Ventana06Desglose.getContentPane().add(lblLinea1);
		
		JLabel lblDetallesTrayecto = new JLabel("Detalles del trayecto");
		lblDetallesTrayecto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetallesTrayecto.setBounds(662, 170, 190, 22);
		Ventana06Desglose.getContentPane().add(lblDetallesTrayecto);
		
		JLabel lblLinea2 = new JLabel("----------------------------");
		lblLinea2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinea2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLinea2.setBounds(630, 185, 225, 14);
		Ventana06Desglose.getContentPane().add(lblLinea2);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDNI.setBounds(238, 221, 70, 27);
		Ventana06Desglose.getContentPane().add(lblDNI);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(238, 275, 118, 22);
		Ventana06Desglose.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellidos.setBounds(238, 334, 118, 22);
		Ventana06Desglose.getContentPane().add(lblApellidos);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrigen.setBounds(630, 230, 167, 27);
		Ventana06Desglose.getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDestino.setBounds(630, 290, 167, 27);
		Ventana06Desglose.getContentPane().add(lblDestino);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFecha.setBounds(630, 351, 167, 22);
		Ventana06Desglose.getContentPane().add(lblFecha);
		
		JLabel lblNAutobus = new JLabel("N\u00BA Autobus");
		lblNAutobus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNAutobus.setBounds(630, 410, 167, 22);
		Ventana06Desglose.getContentPane().add(lblNAutobus);
	}
		
	private void crearCamposTexto() {
		txtNbillete = new JTextField();
		txtNbillete.setEditable(false);
		txtNbillete.setBounds(182, 98, 96, 20);
		Ventana06Desglose.getContentPane().add(txtNbillete);
		txtNbillete.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setEditable(false);
		txtDNI.setBounds(386, 227, 96, 20);
		Ventana06Desglose.getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBounds(386, 279, 96, 20);
		Ventana06Desglose.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(386, 338, 96, 20);
		Ventana06Desglose.getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
	
		txtNAutobus = new JTextField();
		txtNAutobus.setEditable(false);
		txtNAutobus.setBounds(807, 414, 96, 20);
		Ventana06Desglose.getContentPane().add(txtNAutobus);
		txtNAutobus.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setEditable(false);
		txtFecha.setBounds(807, 355, 96, 20);
		Ventana06Desglose.getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setEditable(false);
		txtDestino.setBounds(807, 296, 96, 20);
		Ventana06Desglose.getContentPane().add(txtDestino);
		txtDestino.setColumns(10);
		
		txtOrigen = new JTextField();
		txtOrigen.setEditable(false);
		txtOrigen.setBounds(807, 236, 96, 20);
		Ventana06Desglose.getContentPane().add(txtOrigen);
		txtOrigen.setColumns(10);
	}
	
	public void crearFechaHora() {
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1050, 13, 200, 40);
		Ventana06Desglose.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(12, 13, 200, 40);
		Ventana06Desglose.getContentPane().add(labelFecha);
	}
	
	
	
	
	
	

	
	public JTextField getTxtNbillete() {
		return txtNbillete;
	}
	public void setTxtNbillete(JTextField txtNbillete) {
		this.txtNbillete = txtNbillete;
	}
	public JTextField getTxtDNI() {
		return txtDNI;
	}
	public void setTxtDNI(JTextField txtDNI) {
		this.txtDNI = txtDNI;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
	public JTextField getTxtApellidos() {
		return txtApellidos;
	}
	public void setTxtApellidos(JTextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}
	public JTextField getTxtNAutobus() {
		return txtNAutobus;
	}
	public void setTxtNAutobus(JTextField txtNAutobus) {
		this.txtNAutobus = txtNAutobus;
	}
	public JTextField getTxtDestino() {
		return txtDestino;
	}
	public void setTxtDestino(JTextField txtDestino) {
		this.txtDestino = txtDestino;
	}
	public JTextField getTxtOrigen() {
		return txtOrigen;
	}
	public void setTxtOrigen(JTextField txtOrigen) {
		this.txtOrigen = txtOrigen;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JButton getBtnContinuar() {
		return btnProcederPago;
	}

	public JFrame getDesglose() {
		// TODO Auto-generated method stub
		return Ventana06Desglose;
	}
	public JFrame getVentana06Desglose() {
		// TODO Auto-generated method stub
		return Ventana06Desglose;
	}
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return Ventana06Desglose;
	}

}
