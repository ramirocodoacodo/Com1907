package cine;

public class Sala {
	// matriz de butacas
	private Butaca butacas[][];
	private int num;
	private int pasillo;
	// private String tipoSala;
	
	public Sala(int num, int n, int m, int pasillo) {
		// n: filas
		// m: butacas x fila
		butacas = new Butaca[n][m];
		this.num = num;
		this.pasillo = pasillo;
		
	}
}
