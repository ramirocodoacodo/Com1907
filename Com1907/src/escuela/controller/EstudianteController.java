package escuela.controller;

import escuela.model.Estudiante;
import estudiante.view.EstudianteView;

public class EstudianteController {
	private Estudiante model;
	private EstudianteView view;
	
	public EstudianteController(Estudiante model, EstudianteView view) {
		this.model = model;
		this.view= view;
	}
	
	public void setNombreEstudiante(String nombre) {
		model.setNombre(nombre);
	}

	public String getNombreEstudiante() {
		return model.getNombre();
	}

	public void setDniEstudiante(String dni) {
		model.setDni(dni);
	}

	public String getDniEstudiante() {
		return model.getDni();
	}
	
	public void updateView() {
		view.setVisible(true);
		view.updateView(model.getDni(), model.getNombre());
	}
	
}
