/*
 * 13) Buscar los dos mayores de un array de N datos.
 * */
package tecnicas.u06;

public class Ej13 {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 0, -1, -99, 100 };
		int mayor1;
		int mayor2;

		// Inicializo las variables donde guardo los mayores
		mayor1 = numeros[0];
		mayor2 = numeros[1];
		// Si no están ordenadas, las intercambio porque de eso depende que mi código
		// funcione correctamente
		if (numeros[1] > numeros[0]) {
			mayor1 = numeros[1];
			mayor2 = numeros[0];
		}

		// Recorro todo el vector y cuando encuentro un mayor a todos (mayor a "mayor1")
		// lo reemplazo y mayor 1 pasa a ser mayor2
		for (int num : numeros) {
			if (num > mayor1) {
				mayor2 = mayor1;
				mayor1 = num;
			} else if (num > mayor2)
				mayor2 = num;
		}

		System.out.println("El 1er mayor es: " + mayor1);
		System.out.println("El 2do mayor es: " + mayor2);
	}

}
