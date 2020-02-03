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

public class Ventana08ImprimirBilletes {

	public JFrame ventana08ImprimirBilletes;
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
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnFinalizar;
	private JButton BtnImprimirBillete;
	private JLabel lblFechaVuelta2;
	private JLabel lblNAutobusVuelta2;
	private JLabel lblImagen;
	private JLabel lblHoraVuelta2;
	private JLabel lblPrecioVuelta2;
	private JLabel lblHora2;
	private JLabel lblPrecio2;
	private JLabel lblNBillete;
	private JLabel lblNBilleteVuelta;
	private JLabel lblNBillete_2;
	private JLabel lblNBilleteVuelta_2;
	
	public Ventana08ImprimirBilletes () {
		
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearCamposTexto();
		crearFechaHora();
			
	}
	
	private void crearVentana() {
		ventana08ImprimirBilletes = new JFrame();
		ventana08ImprimirBilletes.setResizable(false);
		ventana08ImprimirBilletes.getContentPane().setBackground(new Color(245, 245, 220));
		ventana08ImprimirBilletes.setBounds(100, 100, 1280, 720);
		ventana08ImprimirBilletes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana08ImprimirBilletes.getContentPane().setLayout(null);
		ventana08ImprimirBilletes.setLocationRelativeTo(null);
	}
	
