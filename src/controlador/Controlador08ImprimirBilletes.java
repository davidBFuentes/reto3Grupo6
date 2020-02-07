package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;

import modelo.Billete;
import modelo.Cliente;
import modelo.Fichero;
import vista.Ventana01Bienvenida;
import vista.Ventana08ImprimirBilletes;
import vista.Ventana09Fin;

public class Controlador08ImprimirBilletes implements MouseListener  {

	private Ventana08ImprimirBilletes ventanaImprimirBilletes;
	private Billete billete;
	private Billete billete2;
	private Cliente cliente;
	
	public Controlador08ImprimirBilletes(Ventana08ImprimirBilletes pVentana08, Billete pBillete, Billete pBillete2, Cliente pCliente) {
		// TODO Auto-generated constructor stub
		
		this.ventanaImprimirBilletes = pVentana08;
		this.billete = pBillete;
		this.billete2 = pBillete2;
		this.cliente = pCliente;
		mIniciarControlador();
	}

	
	private void mIniciarControlador() {
		
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
		this.ventanaImprimirBilletes.getLblPrecio2().setText(String.valueOf(billete.getPrecio()) + " €");
		this.ventanaImprimirBilletes.getLblNBillete_2().setText(String.valueOf(billete.getCod_Billete())); 
		

		if (billete2.getCod_Linea() == null) {
			
			this.ventanaImprimirBilletes.getPanel_5().setVisible(false);
			this.ventanaImprimirBilletes.getLblImagen().setVisible(true);
			
		} else {
			
			this.ventanaImprimirBilletes.getLblImagen().setVisible(false);
			this.ventanaImprimirBilletes.getPanel_5().setVisible(true);
			this.ventanaImprimirBilletes.getLblNBilleteVuelta_2().setText(String.valueOf(billete2.getCod_Billete())); 
			this.ventanaImprimirBilletes.getLblNAutobusVuelta2().setText(billete2.getCod_Bus());
			this.ventanaImprimirBilletes.getLblFechaVuelta2().setText(billete2.getFecha());
			this.ventanaImprimirBilletes.getLblHoraVuelta2().setText(billete2.getHora());
			this.ventanaImprimirBilletes.getLblPrecioVuelta2().setText(String.valueOf(billete2.getPrecio()) + " €" );
			
		}
	
	}

	public void actionPerformed(ActionEvent e) {
		
	
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		e.getComponent().getName();
		
		switch(e.getComponent().getName()) {
		
		case "Salir":
			
			Ventana01Bienvenida window = new Ventana01Bienvenida();
			Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
			window.getFrame().setVisible(true);
			this.ventanaImprimirBilletes.getventana08ImprimirBilletes().dispose();
			
			break;
			
		case "Finalizar":
		
			Ventana09Fin ventana = new Ventana09Fin();
			Controlador09Fin controladorFin = new Controlador09Fin(ventana);
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
