/*
 * 3) Desarrollar un algoritmo que permita ingresar dos números enteros por
teclado. La computadora deberá mostrar su cociente con decimales.
Recuerde utilizar Casting para obtener el resultado con los decimales
correspondientes
*/
package tecnicas.u04;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		double cociente;
		
		System.out.println("Ingrese dos números: ");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		cociente = (double)num1/num2;
		System.out.println("El resultado de la división es: " + cociente);
		
	}

}
