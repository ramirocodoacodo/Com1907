package poo.u07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		boolean err;
		do {
			err = false;
			try {
				System.out.println("Ingrese un número: ");
				num = entrada.nextInt();
				System.out.println("Número ingresado: " + num);
			} catch (InputMismatchException e1) {
				// e1.printStackTrace();
				System.out.println("Ha ingresado un valor no numérico.");
				err = true;
			} catch (Exception e2) {
				// e2.printStackTrace();
				System.out.println("Ha ocurrido un error.");
				err = true;
			}
		} while (!err);
		entrada.close();
	}
}