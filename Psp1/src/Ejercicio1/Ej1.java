package Ejercicio1;
import java.io.IOException;

public class Ej1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if (args.length < 1) {
			System.exit(-1);
		}
		try {
			Process pb = new ProcessBuilder("java", "Ejercicio1.DivisoresContar", 
					args[0]).start();
		} catch (IOException e) {

		}
	}
}