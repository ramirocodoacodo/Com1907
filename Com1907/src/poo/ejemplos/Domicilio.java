package poo.ejemplos;

public class Domicilio {
	private String direccion;
	private int cp;
	private String provincia;
	private String localidad;

	public Domicilio(String direccion, int cp, String provincia, String localidad) {
		this.direccion = direccion;
		this.cp = cp;
		this.provincia = provincia;
		this.localidad = localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Domicilio [direccion=" + direccion + ", cp=" + cp + ", provincia=" + provincia + ", localidad="
				+ localidad + "]";
	}
	
}
