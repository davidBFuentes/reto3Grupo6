package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Fichero;
import vista.Ventana02Login;
import vista.Ventana03Registro;
import vista.Ventana04Trayectos;


public class Controlador02Login implements KeyListener, MouseListener {
	
	private Ventana02Login ventanalogin;
	
	
	public Controlador02Login (Ventana02Login pVentana02) {
		
		this.ventanalogin = pVentana02;
		mInicializarControlador();
		
		
	}
	
	private void mInicializarControlador () {
		
		this.ventanalogin.getbIdentificarse().addMouseListener(this);
		this.ventanalogin.getbIdentificarse().setName("Identificarse");
		this.ventanalogin.getbOmitir().addMouseListener(this);
		this.ventanalogin.getbOmitir().setName("Omitir");
		this.ventanalogin.getbRegistrarse().addMouseListener(this);
		this.ventanalogin.getbRegistrarse().setName("Registrarse");
		this.ventanalogin.getTxtDni().addKeyListener(this);
		this.ventanalogin.getTxtDni().setName("dni");
		this.ventanalogin.getTxtContrasena().addKeyListener(this);
		this.ventanalogin.getTxtContrasena().setName("pass");
			
	}

	private boolean mIdentificarse() {
		
			boolean login = false;
		
			try {
				
				login = Fichero.mComprobarFichero(this.ventanalogin.getTxtDni().getText(), this.ventanalogin.getTxtContrasena().getText());
				
				if (login == true) {
					
					Cliente cliente = new Cliente(this.ventanalogin.getTxtDni().getText(), "x", "x", "x");
					ArrayList<Cliente> listaclientes = ClienteDao.mObtenerClientes();
					
					for (Cliente cliente1: listaclientes){
						
						if (cliente.getDni().equals(cliente1.getDni())) {
							cliente.setNombre(cliente1.getNombre());
							cliente.setApellido(cliente1.getApellido());
							cliente.setSexo(cliente1.getSexo());
							Ventana04Trayectos window4 = new Ventana04Trayectos();
							Controlador04Trayectos controlador = new Controlador04Trayectos(window4);
							window4.getFrame().setVisible(true);
							this.ventanalogin.getLogin().dispose();
						}
						
					}
					
					System.out.println("Identificado");
					
				} else {
					
					System.out.println("Datos incorrectos");
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			return login;
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		e.getComponent().getName();
		
		switch (e.getComponent().getName()) {
		case "dni":
			if(this.ventanalogin.getTxtDni().getText().length()>8) {  
				   e.consume();
				 }
			break;

		case "pass":
			 if(this.ventanalogin.getTxtContrasena().getText().length()>9) {  
				   e.consume();
				 }
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
		
		case "Identificarse":
			
				if (this.ventanalogin.getTxtDni().getText().length() == 0 || this.ventanalogin.getTxtContrasena().getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				
				} else if (this.ventanalogin.getTxtDni().getText().length() < 9){
					JOptionPane.showMessageDialog(null, "Introduzca un DNI válido", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				
				} else {
				
				mIdentificarse();
				
				}
				
				break;
				
		case "Omitir":
				Cliente cliente1 = new Cliente("x", "Invitado", "x", "x");
				Ventana04Trayectos window4 = new Ventana04Trayectos();
				Controlador04Trayectos controlador = new Controlador04Trayectos(window4);
				window4.getFrame().setVisible(true);
				this.ventanalogin.getLogin().dispose();
				break;
				
		case "Registrarse":
			
				Ventana03Registro window3 = new Ventana03Registro();
				Controlador03Registro cRegistro = new Controlador03Registro(window3);
				window3.getFrame().setVisible(true);	
				this.ventanalogin.getLogin().dispose();
				break;
				
		case "Numero":
			
			
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
