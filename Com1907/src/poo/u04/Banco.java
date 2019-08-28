package poo.u04;

import java.util.ArrayList;

public class Banco {
	private String nombre;
	private ArrayList<Cuenta> cuentas;
	
	public Banco(String nombre) {
		this.nombre = nombre;
		cuentas = new ArrayList<Cuenta>();
	}
	
	public boolean agregarCuenta(Cuenta c) {
		if (c.esMayorDeEdad())
			return cuentas.add(c);
		return false;
	}
	
	public String toString() {
		String txt = this.nombre + ":" + "\n";
		for (int i = 0; i < cuentas.size(); i++) {
			txt += cuentas.get(i).toString() + "\n";
		}
		return txt;
	}
}
