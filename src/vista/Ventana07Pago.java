package vista;


import java.awt.Color;
import javax.swing.JFrame;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Ventana07Pago{

	public JFrame Ventana07Pago;
	private JTextField txtIntroducido;

	private JButton btnSalir;
	private JButton btnContinuar;
	private JButton btn_0;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_coma;
	private JButton btn_c;
	private JButton btn_borrar;
	private JButton btn_pagar;
	private JButton btnVolver;
	private JTextField txtPrecioSinIva;
	private JTextField txtPrecioConIva;
	private JTextField txtPrecioAPagar;
	private JTextArea txtVueltas;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_6;
	
	/*
	 * Contructor de la ventana de pago
	 */
	public Ventana07Pago() {
		
		crearVentana();
		crearPaneles();
		crearBotones();
		crearEtiquetas();
		crearTecladoNumerico();
		crearPanelesTexto();
		crearFechaHora();
	}

	/*
	 * Metodo que crea la ventana
	 */
	private void crearVentana() {
		
		Ventana07Pago = new JFrame();
		Ventana07Pago.setResizable(false);
		Ventana07Pago.getContentPane().setBackground(new Color(245, 245, 220));
		Ventana07Pago.setBounds(100, 100, 1280, 720);
		Ventana07Pago.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana07Pago.getContentPane().setLayout(null);
		Ventana07Pago.setLocationRelativeTo(null);
	}
	
	/*
	 * Metodo que crea los paneles de la ventana
	 */
	private void crearPaneles() {
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(29, 29, 1216, 633);
		Ventana07Pago.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(901, 294, 293, 319);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(20, 458, 287, 155);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(328, 20, 556, 255);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(245, 245, 220));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(20, 20, 287, 419);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(245, 245, 220));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBounds(901, 21, 287, 255);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
	}
	
	/*
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnContinuar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnContinuar.setBounds(21, 20, 251, 131);
		panel_1.add(btnContinuar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(21, 168, 251, 131);
		panel_1.add(btnSalir);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setBounds(20, 20, 247, 115);
		panel_2.add(btnVolver);
		
		btn_pagar = new JButton("Pagar");
		btn_pagar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_pagar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_pagar.setBounds(116, 296, 136, 58);
		panel_4.add(btn_pagar);
		
	}
	
	/*
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblPrecioSinIVA = new JLabel("Precio sin IVA");
		lblPrecioSinIVA.setBounds(53, 53, 252, 41);
		panel_3.add(lblPrecioSinIVA);
		lblPrecioSinIVA.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblPrecioConIva = new JLabel("Precio con IVA");
		lblPrecioConIva.setBounds(53, 110, 252, 41);
		panel_3.add(lblPrecioConIva);
		lblPrecioConIva.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblPrecioAPagar = new JLabel("Precio a pagar");
		lblPrecioAPagar.setBounds(53, 170, 240, 41);
		panel_3.add(lblPrecioAPagar);
		lblPrecioAPagar.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblEuro1 = new JLabel("\u20AC");
		lblEuro1.setBounds(466, 53, 56, 41);
		panel_3.add(lblEuro1);
		lblEuro1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblEuro2 = new JLabel("\u20AC");
		lblEuro2.setBounds(466, 111, 56, 39);
		panel_3.add(lblEuro2);
		lblEuro2.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblEuro3 = new JLabel("\u20AC");
		lblEuro3.setBounds(466, 170, 25, 41);
		panel_3.add(lblEuro3);
		lblEuro3.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblIntroducido = new JLabel("Dinero introducido");
		lblIntroducido.setBounds(44, 365, 130, 32);
		panel_4.add(lblIntroducido);
		lblIntroducido.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblEuro4 = new JLabel("\u20AC");
		lblEuro4.setBounds(230, 368, 20, 20);
		panel_4.add(lblEuro4);
		lblEuro4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblVueltas = new JLabel("Vueltas");
		lblVueltas.setBounds(0, 11, 287, 41);
		panel_6.add(lblVueltas);
		lblVueltas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVueltas.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ventana07Pago.class.getResource("/imagenes/fondoEVentana07.jpg")));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setBounds(328, 294, 556, 319);
		panel.add(lblNewLabel);	
	}
	
	/*
	 * Metodo que crea el teclada numerico de la ventana
	 */
	private void crearTecladoNumerico() {
		
		btn_7 = new JButton("7");
		btn_7.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_7.setBounds(194, 20, 58, 58);
		panel_4.add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_8.setBounds(116, 20, 58, 58);
		panel_4.add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.setForeground(new Color(0, 0, 0));
		btn_9.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_9.setBounds(40, 20, 58, 58);
		panel_4.add(btn_9);
		
		btn_4 = new JButton("4");
		btn_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_4.setBounds(194, 89, 58, 58);
		panel_4.add(btn_4);
		
		btn_borrar = new JButton("<--");
		btn_borrar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_borrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_borrar.setBounds(40, 296, 58, 58);
		panel_4.add(btn_borrar);
		
		btn_c = new JButton("C");
		btn_c.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_c.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_c.setBounds(194, 227, 58, 58);
		panel_4.add(btn_c);
		
		btn_5 = new JButton("5");
		btn_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_5.setBounds(116, 89, 58, 58);
		panel_4.add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_6.setBounds(40, 89, 58, 58);
		panel_4.add(btn_6);
		
		btn_3 = new JButton("3");
		btn_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_3.setBounds(40, 158, 58, 58);
		panel_4.add(btn_3);
		
		btn_0 = new JButton("0");
		btn_0.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_0.setBounds(40, 227, 58, 58);
		panel_4.add(btn_0);
		
		btn_coma = new JButton(".");
		btn_coma.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_coma.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_coma.setBounds(116, 227, 58, 58);
		panel_4.add(btn_coma);
		
		btn_2 = new JButton("2");
		btn_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_2.setBounds(116, 158, 58, 58);
		panel_4.add(btn_2);
		
		btn_1 = new JButton("1");
		btn_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_1.setBounds(194, 158, 58, 58);
		panel_4.add(btn_1);
		
	}
		
	/*
	 * Metodo que crea los JPanel de la ventana
	 */
	private void crearPanelesTexto() {
		
		txtPrecioSinIva = new JTextField();
		txtPrecioSinIva.setBorder(null);
		txtPrecioSinIva.setOpaque(false);
		txtPrecioSinIva.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtPrecioSinIva.setBounds(307, 53, 149, 41);
		panel_3.add(txtPrecioSinIva);
		txtPrecioSinIva.setEditable(false);
		
		txtPrecioConIva = new JTextField();
		txtPrecioConIva.setBorder(null);
		txtPrecioConIva.setOpaque(false);
		txtPrecioConIva.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtPrecioConIva.setBounds(307, 110, 149, 41);
		panel_3.add(txtPrecioConIva);
		txtPrecioConIva.setEditable(false);
		
		txtPrecioAPagar = new JTextField();
		txtPrecioAPagar.setBorder(null);
		txtPrecioAPagar.setOpaque(false);
		txtPrecioAPagar.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtPrecioAPagar.setBounds(307, 170, 149, 41);
		panel_3.add(txtPrecioAPagar);
		txtPrecioAPagar.setEditable(false);
		
		txtIntroducido = new JTextField();
		txtIntroducido.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtIntroducido.setBorder(null);
		txtIntroducido.setOpaque(false);
		txtIntroducido.setBounds(173, 365, 51, 32);
		panel_4.add(txtIntroducido);
		txtIntroducido.setEditable(false);
		
		txtVueltas = new JTextArea();
		txtVueltas.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtVueltas.setOpaque(false);
		txtVueltas.setBorder(null);
		txtVueltas.setBounds(30, 56, 220, 199);
		panel_6.add(txtVueltas);
		txtVueltas.setEditable(false);
		
	}
	
	/*
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	public void crearFechaHora() {
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1145, 0, 100, 30);
		Ventana07Pago.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(29, 0, 100, 30);
		Ventana07Pago.getContentPane().add(labelFecha);

	}
	

	public JTextField getTxtIntroducido() {
		return txtIntroducido;
	}

	public void setTxtIntroducido(JTextField txtIntroducido) {
		this.txtIntroducido = txtIntroducido;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public JButton getBtn_0() {
		return btn_0;
	}

	public JTextField getTxtPrecioSinIva() {
		return txtPrecioSinIva;
	}

	public void setTxtPrecioSinIva(JTextField txtPrecioSinIva) {
		this.txtPrecioSinIva = txtPrecioSinIva;
	}

	public void setTxtPrecioConIva(JTextField txtPrecioConIva) {
		this.txtPrecioConIva = txtPrecioConIva;
	}

	public JButton getBtn_1() {
		return btn_1;
	}

	public JButton getBtn_2() {
		return btn_2;
	}

	public JButton getBtn_3() {
		return btn_3;
	}

	public JButton getBtn_4() {
		return btn_4;
	}

	public JButton getBtn_5() {
		return btn_5;
	}

	public JButton getBtn_6() {
		return btn_6;
	}

	public JButton getBtn_7() {
		return btn_7;
	}

	public JButton getBtn_8() {
		return btn_8;
	}

	public JButton getBtn_9() {
		return btn_9;
	}

	public JButton getBtn_coma() {
		return btn_coma;
	}
	
	public JButton getBtn_c() {
		return btn_c;
	}

	public JButton getBtn_borrar() {
		return btn_borrar;
	}
	
	public JButton getBtn_pagar() {
		return btn_pagar;
	}

	public JTextArea getTxtVueltas() {
		return txtVueltas;
	}
	

	public JTextField getTxtPrecioAPagar() {
		return txtPrecioAPagar;
	}
	

	public JTextField getTxtPrecioConIva() {
		return txtPrecioConIva;
	}

	public void setTxtPrecioAPagar(JTextField txtPrecioAPagar) {
		this.txtPrecioAPagar = txtPrecioAPagar;
	}

	public void setTxtVueltas(JTextArea txtVueltas) {
		this.txtVueltas = txtVueltas;
	}

	

	public JFrame getVentana07Pago() {
		
		return Ventana07Pago;
	}

	public void setTxtIntroducido(String string) {
		// TODO Auto-generated method stub

	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public void setVentana07Pago(JFrame ventana07Pago) {
		Ventana07Pago = ventana07Pago;
	}
}