package tecnicas.u06;

import java.util.Scanner;

public class Ej17bis {
	public static int aleatorio(int limInf, int limSup) {
		return (int) (Math.random() * (limSup - limInf + 1)) + limInf;
	}
	
	public static int leerNumero(String msj) {
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		return objNum.nextInt();
	}

	public static void main(String[] args) {
		int numeros [][];
		int n = leerNumero("Ingrese el tamaño de la matriz: ");
		numeros = new int [n][n];
		
		// Cargo la matriz de n x n
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = aleatorio(0,9);
			}
		}
		
		// Muestro la matriz (sin importar el tamaño)
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}

}
