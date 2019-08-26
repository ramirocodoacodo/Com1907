package poo.ejemplos;

public class Auto extends Vehiculo {
	// Atributos
	String patente;
	int modelo; // A�o de fabricaci�n
	
	// M�todo Constructor
	public Auto() {
		super(); // invoco el constructor de la clase padre
		patente = "";
	}
	
	// Sobreescribiendo m�todos heredados
	public void frenar() {
		System.out.println("Frenar auto");
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
	"Auto [patente=" + patente + ", modelo=" + modelo + "]";
	}
	
	
}
