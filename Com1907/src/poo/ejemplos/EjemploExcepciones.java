package poo.ejemplos;

import java.util.Scanner;

public class EjemploExcepciones {
	public static int validarEdad(int edad) throws ExceptionIntervaloEdad {
		if (edad < 0 || edad > 120) {
			throw new ExceptionIntervaloEdad("Edad no válida");
		} else
			return edad;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String edadStr = teclado.nextLine();
		int edad;

		try {
			edad = Integer.parseInt(edadStr);
			edad = validarEdad(edad);
			System.out.println("La edad ingresada es: " + edad);
		} catch (NumberFormatException e1) {
			System.out.println("Error en el número ingresado");
		} catch (ExceptionIntervaloEdad e2) {
			System.out.println("Intervalo de edad fuera de rango");
		} catch (Exception e3) {
			System.out.println("Error no esperado!");
		}

	}

}
