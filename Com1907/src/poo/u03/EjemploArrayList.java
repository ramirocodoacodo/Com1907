package poo.u03;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		// Declaro e instancio Array
		ArrayList<String> nombres = new ArrayList();
		nombres.add("Ramiro");
		nombres.add("Juan");
		nombres.add(1, "Laura");
		
		
		for (Object obj : nombres) {
		// for (String nom : nombres) {
			// System.out.println(obj);
			System.out.println(obj.toString());
		}
		
		System.out.println(nombres.size());
		String str1 = nombres.get(0);
		// System.out.println(nombres.set(0, "Luis"));
		nombres.set(0, "Luis");
		
		for (Object obj : nombres) {
		// for (String nom : nombres) {
			// System.out.println(obj);
			System.out.println(obj.toString());
		}
		
	}

}
