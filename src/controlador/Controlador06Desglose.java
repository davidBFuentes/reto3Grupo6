package controlador;


import java.awt.event.ActionEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Billete;
import modelo.Cliente;
import modelo.Linea;
import modelo.Municipio;
import vista.Ventana01Bienvenida;
import vista.Ventana05ParadasFecha;
import vista.Ventana06Desglose;

import vista.Ventana07Pago;


public class Controlador06Desglose implements MouseListener {

	private Ventana06Desglose ventanadeglose;
	private Billete billete;
	private Billete billete2;
	private Cliente cliente;
	private Linea linea;
	private Municipio municipioOrigen;
	private Municipio municipioDestino;
	
	public Controlador06Desglose (Ventana06Desglose pVentana06, Linea pLinea, Billete pBillete, Billete pBillete2, Cliente pCliente, Municipio pMunicipioOrigen, Municipio pMunicipioDestino) {
		
		this.ventanadeglose = pVentana06;
		this.billete = pBillete;
		this.billete2 = pBillete2;
		this.cliente = pCliente;
		this.linea = pLinea;
		this.municipioOrigen = pMunicipioOrigen;
		this.municipioDestino = pMunicipioDestino;
		
		mIniciarControlador();
		
		
	}
	
	private void mIniciarControlador() {
		
		
		this.ventanadeglose.getTxtDNI().setText(cliente.getDni());
		this.ventanadeglose.getTxtNombre().setText(cliente.getNombre());
		this.ventanadeglose.getTxtApellidos().setText(cliente.getApellido());
		this.ventanadeglose.getTxtOrigen().setText(billete.getNombre_Parada_Origen());
		this.ventanadeglose.getTxtDestino().setText(billete.getNombre_Parada_Destino());
		this.ventanadeglose.getTxtFecha().setText(billete.getFecha() + " " + billete.getHora());	
		
		
		this.ventanadeglose.getTxtNAutobus().setText(billete.getCod_Bus());
		
		this.ventanadeglose.getTxtFecha().setText(billete.getFecha());
		this.ventanadeglose.getTxtNAutobus().setText(billete.getCod_Bus());	
		this.ventanadeglose.getLblHora2().setText(billete.getHora());
		this.ventanadeglose.getLblPrecio2().setText(String.valueOf(billete.getPrecio()) + " €");
		this.ventanadeglose.getBtnSalir().addMouseListener(this);
		this.ventanadeglose.getBtnSalir().setName("Salir");
		this.ventanadeglose.getBtnContinuar().addMouseListener(this);
		this.ventanadeglose.getBtnContinuar().setName("Continuar");
		this.ventanadeglose.getBtnVolver().addMouseListener(this);
		this.ventanadeglose.getBtnVolver().setName("Volver");
		

		if (billete2.getCod_Linea() == null) {
			
			this.ventanadeglose.getPanel_5().setVisible(false);
			this.ventanadeglose.getLblImagen().setVisible(true);
			
		} else {
			
			this.ventanadeglose.getLblImagen().setVisible(false);
			this.ventanadeglose.getPanel_5().setVisible(true);
			this.ventanadeglose.getLblNAutobusVuelta2().setText(billete2.getCod_Bus());
			this.ventanadeglose.getLblFechaVuelta2().setText(billete2.getFecha());
			this.ventanadeglose.getLblHoraVuelta2().setText(billete2.getHora());
			this.ventanadeglose.getLblPrecioVuelta2().setText(String.valueOf(billete2.getPrecio()) + " €" );
			
		}
	
		
	}

	public void actionPerformed(ActionEvent e) {
		
		
	}
		// TODO Auto-generated method stub
		
	

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	e.getComponent().getName();
		
		switch(e.getComponent().getName()) {
		
		case "Salir":
			Ventana01Bienvenida window = new Ventana01Bienvenida();
	
			@SuppressWarnings("unused") Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
		
			window.getFrame().setVisible(true);
			this.ventanadeglose.Ventana06Desglose.setVisible(false);
			break;
			
		case "Continuar":
			
				Ventana07Pago window1 = new Ventana07Pago();
				@SuppressWarnings("unused") Controlador07Pago controlador = new Controlador07Pago(window1, linea, billete, billete2, cliente, municipioOrigen, municipioDestino);
				window1.getVentana07Pago().setVisible(true);
				this.ventanadeglose.Ventana06Desglose.dispose();
			break;
			
		case "Volver":
				Ventana05ParadasFecha window2 = new Ventana05ParadasFecha();
				@SuppressWarnings("unused") Controlador05ParadasFecha controlador05 = new Controlador05ParadasFecha(window2, linea, billete, cliente);
				window2.getFrame().setVisible(true);
				this.ventanadeglose.Ventana06Desglose.dispose();
			break;

		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
