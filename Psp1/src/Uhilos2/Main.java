package Uhilos2;

public class Main {
	public static void main(String[] args) {
		String h = "lopony";
		Trabajador t1 = new Trabajador(h);
		Trabajador t2 = new Trabajador(h);
		t1.start();
		t2.start();
	}
}
