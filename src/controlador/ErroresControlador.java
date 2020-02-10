package controlador;

import javax.swing.JOptionPane;

import vista.Ventana05ParadasFecha;

public class ErroresControlador {
	
	public static boolean verificarErroresControlador5(Ventana05ParadasFecha ventanaParadasFecha) {
		boolean error = true;
		
		if ((ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == 0) 
				&& (ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex() == 0)){
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de origen y otra de destino para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}	
		else if (ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == 0) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de origen para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex() == 0) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de destino para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getComboBoxOrigenIda().getSelectedIndex() == ventanaParadasFecha.getComboBoxDestinoIda().getSelectedIndex()) {
			
			JOptionPane.showMessageDialog(null, "La parada de origen no puede ser la misma que la de destino", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getFechaIda() == null) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una fecha de ida para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getComboBoxHorariosIda().getSelectedIndex() == 0) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar un horario de ida para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getCheckBox().isSelected() && ventanaParadasFecha.getFechaVuelta() == null) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una fecha de vuelta para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);				
		}
		else if(ventanaParadasFecha.getCheckBox().isSelected() && ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedIndex() == 0) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar un horario de vuelta para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		
		/* else if(this.ventanaParadasFecha.getCheckBox().isSelected() && 
		 
				this.ventanaParadasFecha.getDateChooserIda().getDate().equals(this.ventanaParadasFecha.getDateChooserVuelta()) &&
				this.ventanaParadasFecha.getComboBoxHorariosIda().getSelectedItem().equals(this.ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem())) {
			
			JOptionPane.showMessageDialog(null, "La hora de ida y de vuelta no puede ser la misma", "Mensaje de error", JOptionPane.ERROR_MESSAGE );
		}*/
		
		else {
			error = false;
		}
		return error;
	}

}