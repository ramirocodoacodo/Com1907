package cine;

public class Butaca4D extends Butaca implements IButaca4D {
	private boolean vibracion;

	public Butaca4D(int f, int num) {
		super(f, num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vibrar(int seg) {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public void encender() {
		this.vibrar(5);
		luz= true;
	}
*/
	
	@Override
	public void encender() {
		super.encender();
		this.vibrar(5);
	}

}
