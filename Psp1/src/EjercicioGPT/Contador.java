package EjercicioGPT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contador {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader introLanzador = new BufferedReader(new InputStreamReader(System.in));
		int contPositivos = 0;
		int contNegativos = 0;
		int aux;
		while((aux = Integer.parseInt(introLanzador.readLine()))!=0) {
			if(aux<0) {
				contNegativos++;
			} else if(aux>0) {
				contPositivos++;
			}
		}
		System.out.println("La cantidad de positivos es: " + contPositivos + "La cantidad de negativos es: " + contNegativos);
	}
}
