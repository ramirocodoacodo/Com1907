package poo.u01;

public class Ej07 {

	public static void main(String[] args) {
		Motocicleta moto = new Motocicleta("ABC123", "Rojo");
		System.out.println(moto.enMarcha());
		moto.encender();
		System.out.println(moto.enMarcha());
		System.out.println(moto.getVelocidad());
		moto.acelerar();
		System.out.println(moto.getVelocidad());
		moto.acelerar();
		System.out.println(moto.getVelocidad());
		moto.acelerar();
		System.out.println(moto.getVelocidad());
		moto.apagar();
		System.out.println(moto.enMarcha());
		
		System.out.println(moto.toString());
		Motocicleta moto2 = new Motocicleta("ABC123", "Rojo");
		System.out.println(moto2.toString());
		// System.out.println(moto.matricula);
	}

}
