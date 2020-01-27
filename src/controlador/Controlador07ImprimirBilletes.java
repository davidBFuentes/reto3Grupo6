package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vista.Ventana01Bienvenida;
import vista.Ventana06Desglose;
import vista.Ventana08ImprimirBilletes;
import vista.Ventana09Fin;

public class Controlador07ImprimirBilletes implements MouseListener  {

	private Ventana08ImprimirBilletes ventanaImprimirBilletes;
	
	public Controlador07ImprimirBilletes(Ventana08ImprimirBilletes pVentana07) {
		// TODO Auto-generated constructor stub
		this.ventanaImprimirBilletes = pVentana07;
		mIniciarControlador();
	}

	
	private void mIniciarControlador() {
		
		this.ventanaImprimirBilletes.getBtnSalir().addMouseListener(this);
		this.ventanaImprimirBilletes.getBtnSalir().setName("Salir");
		this.ventanaImprimirBilletes.getBtnFinalizar().addMouseListener(this);
		this.ventanaImprimirBilletes.getBtnFinalizar().setName("Finalizar");
		this.ventanaImprimirBilletes.getBtnImprimirBillete().addMouseListener(this);
		this.ventanaImprimirBilletes.getBtnImprimirBillete().setName("Imprimir");
	
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
				this.ventanaImprimirBilletes.getRegistro().dispose();
			break;
			
		case "Finalizar":
			
			Ventana09Fin ventana = new Ventana09Fin();
			Controlador08Fin controladorBienvenida = new Controlador08Fin(ventana);
			ventana.getFrame().setVisible(true);
			this.ventanaImprimirBilletes.getRegistro().dispose();
				
		case "Imprimir":
			
			//Crear fichero en caso de que no exista y escribirlo
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
