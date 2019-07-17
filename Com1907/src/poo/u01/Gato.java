package poo.u01;

import javax.swing.JOptionPane;

public class Gato {
	private String nombre;
	private String raza;
	private String color;
	
	public Gato(String n) {
		nombre = n;
	}	
	
	public Gato(String n, String raza, String c) {
		nombre = n;
		this.raza = raza;
		color = c;
	}
	
	// Métodos (comportamiento)
	public void caminar() {
		System.out.println("Gato caminando...");
	}
	public void maullar() {
		JOptionPane.showMessageDialog(null, "Gato maullando...");
	}
}
