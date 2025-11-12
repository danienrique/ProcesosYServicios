package Hilos2;

public class DentroFuera {
	public static void main(String[] args) {
		HiloFor hola = new HiloFor();
		hola.start();
		for(int i = 0; i<10;i++) {
			System.out.println("Estoy fuera del hilo");
		}
	}
}
