package poo.ejemplos;

public class Auto {
	// Atributos
	String color;
	String marca;
	String patente;
	int modelo; // A�o de fabricaci�n
	
	// M�todo Constructor
	public Auto() {
		
	}
	
	// M�todos (comportamiento)
	public void encender() {
		System.out.println("Encender");
	}
	public void avanzar() {
		System.out.println("Avanzar");
	}
	public void acelerar() {
		System.out.println("Acelerar");
	}
	public void frenar() {
		System.out.println("Frenar");
	}
}
