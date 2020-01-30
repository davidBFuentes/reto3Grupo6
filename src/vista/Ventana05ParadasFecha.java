package vista;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;


public class Ventana05ParadasFecha {


	private static final int MAX_MESES = 6;
	
	private JFrame frame;
	private JButton btnProcederAlPago;
	private JButton btnSalir;
	private JLabel lblSeleccionFechaVuelta;
	private JLabel lblVuelta;
	private JLabel lblOrigenVuelta;
	private JLabel lblDestinoVuelta;
	private JComboBox<Parada> cbxOrigenIda;
	private JComboBox<Parada> cbxDestinoIda;
	private JComboBox<Parada> cbxOrigenVuelta;
	private JComboBox<Parada> cbxDestinoVuelta;
	private JComboBox<String> cbxHorariosIda;
	private JComboBox<String> cbxHorariosVuelta;
	private JCheckBox chkbxIdaYVuelta;
	private JDateChooser dateChooserIda;
	private JDateChooser dateChooserVuelta;
	private DateFormat formatoFecha;
	

	private String fechaIda;
	private String fechaVuelta;
	private JLabel lblHoraIda;
	private JLabel lblHoraVuelta;
	

	
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
		
		JLabel lblSeleccionFechaIda = new JLabel("Selecciona fecha de ida:");
		lblSeleccionFechaIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionFechaIda.setBounds(63, 373, 198, 22);
		frame.getContentPane().add(lblSeleccionFechaIda);
		
		lblSeleccionFechaVuelta = new JLabel("Selecciona fecha de vuelta:");
		lblSeleccionFechaVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionFechaVuelta.setBounds(701, 373, 217, 22);
		frame.getContentPane().add(lblSeleccionFechaVuelta);
		lblSeleccionFechaVuelta.setVisible(false);
		
		JLabel lblOrigenIda = new JLabel("Origen:");
		lblOrigenIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrigenIda.setBounds(100, 181, 67, 22);
		frame.getContentPane().add(lblOrigenIda);
		
		JLabel lblDestinoIda = new JLabel("Destino:");
		lblDestinoIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDestinoIda.setBounds(91, 236, 76, 22);
		frame.getContentPane().add(lblDestinoIda);
		
		JLabel lblIda = new JLabel("IDA");
		lblIda.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblIda.setBounds(183, 108, 56, 16);
		frame.getContentPane().add(lblIda);
		
		lblVuelta = new JLabel("VUELTA");
		lblVuelta.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblVuelta.setBounds(829, 111, 89, 22);
		frame.getContentPane().add(lblVuelta);
		lblVuelta.setVisible(false);
			
		lblOrigenVuelta = new JLabel("Origen:");
		lblOrigenVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrigenVuelta.setBounds(734, 181, 67, 22);
		frame.getContentPane().add(lblOrigenVuelta);
		lblOrigenVuelta.setVisible(false);
		
		lblDestinoVuelta = new JLabel("Vuelta:");
		lblDestinoVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDestinoVuelta.setBounds(734, 236, 67, 22);
		frame.getContentPane().add(lblDestinoVuelta);
		lblDestinoVuelta.setVisible(false);
		
	
	}
		
	private void crearComboBox() {
		
		cbxOrigenIda = new JComboBox<Parada>();
		cbxOrigenIda.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de origen"}));
		cbxOrigenIda.setBounds(170, 180, 160, 23);
		frame.getContentPane().add(cbxOrigenIda);
		
		cbxDestinoIda = new JComboBox<Parada>();
		cbxDestinoIda.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de destino"}));
		cbxDestinoIda.setBounds(170, 238, 160, 23);
		frame.getContentPane().add(cbxDestinoIda);
		
		cbxOrigenVuelta = new JComboBox<Parada>();
		cbxOrigenVuelta.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de origen"}));
		cbxOrigenVuelta.setBounds(813, 183, 160, 23);
		frame.getContentPane().add(cbxOrigenVuelta);
		cbxOrigenVuelta.setVisible(false);
		
		cbxDestinoVuelta = new JComboBox<Parada>();
		cbxDestinoVuelta.setModel(new DefaultComboBoxModel(new String[] {"Seleccione su parada de destino"}));
		cbxDestinoVuelta.setBounds(813, 239, 160, 23);
		frame.getContentPane().add(cbxDestinoVuelta);
		cbxDestinoVuelta.setVisible(false);
		
		cbxHorariosIda = new JComboBox<String>();
		cbxHorariosIda.setModel(new DefaultComboBoxModel(new String[] {"Seleccione hora"}));
		cbxHorariosIda.setBounds(170, 294, 160, 23);
		frame.getContentPane().add(cbxHorariosIda);
		
		cbxHorariosVuelta = new JComboBox<String>();
		cbxHorariosVuelta.setModel(new DefaultComboBoxModel(new String[] {"Seleccione hora"}));
		cbxHorariosVuelta.setBounds(813, 294, 160, 23);
		frame.getContentPane().add(cbxHorariosVuelta);
		cbxHorariosVuelta.setVisible(false);
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
		dateChooserIda.setBounds(266, 373, 111, 22);
		frame.getContentPane().add(dateChooserIda);
		dateChooserIda.setMinSelectableDate(localDate);
		dateChooserIda.setMaxSelectableDate(maxDate);

		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(930, 373, 111, 22);
		frame.getContentPane().add(dateChooserVuelta);
		dateChooserVuelta.setMinSelectableDate(localDate);
		dateChooserVuelta.setMaxSelectableDate(maxDate);
		dateChooserVuelta.setVisible(false);
	}
	
	private void crearCheckBox() {
		
		chkbxIdaYVuelta= new JCheckBox("Ida y vuelta");
		chkbxIdaYVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkbxIdaYVuelta.setBounds(469, 180, 129, 25);
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
		
		lblHoraIda = new JLabel("Hora:");
		lblHoraIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoraIda.setBounds(110, 295, 48, 14);
		frame.getContentPane().add(lblHoraIda);
		
		lblHoraVuelta = new JLabel("Hora:");
		lblHoraVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoraVuelta.setBounds(734, 295, 48, 14);
		frame.getContentPane().add(lblHoraVuelta);
		

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

	public JLabel getLblVuelta() {
		return lblVuelta;
	}

	public JLabel getLblOrigenVuelta() {
		return lblOrigenVuelta;
	}

	public JLabel getLblDestinoVuelta() {
		return lblDestinoVuelta;
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
	
	public JComboBox<Parada> getComboBoxOrigenVuelta() {
		
		return cbxOrigenVuelta;
	}
	
	public JComboBox<Parada> getComboBoxDestinoVuelta() {
		
		return cbxDestinoVuelta;
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
			
			formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
			fechaIda = formatoFecha.format(dateChooserVuelta.getDate());
			return fechaVuelta;
				
		}
}
