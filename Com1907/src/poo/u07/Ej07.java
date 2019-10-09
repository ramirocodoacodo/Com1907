package poo.u07;

import java.util.Scanner;

public class Ej07 {

	public static char caracterEn (String cadena, int pos) throws Exception {
		if (0 <= pos && pos < cadena.length())
			return cadena.charAt(pos);
		else
			throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
	}

	public static void main(String[] args) {
		Scanner lecturaTeclado = new Scanner (System.in);

		try {
			System.out.println("Ingrese una cadena de texto: ");
			String cadena = lecturaTeclado.next();
			int pos = 7;

			System.out.println(caracterEn(cadena,pos));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		lecturaTeclado.close();
	}
}
