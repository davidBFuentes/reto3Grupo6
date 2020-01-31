package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import controlador.ControladorVueltas;
import modelo.Billete;
import vista.Ventana01Bienvenida;
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
	private Billete billete;


	
	public Controlador07Pago (Ventana07Pago window, Billete pbillete) {
		// TODO Auto-generated constructor stub
		this.ventanaPago = window;
		this.billete = pbillete;
		mIniciarControlador();
	}


	private void mIniciarControlador() {
		

		this.ventanaPago.getTxtDestino().setText(billete.getNombre_Parada_Destino());
		this.ventanaPago.getTxtOrigen().setText(billete.getNombre_Parada_Origen());
		this.ventanaPago.getTxtPrecioBillete().setText(Double.toString(billete.getPrecio()));
		this.ventanaPago.getTxtPrecioSinIva().setText(Double.toString(billete.getPrecio()));
		this.ventanaPago.getTxtFechaSalida().setText(billete.getFecha() + " " + billete.getHora());
		this.ventanaPago.getTxtPrecioConIva().setText(Double.toString(billete.getPrecio() + billete.getPrecio()*0.21));
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
				
		case "0":
			
			
			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "0");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "0");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	

			break;
			
		case "1":

			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "1");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "1");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	

			break;

		case "2":

			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "2");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "2");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	
			break;
		case "3":

			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "3");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "3");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	
			break;

		case "4":

			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "4");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "4");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	
			break;

		case "5":
 
			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "5");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "5");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	
			break;

		case "6":

			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "6");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "6");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	
			break;

		case "7":
			
			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "7");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "7");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}	
			break;

		case "8":

			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "8");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "8");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}
			break;

		case "9":
			
			if (comprobarComa == false) {
				if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "9");
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			} else {

				if (distancia < decimales) {
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + "9");
					distancia++;
				}else {
					JOptionPane.showMessageDialog(null, "Maximo de 2 decimales", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
				}
			}
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
			
			break;
			
		case "Continuar":
			if (this.ventanaPago.getTxtPrecioAPagar().getText().length() > 0) {
				total = Float.valueOf(this.ventanaPago.getTxtPrecioAPagar().getText());
			}
			if (total!=0) {
				JOptionPane.showMessageDialog(null, "Debe pagar el precio entero del billete", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}else {
				Ventana08ImprimirBilletes ventana = new Ventana08ImprimirBilletes();
				Controlador08ImprimirBilletes controladorBienvenida = new Controlador08ImprimirBilletes(ventana, billete);
				ventana.getFrame().setVisible(true);
				this.ventanaPago.getRegistro().dispose();
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