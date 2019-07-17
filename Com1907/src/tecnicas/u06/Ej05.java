/*
 * Crear un arreglo de n posiciones y llenarlo con nombres de personas.
 * */
package tecnicas.u06;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {

		String[] nombres = new String[leerNumero("Ingrese cantidad de personas")];
		completarNombres(nombres, "Ingrese los nombres");
		monstraNombres(nombres);
	}

	private static void monstraNombres(String[] nombres) {
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		System.out.println("----------------");
		for (int i = 0; i < nombres.length; i++)
			System.out.println(nombres[i]);
	}

	public static int leerNumero(String mensaje) {
		Scanner objNum1 = new Scanner(System.in);
		System.out.println(mensaje);
		int num = objNum1.nextInt();

		return num;

	}

	private static void completarNombres(String[] nombres, String mensaje) {
		System.out.println(mensaje);

		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = leerNombre();
		}

	}

	public static String leerNombre() {
		Scanner objNum1 = new Scanner(System.in);

		return objNum1.nextLine();

	}

}
