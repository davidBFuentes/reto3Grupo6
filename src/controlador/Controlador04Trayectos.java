package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import metodosDAO.LineaDAO;
import modelo.Billete;
import modelo.Cliente;
import modelo.Linea;
import vista.Ventana01Bienvenida;
import vista.Ventana04Trayectos;
import vista.Ventana05ParadasFecha;

public class Controlador04Trayectos implements MouseListener, MouseMotionListener, ActionListener {
	
	// Crear atributos del controlador
	
	private Ventana04Trayectos ventanatrayectos;
	private Billete billete;
	private Cliente cliente;
	
	
	public Controlador04Trayectos (Ventana04Trayectos pVentana02, Billete pBillete, Cliente pCliente) {
		
		
		this.ventanatrayectos = pVentana02;
		this.billete = pBillete;
		this.cliente = pCliente;
		
		mIniciarControlador();
		
	}
	
	private void mIniciarControlador( ) {
		
		
		this.ventanatrayectos.getBtnContinuar().addMouseListener(this);
		this.ventanatrayectos.getBtnContinuar().setName("Continuar");
		this.ventanatrayectos.getBtnSalir().addMouseListener(this);
		this.ventanatrayectos.getBtnSalir().setName("Salir");
		this.ventanatrayectos.getComboLineas().addActionListener(this);
		this.ventanatrayectos.getComboLineas().setActionCommand("Combo");
		
		ArrayList <Linea> listalineas = LineaDAO.mObtenerLineas();
		
		for (Linea linea : listalineas) {
			this.ventanatrayectos.getComboLineas().addItem(linea);

		}
		
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
			case "Continuar":
				if (this.ventanatrayectos.getComboLineas().getSelectedIndex() != 0) {
					
					Linea linea = new Linea();
					linea = (Linea) this.ventanatrayectos.getComboLineas().getSelectedItem();
					billete.setCod_Linea(linea.getCodLinea());
					Ventana05ParadasFecha window = new Ventana05ParadasFecha();
					Controlador05ParadasFecha controlador = new Controlador05ParadasFecha(window, linea, billete, cliente);
					window.getFrame().setVisible(true);
					this.ventanatrayectos.getFrame().dispose();
					
				}  else {
							
					JOptionPane.showMessageDialog(null, "Ha de seleccionar una línea para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
						
					}
				
				break;
					
				
			case "Salir":
				Ventana01Bienvenida window2 = new Ventana01Bienvenida();
				Controlador01Bienvenida controlador = new Controlador01Bienvenida(window2);

				window2.getFrame().setVisible(true);
				this.ventanatrayectos.getFrame().dispose();
				break;
			
		}
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
		case "Combo":
			System.out.println(this.ventanatrayectos.getComboLineas().getSelectedItem());
			break;
	
		}
		
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
	}

}
