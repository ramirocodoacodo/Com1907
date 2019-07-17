/*
 * Escribir un programa en Java para realizar la b�squeda del nombre de un
cliente en un vector que contiene 5 clientes en total. El cliente a buscar
ser� ingresado por pantalla por el usuario. El algoritmo deber� devolver,
en caso de que ese nombre exista, la posici�n en donde se encuentra
dicho cliente dentro del vector.
*/
package tecnicas.u06;

import java.util.Scanner;

public class Ej15 {
	public static String leerTexto(String msj) {
		Scanner objStr = new Scanner(System.in);
		System.out.println(msj);
		return objStr.nextLine();
	}

	public static void main(String[] args) {
		String [] clientes = {"Juan", "Pedro", "Ramiro", "Paula", "Ana"};
		String nombre = leerTexto("Ingrese un nombre a buscar: ");
		
		boolean encontrado = false;
		for (int i = 0; i < clientes.length; i++) {
			if (nombre.equals(clientes[i])) {
				System.out.println("Posici�n del elemento: " + i);
				encontrado = true;
			}
		}
		if (!encontrado) 
		// if (encontrado == false) 
			System.out.println("Posici�n del elemento: -1");
	}

}
