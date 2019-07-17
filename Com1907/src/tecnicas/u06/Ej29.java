/*
 * Crear un programa que pida al usuario su nombre y apellidos y los
muestre con las mayúsculas y minúsculas correctas (aparecerán en 
Técnicas de Programación- Unidad 6
ESTRUCTURAS LINEALES DE DATOS
Técnicas de Programación
mayúsculas la primera letra y la que
haya tras cada espacio; las demás aparecerán en minúsculas. Por
ejemplo, si introduce “nAcho cabaNes”, es escribirá “Nacho Cabanes”).
*/
package tecnicas.u06;

public class Ej29 {
	public static String tipoOracion(String cadena) {
		String inicial = String.valueOf(cadena.charAt(0));
		String cadenaSinInicial = cadena.substring(1);
		String nuevaCadena = inicial.toUpperCase() + cadenaSinInicial.toLowerCase();
		return nuevaCadena;
	}

	public static String mayusculaEnCadaPalabra(String cadena) {
		String[] cadenas = cadena.split(" ");
		String nuevaCadena = "";
		
		for (String palabra : cadenas) {
			if (!palabra.trim().isEmpty())
				nuevaCadena += " " + tipoOracion(palabra.trim());
		}
		return nuevaCadena.trim();
	}

	public static void main(String[] args) {
		System.out.println(mayusculaEnCadaPalabra(" Hola   mundo "));
		int[] miArray = {8, 18, 34};
		for(int i = 1;i<=miArray.length;i++)
		{
			System.out.println(miArray[i]);
		}
	}

}
