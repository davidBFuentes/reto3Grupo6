package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import metodosDAO.ParadaDAO;
import modelo.Linea;
import modelo.Parada;
import vista.Ventana01Bienvenida;
import vista.Ventana05ParadasFecha;
import vista.Ventana06Desglose;

public class Controlador05ParadasFecha implements MouseListener, MouseMotionListener, ActionListener  {
	
	private Ventana05ParadasFecha ventanaParadasFecha;

	
	public Controlador05ParadasFecha (Ventana05ParadasFecha pVentana05, Linea linea) {
		
		this.ventanaParadasFecha = pVentana05;
		ArrayList<Parada> parada = ParadaDAO.mObtenerParadas(linea);
		mIniciarControlador();
		rellenarComboBox(parada);
		mostrarVuelta();
	}
	
	private void mIniciarControlador() {
		
		
		this.ventanaParadasFecha.getBtnProcederAlPago().addMouseListener(this);
		this.ventanaParadasFecha.getBtnProcederAlPago().setName("Proceder al pago");
		this.ventanaParadasFecha.getBtnSalir().addMouseListener(this);
		this.ventanaParadasFecha.getBtnSalir().setName("Salir");
		
	
	}
	
	private void rellenarComboBox(ArrayList<Parada> listaparadas) {
		
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxOrigenIda().addItem(parada.getNombre());
		}
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxOrigenVuelta().addItem(parada.getNombre());
		}
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxDestinoIda().addItem(parada.getNombre());
		}
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxDestinoVuelta().addItem(parada.getNombre());
		}
		
		
		
		
//		//ComboBox origen
//		ventanaParadasFecha.getComboBoxOrigenIda().setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));
//		
//		//ComboBox destino
//		ventanaParadasFecha.getComboBoxDestinoIda().setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));
//		
//		ventanaParadasFecha.getComboBoxOrigenVuelta().setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));
//
//		ventanaParadasFecha.getComboBoxDestinoVuelta().setModel(new DefaultComboBoxModel(new String[] {"Seleccione su l\u00EDnea", "L\u00EDnea 1: Bilbao - Mungia", "L\u00EDnea 2: Bilbao - Donosti", "L\u00EDnea 3: Bilbao - Gernika"}));

	}
	
	private void mostrarVuelta() {
		
		ventanaParadasFecha.getCheckBox().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (ventanaParadasFecha.getCheckBox().isSelected()){
					ventanaParadasFecha.getLblVuelta().setVisible(true);
					ventanaParadasFecha.getLblOrigenVuelta().setVisible(true);
					ventanaParadasFecha.getLblDestinoVuelta().setVisible(true);
					ventanaParadasFecha.getComboBoxOrigenVuelta().setVisible(true);
					ventanaParadasFecha.getComboBoxDestinoVuelta().setVisible(true);
					ventanaParadasFecha.getLblSeleccionFechaDeVuelta().setVisible(true);
					ventanaParadasFecha.getDateChooserVuelta().setVisible(true);
				}
				else {
					ventanaParadasFecha.getLblVuelta().setVisible(false);
					ventanaParadasFecha.getLblOrigenVuelta().setVisible(false);
					ventanaParadasFecha.getLblDestinoVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxOrigenVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxDestinoVuelta().setVisible(false);
					ventanaParadasFecha.getLblSeleccionFechaDeVuelta().setVisible(false);
					ventanaParadasFecha.getDateChooserVuelta().setVisible(false);
				}
			}
		});
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
