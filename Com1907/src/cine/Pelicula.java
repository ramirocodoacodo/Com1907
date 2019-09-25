package cine;

public class Pelicula {
	private String nombre;
	private String genero;
	private int restriccion; // 13, 18, -1 (restricción por edad)
	
	public Pelicula(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.restriccion = -1;
	}

	public Pelicula(String nombre, String genero, int restriccion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.restriccion = restriccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(int restriccion) {
		this.restriccion = restriccion;
	}
	
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + "]";
	}
	
	
}
