/*
 * 1) Ingresar el �rea de un cuadrado por teclado utilizando un objeto Scanner.
Calcular e imprimir el valor del per�metro. Ejemplo: Ingresa 25, debe
devolver 20.
*/
package tecnicas.u04;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		Scanner objNum = new Scanner(System.in); // Para poder usar el obj Scanner
		int area; // Declarar una variable entera
		double lado, per; // Declarar una variable double
		
		System.out.println("Ingrese el �rea del cuadrado: ");
		
		area= objNum.nextInt(); // Leer num;
		lado = Math.sqrt(area);
		per = 4*lado;
		
		System.out.println("El per�metro es: " + per);
	}

}
