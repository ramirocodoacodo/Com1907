package poo.u04;

public class Cuenta {
	// Atributos
	private float saldo;
	// private String dniTitular;
	private Persona titular;
	// .Atributos

	// Constructores
	public Cuenta(String dniTitular, float saldo) {
		if (esValido(saldo)) {
			this.saldo = saldo;
		}
		
		titular = new Persona(dniTitular);
		// this.dniTitular = dniTitular;
	}

	public Cuenta(String dniTitular) {
		titular = new Persona(dniTitular);
	}
	// .Constructores

	// Metodos
	private boolean esValido(float saldo) {
		return saldo > 0;
	}

	public boolean depositar(float cantidad) {
		if (esValido(cantidad)) {
			this.saldo += cantidad;
			return true;
		}
		return false;
	}

	public boolean extraer(float cantidad) {
		if (esValido(cantidad)) {
			if (getSaldo() - cantidad >= 0) {
				this.saldo -= cantidad;
				return true;
			}
		}
		return false;
	}

	public String getDniTitular() {
		return titular.getDni();
	}

	public void setDniTitular(String dniTitular) {
		titular.setDni(dniTitular);
	}

	// .Metodos

	// Getters,Setters,toString
	@Override
	public String toString() {
		return String.format("DNI:%s  ; Saldo Actual: %.2f$\n", getDniTitular(), getSaldo());
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// .Getters,Setters,toString
}