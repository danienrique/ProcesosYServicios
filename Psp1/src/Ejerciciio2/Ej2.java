package Ejerciciio2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ej2 {
	public static void main(String[] args) throws IOException {
		File f = new File(".");
		Process pb = new ProcessBuilder("java","Ejercicio2.duplicadorNumeros").directory(f).start();
		System.out.println("Introduce el num por teclado");
		try(InputStream is = pb.getInputStream()){
			int c;
			while((c = is.read())!= -1) {
				System.out.println((char)c);
			}
		}
	}
}