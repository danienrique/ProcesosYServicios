package Hilos8;

public class Pitufo extends Thread{
	int nombre;
	Pitufo(int nom){
		this.nombre = nom;
	}
	public synchronized void run() {
		for(int i = 1; i<4;i++) {
			System.out.println("Pitufo " + nombre + " come un " + i + "º pan con queso");
		}
	}
}
