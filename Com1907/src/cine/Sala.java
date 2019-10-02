package cine;

public class Sala implements ISala4D {
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
		inicializarSala();
	}
	
	private void inicializarSala() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = new ButacaEstandar(i,j);
			}
		}
		for (int fila = 0; fila < butacas.length; fila++) {
			butacas[fila][this.pasillo].pasillo();
		}
	}
	
	private boolean isSalaLlena() {
		return false;
	}
	
	// pos: carga la sala de forma aleatoria
	private void cargarSala() {
		
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				Butaca but = butacas[i][j];
				str = str + but.getEstado() + " ";
			}
			str = str + "\n";
		}
		return str;
	}

	@Override
	public void asignarSector4D(int butacaSupIzqFila, int butacaSupIzqCol, int butacaInfDerFila, int butacaInfDerCol) {
		
	}
}
