package poo.u04;

public class MainEmpleado {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Rafael");
		System.out.println(e1.toString());
		Operario OP1 = new Operario("Alfonso", 1);
		System.out.println(OP1);
		Directivo D1 = new Directivo("Raúl");
		System.out.println(D1);
		Oficial of1 = new Oficial("Juan", 1);
		System.out.println(of1);
	}

}
