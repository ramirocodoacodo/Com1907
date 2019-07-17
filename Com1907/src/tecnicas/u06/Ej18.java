package tecnicas.u06;

public class Ej18 {

	public static boolean aleatorio(int limInf, int limSup) {
		int butacas = (int) (Math.random() * (limSup - limInf + 1)) + limInf;
		boolean asiento;
		if (butacas == 1) {
			return asiento = true;
		} else {
			return asiento = false;
		}
	}

	static int asignarButacas(boolean[][] cine) {
		int contador = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				cine[i][j] = aleatorio(0, 1);
				boolean asientooc = cine[i][j];
				if (asientooc == false) {
					contador++;
				}
			}
		}
		return contador;
	}

	public static void main(String args[]) {
		//System.out.println(aleatorio(0, 1));
		boolean[][] cine = new boolean[4][5];
		System.out.println("Las butacas desocupadas son " + asignarButacas(cine));
	}
}
