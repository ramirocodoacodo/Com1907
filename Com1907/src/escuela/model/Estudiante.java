package escuela.model;

public class Estudiante {
	private String dni;
	private String nombre;
		
	public Estudiante() {

	}
	
	public Estudiante(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
