package EjercicioMarMorPal;

import java.io.IOException;
import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner br = new Scanner(System.in);
		int sumatorio = 0;
		int contador=0;
		int num =0;
		while((num = Integer.parseInt(br.nextLine()))!=0) {
			sumatorio += num;
			contador++;
		}
		System.out.println("El resultado es: " + (sumatorio/contador));
		br.close();
	}
}
