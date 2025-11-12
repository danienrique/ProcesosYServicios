package Hilos5;

public class HiloC extends Thread {
	int c;
	HiloC (int co){
		this.c =co;
		System.out.println("Creando hilo: " + this.c);
	}
	public void run () {
		for(int i = 0; i<5;i++) {
			System.out.println("Hilo: " + this.c+ ". Número: " + i);
		}
	}
}
