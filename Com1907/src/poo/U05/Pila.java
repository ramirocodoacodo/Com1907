package poo.U05;

import java.util.ArrayList;

public class Pila implements IColeccion {
	private ArrayList<Object> pila;
	// private int cont;
	
	public Pila() {
		pila = new ArrayList<Object>();
		// cont = -1;
	}
	
	@Override
	public boolean estaVacia() {
		return pila.isEmpty();
	}

	@Override
	public Object extraer() {
		int itemElim= pila.size()-1;
		Object temp = pila.remove(itemElim);
		return temp;
	}

	/*
	@Override
	public Object primero() {
		// TODO Auto-generated method stub
		return null;
	}
	 */
	
	@Override
	public boolean agregar(Object agreg) {
		return pila.add(agreg);
	}

}
