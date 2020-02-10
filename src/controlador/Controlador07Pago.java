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

	//Declaramos las variables que vamos a usar a lo largo del programa
	private Ventana07Pago ventanaPago;

	private int coma;
	private boolean comprobarComa;
	private double restante;
	private double total;
	private double introducido;
	private int distancia = 0;
	private int decimales = 3;
	private Linea linea;
	private Billete billete;
	private Billete billete2;
	private Cliente cliente;
	private double preciototal = 0;


	/**
	 * Constructor que inicializara el funcionamiento del controlador habiendo recibido 5 parametros (la ventana de pago, el objeto linea, el objeto billete, el objeto billete de vuelta y el objeto cliente)
	 * ademas de ello establece los precios con iva y sin iva 
	 * @param pVentana7 
	 * @param pLinea
	 * @param pBillete
	 * @param pBillete2
	 * @param pCliente
	 * 
	 */
	public Controlador07Pago (Ventana07Pago window, Linea pLinea, Billete pbillete, Billete pBillete2, Cliente pCliente) {
		// TODO Auto-generated constructor stub
		
		this.ventanaPago = window;
		this.linea = pLinea;
		this.billete = pbillete;
		this.billete2 = pBillete2;
		this.cliente = pCliente;
		
		if (billete.getCod_Linea() == billete2.getCod_Linea()) {

			//en caso de que haya 2 billetes el precio total sera la suma de ambos
			preciototal = billete.getPrecio() + billete2.getPrecio();

			
		} else {
			//sino solo el precio de ambos
			preciototal = billete.getPrecio();

		}
		
		mIniciarControlador();
		
		
	}

	/**
	 * Metodo para cargar las acciones de los botones
	 */
	private void mIniciarControlador() {
		

		//escribir los precios formateados a 2 decimales en los Textfield necesarios
		this.ventanaPago.getTxtPrecioSinIva().setText(Double.toString(Calculo.formatearPrecio(this.preciototal)));
		this.ventanaPago.getTxtPrecioConIva().setText(Double.toString(Calculo.formatearPrecio(this.preciototal + this.preciototal*0.21)));
		this.ventanaPago.getTxtPrecioAPagar().setText(this.ventanaPago.getTxtPrecioConIva().getText());
		
		
		//Añadimos los mouselistener a los botones
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
		//guardamos el nombre que usamos al pulsar un boton para poder acceder al switch
		String opcion = e.getComponent().getName();
		
		//creamos un switch para denominar lo que va a hacer en cada caso
		switch(opcion) {
		
		case "Salir":
			//en el caso de salir volvera a la ventana de bienvenida
			Ventana01Bienvenida window = new Ventana01Bienvenida();
		
			@SuppressWarnings("unused") 
			Controlador01Bienvenida controladorbienvenida = new Controlador01Bienvenida(window);
		
			window.getFrame().setVisible(true);
			this.ventanaPago.Ventana07Pago.dispose();
			break;
				
		case "0":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;
			
		case "1":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	
	

			break;

		case "2":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;
		case "3":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;

		case "4":

			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;

		case "5":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;

		case "6":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;

		case "7":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;

		case "8":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;

		case "9":
			
			//en el caso de los numeros llama a un metodo que encontraremos al salir del switch 
			extracted(opcion);	

			break;
			
		case "coma":
			//comprobamos  si existe una coma o no y lo metemos en una variable
			coma = this.ventanaPago.getTxtIntroducido().getText().indexOf(".");

			//si se encuentra una coma nos devolvera un 1 por que no sera igual a -1
			if (coma != -1) {
				//en caso de que se encuentre una coma
				comprobarComa = false;
			}else {
				//en caso de que no se encuentre una cosa
				comprobarComa = true;
			}
			
			
			//definimos que solo podra acceder si el textField de introducido no es null o no tiene valor
			if (!this.ventanaPago.getTxtIntroducido().getText().equals("")) {
				//en caso de que se vea que no existe ninguna coma podra acceder
				if (comprobarComa == true) {
					/*
					 * en esta parte le decimos que active el boton para poder usarlo, lo que va a hacer ese boton y vuelve a bloquear. 
					 * Ademas de eso cogeremos su posicion y trabajaremos con ello para poder parar los numeros cuando se escribam 2 despues de la coma
					*/
					this.ventanaPago.getBtn_coma().setEnabled(true);
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + ".");
					this.ventanaPago.getBtn_coma().setEnabled(false);
					distancia = this.ventanaPago.getTxtIntroducido().getText().indexOf(".");
					decimales = distancia +2;
				}

			}
			
			break;

		case "eliminar":
				
				//en el caso de querer borrar todo lo escrito le daremos un valor al textField y pondremos en caso de que no haya coma unos valores para inicializar 2 variables que usaremos despues
				this.ventanaPago.getTxtIntroducido().setText("");
				if (comprobarComa == true) {
					distancia = 0;
					decimales = 3;
				}
				
			break;
		
		case "borrar":

				//para borrar solo lo ultimo introducido debemos primero ver que no esta vacio
				if(this.ventanaPago.getTxtIntroducido().getText().length()!=0) {
					//cuando comprobamos lo anterior podemos proceder a quitarle 1 en su tamaño para asi hacer desaparecer lo ultimo introducido
					this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText().substring(0,this.ventanaPago.getTxtIntroducido().getText().length()-1));
					//tambien tenemos que tener la coma en cuenta
					if (comprobarComa == false && distancia !=0) {
						//en caso de que exista una cosa debemos quitarle 1 en la variable que nos dice cuantos decimales existen 
						distancia--;
					}
				}
				
				break;
			
		case "pagar":
			
			//para pagar debemos meter en una variables el precio total (con iva) que debemos pagar
			if (this.ventanaPago.getTxtPrecioAPagar().getText().length() > 0) {
				total = Double.valueOf(this.ventanaPago.getTxtPrecioAPagar().getText());
			}
			//a su vez debemos meter el dinero que nos ha introducido el usuario
			if (this.ventanaPago.getTxtIntroducido().getText().length() > 0 ) {
				introducido = Double.valueOf(this.ventanaPago.getTxtIntroducido().getText());
				
			}	
			//llamamos a un metodo para que trabaje con ellos
			pagar(total, introducido);
			
			//en caso de que nos pague todo o de mas
			if(Integer.parseInt(this.ventanaPago.getTxtPrecioAPagar().getText())<=0) {
				//bloqueamos los botones salvo el de finalizar
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
			
			//como no le permitiremos pasar de ventana si no ha pagado debemos obtener lo que queda pos pagar
			if (this.ventanaPago.getTxtPrecioAPagar().getText().length() > 0) {
				total = Float.valueOf(this.ventanaPago.getTxtPrecioAPagar().getText());
			}
			//en caso de que no haya pagado toda la cantidad
			if (total!=0) {
				//saldra un mensaje de error para avisarle
				JOptionPane.showMessageDialog(null, "Debe pagar el precio entero del billete", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}else {
				//en caso de que haya pagado todo debemos meter todos los datos en el objeto billete
				billete.setCod_Billete(BilleteDAO.mObtenerCodigoBillete(billete));
				BilleteDAO.mRegistrarBillete(billete);
				
				//en caso de que haya billete de vuelta meteremos los datos en el objeto billete2
				if (billete2.getCod_Linea() != null) {
					billete2.setCod_Billete(BilleteDAO.mObtenerCodigoBillete(billete2));
					BilleteDAO.mRegistrarBillete(billete2);
				}
				//metemos el precio de los billetes en su variable correspondiente
				billete.setPrecio(Calculo.formatearPrecio(billete.getPrecio() + billete.getPrecio() * 0.21));
				billete2.setPrecio(Calculo.formatearPrecio(billete2.getPrecio() + billete2.getPrecio() * 0.21));
				
				//avanzamos a la siguienete ventana
				Ventana08ImprimirBilletes ventana = new Ventana08ImprimirBilletes();
				@SuppressWarnings("unused")
				Controlador08ImprimirBilletes controladorBienvenida = new Controlador08ImprimirBilletes(ventana, billete, billete2, cliente);
				ventana.ventana08ImprimirBilletes.setVisible(true);
				this.ventanaPago.Ventana07Pago.dispose();
			}
			

			break;
			
		case "Volver":

			//en el caso de querer volver a la ventana anterior se volvera
			Ventana06Desglose window1 = new Ventana06Desglose();
			@SuppressWarnings("unused") 
			Controlador06Desglose controlador = new Controlador06Desglose(window1, linea, billete, billete2, cliente);
			window1.Ventana06Desglose.setVisible(true);
			this.ventanaPago.Ventana07Pago.dispose();
			
			break;
		}
	}

	/**
	 * Metodo para pagar al que le pasaremos le dinero uqe falta por pagar y el dinero con el que nos esta pagando (double total, double introducido)
	 * @param total
	 * @param introducido
	 */
	private void pagar(double total, double introducido) {
		//en caso de que el total  sea mayor a lo introducido
		if (total > introducido) {
			//calculamos lo que debe pagar todavia y lo redondeamos a 2 decimales
			restante = total-introducido;
			restante = (Calculo.formatearPrecio(restante));
			//escribimos lo que debe pagar todavia y reiniciamos para que continue pagando
			this.ventanaPago.getTxtPrecioAPagar().setText(Double.toString(restante));
			this.ventanaPago.getTxtIntroducido().setText("");
			introducido = 0;
		}else if (total < introducido) {
			//en caso de que pague de mas calculamos lo que le debamos devolver 
			restante = introducido - total;
			//llamamos al metodo que nos dira cuantas monedas de cuanto valor debemos devolverle
			this.ventanaPago.getTxtVueltas().setText(ControladorVueltas.adevolver(restante));
			//ademas pondremos lo que nos debe pagar a 0 y lo introducido a 0
			this.ventanaPago.getTxtPrecioAPagar().setText("0");
			this.ventanaPago.getTxtIntroducido().setText("");
			introducido = 0;
		}else {
			//si nos mete dinero justo solo pondremos el precio a pagar a 0 y un mensaje dando las gracias
			this.ventanaPago.getTxtPrecioAPagar().setText("0");
			this.ventanaPago.getTxtVueltas().setText("Gracias por su compra \n recoja el billete \n pulse continuar");
			this.ventanaPago.getTxtIntroducido().setText("");
			introducido = 0;
		}
	}

	
	
	/**
	 * Metodo para escribir los numeros
	 * @param opcion
	 */
	private void extracted(String opcion) {
		//en caso de que no haya una coma
		if (comprobarComa == false) {
			//podremos poner hasta un maximo de 3 numeros para asi solo aceptar hasta 999€ y en caso de que se pueda escribir el numero lo escribe
			if (this.ventanaPago.getTxtIntroducido().getText().length()<3) {
				this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + opcion);
			}else {
				//en caso de que no se puedan poner mas numeros nos saldra un mensaje de error
				JOptionPane.showMessageDialog(null, "Maximo de 3 numeros antes de la coma", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			}
		} else {
			//miraremos la distancia en la que esta la coma, adema veremos cual es el maximo de decimales que podemos meter
			if (distancia < decimales) {
				//si se pueden introducir decimales los introducira y sumara 1 a la distancia
				this.ventanaPago.getTxtIntroducido().setText(this.ventanaPago.getTxtIntroducido().getText() + opcion);
				distancia++;
			}else {
				//en caso negativo saldra un mensaje de error
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