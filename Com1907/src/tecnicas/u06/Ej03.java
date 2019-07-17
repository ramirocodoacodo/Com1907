/*
 * Desarrollar un algoritmo que permita mostrar un arreglo de caracteres de
atrás para adelante. Ejemplo: Arreglo {‘A’,’V’,’A’,’J’}, la computadora
muestra: ‘J’ ‘A’ ‘V’ ‘A’. 
*/
package tecnicas.u06;

public class Ej03 {
	public static void main(String[] args) {
		char[] car = new char[4];
		char[] palabra = {'H', 'O', 'L', 'A'};

		car[0] = 'a';
		car[1] = 'v';
		car[2] = 'a';
		car[3] = 'j';

		for (char c : car) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		for (int i = car.length-1; i >= 0; i--) {
			System.out.print(car[i] + " ");
		}

		System.out.println();
		for (int i = palabra.length; i > 0; i--) {
			System.out.print(palabra[i-1] + " ");
		}
	}
}
