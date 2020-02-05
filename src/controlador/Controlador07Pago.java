package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import calculosMatematicos.Calculo;
import controlador.ControladorVueltas;
import metodosDAO.BilleteDAO;
import modelo.Billete;
import modelo.Cliente;
import modelo.Linea;
import vista.Ventana01Bienvenida;
import vista.Ventana06Desglose;
import vista.Ventana08ImprimirBilletes;
import vista.Ventana07Pago;



public class Controlador07Pago implements MouseListener {

	
	private Ventana07Pago ventanaPago;

	private int coma;
	private boolean comprobarComa;
	private float restante;
	private float total;
	private float introducido;
	private int distancia = 0;
	private int decimales = 3;
	private Linea linea;
	private Billete billete;
	private Billete billete2;
	private Cliente cliente;
	private double preciototal = 0;


	
	public Controlador07Pago (Ventana07Pago window, Linea pLinea, Billete pbillete, Billete pBillete2, Cliente pCliente) {
		// TODO Auto-generated constructor stub
		
		this.ventanaPago = window;
		this.linea = pLinea;
		this.billete = pbillete;
		this.billete2 = pBillete2;
		this.cliente = pCliente;
		
		if (billete.getCod_Linea() == billete2.getCod_Linea()) {
			preciototal = billete.getPrecio() + billete2.getPrecio();
			billete.setPrecio(Calculo.formatearPrecio(billete.getPrecio() + billete.getPrecio() * 0.21));
			billete2.setPrecio(Calculo.formatearPrecio(billete2.getPrecio() + billete2.getPrecio() * 0.21));
			
		} else {
			preciototal = billete.getPrecio();
			billete.setPrecio(Calculo.formatearPrecio(billete.getPrecio() + billete.getPrecio() * 0.21));
		}
		
		mIniciarControlador();
		
		
	}


	private void mIniciarControlador() {
		

		
		this.ventanaPago.getTxtPrecioSinIva().setText(Double.toString(Calculo.formatearPrecio(this.preciototal)));
		this.ventanaPago.getTxtPrecioConIva().setText(Double.toString(Calculo.formatearPrecio(this.preciototal + this.preciototal*0.21)));
		this.ventanaPago.getTxtPrecioAPagar().setText(this.ventanaPago.getTxtPrecioConIva().getText());
		
		
		
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
		this.ventanaPago.getBtn_c().addMouseListener(this);
		this.ventanaPago.getBtn_c().setName("eliminar");
		this.ventanaPago.getBtn_borrar().addMouseListener(this);
		this.ventanaPago.getBtn_borrar().setName("borrar");
		this.ventanaPago.getBtn_pagar().addMouseListener(this);
		this.ventanaPago.getBtn_pagar().setName("pagar");
		this.ventanaPago.getBtnVolver().addMouseListener(this);
		this.ventanaPago.getBtnVolver().setName("Volver");
		
		
		
		
	
	}

	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String opcion = e.getComponent().getName();
		
		switch(opcion) {
		
		case "Salir":
			
				Ventana01Bienvenida window = new Ventana01Bienvenida();
				Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
				window.getFrame().setVisible(true);
				this.ventanaPago.Ventana07Pago.dispose();
			break;
				
		case "0":
			
			
			escribir_botones(opcion);	

			break;
			
		case "1":

			escribir_botones(opcion);		

			break;

		case "2":

			escribir_botones(opcion);	
			
			break;
		case "3":

			escribir_botones(opcion);	
			
			break;

		case "4":


			escribir_botones(opcion);	
			
			break;

		case "5":
 
			escribir_botones(opcion);	
			
			break;

		case "6":

			escribir_botones(opcion);	
			
			break;

		case "7":
			
			escribir_botones(opcion);	
			
			break;

		case "8":

			escribir_botones(opcion);	
			
			break;

		case "9":
			
			escribir_botones(opcion);	
			
			break;
			
		case "coma":
			
			coma = this.ventanaPago.getTxtIntroducido().getText().indexOf(".");
			if (coma != -1) {
				comprobarComa = false;
			}else {
				comprobarComa = true;
			}
			
			
			
			if (!this.ventanaPago.getTxtIntroducido().getText().equals("")) {
				if (comprobarComa == true) {
					this.ventanaPago.getBtn_coma().setEnabled(true);
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + ".");
					this.ventanaPago.getBtn_coma().setEnabled(true);
					distancia = this.ventanaPago.getTxtIntroducido().getText().indexOf(".");
					decimales = distancia +2;
				}

			}
			
			break;

		case "eliminar":
			
