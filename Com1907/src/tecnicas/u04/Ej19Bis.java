package tecnicas.u04;

import java.util.Scanner;

public class Ej19Bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la altura de la escalera: ");
		int num = teclado.nextInt();
		int filas = num;
		int col = num;

		for (int i = 0; i < filas; i++) { // fila
			for (int j = col; j > 0; j--)  // columna
				if (j > i) 
					System.out.print("*");
			System.out.println(""); // Salto de línea
		}
	}
}