	private void crearPaneles() {
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.BLACK, 2));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(29, 29, 1216, 633);
		ventana08ImprimirBilletes.getContentPane().add(panel_4);
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
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(245, 245, 220));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(325, 458, 558, 155);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
	}
	
	private void crearBotones() {
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFinalizar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnFinalizar.setBounds(21, 162, 251, 131);
		panel_2.add(btnFinalizar);
		
		BtnImprimirBillete = new JButton("Imprimir Billete");
		BtnImprimirBillete.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		BtnImprimirBillete.setFont(new Font("Tahoma", Font.BOLD, 20));
		BtnImprimirBillete.setBounds(21, 20, 251, 131);
		panel_2.add(BtnImprimirBillete);
	}
	
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
		lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrigen.setBounds(30, 131, 100, 33);
		panel_1.add(lblOrigen);
		lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setBounds(415, 131, 126, 33);
		panel_1.add(lblDestino);
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setBounds(30, 236, 100, 33);
		panel_1.add(lblFecha);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNAutobus = new JLabel("N\u00BA Autob\u00FAs");
		lblNAutobus.setHorizontalAlignment(SwingConstants.CENTER);
		lblNAutobus.setBounds(415, 236, 126, 33);
		panel_1.add(lblNAutobus);
		lblNAutobus.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHora.setBounds(30, 340, 100, 33);
		panel_1.add(lblHora);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio.setBounds(415, 340, 126, 33);
		panel_1.add(lblPrecio);
		
		lblHora2 = new JLabel("");
		lblHora2.setHorizontalAlignment(SwingConstants.LEFT);
		lblHora2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHora2.setBounds(140, 340, 200, 33);
		panel_1.add(lblHora2);
		
		lblPrecio2 = new JLabel("");
		lblPrecio2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrecio2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio2.setBounds(551, 340, 200, 33);
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
		lblNAutobusVuelta2.setBounds(434, 64, 103, 45);
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
		lblPrecioVuelta2.setBounds(434, 99, 48, 45);
		panel_5.add(lblPrecioVuelta2);
		
		lblNBilleteVuelta = new JLabel("N\u00BA Billete");
		lblNBilleteVuelta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNBilleteVuelta.setForeground(new Color(178, 34, 34));
		lblNBilleteVuelta.setBounds(10, 13, 79, 27);
		panel_5.add(lblNBilleteVuelta);
		
		lblNBilleteVuelta_2 = new JLabel("");
		lblNBilleteVuelta_2.setForeground(new Color(178, 34, 34));
		lblNBilleteVuelta_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNBilleteVuelta_2.setBounds(10, 33, 79, 27);
		panel_5.add(lblNBilleteVuelta_2);
		
		lblImagen = new JLabel("");
		lblImagen.setBounds(325, 458, 558, 155);
		panel_4.add(lblImagen);
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblImagen.setIcon(new ImageIcon(Ventana06Desglose.class.getResource("/imagenes/fondoVentana06.jpg")));
		
		JLabel lblLogoTermibus = new JLabel("");
		lblLogoTermibus.setBounds(20, 458, 287, 155);
		panel_4.add(lblLogoTermibus);
		lblLogoTermibus.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblLogoTermibus.setIcon(new ImageIcon(Ventana08ImprimirBilletes.class.getResource("/imagenes/logotermibus.jpg")));
		
	}
		
	private void crearCamposTexto() {
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDNI.setBorder(null);
		txtDNI.setOpaque(false);
		txtDNI.setBounds(126, 89, 135, 27);
		panel.add(txtDNI);
		txtDNI.setEditable(false);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBorder(null);
		txtNombre.setOpaque(false);
		txtNombre.setBounds(126, 141, 143, 27);
		panel.add(txtNombre);
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtApellidos.setBorder(null);
		txtApellidos.setOpaque(false);
		txtApellidos.setBounds(126, 193, 143, 27);
		panel.add(txtApellidos);
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);
		
		txtNAutobus = new JTextField();
		txtNAutobus.setHorizontalAlignment(SwingConstants.LEFT);
		txtNAutobus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNAutobus.setBorder(null);
		txtNAutobus.setOpaque(false);
		txtNAutobus.setBounds(551, 236, 200, 33);
		panel_1.add(txtNAutobus);
		txtNAutobus.setEditable(false);
		txtNAutobus.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setHorizontalAlignment(SwingConstants.LEFT);
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFecha.setBorder(null);
		txtFecha.setOpaque(false);
		txtFecha.setBounds(140, 236, 216, 33);
		panel_1.add(txtFecha);
		txtFecha.setEditable(false);
		txtFecha.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setHorizontalAlignment(SwingConstants.LEFT);
		txtDestino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDestino.setBorder(null);
		txtDestino.setOpaque(false);
		txtDestino.setBounds(529, 131, 324, 33);
		panel_1.add(txtDestino);
		txtDestino.setEditable(false);
		txtDestino.setColumns(10);
		
		txtOrigen = new JTextField();
		txtOrigen.setHorizontalAlignment(SwingConstants.LEFT);
		txtOrigen.setOpaque(false);
		txtOrigen.setBorder(null);
		txtOrigen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOrigen.setBounds(122, 131, 310, 33);
		panel_1.add(txtOrigen);
		txtOrigen.setEditable(false);
		txtOrigen.setColumns(10);
		
		lblNBillete = new JLabel("N\u00BA Billete");
		lblNBillete.setForeground(new Color(178, 34, 34));
		lblNBillete.setBackground(new Color(0, 0, 0));
		lblNBillete.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNBillete.setBounds(10, 11, 78, 27);
		panel_1.add(lblNBillete);
		
		lblNBillete_2 = new JLabel("");
		lblNBillete_2.setForeground(new Color(178, 34, 34));
		lblNBillete_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNBillete_2.setBackground(Color.BLACK);
		lblNBillete_2.setBounds(10, 41, 100, 27);
		panel_1.add(lblNBillete_2);
		
	}
	
	public void crearFechaHora() {
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1150, 0, 100, 30);
		ventana08ImprimirBilletes.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(30, 0, 100, 30);
		ventana08ImprimirBilletes.getContentPane().add(labelFecha);			
						
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

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public JFrame getventana08ImprimirBilletes() {
		// TODO Auto-generated method stub
		return ventana08ImprimirBilletes;
	}

	public JPanel getPanel_5() {
		return panel_5;
	}
	public void setPanel_5(JPanel panel_5) {
		this.panel_5 = panel_5;
	}
	public JLabel getLblFechaVuelta2() {
		return lblFechaVuelta2;
	}
	public void setLblFechaVuelta2(JLabel lblFechaVuelta2) {
		this.lblFechaVuelta2 = lblFechaVuelta2;
	}
	public JLabel getLblNAutobusVuelta2() {
		return lblNAutobusVuelta2;
	}
	public void setLblNAutobusVuelta2(JLabel lblNAutobusVuelta2) {
		this.lblNAutobusVuelta2 = lblNAutobusVuelta2;
	}
	public JLabel getLblImagen() {
		return lblImagen;
	}
	public void setLblImagen(JLabel lblImagen) {
		this.lblImagen = lblImagen;
	}
	public JLabel getLblHoraVuelta2() {
		return lblHoraVuelta2;
	}
	public void setLblHoraVuelta2(JLabel lblHoraVuelta2) {
		this.lblHoraVuelta2 = lblHoraVuelta2;
	}
	public JLabel getLblPrecioVuelta2() {
		return lblPrecioVuelta2;
	}
	public void setLblPrecioVuelta2(JLabel lblPrecioVuelta2) {
		this.lblPrecioVuelta2 = lblPrecioVuelta2;
	}
	public JLabel getLblHora2() {
		return lblHora2;
	}
	public void setLblHora2(JLabel lblHora2) {
		this.lblHora2 = lblHora2;
	}
	public JLabel getLblPrecio2() {
		return lblPrecio2;
	}
	public void setLblPrecio2(JLabel lblPrecio2) {
		this.lblPrecio2 = lblPrecio2;
	}
	public JTextField getTxtFecha() {
		
		return txtFecha;
	}
	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	public JButton getBtnImprimirBillete() {
		return BtnImprimirBillete;
	}

	public void setBtnImprimirBillete(JButton btnImprimirBillete) {
		BtnImprimirBillete = btnImprimirBillete;
	}

	public JLabel getLblNBillete_2() {
		return lblNBillete_2;
	}

	public void setLblNBillete_2(JLabel lblNBillete_2) {
		this.lblNBillete_2 = lblNBillete_2;
	}

	public JLabel getLblNBilleteVuelta_2() {
		return lblNBilleteVuelta_2;
	}

	public void setLblNBilleteVuelta_2(JLabel lblNBilleteVuelta_2) {
		this.lblNBilleteVuelta_2 = lblNBilleteVuelta_2;
	}
}
