package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import metodosDAO.AutobusDAO;
import metodosDAO.HorariosDAO;
import metodosDAO.ParadaDAO;
import modelo.Autobus;
import modelo.Billete;
import modelo.Linea;
import modelo.Parada;
import vista.Ventana01Bienvenida;
import vista.Ventana05ParadasFecha;
import vista.Ventana06Desglose;

public class Controlador05ParadasFecha implements MouseListener, MouseMotionListener, ActionListener  {
	
	private Ventana05ParadasFecha ventanaParadasFecha;
	private Linea linea;
	private Billete billete;
	ArrayList<Parada> listaParadas;
	ArrayList<String> horarios;
	
	public Controlador05ParadasFecha (Ventana05ParadasFecha pVentana05, Linea pLinea, Billete pBillete) {
		
		this.ventanaParadasFecha = pVentana05;
		this.linea = pLinea;
		this.billete = pBillete;
		listaParadas = ParadaDAO.mObtenerParadas(linea);
		horarios = HorariosDAO.mObtenerHorarios(linea);
		
		
		mIniciarControlador();
		rellenarComboBox(calcularOrdenParadas(listaParadas), horarios);
		mostrarVuelta();
		
	}
	
	private void mIniciarControlador() {
		
		
		this.ventanaParadasFecha.getBtnProcederAlPago().addMouseListener(this);
		this.ventanaParadasFecha.getBtnProcederAlPago().setName("Proceder al pago");
		this.ventanaParadasFecha.getBtnSalir().addMouseListener(this);
		this.ventanaParadasFecha.getBtnSalir().setName("Salir");
		
		
	}
	
	private void rellenarComboBox(ArrayList<Parada> listaparadas, ArrayList<String> horarios) {
		
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxOrigenIda().addItem(parada);
		}
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxOrigenVuelta().addItem(parada);
		}
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxDestinoIda().addItem(parada);
		}
		
		for (Parada parada : listaparadas) {
			ventanaParadasFecha.getComboBoxDestinoVuelta().addItem(parada);
		}
		
		for(String horario: horarios) {
			ventanaParadasFecha.getComboBoxHorariosIda().addItem(horario);
		}
		
		for(String horario: horarios) {
			ventanaParadasFecha.getComboBoxHorariosVuelta().addItem(horario);
		}
		
		
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
					ventanaParadasFecha.getComboBoxHorariosVuelta().setVisible(true);
				}
				else {
					ventanaParadasFecha.getLblVuelta().setVisible(false);
					ventanaParadasFecha.getLblOrigenVuelta().setVisible(false);
					ventanaParadasFecha.getLblDestinoVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxOrigenVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxDestinoVuelta().setVisible(false);
					ventanaParadasFecha.getLblSeleccionFechaDeVuelta().setVisible(false);
					ventanaParadasFecha.getDateChooserVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxHorariosVuelta().setVisible(false);
				}
			}
		});
	}

	
	private ArrayList<Parada> calcularOrdenParadas(ArrayList<Parada> listaParadas) {
			
			
		Parada paradaTermibus = listaParadas.get(0);
		for (Parada parada : listaParadas) {
			parada.setDistanciaATermibus(Parada.calcularDistanciaEuclidea(paradaTermibus.getLongitud(), paradaTermibus.getLatitud(), parada.getLongitud(), parada.getLatitud()));
		}
		Collections.sort(listaParadas);
		
		for(Parada parada : listaParadas) {
			System.out.println(parada.getNombre() + " " + parada.getDistanciaATermibus());
			
		}
		return listaParadas;	
		 
	}
	
	public double calcularDistanciaBillete(ArrayList<Parada> listaParadas) {
			
		ArrayList<Parada> paradasBillete = new ArrayList<>();
	
		double distanciaTotal = 0;
		double distancia;
		
		
		for(Parada parada : listaParadas) {
			if (parada.getCodParada() >= billete.getCod_Parada_Inicio() && parada.getCodParada() <= billete.getCod_Parada_Fin()) {
				paradasBillete.add(parada);
			}
		}
		
		Parada parada1 = paradasBillete.get(0);

		for(Parada parada : paradasBillete) {
			
			distancia = Parada.calcularDistanciaEntreParadas(parada1.getLongitud(), parada1.getLatitud(), parada.getLongitud(), parada.getLatitud());
	 		parada1 = parada;
	 		distanciaTotal = distancia + distanciaTotal;
		}
		
		return distanciaTotal; 	
			
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		switch (e.getComponent().getName()) {
		case "Proceder al pago":
			
			if ((this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == 0) && (this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex() == 0)){
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de origen y otra de destino para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}	
			else if (this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == 0) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de origen para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
			else if(this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex() == 0) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de destino para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
			else if(this.ventanaParadasFecha.getFechaIda() == null) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una fecha para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}

			else {
				billete.setCod_Parada_Inicio(((Parada) this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedItem()).getCodParada());
				billete.setNombre_Parada_Origen(this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedItem().toString());
				billete.setCod_Parada_Fin(((Parada) this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedItem()).getCodParada());
				billete.setNombre_Parada_Destino(this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedItem().toString());
				billete.setFecha(this.ventanaParadasFecha.getFechaIda());
				billete.setHora(this.ventanaParadasFecha.getComboBoxHorariosIda().getSelectedItem().toString());
				System.out.println(calcularDistanciaBillete(listaParadas) + "km");
				Autobus autobus = new Autobus();
				autobus = AutobusDAO.mObtenerBus(billete);
				System.out.println(autobus.getCodAutobus());
				System.out.println(autobus.getConsumo());
				Ventana06Desglose window1 = new Ventana06Desglose();
				Controlador06Desglose controlador = new Controlador06Desglose(window1, billete);
				window1.getFrame().setVisible(true);
				this.ventanaParadasFecha.getFrame().dispose();
			}
			
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
