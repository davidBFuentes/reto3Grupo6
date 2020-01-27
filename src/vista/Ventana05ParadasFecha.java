package vista;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import modelo.Parada;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;
import javax.swing.JCheckBox;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Ventana05ParadasFecha {


	private JFrame frame;
	private JButton btnProcederAlPago;
	private JButton btnSalir;
	private JComboBox cbxOrigen;
	private JComboBox cbxVuelta;
	private JDateChooser dateChooserIda;
	private JDateChooser dateChooserVuelta;
	private DateFormat formatoFecha;
	private String fechaIda;
	private String fechaVuelta;

	
	public Ventana05ParadasFecha(){
		crearVentana();
		crearEtiquetas();
		crearBotones();
		crearCalendarios();
		crearCheckBox();
		crearComboBox();
		crearFechaHora();
	}
	
	private void crearVentana() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
	}
	
	private void crearBotones() {
		
		btnProcederAlPago = new JButton("Proceder al pago");
		btnProcederAlPago.setBounds(1081, 573, 154, 69);
		frame.getContentPane().add(btnProcederAlPago);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(29, 573, 154, 69);
		frame.getContentPane().add(btnSalir);
	}
	
	private void crearEtiquetas(){
		
		JLabel lblSeleccionFechaDeIda = new JLabel("Selecciona fecha de ida:");
		lblSeleccionFechaDeIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionFechaDeIda.setBounds(63, 373, 198, 22);
		frame.getContentPane().add(lblSeleccionFechaDeIda);
		
		JLabel lblSeleccionaFechaDeVuelta = new JLabel("Selecciona fecha de vuelta:");
		lblSeleccionaFechaDeVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionaFechaDeVuelta.setBounds(426, 373, 217, 22);
		frame.getContentPane().add(lblSeleccionaFechaDeVuelta);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrigen.setBounds(91, 181, 67, 22);
		frame.getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDestino.setBounds(354, 179, 76, 22);
		frame.getContentPane().add(lblDestino);
	}
		
	private void crearComboBox() {
		
		cbxOrigen = new JComboBox<Object>();
		cbxOrigen.setBounds(170, 180, 103, 25);
	//	cbxOrigen.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));
		frame.getContentPane().add(cbxOrigen);
		
		cbxVuelta = new JComboBox<Object>();
		cbxVuelta.setBounds(442, 180, 103, 25);
		//cbxVuelta.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));
		frame.getContentPane().add(cbxVuelta);
	}
	
	private void crearCalendarios() {
		dateChooserIda = new JDateChooser();
		dateChooserIda.setBounds(266, 373, 105, 22);
		frame.getContentPane().add(dateChooserIda);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(655, 373, 105, 22);
		frame.getContentPane().add(dateChooserVuelta);
	}
	
	private void crearCheckBox() {
		
		JCheckBox chkbxIdaYVuelta= new JCheckBox("Ida y vuelta");
		chkbxIdaYVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkbxIdaYVuelta.setBounds(652, 178, 129, 25);
		frame.getContentPane().add(chkbxIdaYVuelta);
	}
		
	private void crearFechaHora() {
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1050, 13, 200, 40);
		frame.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(12, 13, 200, 40);
		frame.getContentPane().add(labelFecha);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnProcederAlPago() {
		return btnProcederAlPago;
	}

	public void setBtnProcederAlPago(JButton btnProcedeerAlPago) {
		this.btnProcederAlPago = btnProcedeerAlPago;
	}
	
	public JComboBox<?> getComboBoxOrigen() {
		
		return cbxOrigen;
	}
	
	public JComboBox<?> getComboBoxDestino() {
		
		return cbxVuelta;
	}
	
	private String getFechaIda() {
		
		formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		fechaIda = formatoFecha.format(dateChooserIda.getDate());
		return fechaIda;
			
	}
	
	private String getFechaVuelta() {
		
		formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		fechaIda = formatoFecha.format(dateChooserVuelta.getDate());
		return fechaVuelta;
			
	}


}
