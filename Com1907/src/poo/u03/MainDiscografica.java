package poo.u03;

import poo.u02.DiscoMusical;

public class MainDiscografica {

	public static void main(String[] args) {
		DiscoMusical disco1 = new DiscoMusical();
		DiscoMusical disco2 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco3 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco4 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco5 = new DiscoMusical("Nevermind", "Nirvana", 1991);
		DiscoMusical disco6 = new DiscoMusical("Ultimo", "Nirvana", 1991);
		DiscoMusical disco7 = new DiscoMusical("No se debería agregar", "Nirvana", 1991);
//		JOptionPane.showMessageDialog(null, disco1.toString());
//		System.out.println(disco2.toString());
		
		Discografica discografica = new Discografica(6, "EMI");
		System.out.println(discografica.toString());
		discografica.agregarDisco(disco1);
		discografica.agregarDisco(disco2);
		discografica.agregarDisco(disco3);
		discografica.agregarDisco(disco4);
		discografica.agregarDisco(disco5);
		discografica.agregarDisco(disco6);
		//discografica.agregarDisco(disco7);
		System.out.println(discografica.toString());
		
		System.out.println(disco2.equals(disco3));
		System.out.println(disco2.equals(disco1));
		System.out.println(discografica.existeDisco(disco2));
		System.out.println(discografica.existeDisco(disco7));
	}

}
