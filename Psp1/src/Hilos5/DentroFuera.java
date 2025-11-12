package Hilos5;

public class DentroFuera {
	public static void main(String[] args) {
		for(int i = 0; i<5;i++) {
			HiloC hc = new HiloC(i);
			hc.start();
			try {
				hc.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Todos los hilos han sido creados");
	}
}
