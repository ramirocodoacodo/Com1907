package poo.ejemplos;

import javax.swing.JOptionPane;

public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Ramiro");
		p1.cambiarNombre("Juan");
		JOptionPane.showMessageDialog(null, p1.miNombre());
		JOptionPane.showMessageDialog(null, p2.miNombre());

	}

}
