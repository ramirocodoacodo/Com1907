package tecnicas.u04;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		String clave = "";
		int intentos = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la contraseña: ");

		while (!clave.equals("eureka") && intentos < 3) {
			clave = teclado.nextLine();
			intentos = intentos + 1;
		}
		
		if (clave.contentEquals("eureka"))
			System.out.println("Correcto");
		else {
			System.out.println("Agoto los 3 intentos");
		}
	}

}
