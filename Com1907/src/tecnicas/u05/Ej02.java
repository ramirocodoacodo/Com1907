package tecnicas.u05;

public class Ej02 {
	static int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	static int restar(int num1, int num2) {
		return num1-num2;
	}
	
	static int operacion(char op, int num1, int num2) {
		int result = 0;
		switch (op) {
		case 'S':
		case 's':
			result = num1 + num2;
			break;
		case 'R':
		case 'r':
			result = num1 - num2;
			break;
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println("Suma: " + operacion('S', 2, 3));
		System.out.println("Resta: " + operacion('R', 2, 3));
	}

}
