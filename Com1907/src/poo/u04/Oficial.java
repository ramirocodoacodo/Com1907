package poo.u04;

public final class Oficial extends Operario {

	public Oficial(String n, int num) {
		super(n, num);
	}

	public String toString() {
		return super.toString() + " -> " + this.getClass().getSimpleName();
	}
}
