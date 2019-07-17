package tecnicas.u06;

import java.util.Scanner;

public class Ej29b {
	public static void main(String[] args) {
		String nombreApellido = getString("Ingrese su nombre y apellido/s -> ");
		nombreApellido = modificarCadena(nombreApellido);
		System.out.println(nombreApellido);
	}

	public static String getString(String texto) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(texto);
		String contenido = entrada.nextLine();
		entrada.close();
		return contenido;
	}

	public static String modificarCadena(String texto) {
		String[] palabra = texto.trim().split(" ");
		texto = "";
		char auxiliar;
		for (int posicion = 0; posicion != palabra.length; posicion++) {
			if (!palabra[posicion].isEmpty()) {
				auxiliar = palabra[posicion].toUpperCase().charAt(0);
				palabra[posicion] = palabra[posicion].toLowerCase();
				palabra[posicion] = auxiliar + palabra[posicion].substring(1);
				texto += palabra[posicion] + " ";
			}
		}
		return texto.trim();
	}
}
