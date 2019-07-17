package tecnicas.ejemplos;

public class Sorteo {
	private static String[] alumnos = { "Miguel", "Lisa", "María Alejandra", "Natalia", "Adelina", "Luis", "María Constanza",
			"Marcelo", "Marco Antonio", "Fabrizio", "Cristian", "Ashly", "Carmen", "Juan", "Rafael", "Mariana",
			"Franco Romagnoli", "Rubén", "Daneisy", "Juan", "Franco Torres", "Omar" };

	public static int aleatorio(int limInf, int limSup) {
		return (int) (Math.random() * (limSup - limInf + 1)) + limInf;
	}

	public static void main(String[] args) {
		System.out.println(alumnos[aleatorio(0, 21)]);
	}

}
