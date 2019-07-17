/*
 * Crear un programa que pida al usuario su nombre y apellidos y los
muestre con las may�sculas y min�sculas correctas (aparecer�n en 
T�cnicas de Programaci�n- Unidad 6
ESTRUCTURAS LINEALES DE DATOS
T�cnicas de Programaci�n
may�sculas la primera letra y la que
haya tras cada espacio; las dem�s aparecer�n en min�sculas. Por
ejemplo, si introduce �nAcho cabaNes�, es escribir� �Nacho Cabanes�).
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
