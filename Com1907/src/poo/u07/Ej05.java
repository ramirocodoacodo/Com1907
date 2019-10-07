package poo.u07;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			String aux = teclado.nextLine();
			int aux2 = Integer.parseInt(aux);
		} catch (NumberFormatException e1) {
			System.out.println(e1.getMessage());
			System.out.println("Error en el número ingresado");
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			System.out.println("Ha ocurrido un error!");
		}
		teclado.close();
	}

}
