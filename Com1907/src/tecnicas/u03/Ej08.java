/*
 * Escribir un c�digo que categorice la calificaci�n ingresada por un docente
	de la siguiente forma (utilice una estructura de selecci�n):
	9-10: Ha obtenido una calificaci�n sobresaliente
	7-8: Ha obtenido una calificaci�n notable
	4-6: Ha obtenido un aprobado
	1-3: Ha desaprobado
	Validar que la nota ingresada se encuentre entre 1 y 10.
*/
package tecnicas.u03;
import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese la nota del alumno: ");
		int nota = ent.nextInt();

		switch (nota) {
		case 1:
		case 2:
		case 3:
			System.out.println("Ha desaprobado");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Ha obtenido un aprobado");
			break;
		default:
			System.out.println("Debe ingresar una nota v�lida.");
			break;
		}
	}
}
