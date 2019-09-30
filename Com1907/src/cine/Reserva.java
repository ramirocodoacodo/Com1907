package cine;

import java.util.Date;

public class Reserva {
	private Pelicula peli;
	private Date fecha;
	private Sala sala;
	private Butaca butaca;
	private Usuario usuario;
	private int num;
	
	public Reserva(Pelicula peli, Date fecha, Sala sala, Butaca butaca, Usuario usuario) {
		super();
		this.peli = peli;
		this.fecha = fecha;
		this.sala = sala;
		this.butaca = butaca;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Reserva [peli=" + peli + ", fecha=" + fecha + ", sala=" + sala + ", butaca=" + butaca + ", num=" + num
				+ "]";
	}
	
	
}
