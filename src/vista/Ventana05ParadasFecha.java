package vista;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.Caret;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.toedter.calendar.JDateChooser;

import modelo.Parada;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;
import javax.swing.JCheckBox;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class Ventana05ParadasFecha {


	private static final int MAX_MESES = 6;
	
	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnProcederAlPago;
	private JButton btnSalir;
	private JButton btnVolver;
	private JLabel lblSeleccionFechaVuelta;
	private JComboBox<Parada> cbxOrigenIda;
	private JComboBox<Parada> cbxDestinoIda;
	private JComboBox<String> cbxHorariosIda;
	private JComboBox<String> cbxHorariosVuelta;
	private JCheckBox chkbxIdaYVuelta;
	private JDateChooser dateChooserIda;
	private JDateChooser dateChooserVuelta;
	private DateFormat formatoFecha;
	

	private String fechaIda;
	private String fechaVuelta;
	private JPanel panel_3;
	private JPanel panel_4;
	
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
	
	private void crearEtiquetas(){
		
		JLabel lblSeleccionFechaIda = new JLabel("Seleccione fecha:");
		lblSeleccionFechaIda.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionFechaIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionFechaIda.setBounds(50, 131, 344, 22);
		panel_1.add(lblSeleccionFechaIda);
		
		JLabel lblFondoVentana05 = new JLabel("");
		lblFondoVentana05.setIcon(new ImageIcon(Ventana05ParadasFecha.class.getResource("/imagenes/fondoVentana005.png")));
		lblFondoVentana05.setBounds(20, 295, 862, 318);
		panel.add(lblFondoVentana05);
		
		lblSeleccionFechaVuelta = new JLabel("Seleccione fecha de vuelta:");
		lblSeleccionFechaVuelta.setBounds(0, 49, 293, 22);
		panel_3.add(lblSeleccionFechaVuelta);
		lblSeleccionFechaVuelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionFechaVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
	}
		
	private void crearComboBox() {
		
		cbxOrigenIda = new JComboBox<Parada>();
		cbxOrigenIda.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxOrigenIda.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxOrigenIda.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de origen"}));
		cbxOrigenIda.setBounds(50, 52, 344, 30);
		panel_1.add(cbxOrigenIda);
		
		cbxDestinoIda = new JComboBox<Parada>();
		cbxDestinoIda.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxDestinoIda.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxDestinoIda.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de destino"}));
		cbxDestinoIda.setBounds(456, 52, 344, 30);
		panel_1.add(cbxDestinoIda);
		
		cbxHorariosIda = new JComboBox<String>();
		cbxHorariosIda.setEnabled(false);
		cbxHorariosIda.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxHorariosIda.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxHorariosIda.setBounds(456, 168, 344, 30);
		panel_1.add(cbxHorariosIda);
		
		cbxHorariosVuelta = new JComboBox<String>();
		cbxHorariosVuelta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cbxHorariosVuelta.setBounds(33, 169, 233, 30);
		panel_3.add(cbxHorariosVuelta);
		cbxHorariosVuelta.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		cbxHorariosVuelta.setVisible(false);
		dateChooserVuelta.setVisible(false);
		lblSeleccionFechaVuelta.setVisible(false);
		
	}
	
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
	
	private void crearCheckBox() {
		
		chkbxIdaYVuelta= new JCheckBox("A\u00F1adir vuelta");
		chkbxIdaYVuelta.setBounds(79, 20, 129, 25);
		panel_3.add(chkbxIdaYVuelta);
		chkbxIdaYVuelta.setContentAreaFilled(false);
		chkbxIdaYVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
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
	
	public JCheckBox getCheckBox() {
		return chkbxIdaYVuelta;
	}
	
	public JLabel getLblSeleccionFechaVuelta() {
		return lblSeleccionFechaVuelta;
	}

	
	public JLabel getLblSeleccionFechaDeVuelta() {
		return lblSeleccionFechaVuelta;
	}
	
	public JComboBox<Parada> getComboBoxOrigenIda() {
		
		return cbxOrigenIda;
	}
	
	public JComboBox<Parada> getComboBoxDestinoIda() {
		
		return cbxDestinoIda;
	}
	
	
	public JDateChooser getDateChooserIda() {
		return dateChooserIda;
	}
	
	public JDateChooser getDateChooserVuelta() {
		return dateChooserVuelta;
	}
	

	public JComboBox<String> getComboBoxHorariosIda() {
		return cbxHorariosIda;
	}

	public void setComboBoxHorariosIda(JComboBox<String> horarios) {
		cbxHorariosIda = horarios;
	}

	public JComboBox<String> getComboBoxHorariosVuelta() {
		return cbxHorariosVuelta;
	}

	public void setComboBoxHorariosVuelta(JComboBox<String> cbxHorariosVuelta) {
		this.cbxHorariosVuelta = cbxHorariosVuelta;
	}
	
	public String getFechaIda() {
			
		try{
			
			formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
			fechaIda = formatoFecha.format(dateChooserIda.getDate());
		}
		
			catch(NullPointerException e){
				
			return null;
		}
		
		return fechaIda;
				
	}
		
	public String getFechaVuelta() {
			
		try{
			
			formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
			fechaVuelta = formatoFecha.format(dateChooserVuelta.getDate());
		}
		
			catch(NullPointerException e){
			return null;
		}
		
		return fechaVuelta;
				
	}

	public JButton getBtnVolver() {
		
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		
		this.btnVolver = btnVolver;
	}
	/**
	 * Metodo para rellenar los combobox a mostrar
	 * @param listaparadas
	 * @param horarios
	 */
	public void rellenarComboBoxParadas(ArrayList<Parada> listaparadas) {
		
		
		for (Parada parada : listaparadas) {
			getComboBoxOrigenIda().addItem(parada);
		}
		
		for (Parada parada : listaparadas) {
			getComboBoxDestinoIda().addItem(parada);
		}
	}
	
	public void rellenarComboBoxHorarios(ArrayList<String> horarios) {	
		getComboBoxHorariosIda().addItem("Seleccione hora de ida");
		for(String horario: horarios) {
			getComboBoxHorariosIda().addItem(horario);
		}
		getComboBoxHorariosVuelta().addItem("Seleccione hora de vuelta");
		for(String horario: horarios) {
			getComboBoxHorariosVuelta().addItem(horario);
		}
		
		
	}
}
