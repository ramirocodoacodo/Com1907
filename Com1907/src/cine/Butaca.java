package cine;

public class Butaca {
	private int fila;
	private int num;
	private String estado; // L: Libre, O: Ocupada, X: Pasillo

	public Butaca(int f, int num) {
		fila = f;
		this.num = num;
		estado = "L";
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// pre: ninguna
	// pos: devuelve V si pudo ocupar la butaca (estaba libre), 
	// 		F si no estaba disponible (ocupada o pasillo).
	public boolean ocupar() {
		
	}
}
