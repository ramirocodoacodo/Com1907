package poo.ejemplos;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JList;

public class EjemploLista {

	public static void main(String[] args) {
		JFrame formVentana = new JFrame();
		formVentana.setTitle("Ejemplo JFrame");
		formVentana.setLocationRelativeTo(null);
		formVentana.setSize(300, 400);
		formVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JList listaNombres;
		String nombres[] = { "Cristian", "Julian", "Milena" };
		listaNombres = new JList(nombres);

		formVentana.add(listaNombres);

		formVentana.setVisible(true);
		Component strLine = new String("Hola");
		listaNombres.setSelectedIndex(0);
		System.out.println(listaNombres.getSelectedValue());
		listaNombres.add(strLine);
	}

}
