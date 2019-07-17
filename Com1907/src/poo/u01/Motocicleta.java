package poo.u01;

public class Motocicleta {
	// Crear 2 atributos de clase VEL_MAXIMA y CONT
	private String matricula;
	private String color;
	private int velocidad;
	private boolean enMarcha;
	
	// Constructor
	public Motocicleta(String matricula, String color) {
		this.matricula = matricula;
		this.color = color; // Getters y Setters
		velocidad = 0;
		enMarcha = false;
	}

	// Getters y Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public boolean enMarcha() {
		return enMarcha;
	}

	public void encender() {
		enMarcha = true;
		velocidad = 0;
	}

	public void apagar() {
		enMarcha = false;
	}

	// Limitar velocidad máxima
	public void acelerar() {
		if (enMarcha) {
			if (velocidad != 0)
				velocidad *= 1.1;
			else
				velocidad = 10;
		}
		//System.out.println(String.valueOf(23));
		//System.out.println(Math.random());
	}

	public String toString() {
		return "Velocidad: " + velocidad + " km/h \n" + "Matricula: " + matricula + "\n" + "En marcha: " + enMarcha
				+ ".";
	}
}
