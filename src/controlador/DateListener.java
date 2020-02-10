package controlador;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import modelo.Linea;
import vista.Ventana05ParadasFecha;

public class DateListener implements PropertyChangeListener {
	
	private Linea linea;
	ArrayList<String> horarios;
	Ventana05ParadasFecha ventana05ParadasFecha;


	public DateListener() {
		
	}
	
	public DateListener(Linea linea, Ventana05ParadasFecha ventana05ParadasFecha) {
		this.linea = linea;
		this.ventana05ParadasFecha = ventana05ParadasFecha;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
	
			horarios = metodosDAO.HorariosDAO.mObtenerHorarios(linea);
			ventana05ParadasFecha.getComboBoxHorariosIda().removeAllItems();
			ventana05ParadasFecha.getComboBoxHorariosVuelta().removeAllItems();
			ventana05ParadasFecha.rellenarComboBoxHorarios(horarios);
			ventana05ParadasFecha.getDateChooserVuelta().setMinSelectableDate(ventana05ParadasFecha.getDateChooserIda().getDate());
			ventana05ParadasFecha.getDateChooserVuelta().setDate(null);
			if (ventana05ParadasFecha.getDateChooserIda().getDate() == null) {
				ventana05ParadasFecha.getComboBoxHorariosIda().setEnabled(true);
			}
	}
}
