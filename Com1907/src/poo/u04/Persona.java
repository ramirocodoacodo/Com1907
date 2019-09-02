package poo.u04;

import poo.ejemplos.Domicilio;

public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private Domicilio dom;
	// private int cont;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String dni) {
		super();
		this.dni = dni;
	}

	public Persona(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean esMayorDeEdad() {
		if (edad>=18)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

}
