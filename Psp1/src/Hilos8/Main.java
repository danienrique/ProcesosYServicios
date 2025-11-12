package Hilos8;

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i<10;i++) {
			Pitufo p = new Pitufo(i);
			p.start();
		}
	}
}
