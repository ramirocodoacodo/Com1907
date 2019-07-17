package tecnicas.u04;
import java.util.Scanner;

/*
 * Desarrollar un algoritmo que permita ingresar dos números enteros por
teclado utilizando un objeto Scanner. La computadora deberá mostrar su
cociente entero. El resto se deberá mostrar en otra línea. Ejemplo:
Ingresa 23 y 5, debe devolver 4 y, en otra línea, 3.
 */

public class Ej02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Ingrese 2 números: ");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		System.out.println("El cociente entero es: " + num1/num2);
		System.out.println("El resto de la división es: " + num1%num2);
	}

}
