package Ejerciciio2;


public class duplicadorNumeros {
	public static void main(String[] args) {
		if(args.length<1) {
			System.exit(-1);
		}
		int num = Integer.parseInt(args[0]);
		System.out.println("El doble del número introducido es " + num*2);
	}
}
