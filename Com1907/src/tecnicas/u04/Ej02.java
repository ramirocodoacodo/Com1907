package tecnicas.u04;
import java.util.Scanner;

/*
 * Desarrollar un algoritmo que permita ingresar dos n�meros enteros por
teclado utilizando un objeto Scanner. La computadora deber� mostrar su
cociente entero. El resto se deber� mostrar en otra l�nea. Ejemplo:
Ingresa 23 y 5, debe devolver 4 y, en otra l�nea, 3.
 */

public class Ej02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Ingrese 2 n�meros: ");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		System.out.println("El cociente entero es: " + num1/num2);
		System.out.println("El resto de la divisi�n es: " + num1%num2);
	}

}
