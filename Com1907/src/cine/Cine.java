package cine;

import java.util.ArrayList;
import java.util.Iterator;

public class Cine {
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Reserva> reservas;
	private ArrayList<Sala> salas;
	static int contadorReservas = 0;
	private String nombre;
	
	public Cine(String nombre) {
		this.nombre = nombre;
		peliculas = new ArrayList<Pelicula>();
		reservas = new ArrayList<Reserva>();
		salas = new ArrayList<Sala>();
	}
	
	public boolean reservar(Reserva reserva) {
		contadorReservas++;
		return false;
	}
	
	public boolean agregarPelicula(Pelicula peli) {
		return peliculas.add(peli);
	}
	
	public boolean agregarPelicula(String nombre, String genero) {
		Pelicula peli = new Pelicula(nombre, genero);
		return peliculas.add(peli);
	}

	public boolean eliminarPelicula(Pelicula peli) {
		return peliculas.remove(peli);
	}
	
	public Pelicula eliminarPelicula(int pos) {
		return peliculas.remove(pos);
	}
	
	public String listarPeliculas() {
		String str = "";
		Iterator<Pelicula> it = peliculas.iterator();
		while (it.hasNext()) {
			Pelicula peli = it.next();
			str += peli.toString() + "\n";
		}
		return str;
	}

	public String listarReservas() {
		String str = "";
		for (Reserva reserv : reservas) {
			str += reserv.toString() + "\n";
		}
		return str;
	}
}

