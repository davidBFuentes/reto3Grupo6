package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.Linea;
import vista.Ventana01Bienvenida;
import vista.Ventana04Trayectos;
import vista.Ventana05ParadasFecha;
import vista.Ventana06Desglose;

public class Controlador04Trayectos implements MouseListener, MouseMotionListener, ActionListener {
	
	private Ventana04Trayectos ventanatrayectos;
	
	public Controlador04Trayectos (Ventana04Trayectos pVentana02) {
		
		this.ventanatrayectos = pVentana02;
		mIniciarControlador();
	}
	
	private void mIniciarControlador() {
		
		this.ventanatrayectos.getBtnContinuar().addMouseListener(this);
		this.ventanatrayectos.getBtnContinuar().setName("Continuar");
		this.ventanatrayectos.getBtnSalir().addMouseListener(this);
		this.ventanatrayectos.getBtnSalir().setName("Salir");
		this.ventanatrayectos.getComboLineas().addActionListener(this);
		this.ventanatrayectos.getComboLineas().setActionCommand("Combo");
		
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
		case "Continuar":
			if (this.ventanatrayectos.getComboLineas().getSelectedItem().toString().equalsIgnoreCase("Seleccione la línea en la que desea viajar")) {
				JOptionPane.showMessageDialog(null, "Ha de seleccionar una línea para continuar", "Mensaje de error",JOptionPane.ERROR_MESSAGE);
			} else {
				switch (this.ventanatrayectos.getComboLineas().getSelectedItem().toString()) {
				case "Línea 1: Bilbao - Mungia":
					Linea linea = new Linea();
					
					break;

				default:
					break;
				}
				Ventana05ParadasFecha window1 = new Ventana05ParadasFecha();
				Controlador05ParadasFecha controlador = new Controlador05ParadasFecha(window1);
				window1.getFrame().setVisible(true);
				this.ventanatrayectos.getFrame().dispose();
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
		
		e.getActionCommand();
		
		switch (e.getActionCommand()) {
		case "Combo":
			
			if(this.ventanatrayectos.getComboLineas().getSelectedItem().toString().contains("1")) {
				this.ventanatrayectos.getLblFondoCiudad().setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoMungia.png")));
			} 
			
			if(this.ventanatrayectos.getComboLineas().getSelectedItem().toString().contains("2")) {
				this.ventanatrayectos.getLblFondoCiudad().setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoDonosti.png")));
			}
			
			if(this.ventanatrayectos.getComboLineas().getSelectedItem().toString().contains("3")) {
				this.ventanatrayectos.getLblFondoCiudad().setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoGernika.png")));
			} 
			
			if(this.ventanatrayectos.getComboLineas().getSelectedItem().toString().contains("Seleccione")) {
				this.ventanatrayectos.getLblFondoCiudad().setIcon(new ImageIcon(Ventana04Trayectos.class.getResource("/imagenes/fondoBilbao.png")));
			} 
			break;
	
		}
		
	}

}
