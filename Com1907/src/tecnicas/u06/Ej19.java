/***************************************************************************/
/******************************* EJERCICIO 19 ******************************/
/***************************************************************************/
/**
* @author Ramiro Escalante Leiva: www.linkedin.com/in/ramiroescalanteleiva/
Array de 2 dimensiones. Una escuela tiene un total de 3 aulas con la
siguiente capacidad:
Identificador Aula Cantidad de Bancos del Aula
Azul 40
Verde 35
Amarillo 30
Sabiendo la cantidad de bancos de cada aula, el usuario deber� ingresar
la cantidad de alumnos inscriptos para cursar tercer grado y el sistema
deber� determinar qu� aula (Azul, Verde o Amarillo) es la indicada para la
cantidad ingresada. La escuela ya sabe que la m�xima capacidad de sus
aulas es de 40 alumnos, por lo tanto, la cantidad de alumnos inscriptos
que ingresa el usuario siempre ser� un n�mero menor o igual a 40. Se
espera que el aula asignada sea la que deje menos bancos libres.
*/
package tecnicas.u06;

import java.util.Scanner;

public class Ej19 {
	public static int leerNumero(String msj) {
		Scanner objNum = new Scanner(System.in);
		System.out.println(msj);
		return objNum.nextInt();
	}

	// Este ejercicio se puede resolver de muchas formas pero la idea es poder
	// hacerlo de forma din�mica. Por ejemplo, si yo agregara m�s filas (aulas) a
	// escuela tendr�a que seguir funcionando sin problemas.
	public static void main(String[] args) {
		String[][] infoBancosPorAula = { { "Azul", "40" }, { "Verde", "35" },
				// { "Roja", "34" }, // Esta l�nea la agrego para verificar que se cumple lo que
				// menciono en mi comentario anterior
				{ "Amarillo", "30" } };
		final int CAPACIDAD_MAX = 40; // Capacidad m�xima de alumnos
		int cantInscriptos;
		int menorDiferencia;
		int capacidadSala;
		String salaAsignada = "";
		// Ingreso de la cantidad de alumnos inscriptos con validaci�n
		do {
			cantInscriptos = leerNumero("Ingrese la cantidad de alumnos 			inscriptos: ");
			if (cantInscriptos > CAPACIDAD_MAX)
				System.out.println("La capacidad m�xima de las aulas es de			" + CAPACIDAD_MAX + "!");
		} while (cantInscriptos > CAPACIDAD_MAX);
		
		
		// recorro s�lo la 2da columna de todas las filas del array buscando la menor
		// diferencia
		menorDiferencia = CAPACIDAD_MAX + 1; // inicializo la variable auxiliar con un valor que se que siempre voy a
		// reemplazar pero lo uso para poder hacer la primera comparaci�n dentro
		// del for
		for (int fila = 0; fila < infoBancosPorAula.length; fila++) {
			// s�lo leo la col 1 ya que ah� se guarda el dato de la capacidad de cada sala
			// lo que varia en el for es s�lo la fila
			// en formato String
			capacidadSala = Integer.parseInt(infoBancosPorAula[fila][1]); // convierto el String a Entero con el
			// parseInt
			if (capacidadSala - cantInscriptos < menorDiferencia && capacidadSala - cantInscriptos >= 0) {
				menorDiferencia = capacidadSala - cantInscriptos;
				salaAsignada = infoBancosPorAula[fila][0];
				// el nombre de la sala est� en la col 0
			}
		}
		System.out.println("Seg�n los alumnos ingresados, la sala asignada es: 			" + salaAsignada);
	}
}