package cine;

import java.util.ArrayList;

public class Cine {
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Reserva> reservas;
	private ArrayList<Sala> salas;
	static int contadorReservas = 0;
	
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

}
