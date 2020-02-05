package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import calculosMatematicos.Calculo;
import metodosDAO.AutobusDAO;
import metodosDAO.HorariosDAO;
import metodosDAO.MunicipioDAO;
import metodosDAO.ParadaDAO;
import modelo.Autobus;
import modelo.Billete;
import modelo.Cliente;
import modelo.Linea;
import modelo.Municipio;
import modelo.Parada;
import vista.Ventana01Bienvenida;
import vista.Ventana04Trayectos;
import vista.Ventana05ParadasFecha;
import vista.Ventana06Desglose;

public class Controlador05ParadasFecha implements MouseListener, MouseMotionListener, ActionListener {
	
	
	//Creamos los atributos de la clase que vamos a manipular
	private Ventana05ParadasFecha ventanaParadasFecha;
	private Linea linea;
	private Billete billete;
	private Cliente cliente;
	ArrayList<Parada> listaParadas;
	ArrayList<String> horarios;
	ArrayList<Parada> paradasBillete;
	ArrayList<Parada> paradasBillete2;
	Autobus autobus;
	
	/**
	 * Constructor que inicializara el funcionamiento del controlador habiendo recibido tres parametros (la ventana de seleccion de paradas y fecha, el objeto linea y el objeto billete)
	 * @param pVentana05 
	 * @param pLinea
	 * @param pBillete
	 */
	public Controlador05ParadasFecha (Ventana05ParadasFecha pVentana05, Linea pLinea, Billete pBillete, Cliente pCliente) {
		
		//Recibimos los objetos del controlador anterior
		this.ventanaParadasFecha = pVentana05;
		this.linea = pLinea;
		this.billete = pBillete;
		this.cliente = pCliente;
		
		//Cargamos los arraylist de paradas y horarios en funcion de la linea seleccionada previamente
		listaParadas = ParadaDAO.mObtenerParadas(linea);
		horarios = HorariosDAO.mObtenerHorarios(linea);

		//Iniciamos el controlador
		mIniciarControlador();
		
		//Rellenamos los combobox con las paradas y horarios cargados
		ventanaParadasFecha.rellenarComboBoxParadas(Calculo.calcularOrdenParadas(listaParadas));
		
		//Llamamos al metodo que mostrara las opciones de vuelta, si el checkbox ha sido seleccionado
		mostrarVuelta();
		
	}
	
	/**
	 * Metodo para cargar las acciones de los botones
	 */
	private void mIniciarControlador() {
		
		//Añadimos los mouselistener a los botones
		this.ventanaParadasFecha.getBtnProcederAlPago().addMouseListener(this);
		this.ventanaParadasFecha.getBtnProcederAlPago().setName("Proceder al pago");
		this.ventanaParadasFecha.getBtnVolver().addMouseListener(this);
		this.ventanaParadasFecha.getBtnVolver().setName("Volver");
		this.ventanaParadasFecha.getBtnSalir().addMouseListener(this);
		this.ventanaParadasFecha.getBtnSalir().setName("Salir");
		this.ventanaParadasFecha.getDateChooserIda().addPropertyChangeListener(new DateListener(linea, ventanaParadasFecha));		
	}
	
