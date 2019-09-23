package cine;

import javax.swing.JOptionPane;

public class MainCine {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Ingrese su mail: ");
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
		
		Usuario usu1 = new Usuario(email, nombre, apellido);
		JOptionPane.showMessageDialog(null, usu1.getNombre());
		usu1.setNombre("Ramiro");
		// usu1.nombre = "Juan"; // NO
		JOptionPane.showMessageDialog(null, usu1.toString());
	}

}
