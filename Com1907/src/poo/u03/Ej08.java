package poo.u03;

/*
Dado un ArrayList con números, utilice un método que al digitar una posición reemplace el
dato que contiene por uno ingresado por el usuario.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ej08 {

	static public void cargarArray(ArrayList<Integer> nums) {
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> misNumeros = new ArrayList<Integer>(5);
		cargarArray(misNumeros);
		
		System.out.println("Valores en el ArrayList antes del remplazo");
		mostrarValores(misNumeros);
		
		int nroElemento = ingresoNumero("Ingrese el elemento a remplazar");
		
		int nuevoValor = ingresoNumero("Ingrese el nuevo valor a insertar en el elemento " + nroElemento);
		
		misNumeros.set(nroElemento, nuevoValor);
		
		mostrarValores(misNumeros);
		

	}
	
	static public int ingresoNumero(String mensaje) {
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		int nro = input.nextInt();
		return nro;
	}

	static public void mostrarValores(ArrayList<Integer> miArray) {
		for (int i = 0; i < miArray.size(); i++) {
			System.out.println("Elemento: " + i + "= " + miArray.get(i));
		}
	}
}
