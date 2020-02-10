package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.time.LocalTime;
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

/**
 * Clase Controlador05ParadasFecha, gestiona el funcionamiento de la Ventana05ParadasFecha
 *
 */
public class Controlador05ParadasFecha implements MouseListener, MouseMotionListener, ActionListener {
	
	
	//Creamos los atributos de la clase que vamos a manipular
	private Ventana05ParadasFecha ventanaParadasFecha;
	private Linea linea;
	private Billete billete;
	private Billete billete2;
	private Cliente cliente;
	ArrayList<Parada> listaParadas;
	ArrayList<LocalTime> horarios;
	ArrayList<Parada> paradasBillete;
	ArrayList<Parada> paradasBillete2;
	private Autobus autobus;
	private Autobus autobus2;
	
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
				}
				else {
					ventanaParadasFecha.getDateChooserVuelta().setVisible(false);
					ventanaParadasFecha.getComboBoxHorariosVuelta().setVisible(false);
				}
			}
		});
	}

	/**
	 * Metodo que controla las acciones de los botones
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		switch (e.getComponent().getName()) {
		
		//En caso de que se pulse el boton proceder al pago 
		case "Proceder al pago":
			
			//Si los errores han sido verificados y no ha habido ningun caso se ejecutara el siguiente codigo
			if (!ErroresControlador.verificarErroresControlador5(ventanaParadasFecha)) {
				
				//Setearemos los atributos del objeto billete en funcion de las paradas seleccionadas
				billete.setNum_Parada_Inicio(((Parada) this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem()).getNumParada());
				billete.setCod_Parada_Inicio(((Parada) this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem()).getCodParada());
				billete.setNombre_Parada_Origen(this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem().toString());
				billete.setNum_Parada_Fin(((Parada) this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem()).getNumParada());
				billete.setCod_Parada_Fin(((Parada) this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem()).getCodParada());
				billete.setNombre_Parada_Destino(this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem().toString());
				billete.setFecha(this.ventanaParadasFecha.getFechaIda());
				billete.setHora(this.ventanaParadasFecha.getComboBoxHorariosIda().getSelectedItem().toString());
				
				//Filtramos las paradas del arraylist listaParadas, las ordenamos en funcion del atributo numParada y las almacenamos en un arraylist nuevo
				paradasBillete = Calculo.calcularOrdenParadas(Calculo.filtrarParadas(listaParadas, billete));
				
				//Rellenamos un objeto autobus con los datos de la base de datos
				autobus = AutobusDAO.mObtenerBus(billete);
			
				//Calculamos el precio del billete y lo seteamos en el atributo del objeto billete
				billete.setPrecio(Calculo.calcularPrecioBillete(billete, paradasBillete, autobus));
				
				//Seteamos el codigo del autobus en el atributo del objeto billete
				billete.setCod_Bus(autobus.getCodAutobus());	
					
				//Creamos dos objetos Municipio que habran sido cargados en funcion de la parada de origen y de destino
				Municipio municipioOrigen = new Municipio();
				municipioOrigen = MunicipioDAO.mObtenerMunicipio((Parada) this.ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedItem());
				Municipio municipioDestino = new Municipio();
				municipioDestino = MunicipioDAO.mObtenerMunicipio((Parada) this.ventanaParadasFecha.getComboBoxParadaDestino().getSelectedItem());
				
				//Creamos el objeto billete2 por si han seleccio
				billete2 = new Billete();
				
				//Si el checkbox de vuelta ha sido seleccionado
				if (this.ventanaParadasFecha.getCheckBox().isSelected()) {
					
					//Rellenamos el objeto billete2 con los datos recogidos
					billete2.setDni(billete.getDni());
					billete2.setCod_Linea(billete.getCod_Linea());
					billete2.setCod_Parada_Inicio(billete.getCod_Parada_Fin());
					billete2.setCod_Parada_Fin(billete.getCod_Parada_Inicio());
					billete2.setNombre_Parada_Origen(billete.getNombre_Parada_Destino());
					billete2.setNombre_Parada_Destino(billete.getNombre_Parada_Origen());
					billete2.setFecha(this.ventanaParadasFecha.getFechaVuelta());
					billete2.setHora(this.ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem().toString());
					
					//Creamos el objeto autobus2 que alamacenara los datos de la vuelta
					autobus2 = new Autobus();
					autobus2 = AutobusDAO.mObtenerBus(billete2);
					
					//Cargamos el arraylist de paradas de la ida, ya que las paradas no van a variar
					paradasBillete2 = paradasBillete;

					//Seteamos el precio del billete habiendo calculado el precio del mismo previamente
					billete2.setPrecio(Calculo.calcularPrecioBillete(billete2, paradasBillete2, autobus2));
					
					//Seteamos en el billete2 el codigo del autobus de vuelta
					billete2.setCod_Bus(autobus2.getCodAutobus());
				
				}
				if (AutobusDAO.mComprobarAsientosLibres(autobus, billete)) {
					
					JOptionPane.showMessageDialog(null, "No hay asientos disponibles para el viaje de ida", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if (AutobusDAO.mComprobarAsientosLibres(autobus2, billete2)) {
					
					JOptionPane.showMessageDialog(null, "No hay asientos disponibles para el viaje de vuelta", "Mensaje de error", JOptionPane.ERROR_MESSAGE);

				
				
				}
				else {
					//Cargamos la ventana y el controlador siguiente, ocultando la actual
					Ventana06Desglose window1 = new Ventana06Desglose();
					Controlador06Desglose controlador = new Controlador06Desglose(window1, linea, billete, billete2, cliente);
					window1.getVentana06Desglose().setVisible(true);
					this.ventanaParadasFecha.getFrame().dispose();
				}
			}
			
			break;
			
		//En caso de que se pulse el boton Salir 
		case "Salir":
			
			//Cargaremos la ventana de inicio con su controlador y ocultaremos la actual
			Ventana01Bienvenida window2 = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controlador1 = new Controlador01Bienvenida(window2);
			
			window2.getFrame().setVisible(true);
			this.ventanaParadasFecha.getFrame().dispose();
			
			break;
		
		//En caso de que se pulse el boton Volver
		case "Volver":
			
			//Cargaremos la ventana anterior con su respectivo controlador y ocultaremos la actual
			Ventana04Trayectos window3 = new Ventana04Trayectos();
			@SuppressWarnings("unused") Controlador04Trayectos controlador2 = new Controlador04Trayectos(window3, billete, cliente);
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
