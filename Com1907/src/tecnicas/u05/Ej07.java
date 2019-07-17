package tecnicas.u05;

import java.util.Scanner;

public class Ej07 {
	public static void imprimirSimbolo(char caracter, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(caracter);
		}
	}

	public static void main(String[] args) {
		char caracter;
		int n;
		String texto;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un caracter");
		texto = teclado.next();
		caracter = texto.charAt(0);
		System.out.println("Ingrese un numero");
		n = teclado.nextInt();

		imprimirSimbolo(caracter, n);

		teclado.close();

	}

}
