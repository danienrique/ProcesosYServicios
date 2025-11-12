package EjercicioGPT;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lanzador {
	public static void main(String[] args) {
		File f = new File(".");
		try (Scanner sc = new Scanner(System.in)) {
			try {
				Process pb = new ProcessBuilder("java", "EjercicioGPT.Contador").directory(f).start();
				try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(pb.getOutputStream()));) {
					System.out.println("Introduzca números(0 para salir del programa)");
					int num = sc.nextInt();

					while (num != 0) {
						pw.write(num + "\n");
						System.out.println("Introduzca números(0 para salir del programa)");
						num = sc.nextInt();
						pw.flush();
					}
					
					try (BufferedReader pr = new BufferedReader(new InputStreamReader(pb.getInputStream()));) {
						String c;
						while ((c = pr.readLine()) != null) {
							System.out.println(c);
						}
						try (BufferedReader pe = new BufferedReader(new InputStreamReader(pb.getErrorStream()))) {
							String c2;
							while ((c2 = pr.readLine()) != null) {
								System.out.println(c2);

							}
						}

					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