				this.ventanaPago.getTxtIntroducido().setText("");
				if (comprobarComa == true) {
					distancia = 0;
					decimales = 3;
				}
				
			break;
		
		case "borrar":

				this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText().substring(0,this.ventanaPago.getTxtIntroducido().getText().length()-1));
				if (comprobarComa == true && distancia !=0) {
					distancia--;
				}
				break;
			
		case "pagar":
			
			
			if (this.ventanaPago.getTxtPrecioAPagar().getText().length() > 0) {
				total = Float.valueOf(this.ventanaPago.getTxtPrecioAPagar().getText());
			}
			if (this.ventanaPago.getTxtIntroducido().getText().length() > 0 ) {
				introducido = Float.valueOf(this.ventanaPago.getTxtIntroducido().getText());
				
			}	

			if (total > introducido) {
				restante = total-introducido;
				restante = (float) (Math.floor(restante*100)/100);
				this.ventanaPago.getTxtPrecioAPagar().setText(Float.toString(restante));
				this.ventanaPago.getTxtIntroducido().setText("");
				introducido = 0;
			}
		
			if (total < introducido) {
				restante = introducido - total;
				this.ventanaPago.getTxtVueltas().setText(ControladorVueltas.adevolver(restante));
				this.ventanaPago.getTxtPrecioAPagar().setText("0");
				this.ventanaPago.getTxtIntroducido().setText("");
				introducido = 0;
			}
		
			if (total == introducido) {
				this.ventanaPago.getTxtPrecioAPagar().setText("0");
				this.ventanaPago.getTxtVueltas().setText("Gracias por su compra \n retire sus productos \n pulse continuar");
				this.ventanaPago.getTxtIntroducido().setText("");
				introducido = 0;
			}
			
			if(Integer.parseInt(this.ventanaPago.getTxtPrecioAPagar().getText())<=0) {
				this.ventanaPago.getBtn_0().setEnabled(false);
				this.ventanaPago.getBtn_1().setEnabled(false);
				this.ventanaPago.getBtn_2().setEnabled(false);
				this.ventanaPago.getBtn_3().setEnabled(false);
				this.ventanaPago.getBtn_4().setEnabled(false);
				this.ventanaPago.getBtn_5().setEnabled(false);
				this.ventanaPago.getBtn_6().setEnabled(false);
				this.ventanaPago.getBtn_7().setEnabled(false);
				this.ventanaPago.getBtn_8().setEnabled(false);
				this.ventanaPago.getBtn_9().setEnabled(false);
				this.ventanaPago.getBtn_coma().setEnabled(false);
				this.ventanaPago.getBtn_borrar().setEnabled(false);
				this.ventanaPago.getBtn_pagar().setEnabled(false);
				this.ventanaPago.getBtn_c().setEnabled(false);
				this.ventanaPago.getBtnSalir().setEnabled(false);
				this.ventanaPago.getBtnVolver().setEnabled(false);
			}
			
			break;
			
		case "Continuar":
			if (this.ventanaPago.getTxtPrecioAPagar().getText().length() > 0) {
				total = Float.valueOf(this.ventanaPago.getTxtPrecioAPagar().getText());
			}
			if (total!=0) {
				JOptionPane.showMessageDialog(null, "Debe pagar el precio entero del billete", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}else {
				
				billete.setCod_Billete(BilleteDAO.mObtenerCodigoBillete(billete));
				BilleteDAO.mRegistrarBillete(billete);
				
				if (billete2.getCod_Linea() != null) {
					billete2.setCod_Billete(BilleteDAO.mObtenerCodigoBillete(billete2));
					BilleteDAO.mRegistrarBillete(billete2);
				}
				
				Ventana08ImprimirBilletes ventana = new Ventana08ImprimirBilletes();
				Controlador08ImprimirBilletes controladorBienvenida = new Controlador08ImprimirBilletes(ventana, billete, billete2, cliente);
				ventana.ventana08ImprimirBilletes.setVisible(true);
				this.ventanaPago.Ventana07Pago.dispose();
			}
			

			break;
			
		case "Volver":
			Ventana06Desglose window1 = new Ventana06Desglose();
			Controlador06Desglose controlador = new Controlador06Desglose(window1, linea, billete, billete2, cliente);
			window1.Ventana06Desglose.setVisible(true);
			this.ventanaPago.Ventana07Pago.dispose();
			
			break;
		}
	}


	private void escribir_botones(String opcion) {
		if (comprobarComa == false) {
			if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
				this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + opcion);
			}else {
				JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
		} else {

			if (distancia < decimales) {
				this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + opcion);
				distancia++;
			}else {
				JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
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