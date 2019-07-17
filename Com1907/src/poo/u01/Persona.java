package poo.u01;

public class Persona {
	private String nombre;
	private double altura;
	private int edad;
	private String genero;

	public Persona(String nombre, double altura, int edad, String genero) {
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
		this.genero = genero;
	}

	public int getEdad() {
		return edad; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
