package tecnicas.ejemplos;

public class Funcion {
	// Ejemplo de funcion
	// Declaración de una función
	static int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	static int restar(int num1, int num2) {
		return num1-num2;
	}

	public static void main(String[] args) {
		// Invocar la función
		//<tipo> var = <nombreFuncion>(<tipo> arg1, <tipo> arg2, ...)
		int suma = sumar(2,3);
		int resta = restar(2,3);

		System.out.println("El resultado de la suma es: " + suma);
	}

}
