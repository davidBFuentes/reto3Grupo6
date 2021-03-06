package vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
/**
 * clase que crea la ventana que nos muestra lo que hemos seleccionado hasta el momento
 */
public class Ventana06Desglose{

	public JFrame Ventana06Desglose;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtNAutobus;
	private JTextField txtFecha;
	private JTextField txtDestino;
	private JTextField txtOrigen;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnSalir;
	private JButton btnProcederPago;
	private JButton btnVolver;
	private JLabel lblFechaVuelta2;
	private JLabel lblNAutobusVuelta2;
	private JLabel lblImagen;
	private JLabel lblHoraVuelta2;
	private JLabel lblPrecioVuelta2;
	private JLabel lblHora2;
	private JLabel lblPrecio2;
	
	/**
	 * Constructor de la ventana de desglose
	 */
	public Ventana06Desglose() {
		
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearFechaHora();
			
	}
	
	/**
	 * Metodo que crea la ventana
	 */
	private void crearVentana() {
		Ventana06Desglose = new JFrame();
		Ventana06Desglose.setResizable(false);
		Ventana06Desglose.getContentPane().setBackground(new Color(245, 245, 220));
		Ventana06Desglose.setBounds(100, 100, 1280, 720);
		Ventana06Desglose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana06Desglose.getContentPane().setLayout(null);
		Ventana06Desglose.setLocationRelativeTo(null);
	}
	
