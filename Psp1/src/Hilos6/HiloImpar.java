package Hilos6;

public class HiloImpar extends HiloPar{
	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2!=0) {
				System.out.println("Hilo Impar, numero: " + i);
			}
		}
	}
}