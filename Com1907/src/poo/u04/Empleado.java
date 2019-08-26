package poo.u04;

public class Empleado {
	private String nombre;
	
	public Empleado(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String toString() {
		return "Empleado " + this.nombre;
		// return this.getClass().getSimpleName() + " " + this.nombre;
	}
}
