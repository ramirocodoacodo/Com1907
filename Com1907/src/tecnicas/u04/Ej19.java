package tecnicas.u04;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la altura de la escalera: ");
		int num = teclado.nextInt();
		int filas = num;
		int col = num;

		for (int i = 0; i < filas; i++) { // fila
			for (int j = 0; j < col; j++) // columna
				System.out.print("*");
			System.out.println(""); // Salto de línea
			col--; // Elimino la última columna en cada iteración
		}
	}
}
