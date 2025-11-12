package Ejercicio1Repaso;

public class Alumno {
	String nombre;
	double nota;
	Alumno(String name, double note){
		this.nombre = name;
		this.nota = note;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
}
