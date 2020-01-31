package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vista.Ventana01Bienvenida;
import vista.Ventana08ImprimirBilletes;
import vista.Ventana07Pago;


public class Controlador07Pago implements MouseListener {

	
	private Ventana07Pago ventanaPago;
	
	public Controlador07Pago (Ventana07Pago window) {
		// TODO Auto-generated constructor stub
		this.ventanaPago = window;
		mIniciarControlador();
	}


	private void mIniciarControlador() {
		
		this.ventanaPago.getBtnSalir().addMouseListener(this);
		this.ventanaPago.getBtnSalir().setName("Salir");
		this.ventanaPago.getBtnContinuar().addMouseListener(this);
		this.ventanaPago.getBtnContinuar().setName("Continuar");
		this.ventanaPago.getBtn_0().addMouseListener(this);
		this.ventanaPago.getBtn_0().setName("0");
		this.ventanaPago.getBtn_1().addMouseListener(this);
		this.ventanaPago.getBtn_1().setName("1");
		this.ventanaPago.getBtn_2().addMouseListener(this);
		this.ventanaPago.getBtn_2().setName("2");
		this.ventanaPago.getBtn_3().addMouseListener(this);
		this.ventanaPago.getBtn_3().setName("3");
		this.ventanaPago.getBtn_4().addMouseListener(this);
		this.ventanaPago.getBtn_4().setName("4");
		this.ventanaPago.getBtn_5().addMouseListener(this);
		this.ventanaPago.getBtn_5().setName("5");
		this.ventanaPago.getBtn_6().addMouseListener(this);
		this.ventanaPago.getBtn_6().setName("6");
		this.ventanaPago.getBtn_7().addMouseListener(this);
		this.ventanaPago.getBtn_7().setName("7");
		this.ventanaPago.getBtn_8().addMouseListener(this);
		this.ventanaPago.getBtn_8().setName("8");
		this.ventanaPago.getBtn_9().addMouseListener(this);
		this.ventanaPago.getBtn_9().setName("9");
		this.ventanaPago.getBtn_coma().addMouseListener(this);
		this.ventanaPago.getBtn_coma().setName("coma");

	
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
				this.ventanaPago.getRegistro().dispose();
			break;
			
		case "Continuar":
			
				Ventana08ImprimirBilletes ventana = new Ventana08ImprimirBilletes();
				Controlador08ImprimirBilletes controladorBienvenida = new Controlador08ImprimirBilletes(ventana);
				ventana.getFrame().setVisible(true);
				this.ventanaPago.getRegistro().dispose();
				break;
				
		case "0":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "0");
			//txtIntroducido.setText(txtIntroducido.getText()+"0");
			break;
			
		case "1":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "1");
			break;

		case "2":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "2");
			break;

		case "3":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "3");
			break;

		case "4":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "4");
			break;

		case "5":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "5");
			break;

		case "6":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "6");
			break;

		case "7":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "7");
			break;

		case "8":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "8");
			break;

		case "9":
			
			this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "9");
			break;
			
		case "coma":
			if (!this.ventanaPago.getTxtIntroducido().getText().equals("")) {
				
				this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + ".");
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
