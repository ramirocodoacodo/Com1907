package tecnicas.u05;

import java.util.Scanner;

public class Calculadora {
	public static double leerNumero(String msj) {
		double num;
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		num = objNum.nextDouble();
		return num;
	}

	public static String leerTexto(String msj) {
		String txt;
		Scanner objStr = new Scanner(System.in);
		System.out.println(msj);
		txt = objStr.nextLine();
		return txt;
	}

	public static double calcular(String operacion, double num1, double num2) {
		double resultado = 0;

		switch (operacion) {

		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		}

		return resultado;
	}

	static boolean log(String usuario, String contraseña) {
		final String USU = "ADMIN";
		final String PASS = "1234";
		return (usuario.equals(USU) && contraseña.equals(PASS));
	}

	public static void main(String[] args) {
		double resultado;
		double op1, op2;
		String operacion;

		// para login:
		String log, pass;
		log = leerTexto("Ingrese su usuario: ");
		pass = leerTexto("Ingrese su contraseña: ");

		// Utilizacion del LOGIN:
		if (log(log, pass)) {
			op1 = leerNumero("Ingrese el operador 1: ");
			op2 = leerNumero("Ingrese el operador 2: ");

			// obtengo la operacion a realizar:
			operacion = leerTexto("Ingrese el operador (+, -, *, /): ");

			// Utilizacion de la calculadora:
			resultado = calcular(operacion, op1, op2);
			System.out.println("Resultado: " + resultado);
		} else
			System.out.println("No se logeo correctamente");
	}
}
