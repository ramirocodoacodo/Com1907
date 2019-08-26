package poo.u04;

public final class Directivo extends Empleado {

	public Directivo(String n) {
		super(n);
	}

	public String toString() {
		return "Empleado " + getNombre() + " -> " + this.getClass().getSimpleName();
	}
}
