package poo.ejemplos;

public class MainAuto {

	public static void main(String[] args) {
		Auto miAuto = new Auto(); // Creo el objeto auto (instancio la clase Auto)
		Auto auto2 = new Auto(); // Creo otro objeto auto (instancio la clase Auto)
		Vehiculo veh1 = new Vehiculo();
		
		miAuto.arrancar();
		miAuto.acelerar();
		veh1.frenar();
		System.out.println(veh1.toString());
		System.out.println(miAuto.toString());
		
		Motor m1 = new Motor();
		veh1.setMotor(m1);
	}

}
