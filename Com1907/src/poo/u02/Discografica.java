package poo.u02;

public class Discografica {
	private DiscoMusical[] discografia;
	private String nombre;
	private int anioCreacion;
	private int cont;
	
	public Discografica (int tamanio, String nombre){
		discografia = new DiscoMusical[tamanio];
		this.nombre = nombre;
	}
	
	public boolean agregarDisco(DiscoMusical disco) {
		// C�digo m�todo
		cont++;
		return true;
	}

	public DiscoMusical buscarDisco(String autor) {
		// C�digo m�todo
		return null;
	}

	public DiscoMusical buscarDisco(String titulo, String autor, int anioEdicion) {
		// C�digo m�todo
		return null;
	}
	
	public String toString() {
		DiscoMusical disco;
		String texto = "";
		for (int i = 0; i < cont; i++) {
			disco = discografia[i];
			texto += disco.toString() + "\n";
		}
		return texto;
	}
}
