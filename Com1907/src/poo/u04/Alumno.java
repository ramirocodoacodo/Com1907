package poo.u04;

public class Alumno extends Persona {
	private String matricula;

	public Alumno(String nombre, int e, String m) {
		super(nombre, e);
		matricula = m;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		String txt = "";
		txt = "Alumno: " + "\n" +
				"Nombre= " + this.getNombre() + "\n" +
				"Edad= " + this.getEdad() + "\n" +
				"matricula=" + matricula;
		return txt;
	}

}
