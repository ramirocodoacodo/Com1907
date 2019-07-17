package tecnicas.u04;
import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		Scanner objNum = new Scanner(System.in);
		int ba,alt;
		double hipo;
		double per;
		double sup;

		System.out.println("Ingrese los lados de un triangulo");
		ba = objNum.nextInt(); // Leer
		alt = objNum.nextInt();
		// hipo = objNum.nextInt();
		hipo = Math.sqrt(Math.pow(ba,2)+alt*alt);

		per= ba+alt+hipo;
		sup=(ba*alt)/2;
		
		System.out.println("El perímetro es: " + per);
		System.out.println("La sup es: " + sup);
	}
}
