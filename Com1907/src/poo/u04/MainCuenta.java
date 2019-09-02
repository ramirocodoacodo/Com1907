package poo.u04;

public class MainCuenta {

	public static void main(String[] args) {
		//Cuenta c1 = new Cuenta("28000000");
		//Cuenta c2 = new Cuenta("28000001", 100);
		Cuenta c1 = new CuentaClassic("28000000");
		Cuenta c2 = new CuentaClassic("28000001", 100);
		Cuenta c3 = new CuentaGold("28000002", "José", 50, 100);
		
		// System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// Pruebo extraer en cuentas con y sin descubierto
		System.out.println();
		System.out.println("Pruebo extraer en cuentas con y sin descubierto: ");
		c2.extraer(1000);
		c3.extraer(1000);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
