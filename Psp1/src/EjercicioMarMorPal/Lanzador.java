package EjercicioMarMorPal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Lanzador {
	public static void main(String[] args) {
		File f = new File(".");
		Scanner sc = new Scanner(System.in);
		try {
			Process pb = new ProcessBuilder("java", "EjercicioMarMorPal.Operaciones").directory(f).start();
			try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(pb.getOutputStream()))) {
				int num;
				do {
					System.out.println("Introduzca un número (distinto de 0)");
					num = sc.nextInt();
					bw.write(num + "\n");
					bw.flush();
				} while (num != 0);
			}
			try (BufferedReader br = new BufferedReader(new InputStreamReader(pb.getInputStream()))) {
				String c;
				while ((c = br.readLine()) != null) {
					System.out.println(c);
				}
			}
			try (BufferedReader br = new BufferedReader(new InputStreamReader(pb.getErrorStream()))) {
				String c;
				while ((c = br.readLine()) != null) {
					System.err.println(c);
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
