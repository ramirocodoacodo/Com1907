package poo.u04;

public class Operario extends Empleado {
	private int numero;
	
	public Operario(String n, int num) {
		super(n);
		numero = num;
	}

	public String toString() {
		// return "Operario: " + this.getNombre();
		// return "Empleado " + getNombre() + " -> " + this.getClass().getSimpleName();
		return super.toString() + " -> " + "Operario";
	}
}
