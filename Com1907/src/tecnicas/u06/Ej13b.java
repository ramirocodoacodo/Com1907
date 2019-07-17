package tecnicas.u06;

//Buscar los dos mayores de un array de N datos

public class Ej13b {

	private static void poblarArreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random() * 100);
		}
	}

	// devuelve el mayor valor dentro del arreglo sin considerar
	// el elemento informado en descartar:
	private static int buscarMax(int[] arreglo, int descartar) {
		int max, item = 0, desde = 1;

		// Si no debe considerar el elemento 0, guarda el valor del 1 y recorre a partir
		// del 2:
		if (descartar == 0) {
			item = 1;
			desde = 2;
		}
		// Sino, guarda el valor del elemento 0, y recorre a partir del elemento 1:
		else
			item = 0;

		max = arreglo[item];

		for (int i = desde; i < arreglo.length; i++) {
			if (arreglo[i] > max && i != descartar) {
				item = i;
				max = arreglo[i];
			}
		}
		return item;
	}

	public static void main(String[] args) {
		int max1, max2;
		int[] arregloA = new int[15];

		System.out.println("Programa que cargara con numeros aleatorios un arreglo de 15");
		System.out.println("Elementos y se mostraran los dos valores maximos que contiene.");

		poblarArreglo(arregloA);

		// buscarmax busca el maximo sin considerar un elemento indicado.
		// en este caso, como se informa -1, se consideran todos los elementos
		max1 = buscarMax(arregloA, -1);

		// Ahora buscamax no va a considerar el elemento ya encontrado en el llamdado
		// anterior:
		max2 = buscarMax(arregloA, max1);

		mostrarResultado(max1, max2, arregloA);

		mostrarArreglo(arregloA);

	}

	private static void mostrarResultado(int max1, int max2, int[] arreglo) {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("El Maximo nro. en el arreglo es el: " + arreglo[max1]);
		System.out.println("El segundo nro. maximo es el: " + arreglo[max2]);
	}

	private static void mostrarArreglo(int[] numeros) {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                 VALORES DENTRO DEL ARREGLO");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
	}

}
