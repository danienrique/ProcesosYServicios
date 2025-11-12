package au;

import java.io.IOException;
import java.io.InputStream;

public class Act1_1 {
	public static void main(String[] args) throws IOException {
		Process pb = new ProcessBuilder("java", "LeerNombre", "Hola").start();
		int caracter;
		InputStream is = pb.getInputStream();
		while((caracter = is.read()) !=1) {
			System.out.println((char)caracter);
		}
		is.close();
		InputStream err = pb.getErrorStream();
		int cha;
		while((cha = err.read()) != -1) {
			System.out.println((char)cha);
		}
		err.close();
	}
	
}