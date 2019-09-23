package cine;

public class Usuario {
	// Clase Cine (ArrayList de salas, ArrayList de reservas)
	// Clase Sala (Matriz de 5x8 de butacas)
	// Clase Butaca
	// Clase Reserva
	
	private String email;
	private String pass;
	
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	
	// private Domicilio dom;
	
	// Método Constructor
	public Usuario(String email, String nombre, String ape) {
		this.email = email;
		this.nombre = nombre;
		apellido = ape;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// @to-do: Getters y Setters para el resto de los atributos
	
	// Devuelve info del objetivo
	public String toString() {
		String str = "Email: " + this.email + ", Nombre: " + this.nombre
				 + ", Apellido: " + this.apellido;
		return str;
	}
}
