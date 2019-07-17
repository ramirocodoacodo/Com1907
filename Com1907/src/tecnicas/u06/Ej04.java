/*
 * Crear un array unidimensional con un tamaño de 10, 
 * inserta los valores numéricos que desees de la manera que quieras 
 * y muestra por pantalla la media de valores (promedio) del array. 
 * Nota: puede utilizar el método random de la Clase Math para generar 
 * números aleatorios al cargar el array.
*/
package tecnicas.u06;

public class Ej04 {
	public static int aleatorio(int limInf, int limSup) {
		return (int)(Math.random()*(limSup-limInf+1))+limInf;
	}
	
	public static void main(String[] args) {
		// Crear un array unidimensional con un tamaño de 10
		int[] numeros = new int[10];
		
		// inserta los valores numéricos que desees de la manera que quieras 
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorio(1,10);
		}
		
		// Mostrar por pantalla el vector (foreach)
		int sum = 0; // sumatoria de numeros
		for (int num : numeros) {
			System.out.print(num + " ");
			sum = num + sum;
		}
		System.out.println();

		// muestra por pantalla la media de valores (promedio) del array
		double prom = (double)sum/numeros.length;
		System.out.println("El promedio es: " + prom);
	}

}
