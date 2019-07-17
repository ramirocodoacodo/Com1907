package tecnicas.ejemplos;

public class OrdenamientoBurbuja {

	public static void burbuja(int[] A) {

		int i, j, aux;

		for (i = 0; i < A.length - 1; i++) {

			for (j = 0; j < A.length - i - 1; j++) {

				if (A[j + 1] < A[j]) {

					aux = A[j + 1];

					A[j + 1] = A[j];

					A[j] = aux;

				}

			}

		}

	}

	public static void mostrarVector(int[] v) {

		for (int i : v) {

			System.out.print(i + " ");

		}

		System.out.println("");

	}

	public static void main(String[] args) {

		int[] vector = { 50, 26, 7, 9, 15, 27 };

		mostrarVector(vector);

		burbuja(vector);

		mostrarVector(vector);

		System.out.println(vector[vector.length-1]);
		System.out.println(vector[vector.length-2]);
		
	}

}