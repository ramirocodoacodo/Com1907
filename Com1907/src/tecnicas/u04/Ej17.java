package tecnicas.u04;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.println("Poner un numero ");
		n = teclado.nextInt();
		
		System.out.println("Tabla del " + n);
		for (int i = 1; i <= 10; i++)
			System.out.println(n + " * " + i + " = " + n * i);
	}

}
