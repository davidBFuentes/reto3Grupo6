package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;
import calculosMatematicos.Calculo;

import modelo.Billete;
import modelo.Cliente;
import modelo.Fichero;
import modelo.Municipio;
import vista.Ventana01Bienvenida;
import vista.Ventana08ImprimirBilletes;
import vista.Ventana09Fin;

public class Controlador08ImprimirBilletes implements MouseListener  {

	//crear las variables que vamos a usar 
	private Ventana08ImprimirBilletes ventanaImprimirBilletes;
	private Billete billete;
	private Billete billete2;
	private Cliente cliente;
	private Municipio municipioOrigen;
	private Municipio municipioDestino;
	
	/**
	 * Constructor del controlador, recibe por parametros (la ventana nnueva, el billete, el billete de vuelta, el objeto cliente)
	 * 
	 * @param pVentana08
	 * @param pBillete
	 * @param pBillete2
	 * @param pCliente
	 */
	public Controlador08ImprimirBilletes(Ventana08ImprimirBilletes pVentana08, Billete pBillete, Billete pBillete2, Cliente pCliente, Municipio pMunicipioOrigen, Municipio pMunicipioDestino) {
		// TODO Auto-generated constructor stub
		
		this.ventanaImprimirBilletes = pVentana08;
		this.billete = pBillete;
		this.billete2 = pBillete2;
		this.cliente = pCliente;
		this.municipioOrigen = pMunicipioOrigen;
		this.municipioDestino = pMunicipioDestino;
		mIniciarControlador();
	}

	/**
	 * Metodo para cargar las acciones de los botones
	 */
	private void mIniciarControlador() {
		
		//Añadimos los mouselistener a los botones
		this.ventanaImprimirBilletes.getBtnFinalizar().addMouseListener(this);
		this.ventanaImprimirBilletes.getBtnFinalizar().setName("Finalizar");
		this.ventanaImprimirBilletes.getBtnImprimirBillete().addMouseListener(this);
		this.ventanaImprimirBilletes.getBtnImprimirBillete().setName("Imprimir");
		this.ventanaImprimirBilletes.getBtnEnviarCorreo().addMouseListener(this);
		this.ventanaImprimirBilletes.getBtnEnviarCorreo().setName("EnviarCorreo");
		this.ventanaImprimirBilletes.getTxtDNI().setText(cliente.getDni());
		this.ventanaImprimirBilletes.getTxtNombre().setText(cliente.getNombre());
		this.ventanaImprimirBilletes.getTxtApellidos().setText(cliente.getApellido());
		this.ventanaImprimirBilletes.getTxtOrigen().setText(billete.getNombre_Parada_Origen());
		this.ventanaImprimirBilletes.getTxtDestino().setText(billete.getNombre_Parada_Destino());
		this.ventanaImprimirBilletes.getTxtFecha().setText(billete.getFecha());
		this.ventanaImprimirBilletes.getTxtNAutobus().setText(billete.getCod_Bus());	
		this.ventanaImprimirBilletes.getLblHora2().setText(billete.getHora());
		this.ventanaImprimirBilletes.getLblPrecio2().setText(String.valueOf(Calculo.formatearPrecio(billete.getPrecio())) + " €");
		this.ventanaImprimirBilletes.getLblNBillete_2().setText(String.valueOf(billete.getCod_Billete())); 
		
		//en caso de que no tengamos billete de vuelta
		if (billete2.getCod_Linea() == null) {
			
			//haremos que aparezca una imagen en vez de un billete vacio
			this.ventanaImprimirBilletes.getPanel_5().setVisible(false);
			this.ventanaImprimirBilletes.getLblImagen().setVisible(true);
			
		} else {
			//en caso de que hay billete de vuelta enseñaremos los datos del billete en vez de la imagen
			this.ventanaImprimirBilletes.getLblImagen().setVisible(false);
			this.ventanaImprimirBilletes.getPanel_5().setVisible(true);
			this.ventanaImprimirBilletes.getLblNBilleteVuelta_2().setText(String.valueOf(billete2.getCod_Billete())); 
			this.ventanaImprimirBilletes.getLblNAutobusVuelta2().setText(billete2.getCod_Bus());
			this.ventanaImprimirBilletes.getLblFechaVuelta2().setText(billete2.getFecha()); 
			this.ventanaImprimirBilletes.getLblHoraVuelta2().setText(billete2.getHora());
			this.ventanaImprimirBilletes.getLblPrecioVuelta2().setText(String.valueOf(Calculo.formatearPrecio(billete2.getPrecio())) + " €" );
			
		}
	
	}

	public void actionPerformed(ActionEvent e) {
		
	
		
	}
	
	/**
	 * Metodo que controla las acciones de  los botones
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		//creamos un switch con el que pondremos las acciones de los botones dependiendo de su nombre
		switch(e.getComponent().getName()) {
		
		case "Salir":
			
			//al pulsar salir volveremos a la pantalla de inicio PERO no se devolvera el dinero 
			Ventana01Bienvenida window = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
			window.getFrame().setVisible(true);
			this.ventanaImprimirBilletes.getventana08ImprimirBilletes().dispose();
			
			break;
			
		case "Finalizar":
		
			//al pulsar continuar iremos a la ventana final
			Ventana09Fin ventana = new Ventana09Fin();
			@SuppressWarnings("unused") Controlador09Fin controladorFin = new Controlador09Fin(ventana, municipioOrigen, municipioDestino);
			ventana.getFrame().setVisible(true);
			this.ventanaImprimirBilletes.getventana08ImprimirBilletes().dispose();
			
			break;
				
		case "Imprimir":
			
			//Crear fichero en caso de que no exista y escribirlo
			try {
				Fichero.mImprimirBillete(this.billete, this.billete2);
				JOptionPane.showMessageDialog(null, "Billete imprimido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				this.ventanaImprimirBilletes.getBtnImprimirBillete().setEnabled(false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "EnviarCorreo":
			
			//nos escriben por teclado el correo electronico al que quieren mandar el correo, si no se quiere mandar no pondra nada
			if (GestorCorreo.validarEmail(ventanaImprimirBilletes.getTxtFldCorreo().getText())) {
				try {
					GestorCorreo.enviarCorreo(ventanaImprimirBilletes.getTxtFldCorreo().getText(), billete, billete2);
				} catch (AddressException e1) {
					// TODO Bloque catch generado automáticamente
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Correo enviado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				ventanaImprimirBilletes.getBtnEnviarCorreo().setEnabled(false);
			}
			//si el correo no es valido saldra un mensaje de error
			else {
				JOptionPane.showMessageDialog(null, "El correo electronico no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			break;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
