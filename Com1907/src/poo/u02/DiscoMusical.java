package poo.u02;

public class DiscoMusical {
	private String titulo;
	private String autor;
	private String formato;
	private int anioEdicion;
	private boolean digital;

	public DiscoMusical() {
		titulo = "";
		autor = "";
		formato = "";
	}

	public DiscoMusical(String titulo, String autor, int anioEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioEdicion = anioEdicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String t) {
		titulo = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public String toString() {
		return "Titulo: " + titulo + ", " + "Autor: " + autor + ", " + "Año de Edición: " + anioEdicion + ".";
	}

	public boolean equals(DiscoMusical disco) {
		if (this.titulo.equals(disco.getTitulo()) && this.autor.equals(disco.getAutor())
				&& this.anioEdicion == disco.getAnioEdicion()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscoMusical other = (DiscoMusical) obj;
		if (anioEdicion != other.anioEdicion)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/*
	public boolean equals(Object o) {
		DiscoMusical disco = (DiscoMusical) o;
		if (this.titulo.equals(disco.getTitulo()) && this.autor.equals(disco.getAutor())
				&& this.anioEdicion == disco.getAnioEdicion()) {
			return true;
		} else {
			return false;
		}
	}*/
	
	
	
}
