package poo.u03;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej10 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(10);
		numeros.add(7);
		numeros.add(4);
		
		Iterator it = numeros.iterator();
		int elem;
		int sum = 0;
		int cont = 0;
		while (it.hasNext()) {
			elem = (int) it.next();
			sum += elem;
			// sum = sum + elem;
			cont++;
			// cont += 1;
			// cont = cont+1;
			System.out.println(elem);
		}
		System.out.println(sum);
		System.out.println(cont);
	}

}
