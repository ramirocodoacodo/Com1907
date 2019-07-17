/*
 *  Desarrollar un algoritmo que, dada la edad de una persona 
 *  (entre 1 y 120 a�os) y su g�nero ('F' para mujeres, 'M' 
 *  para hombres), la computadora indique si est� en edad de 
 *  jubilarse. Ayuda: Las mujeres se jubilan con 60 a�os o m�s. 
 *  Los hombres se jubilan con 65 a�os o m�s. Ejemplo: Ingresa 62 
 *  y 'M', debe devolver �No se jubila�. 
 *  */
package tecnicas.u04;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		final String MASCULINO = "M";
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese la edad de la persona: ");
		int edad = ent.nextInt();
		System.out.println("Ingrese el g�nero de la persona: ");
		ent.nextLine(); // Limpia el buffer
		String gen = ent.nextLine();

		if ((gen.equals(MASCULINO) && edad >= 65) || (gen.equals("F") && edad >= 60))
			System.out.println("Ya est� en edad de jubilarse.");
		 else {
			System.out.println("No se jubila.");
		}
	}

}