	/**
	 * Metodo que muestra las opciones para la vuelta si el checkbox ha sido seleccionado
	 */
	private void mostrarVuelta() {
		
		ventanaParadasFecha.getCheckBox().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (ventanaParadasFecha.getCheckBox().isSelected()){
					ventanaParadasFecha.getDateChooserVuelta().setVisible(true);
					ventanaParadasFecha.getComboBoxHorariosVuelta().setVisible(true);
					ventanaParadasFecha.getLblSeleccionFechaDeVuelta().setVisible(true);
				}
				else {
					ventanaParadasFecha.getDateChooserVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxHorariosVuelta().setVisible(false);
					ventanaParadasFecha.getLblSeleccionFechaDeVuelta().setVisible(false);
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
			else if(this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex()) {
				
				JOptionPane.showMessageDialog(null, "La parada de origen no puede ser la misma que la de destino", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
			else if(this.ventanaParadasFecha.getFechaIda() == null) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una fecha de ida para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
			else if(this.ventanaParadasFecha.getComboBoxHorariosIda().getSelectedIndex() == 0) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar un horario de ida para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
			else if(this.ventanaParadasFecha.getCheckBox().isSelected() && this.ventanaParadasFecha.getFechaVuelta() == null) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una fecha de vuelta para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);				
			}
			else if(this.ventanaParadasFecha.getCheckBox().isSelected() && this.ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedIndex() == 0) {
				
				JOptionPane.showMessageDialog(null, "Ha de seleccionar un horario de vuelta para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
			else {
				
				billete.setCod_Parada_Inicio(((Parada) this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedItem()).getCodParada());
				billete.setNombre_Parada_Origen(this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedItem().toString());
				billete.setCod_Parada_Fin(((Parada) this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedItem()).getCodParada());
				billete.setNombre_Parada_Destino(this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedItem().toString());
				billete.setFecha(this.ventanaParadasFecha.getFechaIda());
				billete.setHora(this.ventanaParadasFecha.getComboBoxHorariosIda().getSelectedItem().toString());
				
				paradasBillete = Calculo.filtrarParadas(listaParadas, billete);
				
				autobus = AutobusDAO.mObtenerBus(billete);
			
				Calculo.calcularPrecioBillete(billete, paradasBillete, autobus);
				
				billete.setCod_Bus(autobus.getCodAutobus());	
				
				Billete billete2 = new Billete();
				Parada paradaOrigen = new Parada();
				paradaOrigen = (Parada) this.ventanaParadasFecha.getComboBoxOrigenIda().getSelectedItem();
				Parada paradaDestino = new Parada();
				paradaDestino = (Parada) this.ventanaParadasFecha.getComboBoxDestinoIda().getSelectedItem();
				Municipio municipioOrigen = new Municipio();
				municipioOrigen = MunicipioDAO.mObtenerMunicipio(paradaOrigen);
				Municipio municipioDestino = new Municipio();
				municipioDestino = MunicipioDAO.mObtenerMunicipio(paradaDestino);

				if (this.ventanaParadasFecha.getCheckBox().isSelected()) {
					
					billete2.setDni(billete.getDni());
					billete2.setCod_Linea(billete.getCod_Linea());
					billete2.setCod_Parada_Inicio(billete.getCod_Parada_Fin());
					billete2.setCod_Parada_Fin(billete.getCod_Parada_Inicio());
					billete2.setNombre_Parada_Origen(billete.getNombre_Parada_Destino());
					billete2.setNombre_Parada_Destino(billete.getNombre_Parada_Origen());
					billete2.setFecha(this.ventanaParadasFecha.getFechaVuelta());
					billete2.setHora(this.ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem().toString());
					
					Autobus autobus2 = new Autobus();
					autobus2 = AutobusDAO.mObtenerBus(billete2);
					
					paradasBillete2 = Calculo.filtrarParadas(listaParadas, billete2);
					Calculo.calcularPrecioBillete(billete2, paradasBillete2, autobus2);
					
					billete2.setCod_Bus(autobus2.getCodAutobus());
				
				}
				
				Ventana06Desglose window1 = new Ventana06Desglose();
				Controlador06Desglose controlador = new Controlador06Desglose(window1, linea, billete, billete2, cliente);
				window1.getVentana06Desglose().setVisible(true);
				this.ventanaParadasFecha.getFrame().dispose();
				
			}
			
			break;

		case "Salir":
			Ventana01Bienvenida window2 = new Ventana01Bienvenida();
			Controlador01Bienvenida controlador1 = new Controlador01Bienvenida(window2);
			window2.getFrame().setVisible(true);
			this.ventanaParadasFecha.getFrame().dispose();
			
			break;
			
		case "Volver":
			Ventana04Trayectos window3 = new Ventana04Trayectos();
			Controlador04Trayectos controlador2 = new Controlador04Trayectos(window3, billete, cliente);
			window3.getFrame().setVisible(true);
			this.ventanaParadasFecha.getFrame().dispose();
			
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
