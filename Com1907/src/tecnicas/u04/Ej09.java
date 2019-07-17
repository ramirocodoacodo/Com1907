/*
 * 9) Desarrollar un algoritmo que, dada la
	cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
	computadora indique si alcanzan las sillas, en caso contrario, indique
	cuántas faltan para que todo el alumnado tenga asiento.
 */
package tecnicas.u04;
import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int SILLAS = 25; // Declaración de un CONSTANTE
		int cantAlumnos;

		System.out.println("Ingrese la cantidad de alumnos del curso: ");
		cantAlumnos = teclado.nextInt();

		// Condicional doble en Java
		if (SILLAS < cantAlumnos) 
			System.out.println("Faltan sillas! Faltantes: " + (cantAlumnos - SILLAS));
		 else {
			System.out.println("Hay sillas suficientes!");
		}
		teclado.close();
	}
}
