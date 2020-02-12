package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import rojeru_san.RSLabelFecha;
import rojeru_san.RSLabelHora;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaHistorial {
	
	private JFrame frame; 
	private JTable table;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private DefaultTableModel model;
	private JScrollPane scrollPane;
	private JButton btnVolver;
	private JPanel panel_3;
	private JButton btnSalir;
	private JTextField textMensajeSinCompras;
	
	/*
	 * Constructor de la Ventana Historial
	 */
	public VentanaHistorial() {
		
		crearVentana();
		crearPaneles();
		crearBotones();
		crearTabla();
		crearEtiquetas();
		crearFechaHora();
		crearTexto();
		
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
		
	}
	
	/*
	 * Metodo que crea los paneles de la ventana
	 */
	private void crearPaneles() {
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(29, 29, 1216, 633);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(20, 20, 1171, 418);
		panel.add(panel_1);
		panel_1.setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(20, 458, 287, 155);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
	}
	
	/*
	 * Metodo que crea los botones de la ventana
	 */
	private void crearBotones() {
		
		btnVolver = new JButton("Volver");
		btnVolver.setFocusPainted(false);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVolver.setBounds(20, 20, 247, 115);
		panel_2.add(btnVolver);
		
	}
		
	/*
	 * Metodo que crea la tabla de la ventana
	 */
	private void crearTabla() {
		
		model = new DefaultTableModel();
		model.addColumn("Código de billete");
		model.addColumn("Código de línea");
		model.addColumn("Código de autobús");
		model.addColumn("Fecha");
		model.addColumn("Hora");
		model.addColumn("Precio");
		
		table = new JTable();
		table.setRowHeight(80);
		table.setModel(model);

		
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getTableHeader().setResizingAllowed(false);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 20, 1124, 375);
		panel_1.add(scrollPane);
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2));
		scrollPane.setViewportView(table);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
		table.setFont(new Font("Tahoma", Font.BOLD, 20));
		table.setDefaultEditor(Object.class, null); 

	}
	
	/*
	 * Metodo que crea las etiquetas de la ventana
	 */
	private void crearEtiquetas() {
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblImagen.setIcon(new ImageIcon(VentanaHistorial.class.getResource("/imagenes/imagenHistorial.jpg")));
		lblImagen.setBounds(325, 458, 560, 155);
		panel.add(lblImagen);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBounds(904, 458, 287, 155);
		panel.add(panel_3);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFocusPainted(false);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSalir.setBounds(20, 20, 247, 115);
		panel_3.add(btnSalir);
	
	}
	
	/*
	 * Metodo que crea los JtextField de la ventana
	 */
	private void crearTexto() {
		
		textMensajeSinCompras = new JTextField();
		textMensajeSinCompras.setOpaque(false);
		textMensajeSinCompras.setEditable(false);
		textMensajeSinCompras.setFont(new Font("Tahoma", Font.BOLD, 40));
		textMensajeSinCompras.setHorizontalAlignment(SwingConstants.CENTER);
		textMensajeSinCompras.setBorder(null);
		textMensajeSinCompras.setBounds(25, 20, 1124, 375);
		panel_1.add(textMensajeSinCompras);
		textMensajeSinCompras.setColumns(10);
	}
	
	
	/*
	 * Metodo que crea las etiquetas de la fecha y la hora
	 */
	private void crearFechaHora() {
		
		RSLabelFecha labelFecha = new RSLabelFecha();
		labelFecha.setBounds(30, 0, 100, 30);
		frame.getContentPane().add(labelFecha);
		labelFecha.setForeground(Color.BLACK);
		
		RSLabelHora labelHora = new RSLabelHora();
		labelHora.setBounds(1144, 0, 100, 30);
		frame.getContentPane().add(labelHora);
		labelHora.setForeground(Color.BLACK);
			
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTextField getTextMensajeSinCompras() {
		return textMensajeSinCompras;
	}

	public void setTextMensajeSinCompras(JTextField textMensajeSinCompras) {
		this.textMensajeSinCompras = textMensajeSinCompras;
	}
}
