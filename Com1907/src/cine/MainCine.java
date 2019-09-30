package cine;

import javax.swing.JOptionPane;

public class MainCine {

	public static void main(String[] args) {
		/*
		String email = JOptionPane.showInputDialog("Ingrese su mail: ");
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
		
		Usuario usu1 = new Usuario(email, nombre, apellido);
		JOptionPane.showMessageDialog(null, usu1.getNombre());
		usu1.setNombre("Ramiro");
		// usu1.nombre = "Juan"; // NO
		JOptionPane.showMessageDialog(null, usu1.toString());
		
		Butaca but1 = new Butaca(1, 2);
		but1.ocupar();
		System.out.println(but1);
		but1.liberar();
		System.out.println(but1);
		
		Sala sala1 = new Sala(1, 5, 8, 5);
		System.out.println(sala1);
		*/
		Pelicula peli1 = new Pelicula("El Padrino");
		Pelicula peli2 = new Pelicula("Batman");
		
		Cine cine = new Cine("Hoyts");
		JOptionPane.showMessageDialog(null, cine.listarPeliculas());
		cine.agregarPelicula(peli1);
		cine.agregarPelicula(peli2);
		cine.agregarPelicula(new Pelicula("Avengers", "Ciencia Ficción"));
		JOptionPane.showMessageDialog(null, cine.listarPeliculas());
		cine.eliminarPelicula(0);
		JOptionPane.showMessageDialog(null, cine.listarPeliculas());
		cine.eliminarPelicula(new Pelicula("Batman"));
		JOptionPane.showMessageDialog(null, cine.listarPeliculas());
	}

}
