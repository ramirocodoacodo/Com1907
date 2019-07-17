package tecnicas.u06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej28 {
	public static void main(String[] args) {
		String frase;
		frase = getString("Introduzca una frase cualquiera -> ");
		System.out.printf("La cantidad de palabras en la frase es de -> %d", getPalabras(frase));
	}

	public static String getString(String texto) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf(texto);
		String contenido = entrada.nextLine();
		entrada.close();
		return contenido;
	}

	public static int getPalabras(String frase) {
		int cantidadDePalabras = 1;
		frase = frase.trim(); // Devuelve la cadena de caracteres sin espacios al principio y al final.
		if (frase.length() == 0) {
			return 0;
		}
		char[] caracteres = new char[frase.length()];
		caracteres = frase.toCharArray();
		for (int posicion = 0; posicion != frase.length(); posicion++) {
			if (caracteres[posicion] == ' ') {
				cantidadDePalabras++;
				while (caracteres[posicion] == ' ') {
					posicion++;
				}
				posicion--;
			}
		}
		return cantidadDePalabras;
	}

	// Ventana de Mensaje
	// JOptionPane.showMessageDialog(null,"Este es un mensaje simple");

	// Ventana para ingresar texto
	// String texto = JOptionPane.showInputDialog (null, "Ingrese un texto: ",
	// "showInputDialog", JOptionPane.INFORMATION_MESSAGE);
}
