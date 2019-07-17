package tecnicas.u06;

import java.util.Scanner;

public class Ej28b {

	private static String ingreseUnaOracion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Ingrese varias palabras separadas por uno o mas espacios. El programa contara cuantas palabras contiene");

		return teclado.nextLine();
	}

	public static void main(String[] args) {

		String oracion = ingreseUnaOracion();

		int cantPalabras = contadorDePalabras(oracion);

		System.out.println("Contiene " + cantPalabras + " palabras");

	}

	private static int contadorDePalabras(String palabras) {

		int cantidadFrases = 0;
		String[] palabra = palabras.split(" ");

		for (String cadaFrase : palabra) {
			if (!cadaFrase.trim().isEmpty())
				cantidadFrases++;
		}

		return cantidadFrases;
	}
}
