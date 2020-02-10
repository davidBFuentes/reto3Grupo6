package controlador;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import vista.Ventana05ParadasFecha;

public class ErroresControlador {

	/**
	 * Metodo que verifica que no haya errores en la ventanaParadasFecha
	 * @param ventanaParadasFecha
	 * @return
	 */
	public static boolean verificarErroresControlador5(Ventana05ParadasFecha ventanaParadasFecha) {
		boolean error = true;

		
		if ((ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedIndex() == 0) 
				&& (ventanaParadasFecha.getComboBoxParadaDestino().getSelectedIndex() == 0)){
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de origen y otra de destino para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}	
		else if (ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedIndex() == 0) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de origen para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getComboBoxParadaDestino().getSelectedIndex() == 0) {
			
			JOptionPane.showMessageDialog(null, "Ha de seleccionar una parada de destino para continuar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		else if(ventanaParadasFecha.getComboBoxParadaOrigen().getSelectedIndex() == ventanaParadasFecha.getComboBoxParadaDestino().getSelectedIndex()) {
			
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
		else if(ventanaParadasFecha.getCheckBox().isSelected() &&
				ventanaParadasFecha.getFechaIda().equals(ventanaParadasFecha.getFechaVuelta()) && 
				(((LocalTime) ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem()).isBefore((LocalTime)ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem()) ||
				((LocalTime) ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem()).equals(((LocalTime)ventanaParadasFecha.getComboBoxHorariosVuelta().getSelectedItem())))) {
			
			JOptionPane.showMessageDialog(null, "La hora de vuelta no puede ser la misma ni anterior a la de ida", "Mensaje de error", JOptionPane.ERROR_MESSAGE );
		}
		
		else {
			error = false;
		}
		return error;
	}

}
