package Hilos7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b,a;
		for(int i = 0; i<10;i++) {
			System.out.println("Dime la altura del triangulo:");
			a = sc.nextInt();
			System.out.println("Dime la base: ");
			b = sc.nextInt();
			CalculaAreas ca = new CalculaAreas(b, a);
			ca.start();
			try {
				ca.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sacabo");
		
		
		sc.close();
	}
}
