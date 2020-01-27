package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import modelo.Linea;
import vista.Ventana01Bienvenida;
import vista.Ventana05ParadasFecha;
import vista.Ventana06Desglose;

public class Controlador05ParadasFecha implements MouseListener, MouseMotionListener, ActionListener  {
	
	private Ventana05ParadasFecha ventanaParadasFecha;
	
	public Controlador05ParadasFecha (Ventana05ParadasFecha pVentana05) {
		
		this.ventanaParadasFecha = pVentana05;
		mIniciarControlador();
		rellenarComboBox();
	}
	
	private void mIniciarControlador() {
			
		this.ventanaParadasFecha.getBtnProcederAlPago().addMouseListener(this);
		this.ventanaParadasFecha.getBtnProcederAlPago().setName("Proceder al pago");
		this.ventanaParadasFecha.getBtnSalir().addMouseListener(this);
		this.ventanaParadasFecha.getBtnSalir().setName("Salir");
	
	}
	
	private void rellenarComboBox() {
		
		//ComboBox origen
		ventanaParadasFecha.getComboBoxOrigen().setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));
		
		//ComboBox destino
		ventanaParadasFecha.getComboBoxDestino().setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		e.getComponent().getName();

		switch (e.getComponent().getName()) {
		case "Proceder al pago":
			Ventana06Desglose window1 = new Ventana06Desglose();
			Controlador06Desglose controlador = new Controlador06Desglose(window1);
			window1.getFrame().setVisible(true);
			this.ventanaParadasFecha.getFrame().dispose();

			
			break;

		case "Salir":
			Ventana01Bienvenida window2 = new Ventana01Bienvenida();
			Controlador01Bienvenida controlador1 = new Controlador01Bienvenida(window2);
			window2.getFrame().setVisible(true);
			this.ventanaParadasFecha.getFrame().dispose();
			
			break;
			
		}	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	
}
