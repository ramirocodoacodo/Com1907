package poo.ejemplos;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String fechaNacimiento;
	
	public Persona() {
		nombre= "";
		apellido= "";
		edad = 0;
	}
	
	public Persona(String nombre) {
		this.nombre= nombre;
		apellido= "";
		edad = 0;
	}
	
	public String miNombre() {
		return nombre;
	}

	public void cambiarNombre(String n) {
		nombre = n;
	}
}









