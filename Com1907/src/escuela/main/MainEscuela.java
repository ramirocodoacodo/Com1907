// https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
package escuela.main;

import escuela.controller.EstudianteController;
import escuela.model.Estudiante;
import estudiante.view.EstudianteView;

public class MainEscuela {

	public static void main(String[] args) {
		// Obtengo los datos del estudiante
		Estudiante model = obtenerDatosEstudiante();

		// Creo una vista: para mostrar los datos del estudiante
		EstudianteView view = new EstudianteView();
		//view.setVisible(true);

		EstudianteController controller = new EstudianteController(model, view);

		controller.updateView();

		// Actualizo el modelo (modifico nombre)
		controller.setNombreEstudiante("Juan");

		controller.updateView();
	}

	private static Estudiante obtenerDatosEstudiante() {
		Estudiante estudiante = new Estudiante("1234", "Pablo");
		return estudiante;
	}
}
