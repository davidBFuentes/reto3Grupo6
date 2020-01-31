package controlador;


import java.awt.event.ActionEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Billete;
import vista.Ventana01Bienvenida;

import vista.Ventana06Desglose;

import vista.Ventana07Pago;


public class Controlador06Desglose implements MouseListener {

	private Ventana06Desglose ventanadeglose;
	private Billete billete;
	
	public Controlador06Desglose (Ventana06Desglose pVentana06, Billete pBillete) {
		
		this.ventanadeglose = pVentana06;
		this.billete = pBillete;
		mIniciarControlador();
		
		
	}
	
	private void mIniciarControlador() {
		
		
		
		this.ventanadeglose.getBtnSalir().addMouseListener(this);
		this.ventanadeglose.getBtnSalir().setName("Salir");
		this.ventanadeglose.getBtnContinuar().addMouseListener(this);
		this.ventanadeglose.getBtnContinuar().setName("Continuar");
	
		
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
				Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
				window.getFrame().setVisible(true);
				this.ventanadeglose.getDesglose().dispose();
			break;
			
		case "Continuar":
			
				Ventana07Pago window1 = new Ventana07Pago();
				Controlador07Pago controlador = new Controlador07Pago(window1);
				window1.getVentana07Pago().setVisible(true);
				this.ventanadeglose.getFrame().dispose();
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
