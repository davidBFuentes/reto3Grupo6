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

import calculosMatematicos.Calculo;
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
	
	
	//Creamos los atributos de la clase que vamos a manipular
	private Ventana05ParadasFecha ventanaParadasFecha;
	private Linea linea;
	private Billete billete;
	ArrayList<Parada> listaParadas;
	ArrayList<String> horarios;
	ArrayList<Parada> paradasBillete;
	Autobus autobus;
	
	//Constructor que inicializara el funcionamiento del controlador habiendo recibido tres parametros (la ventana de trayectos, el objeto linea y el objeto billete)
	public Controlador05ParadasFecha (Ventana05ParadasFecha pVentana05, Linea pLinea, Billete pBillete) {
		
		//Recibimos los objetos del controlador anterior
		this.ventanaParadasFecha = pVentana05;
		this.linea = pLinea;
		this.billete = pBillete;
		
		//Cargamos los arraylist de paradas y horarios en funcion de la linea seleccionada previamente
		listaParadas = ParadaDAO.mObtenerParadas(linea);
		horarios = HorariosDAO.mObtenerHorarios(linea);

		//Iniciamos el controlador
		mIniciarControlador();
		
		//Rellenamos los combobox con las paradas y horarios cargados
		rellenarComboBox(Calculo.calcularOrdenParadas(listaParadas), horarios);
		
		//Llamamos al metodo que mostrara las opciones de vuelta, si el checkbox ha sido seleccionado
		mostrarVuelta();
		
	}
	
	//Metodo para cargar las acciones de los botones
	private void mIniciarControlador() {
		
		//Añadimos los mouselistener a los botones
		this.ventanaParadasFecha.getBtnProcederAlPago().addMouseListener(this);
		this.ventanaParadasFecha.getBtnProcederAlPago().setName("Proceder al pago");
		this.ventanaParadasFecha.getBtnSalir().addMouseListener(this);
		this.ventanaParadasFecha.getBtnSalir().setName("Salir");
		
		
	}
	
	//Metodo para rellenar los combobox a mostrar
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

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		switch (e.getComponent().getName()) {
		case "Proceder al pago":
			
			if ((this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == 0) 
					&& (this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex() == 0)){
				
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
				paradasBillete = Calculo.filtrarParadas(listaParadas, billete);
				System.out.println(Calculo.calcularDistanciaBillete(paradasBillete) + "km");
				autobus = AutobusDAO.mObtenerBus(billete);
				Calculo.calcularPrecioBillete(billete, paradasBillete, autobus);
				System.out.println(billete.getPrecio() + "€");
				System.out.println(autobus.getCodAutobus());
				System.out.println(autobus.getConsumo());

				billete.setCod_Bus(autobus.getCodAutobus());
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
