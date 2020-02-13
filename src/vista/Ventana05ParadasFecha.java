package vista;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import modelo.Parada;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;


public class Ventana05ParadasFecha {


	private static final int MAX_MESES = 6;
	
	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnProcederAlPago;
	private JButton btnSalir;
	private JButton btnVolver;
	private JComboBox<Parada> cbxParadaOrigen;
	private JComboBox<Parada> cbxParadaDestino;
	private JComboBox<LocalTime> cbxHorariosIda;
	private JComboBox<LocalTime> cbxHorariosVuelta;
	private JCheckBox chkbxIdaYVuelta;
	private JDateChooser dateChooserIda;
	private JDateChooser dateChooserVuelta;
	
	private String fechaIda;
	private String fechaVuelta;
	private JPanel panel_3;
	private JPanel panel_4;
	
	
	SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	

	/*
	 * Constructor de la ventana paradas fecha
	 */
	public Ventana05ParadasFecha(){
		
		crearVentana();
		crearPaneles();
		crearEtiquetas();
		crearBotones();
		crearCalendarios();
		crearCheckBox();
		crearComboBox();
		crearFechaHora();
	}
	
	/*
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
		frame.setLocationRelativeTo(null);
				
	}
	
	/*
	 * Metodo que crea los paneles de la ventana
	 */
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
		panel_1.setBounds(20, 20, 862, 256);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(901, 294, 293, 319);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(901, 20, 293, 256);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(245, 245, 220));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(20, 458, 287, 155);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
	}
	
	/*
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnProcederAlPago = new JButton("Proceder al pago");
		btnProcederAlPago.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProcederAlPago.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnProcederAlPago.setBounds(21, 20, 251, 131);
		panel_2.add(btnProcederAlPago);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 168, 251, 131);
		panel_2.add(btnSalir);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setBounds(20, 20, 247, 115);
		panel_4.add(btnVolver);
		
	}
	
	/*
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas(){
		
		JLabel lblFondoVentana05 = new JLabel("");
		lblFondoVentana05.setIcon(new ImageIcon(Ventana05ParadasFecha.class.getResource("/imagenes/fondoVentana005.png")));
		lblFondoVentana05.setBounds(20, 295, 862, 318);
		panel.add(lblFondoVentana05);
		
	}
		
	/*
	 * Metodo que crea los combobox de la ventana
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void crearComboBox() {
		
		cbxParadaOrigen = new JComboBox<Parada>();
		cbxParadaOrigen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxParadaOrigen.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxParadaOrigen.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de origen"}));
		cbxParadaOrigen.setBounds(50, 52, 344, 30);
		panel_1.add(cbxParadaOrigen);
		
		cbxParadaDestino = new JComboBox<Parada>();
		cbxParadaDestino.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxParadaDestino.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxParadaDestino.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de destino"}));
		cbxParadaDestino.setBounds(456, 52, 344, 30);
		panel_1.add(cbxParadaDestino);
		
		cbxHorariosIda = new JComboBox<LocalTime>();
		cbxHorariosIda.setEnabled(false);
		cbxHorariosIda.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxHorariosIda.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxHorariosIda.setBounds(456, 168, 344, 30);
		panel_1.add(cbxHorariosIda);
		
		cbxHorariosVuelta = new JComboBox<LocalTime>();
		cbxHorariosVuelta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxHorariosVuelta.setBounds(33, 169, 233, 30);
		panel_3.add(cbxHorariosVuelta);
		cbxHorariosVuelta.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxHorariosVuelta.setVisible(false);
		dateChooserVuelta.setVisible(false);
		
	}
	
	/**
	 * Metodo que crea los calendarios de la ventana
	 */
	private void crearCalendarios() {
		
		/*Otra forma de obtener SYSDATE
		 * 
		LocalDateTime now = LocalDateTime.now();
		Date localDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		*/
		
		Calendar cal = Calendar.getInstance();
		Date localDate = cal.getTime();
		cal.add(Calendar.MONTH, MAX_MESES);
		Date maxDate = cal.getTime();
		
		dateChooserIda = new JDateChooser();
		dateChooserIda.setForeground(Color.BLACK);
		dateChooserIda.setBounds(50, 169, 344, 30);
		panel_1.add(dateChooserIda);
		((JTextField)dateChooserIda.getDateEditor().getUiComponent()).setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		((JTextField)dateChooserIda.getDateEditor().getUiComponent()).setText("Seleccione fecha de ida");
		((JTextField)dateChooserIda.getDateEditor().getUiComponent()).setForeground(Color.BLACK);
		dateChooserIda.setMinSelectableDate(localDate);
		dateChooserIda.setMaxSelectableDate(maxDate);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(33, 82, 233, 30);
		panel_3.add(dateChooserVuelta);
		((JTextField)dateChooserVuelta.getDateEditor().getUiComponent()).setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		((JTextField)dateChooserVuelta.getDateEditor().getUiComponent()).setText("Seleccione fecha de vuelta");
		((JTextField)dateChooserVuelta.getDateEditor().getUiComponent()).setForeground(Color.BLACK);
		dateChooserVuelta.setMinSelectableDate(localDate);
		dateChooserVuelta.setMaxSelectableDate(maxDate);	
	}
	
	/**
	 * Metodo que crea el checkbox de vuelta
	 */
	private void crearCheckBox() {
		
		chkbxIdaYVuelta= new JCheckBox("A\u00F1adir vuelta");
		chkbxIdaYVuelta.setBounds(79, 20, 129, 25);
		panel_3.add(chkbxIdaYVuelta);
		chkbxIdaYVuelta.setContentAreaFilled(false);
		chkbxIdaYVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
	}
	
	/**
	 * Metodo que crea la etiqueta de la fecha y la hora
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
	
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * Metodo que establece el atributo btnSalir como el JButton que recibe como parametro
	 * @param btnSalir
	 */
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnProcederAlPago() {
		return btnProcederAlPago;
	}

	/**
	 * Metodo que establece el atributo btnProcederAlPago como el JButton que recibe como parametro
	 * @param btnProcederAlPago
	 */
	public void setBtnProcederAlPago(JButton btnProcedeerAlPago) {
		this.btnProcederAlPago = btnProcedeerAlPago;
	}
	
	public JCheckBox getCheckBox() {
		return chkbxIdaYVuelta;
	}
	
	public JComboBox<Parada> getComboBoxParadaOrigen() {
		
		return cbxParadaOrigen;
	}
	
	public JComboBox<Parada> getComboBoxParadaDestino() {
		
		return cbxParadaDestino;
	}
	
	/**
	 * Metodo que devuelve el JDateChooser dateChooserIda
	 * @return dateChooserIda
	 */
	public JDateChooser getDateChooserIda() {
		return dateChooserIda;
	}
	
	/**
	 * Metodo que devuelve el JDateChooser dateChooserVuelta
	 * @return dateChooserVuelta
	 */
	public JDateChooser getDateChooserVuelta() {
		return dateChooserVuelta;
	}
	
	/**
	 * Metodo que devuelve el JComboBox<LocalTime> cbxHorariosIda
	 * @return cbxHorariosIda
	 */
	public JComboBox<LocalTime> getComboBoxHorariosIda() {
		return cbxHorariosIda;
	}

	/**
	 * Metodo que establece el atributo horarios como el JComboBox<LocalTime> que recibe como parametro
	 * @param horarios
	 */
	public void setComboBoxHorariosIda(JComboBox<LocalTime> horarios) {
		cbxHorariosIda = horarios;
	}

	/**
	 * Metodo que devuelve el JComboBox<LocalTime> cbxHorariosVuelta
	 * @return cbxHorariosVuelta
	 */
	public JComboBox<LocalTime> getComboBoxHorariosVuelta() {
		return cbxHorariosVuelta;
	}

	/**
	 * Metodo que establece el atributo cbxHorariosVuelta como el JComboBox que recibe como parametro
	 * @param cbxHorariosVuelta
	 */
	public void setComboBoxHorariosVuelta(JComboBox<LocalTime> cbxHorariosVuelta) {
		this.cbxHorariosVuelta = cbxHorariosVuelta;
	}
	
	/**
	 * Metodo que devuelve la fecha seleccionada en el dateChooserIda
	 * @return fechaIda
	 */
	public String getFechaIda() {
			
		try{
			
			fechaIda = formatoFecha.format(dateChooserIda.getDate());
		}
		
			catch(NullPointerException e){
				
			return null;
		}
		
		return fechaIda;
				
	}
	
	/**
	 * Metodo que devuelve la fecha seleccionada en el dateChooserVuelta
	 * @return fechaVuelta
	 */
	public String getFechaVuelta() {
			
		try{
			
			fechaVuelta = formatoFecha.format(dateChooserVuelta.getDate());
		}
		catch(NullPointerException e){
			return null;
		}
		
		return fechaVuelta;		
	}

	/**
	 * Metodo que devuelve el JButton btnVolver
	 * @return btnVolver
	 */
	public JButton getBtnVolver() {
		
		return btnVolver;
	}

	/**
	 * Metodo que establece el atributo btnVolver como el JButton btnVolver que recibe como parametro
	 * @param btnVolver
	 */
	public void setBtnVolver(JButton btnVolver) {
		
		this.btnVolver = btnVolver;
	}
	/**
	 * Metodo para rellenar los combobox a mostrar
	 * @param ArrayList<Parada> listaparadas
	 */
	public void rellenarComboBoxParadas(ArrayList<Parada> listaparadas) {
		
		for (Parada parada : listaparadas) {
			getComboBoxParadaOrigen().addItem(parada);
		}
		
		for (Parada parada : listaparadas) {
			getComboBoxParadaDestino().addItem(parada);
		}
	}
	
	/**
	 * Metodo que rellena los combobox con los horarios del trayecto seleccionado
	 * @param ArrayList<LocalTime> horarios
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void rellenarComboBoxHorarios(ArrayList<LocalTime> horarios) {	
		cbxHorariosIda.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su hora de ida"}));

		for(LocalTime horario: horarios) {
			getComboBoxHorariosIda().addItem(horario);
		}
		cbxHorariosVuelta.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su hora de vuelta"}));

		for(LocalTime horario: horarios) {
			getComboBoxHorariosVuelta().addItem(horario);
		}
		
		
	}
}
