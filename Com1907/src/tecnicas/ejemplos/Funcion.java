package tecnicas.ejemplos;

public class Funcion {
	// Ejemplo de funcion
	// Declaraci�n de una funci�n
	static int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	static int restar(int num1, int num2) {
		return num1-num2;
	}

	public static void main(String[] args) {
		// Invocar la funci�n
		//<tipo> var = <nombreFuncion>(<tipo> arg1, <tipo> arg2, ...)
		int suma = sumar(2,3);
		int resta = restar(2,3);

		System.out.println("El resultado de la suma es: " + suma);
	}

}
