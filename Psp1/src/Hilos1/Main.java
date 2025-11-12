package Hilos1;

public class Main {
	public static void main(String[] args) {
		TIC t1 = new TIC();
		TAC t2 = new TAC();
		
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
