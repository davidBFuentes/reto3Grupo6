package vista;


import java.awt.Color;
import javax.swing.JFrame;
import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;



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
	private JTextField txtOrigen;
	private JTextField txtDestino;
	private JTextField txtFechaSalida;
	private JTextField txtPrecioBillete;
	private JTextField txtPrecioSinIva;
	private JTextField txtPrecioConIva;
	private JTextField txtPrecioAPagar;
	private JTextArea txtVueltas;
	

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

	public Ventana07Pago() {
		
		crearVentana();
		crearBotones();
		crearEtiquetas();
		crearTecladoNumerico();
		crearPanelesTexto();
		crearFechaHora();
	}

	private void crearVentana() {
		Ventana07Pago = new JFrame();
		Ventana07Pago.getContentPane().setBackground(Color.WHITE);
		Ventana07Pago.setBounds(100, 100, 1280, 720);
		Ventana07Pago.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana07Pago.getContentPane().setLayout(null);
		Ventana07Pago.setLocationRelativeTo(null);
	}
	
	private void crearBotones() {
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(36, 592, 147, 56);
		Ventana07Pago.getContentPane().add(btnSalir);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(1051, 592, 147, 56);
		Ventana07Pago.getContentPane().add(btnContinuar);
	}
	
	private void crearEtiquetas() {
	
		JLabel lblEuro = new JLabel("\u20AC");
		lblEuro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEuro.setBounds(734, 170, 56, 20);
		Ventana07Pago.getContentPane().add(lblEuro);
		
		JLabel lblEuro1 = new JLabel("\u20AC");
		lblEuro1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEuro1.setBounds(400, 309, 56, 20);
		Ventana07Pago.getContentPane().add(lblEuro1);
		
		JLabel lblEuro2 = new JLabel("\u20AC");
		lblEuro2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEuro2.setBounds(400, 374, 56, 20);
		Ventana07Pago.getContentPane().add(lblEuro2);
		
		JLabel lblEuro3 = new JLabel("\u20AC");
		lblEuro3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEuro3.setBounds(400, 440, 56, 20);
		Ventana07Pago.getContentPane().add(lblEuro3);
		
		JLabel lblEuro4 = new JLabel("\u20AC");
		lblEuro4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEuro4.setBounds(783, 590, 56, 20);
		Ventana07Pago.getContentPane().add(lblEuro4);
		
		JLabel lblVueltas = new JLabel("Vueltas");
		lblVueltas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVueltas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVueltas.setBounds(995, 145, 198, 41);
		Ventana07Pago.getContentPane().add(lblVueltas);
		
		JLabel lblIntroducido = new JLabel("Dinero introducido");
		lblIntroducido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntroducido.setBounds(483, 590, 190, 26);
		Ventana07Pago.getContentPane().add(lblIntroducido);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrigen.setBounds(210, 139, 108, 20);
		Ventana07Pago.getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDestino.setBounds(342, 139, 108, 20);
		Ventana07Pago.getContentPane().add(lblDestino);
		
		JLabel lblFecha = new JLabel("Fecha salida");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFecha.setBounds(483, 139, 108, 20);
		Ventana07Pago.getContentPane().add(lblFecha);
		
		JLabel lblPrecioBillete = new JLabel("Precio billete");
		lblPrecioBillete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioBillete.setBounds(625, 139, 108, 20);
		Ventana07Pago.getContentPane().add(lblPrecioBillete);
		
		JLabel lblPrecioSinIVA = new JLabel("Precio Sin IVA");
		lblPrecioSinIVA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioSinIVA.setBounds(73, 299, 114, 41);
		Ventana07Pago.getContentPane().add(lblPrecioSinIVA);
		
		JLabel lblPrecioConIva = new JLabel("Precio Con IVA");
		lblPrecioConIva.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioConIva.setBounds(73, 359, 126, 41);
		Ventana07Pago.getContentPane().add(lblPrecioConIva);
		
		JLabel lblPrecioAPagar = new JLabel("Precio A Pagar");
		lblPrecioAPagar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioAPagar.setBounds(73, 430, 119, 41);
		Ventana07Pago.getContentPane().add(lblPrecioAPagar);
	}
	
	private void crearTecladoNumerico() {
		
		btn_0 = new JButton("0");
		btn_0.setBounds(615, 485, 89, 75);
		Ventana07Pago.getContentPane().add(btn_0);
		
		btn_1 = new JButton("1");
		btn_1.setBounds(530, 414, 89, 75);
		Ventana07Pago.getContentPane().add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.setBounds(615, 414, 89, 75);
		Ventana07Pago.getContentPane().add(btn_2);
		
		btn_3 = new JButton("3");
		btn_3.setBounds(701, 414, 89, 75);
		Ventana07Pago.getContentPane().add(btn_3);
		
		btn_4 = new JButton("4");
		btn_4.setBounds(530, 342, 89, 75);
		Ventana07Pago.getContentPane().add(btn_4);
		
		btn_5 = new JButton("5");
		btn_5.setBounds(615, 342, 89, 75);
		Ventana07Pago.getContentPane().add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.setBounds(701, 342, 89, 75);
		Ventana07Pago.getContentPane().add(btn_6);
		
		btn_7 = new JButton("7");
		btn_7.setBounds(530, 269, 89, 75);
		Ventana07Pago.getContentPane().add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.setBounds(615, 269, 89, 75);
		Ventana07Pago.getContentPane().add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.setBounds(701, 269, 89, 75);
		Ventana07Pago.getContentPane().add(btn_9);
		
		btn_borrar = new JButton("<--");
		btn_borrar.setBounds(530, 485, 89, 75);
		Ventana07Pago.getContentPane().add(btn_borrar);
		
		btn_c = new JButton("C");
		btn_c.setBounds(812, 269, 89, 75);
		Ventana07Pago.getContentPane().add(btn_c);
		
		btn_coma = new JButton(".");
		btn_coma.setEnabled(false);
		btn_coma.setBounds(701, 485, 89, 75);
		Ventana07Pago.getContentPane().add(btn_coma);
		
		btn_pagar = new JButton("Pagar");

		btn_pagar.setBounds(812, 371, 89, 63);
		Ventana07Pago.getContentPane().add(btn_pagar);
		
	}
		
	private void crearPanelesTexto() {

		txtIntroducido = new JTextField();
		txtIntroducido.setEditable(false);
		txtIntroducido.setBounds(641, 590, 132, 20);
		Ventana07Pago.getContentPane().add(txtIntroducido);
		
		txtOrigen = new JTextField();
		txtOrigen.setEditable(false);
		txtOrigen.setBounds(210, 170, 89, 20);
		Ventana07Pago.getContentPane().add(txtOrigen);
		
		txtDestino = new JTextField();
		txtDestino.setEditable(false);
		txtDestino.setBounds(342, 170, 89, 20);
		Ventana07Pago.getContentPane().add(txtDestino);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setEditable(false);
		txtFechaSalida.setBounds(483, 170, 89, 20);
		Ventana07Pago.getContentPane().add(txtFechaSalida);
		
		txtPrecioBillete = new JTextField();
		txtPrecioBillete.setEditable(false);
		txtPrecioBillete.setBounds(625, 173, 89, 20);
		Ventana07Pago.getContentPane().add(txtPrecioBillete);
		
		txtPrecioSinIva = new JTextField();
		txtPrecioSinIva.setEditable(false);
		txtPrecioSinIva.setBounds(224, 310, 166, 20);
		Ventana07Pago.getContentPane().add(txtPrecioSinIva);
		
		txtPrecioConIva = new JTextField();
		txtPrecioConIva.setText("10");
		txtPrecioConIva.setEditable(false);
		txtPrecioConIva.setBounds(224, 374, 166, 20);
		Ventana07Pago.getContentPane().add(txtPrecioConIva);
		
		txtPrecioAPagar = new JTextField();
		txtPrecioAPagar.setEditable(false);
		txtPrecioAPagar.setBounds(224, 436, 166, 20);
		Ventana07Pago.getContentPane().add(txtPrecioAPagar);
		
		txtVueltas = new JTextArea();
		txtVueltas.setEditable(false);
		txtVueltas.setBounds(995, 189, 223, 282);
		Ventana07Pago.getContentPane().add(txtVueltas);	
	}


	public void crearFechaHora() {
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setForeground(Color.BLACK);
		labelHora.setBounds(1050, 13, 200, 40);
		Ventana07Pago.getContentPane().add(labelHora);
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setForeground(Color.BLACK);
		labelFecha.setBounds(12, 13, 200, 40);
		Ventana07Pago.getContentPane().add(labelFecha);
		

	}

	public Window getRegistro() {
		// TODO Auto-generated method stub
		return Ventana07Pago;
	}

	public void setTxtIntroducido(String string) {
		// TODO Auto-generated method stub

	}

	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return Ventana07Pago;
	}
}