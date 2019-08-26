package poo.ejemplos;

public class Vehiculo {
	private String fabricante;
	private String matricula;
	private int anioFabricacion;
	private double velocidadMax;
	private Motor motor; // Composición
	
	public Vehiculo() {
		fabricante = "";
		motor = new Motor(); // Instanciar la clase Motor
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public double getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public void setMotor(Motor m) {
		motor = m;
	}

	public Motor getMotor() {
		return motor;
	}
	
	// Métodos (comportamiento)
	public void arrancar() {
		System.out.println("arrancar");
	}
	public void apagar() {
		System.out.println("apagar");
	}
	public void acelerar() {
		System.out.println("Acelerar");
	}
	public void frenar() {
		System.out.println("Frenar");
	}

	@Override
	public String toString() {
		return "Vehiculo [fabricante=" + fabricante + ", matricula=" + matricula + ", anioFabricacion="
				+ anioFabricacion + ", motor=" + motor + "]";
	}

	
}
