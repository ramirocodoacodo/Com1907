package poo.u04;

public class CuentaGold extends Cuenta {
	private float descubierto;

	public CuentaGold(String dniTitular, String nombre, int edad, float saldo) {
		super(dniTitular, nombre, edad, saldo);
		descubierto = Banco.descubierto;
	}

	public boolean extraer(float importe) {
		if (esValido(importe)) {
			if (getSaldo()+descubierto - importe >= 0) {
				saldo -= importe;
				return true;
			}
		}
		return false;
	}
}
