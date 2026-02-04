package Uhilos;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File f = new File("Numeros.txt");
		Productor prod = new Productor(f);
		Consumidor cons = new Consumidor(f);
		prod.start();
		cons.start();
	}
}
