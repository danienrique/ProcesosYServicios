package Hilos6;

public class Main {
	public static void main(String[] args) {
		HiloPar hp = new HiloPar();
		hp.start();
		try {
			hp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HiloImpar hi = new HiloImpar();
		hi.start();
		try {
			hi.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
