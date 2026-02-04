package Hilos2_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    MyHilo h1 = new MyHilo();
	    MyHilo h2 = new MyHilo();
	    h1.Suspende();
	    h2.Suspende();
	    h1.start();
	    h2.start();

	    String respuesta = "";
	    while (!(respuesta = sc.next()).equalsIgnoreCase("*")) {
	        System.out.println("Pulsa S (suspende h1 y reanuda h2)");
	        System.out.println("Pulsa R (suspende h2 y reanuda h1)");

	        if (respuesta.equalsIgnoreCase("r")) {
	            h1.Reanuda();
	            h2.Suspende();
	        }
	        if (respuesta.equalsIgnoreCase("s")) {
	            h1.Suspende();
	            h2.Reanuda();
	        }
	    }
	}

}