	/**
	 * Metodo que crea los paneles de la ventana
	 */
	private void crearPaneles() {
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.BLACK, 2));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(29, 29, 1216, 633);
		Ventana06Desglose.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(901, 20, 293, 258);
		panel_4.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(20, 20, 863, 420);
		panel_4.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBounds(901, 294, 293, 319);
		panel_4.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(20, 458, 287, 155);
		panel_4.add(panel_3);
		panel_3.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(245, 245, 220));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(325, 458, 558, 155);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
	}
	
	/**
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setBounds(20, 20, 247, 115);
		panel_3.add(btnVolver);
		
		btnProcederPago = new JButton("Proceder al pago");
		btnProcederPago.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnProcederPago.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnProcederPago.setBounds(21, 20, 251, 131);
		panel_2.add(btnProcederPago);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 168, 251, 131);
		panel_2.add(btnSalir);
	}
	
	/**
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblDatosPasajero = new JLabel("Datos del pasajero");
		lblDatosPasajero.setBounds(36, 11, 225, 36);
		panel.add(lblDatosPasajero);
		lblDatosPasajero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPasajero.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblLinea1 = new JLabel("---------------------------");
		lblLinea1.setBounds(0, 41, 293, 14);
		panel.add(lblLinea1);
		lblLinea1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinea1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDNI.setBounds(10, 87, 92, 27);
		panel.add(lblDNI);
		lblDNI.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 141, 92, 22);
		panel.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidos.setBounds(10, 193, 92, 22);
		panel.add(lblApellidos);
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblDetallesTrayecto = new JLabel("Detalles del viaje");
		lblDetallesTrayecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetallesTrayecto.setBounds(0, 33, 863, 22);
		panel_1.add(lblDetallesTrayecto);
		lblDetallesTrayecto.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblLinea2 = new JLabel("----------------------------");
		lblLinea2.setBounds(0, 54, 863, 14);
		panel_1.add(lblLinea2);
		lblLinea2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinea2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrigen.setBounds(30, 131, 100, 33);
		panel_1.add(lblOrigen);
		lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestino.setBounds(450, 131, 91, 33);
		panel_1.add(lblDestino);
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(30, 236, 100, 33);
		panel_1.add(lblFecha);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNAutobus = new JLabel("N\u00BA Autob\u00FAs");
		lblNAutobus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNAutobus.setBounds(415, 236, 126, 33);
		panel_1.add(lblNAutobus);
		lblNAutobus.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHora.setBounds(30, 340, 100, 33);
		panel_1.add(lblHora);
		
		JLabel lblPrecio = new JLabel("Precio sin iva");
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio.setBounds(399, 340, 142, 33);
		panel_1.add(lblPrecio);
		
		lblHora2 = new JLabel("");
		lblHora2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHora2.setBounds(135, 340, 254, 33);
		panel_1.add(lblHora2);
		
		lblPrecio2 = new JLabel("");
		lblPrecio2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio2.setBounds(544, 340, 309, 33);
		panel_1.add(lblPrecio2);
		
		JLabel lblDetallesVuelta = new JLabel("Detalles de la vuelta");
		lblDetallesVuelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetallesVuelta.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDetallesVuelta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDetallesVuelta.setBounds(0, 11, 558, 22);
		panel_5.add(lblDetallesVuelta);
		
		JLabel lblLinea2_1 = new JLabel("----------------------------");
		lblLinea2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinea2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLinea2_1.setBounds(0, 29, 558, 14);
		panel_5.add(lblLinea2_1);
		
		JLabel lblFechaVuelta = new JLabel("Fecha");
		lblFechaVuelta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFechaVuelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaVuelta.setBounds(21, 63, 90, 45);
		panel_5.add(lblFechaVuelta);
		
		JLabel lblNAutobusVuelta = new JLabel("N\u00BA Autobus");
		lblNAutobusVuelta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNAutobusVuelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNAutobusVuelta.setBounds(267, 64, 157, 45);
		panel_5.add(lblNAutobusVuelta);
		
		lblFechaVuelta2 = new JLabel("");
		lblFechaVuelta2.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaVuelta2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaVuelta2.setBounds(110, 63, 141, 45);
		panel_5.add(lblFechaVuelta2);
		
		lblNAutobusVuelta2 = new JLabel("");
		lblNAutobusVuelta2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNAutobusVuelta2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNAutobusVuelta2.setBounds(415, 64, 133, 45);
		panel_5.add(lblNAutobusVuelta2);
		
		JLabel lblHoraVuelta = new JLabel("Hora");
		lblHoraVuelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraVuelta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHoraVuelta.setBounds(31, 99, 79, 45);
		panel_5.add(lblHoraVuelta);
		
		JLabel lblPrecioVuelta = new JLabel("Precio");
		lblPrecioVuelta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecioVuelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioVuelta.setBounds(325, 99, 90, 45);
		panel_5.add(lblPrecioVuelta);
		
		lblHoraVuelta2 = new JLabel("");
		lblHoraVuelta2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoraVuelta2.setHorizontalAlignment(SwingConstants.LEFT);
		lblHoraVuelta2.setBounds(110, 99, 141, 45);
		panel_5.add(lblHoraVuelta2);
		
		lblPrecioVuelta2 = new JLabel("");
		lblPrecioVuelta2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecioVuelta2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrecioVuelta2.setBounds(415, 99, 133, 45);
		panel_5.add(lblPrecioVuelta2);
		
		lblImagen = new JLabel("");
		lblImagen.setBounds(325, 458, 558, 155);
		panel_4.add(lblImagen);
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblImagen.setIcon(new ImageIcon(Ventana06Desglose.class.getResource("/imagenes/fondoVentana06.jpg")));
		
	}
		
	/**
	 * Metodo que crea los JTextField de la ventana
	 */
	private void crearCamposTexto() {
		
		txtDNI = new JTextField();
		txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDNI.setBorder(null);
		txtDNI.setOpaque(false);
		txtDNI.setBounds(112, 89, 171, 27);
		panel.add(txtDNI);
		txtDNI.setEditable(false);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBorder(null);
		txtNombre.setOpaque(false);
		txtNombre.setBounds(112, 141, 171, 27);
		panel.add(txtNombre);
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtApellidos.setBorder(null);
		txtApellidos.setOpaque(false);
		txtApellidos.setBounds(112, 193, 171, 27);
		panel.add(txtApellidos);
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);
		
		txtNAutobus = new JTextField();
		txtNAutobus.setHorizontalAlignment(SwingConstants.CENTER);
		txtNAutobus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNAutobus.setBorder(null);
		txtNAutobus.setOpaque(false);
		txtNAutobus.setBounds(544, 236, 309, 33);
		panel_1.add(txtNAutobus);
		txtNAutobus.setEditable(false);
		txtNAutobus.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setHorizontalAlignment(SwingConstants.CENTER);
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFecha.setBorder(null);
		txtFecha.setOpaque(false);
		txtFecha.setBounds(135, 236, 270, 33);
		panel_1.add(txtFecha);
		txtFecha.setEditable(false);
		txtFecha.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setHorizontalAlignment(SwingConstants.CENTER);
		txtDestino.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDestino.setBorder(null);
		txtDestino.setOpaque(false);
		txtDestino.setBounds(544, 131, 309, 33);
		panel_1.add(txtDestino);
		txtDestino.setEditable(false);
		txtDestino.setColumns(10);
		
		txtOrigen = new JTextField();
		txtOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrigen.setOpaque(false);
		txtOrigen.setBorder(null);
		txtOrigen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtOrigen.setBounds(135, 131, 325, 33);
		panel_1.add(txtOrigen);
		txtOrigen.setEditable(false);
		txtOrigen.setColumns(10);
		
	}
	
	/**
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	public void crearFechaHora() {
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1150, 0, 100, 30);
		Ventana06Desglose.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(30, 0, 100, 30);
		Ventana06Desglose.getContentPane().add(labelFecha);			
						
	}

	/**
	 * Metodo que da el DNI de un usuario
	 * @return DNI
	 */
	public JTextField getTxtDNI() {
		return txtDNI;
	}
	/**
	 * Metodo que cambia el DNI de un usuario
	 * @param txtDNI
	 */
	public void setTxtDNI(JTextField txtDNI) {
		this.txtDNI = txtDNI;
	}
	/**
	 * Metodo que da el nombre de un usuario
	 * @return nombre del usuario
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	/**
	 * Metodo que cambia el nombre de un usuario
	 * @param txtNombre
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
	/**
	 * 	Metodo que devuelve el apellido de un usuario
	 * @return
	 */
	public JTextField getTxtApellidos() {
		return txtApellidos;
	}
	/**
	 * Metodo que cambia el apellido de un usuario
	 * @param nuevos Apellidos
	 */
	public void setTxtApellidos(JTextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}
	/**
	 * Metodo que devuelve el numero de autobus
	 * @return numero de autobus
	 */
	public JTextField getTxtNAutobus() {
		return txtNAutobus;
	}
	/**
	 * Metodo que cambia el numero de autobus 
	 * @param nuevo numero de autobus
	 */
	public void setTxtNAutobus(JTextField txtNAutobus) {
		this.txtNAutobus = txtNAutobus;
	}
	/**
	 * Metodo que devuelve la parada de destino
	 * @return parada destino
	 */
	public JTextField getTxtDestino() {
		return txtDestino;
	}
	/**
	 * Metodo que cambia la parada de destino por la que se le pasa por parametro
	 * @param nueva parada de destino
	 */
	public void setTxtDestino(JTextField txtDestino) {
		this.txtDestino = txtDestino;
	}
	/**
	 * Metodo que devuelve la parada de origen
	 * @return parada de origen
	 */
	public JTextField getTxtOrigen() {
		return txtOrigen;
	}
	/**
	 * Metodo que cambia la parada de origen por la que se le pasa por parametro
	 * @param nueva parada de origen
	 */
	public void setTxtOrigen(JTextField txtOrigen) {
		this.txtOrigen = txtOrigen;
	}
	/**
	 * devuelve el boton salir 
	 * @return boton salir
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}
	/**
	 * devuelve el boton continuar
	 * @return boton continuar
	 */
	public JButton getBtnContinuar() {
		return btnProcederPago;
	}
	/**
	 * devuelve el frame de esta ventana
	 * @return frame de esta ventana
	 */
	public JFrame getVentana06Desglose() {
		// TODO Auto-generated method stub
		return Ventana06Desglose;
	}

	/**
	 * devuelve los detalles de la vuelta
	 * @return detalles de la vuelta
	 */
	public JPanel getPanel_5() {
		return panel_5;
	}
	/**
	 * cambia los detalles de vuelta por lo que se le pasa por parametro
	 * @param nuevo panel por el que se quiere cambiar 
	 */
	public void setPanel_5(JPanel panel_5) {
		this.panel_5 = panel_5;
	}
	/**
	 * devuelve la fecha del billete de vuelta
	 * @return fecha del billete de vuelta
	 */
	public JLabel getLblFechaVuelta2() {
		return lblFechaVuelta2;
	}
	/**
	 * cambia la fecha del billete de vuelta por la que se le pasa por parametro
	 * @param nueva fecha del billete de vuelta
	 */
	public void setLblFechaVuelta2(JLabel lblFechaVuelta2) {
		this.lblFechaVuelta2 = lblFechaVuelta2;
	}
	/**
	 * devuelve el numero del autobus de vuelta
	 * @return numero del autobus
	 */
	public JLabel getLblNAutobusVuelta2() {
		return lblNAutobusVuelta2;
	}
	/**
	 * cambia el numero del autobus de vuelta por el que se la pasa por parametro
	 * @param nuevo numero del autobus de vuelta
	 */
	public void setLblNAutobusVuelta2(JLabel lblNAutobusVuelta2) {
		this.lblNAutobusVuelta2 = lblNAutobusVuelta2;
	}
	/**
	 * devuelve la imagen
	 * @return imagen
	 */
	public JLabel getLblImagen() {
		return lblImagen;
	}
	/**
	 * cambia la imagen por algo que se le pase por parametro
	 * @param por lo que se quiere cambiar la imagen
	 */
	public void setLblImagen(JLabel lblImagen) {
		this.lblImagen = lblImagen;
	}
	/**
	 * devuelve la hora de vuelta del autobus
	 * @return hora de vuelta del autobus 
	 */
	public JLabel getLblHoraVuelta2() {
		return lblHoraVuelta2;
	}
	/**
	 * cambia la hora de vuelta del autobus por la que se le pasa por parametro
	 * @param nueva hora de vuelta del autobus  
	 */
	public void setLblHoraVuelta2(JLabel lblHoraVuelta2) {
		this.lblHoraVuelta2 = lblHoraVuelta2;
	}
	/**
	 * devuelve el precio del billete de vuelta 
	 * @param nuevo precio del billete de vuelta
	 */
	public JLabel getLblPrecioVuelta2() {
		return lblPrecioVuelta2;
	}	
	/**
	 * cambia el precio del billete de ida por la que se le pasa por parametro
	 * @param nuevo precio del billete de ida
	 */
	public void setLblPrecioVuelta2(JLabel lblPrecioVuelta2) {
		this.lblPrecioVuelta2 = lblPrecioVuelta2;
	}
	/**
	 * devuelve la hora del billete de ida
	 * @param hora del billete de ida
	 */
	public JLabel getLblHora2() {
		return lblHora2;
	}
	/**
	 * cambia la hora del billete de ida por la que se le pasa por parametro
	 * @param nueva hora del billete de ida
	 */
	public void setLblHora2(JLabel lblHora2) {
		this.lblHora2 = lblHora2;
	}
	/**
	 * devulve el precio del billete de ida
	 * @return el precio del billete de ida
	 */
	public JLabel getLblPrecio2() {
		return lblPrecio2;
	}
	/**
	 * cambia el precio del billete de ida
	 * @param precio del billete de ida
	 */
	public void setLblPrecio2(JLabel lblPrecio2) {
		this.lblPrecio2 = lblPrecio2;
	}
	/**
	 * devuelve la fecha que esta escrita
	 * @return fecha
	 */
	public JTextField getTxtFecha() {
		
		return txtFecha;
	}
	/**
	 * cambia la fecha por la nueva que se quiere poner
	 * @param nueva fecha a poner
	 */
	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}
	/**
	 * devuelve el boton volver
	 * @return boton volver
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}

}
