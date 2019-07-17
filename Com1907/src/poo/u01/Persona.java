package poo.u01;

public class Persona {
	private String nombre;
	private double altura;
	private int edad;
	private String genero;

	public int getEdad() {
		return edad;
	}
	
	public Persona(String nombre, double altura, int edad, String genero) {
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
		this.genero = genero;
	}
}
