package poo.u04;

public class MainBanco {

	public static void main(String[] args) {
		Banco banco1 = new Banco("Santander");
		Cuenta c1 = new Cuenta("28000000");
		Cuenta c2 = new Cuenta("28000001", 100);
		Cuenta c3 = new Cuenta("28000001", "Juan", 48, 1000);
		c3.depositar(50);
		c3.extraer(1000);
		banco1.agregarCuenta(c1);
		banco1.agregarCuenta(c2);
		banco1.agregarCuenta(c3);
		
		System.out.println(banco1.toString());
	}

}
