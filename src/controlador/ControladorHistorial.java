package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import metodosDAO.BilleteDAO;
import modelo.Billete;
import modelo.Cliente;
import vista.Ventana01Bienvenida;
import vista.VentanaControlUsuario;
import vista.VentanaHistorial;

public class ControladorHistorial implements MouseListener {
	
	private VentanaHistorial ventanaHistorial;
	private Cliente cliente;
	private Billete billete;
	
	public ControladorHistorial (VentanaHistorial pVentanaHistorial, Cliente pCliente, Billete pBillete ) {
		
		this.ventanaHistorial = pVentanaHistorial;
		this.cliente = pCliente;
		this.billete = pBillete;
		mIniciarControlador();
	
	}
	
	private void mIniciarControlador() {
		
		this.ventanaHistorial.getBtnVolver().addMouseListener(this);
		this.ventanaHistorial.getBtnVolver().setName("Volver");
		this.ventanaHistorial.getBtnSalir().addMouseListener(this);
		this.ventanaHistorial.getBtnSalir().setName("Salir");
		
		ArrayList <Billete> listaBilletes = BilleteDAO.mObtenerBilletes(cliente);	
		listaBilletes.toArray();
		
		for (int i = 0; i < (listaBilletes.size()); i++) {
		      this.ventanaHistorial.getModel().addRow(new Object[] { 
		    	  String.valueOf(listaBilletes.get(i).getCod_Billete()),
		          String.valueOf(listaBilletes.get(i).getCod_Linea()),
		          String.valueOf(listaBilletes.get(i).getCod_Bus()),
		          String.valueOf(listaBilletes.get(i).getFecha()),
		          String.valueOf(listaBilletes.get(i).getHora()),
		          String.valueOf(listaBilletes.get(i).getPrecio() + " €"),
		          
		      });

		    }
		
		if (listaBilletes.size() == 0) {
			this.ventanaHistorial.getScrollPane().setVisible(false);
			this.ventanaHistorial.getTextMensajeSinCompras().setText("Aún no ha comprado ningún billete");
			
		}
			
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getComponent().getName()) {
		case "Volver":
			VentanaControlUsuario ventanaUsuario = new VentanaControlUsuario();
			@SuppressWarnings("unused") ControladorControlUsuario controladorUsuario = new ControladorControlUsuario(ventanaUsuario, cliente, billete);
			ventanaUsuario.getFrame().setVisible(true);
			this.ventanaHistorial.getFrame().dispose();
			
			break;
			
		case "Salir":
			Ventana01Bienvenida ventanaBienvenida = new Ventana01Bienvenida();
			@SuppressWarnings("unused") Controlador01Bienvenida controladorBienvenida = new Controlador01Bienvenida(ventanaBienvenida);
			ventanaBienvenida.getFrame().setVisible(true);
			this.ventanaHistorial.getFrame().dispose();
			
			break;

		default:
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
