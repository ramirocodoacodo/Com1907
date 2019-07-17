package tecnicas.ejemplos;

import java.util.Scanner;

public class Matrices {
	public static int leerNumero(String msj) {
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		return objNum.nextInt();
	}
	
	public static void main(String[] args) {
		// Definir y dimensionar una matriz de 2x3 (2 filas y 3 columnas)
		//int numeros [][] = new int[2][3];
		int numeros [][] = {{1,2,3},{4,5,6}};
		
		// Muestro la matriz completa
		// i recorre por filas
		for (int i = 0; i < 2; i++) {
			// i recorre por columna
			for (int j = 0; j < 3; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println(); // Salto de línea
		}

		//System.out.println(numeros[0][0]);
		
		// Asigación de un valor a un elemento de la matriz
		numeros[0][0] = -1;
		//numeros[0][2] = leerNumero("Ingrese la posición (0,2): ");
		numeros[1][2] = 8;
		
		// Mostrar el valor de un elemento de la matriz
		//System.out.println(numeros[0][0]);
		
		// Muestro la matriz completa
		// i recorre por filas
		for (int i = 0; i < 2; i++) {
			// i recorre por columna
			for (int j = 0; j < 3; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println(); // Salto de línea
		}
		
		// Cargar matriz completa
		for (int i = 0; i < 2; i++) {
			// i recorre por columna
			for (int j = 0; j < 3; j++) {
				numeros[i][j] = leerNumero("Ingrese la posición (" + i + "," + j + "): ");
			}
		}

		// Muestro la matriz completa
		// i recorre por filas
		for (int i = 0; i < 2; i++) {
			// i recorre por columna
			for (int j = 0; j < 3; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println(); // Salto de línea
		}
	}

}
