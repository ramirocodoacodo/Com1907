package tecnicas.u04;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese 2 numeros");
		num1 = teclado.nextDouble();

		do {
			num2 = teclado.nextDouble();
			if (num2 ==0)
				System.out.println("el segundo número debe ser distinto que 0");
		} while (num2 == 0);

		System.out.println("resultado " + num1 / num2);

	}
}
