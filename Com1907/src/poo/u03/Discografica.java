package poo.u03;
import java.util.ArrayList;
import java.util.Iterator;

import poo.u02.DiscoMusical;

public class Discografica {
	private ArrayList<DiscoMusical> discografia;
	private String nombre;
	private int anioCreacion;
	// private int cont;
	
	public Discografica (int tamanio, String nombre){
		discografia = new ArrayList<DiscoMusical>(tamanio);
		this.nombre = nombre;
	}
	
	public boolean agregarDisco(DiscoMusical disco) {
		// C�digo m�todo
			return discografia.add(disco);
			// return true;
	}

	public int buscarDisco(DiscoMusical disco) {
		// C�digo m�todo
		return -1;
	}

	public DiscoMusical buscarDisco(String titulo, String autor, int anioEdicion) {
		// C�digo m�todo
		return null;
	}
	
	public boolean existeDisco(DiscoMusical disco) {
		// C�digo m�todo
		// DiscoMusical disco = new DiscoMusical(titulo, autor, anioEdicion);
		Object o = (Object)disco;
		return discografia.contains(o);
		// return discografia.contains(disco);
	}

	public DiscoMusical buscarDisco(String autor) {
		// C�digo m�todo
		return null;
	}

	public String toString() {
		Iterator<DiscoMusical> it = discografia.iterator();
		
		DiscoMusical disco;
		String texto = "";
		/*
		for (int i = 0; i < cont; i++) {
			disco = discografia[i];
			texto += disco.toString() + "\n";
		}
		*/
		while (it.hasNext()) {
			disco = it.next();
			texto += disco.toString() + "\n";
		}
		return texto;
	}
}
