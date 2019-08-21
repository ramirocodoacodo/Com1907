package poo.u04;

public class EjemploHerencia {

	public static void main(String[] args) {
		Persona p1 = new Persona("Ramiro", 38);
		//p1.nombre = "";
		System.out.println(p1.toString());
		
		Alumno a1 = new Alumno("Jose", 20, "1234");
		System.out.println(a1.toString());
		System.out.println(a1.getNombre());
	}

}
