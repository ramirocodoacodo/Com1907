package tecnicas.u04;

import java.util.Scanner;

public class Ej16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, cont;

		System.out.println("Ingrese un número: ");
		num = teclado.nextInt();

		// do-while
		cont = num;
		do {
			cont++;
			System.out.println(cont);
		} while (cont < num + 10);

		// while
		int i;
		i = num;
		while (i <= num + 9) {
			i++;
			System.out.println(i);
		}
		
		// for
		for (int j = num; j < num+10; j++) {
			System.out.println(j+1);
		}
	}
}
