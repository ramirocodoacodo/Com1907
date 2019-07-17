package tecnicas.u05;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Por favor ingrese numero, del 1 al 12: ");
		int num = leer.nextInt();
		if (!obtenerMesEnTexto(num).equals(""))
			System.out.println(obtenerMesEnTexto(num));
		else
			System.out.println("El mes no es válido");
	}

	static String obtenerMesEnTexto(int num1) {
		String mes= "";
		switch (num1) {
		case 1:
			mes = "enero";
			break;
		case 2:
			mes = "febrero";
			break;
		case 3:
			mes = "marzo";
			break;
		case 4:
			mes = "abril";
			break;
		case 5:
			mes = "mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		default:
				mes = "";
				break;
		}
		return mes;
	}

}
