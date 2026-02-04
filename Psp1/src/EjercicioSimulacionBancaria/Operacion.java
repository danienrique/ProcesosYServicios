package EjercicioSimulacionBancaria;

import java.util.Scanner;

public class Operacion extends Thread {
	public static Scanner sc = new Scanner(System.in);
	Cuenta c;
	boolean ingresar;
	double cantidad;
	Operacion(Cuenta c1, boolean ingresar, double cantidad){
		c = c1;
		this.ingresar = ingresar;
		comprobarCantidad(cantidad);
	}
	public void retirar20() {
		c.retirarDinero(20.0);
		System.out.println("El saldo de la cuenta es: " + c.getSalario());
	}

	public void retirar50() {
		c.retirarDinero(50.0);
		System.out.println("El saldo de la cuenta es: " + c.getSalario());
	}

	public void retirar100() {
		c.retirarDinero(100.0);
		System.out.println("El saldo de la cuenta es: " + c.getSalario());
	}

	public void ingresar20() {
		c.ingresarDinero(20.0);
		System.out.println("El saldo de la cuenta es: " + c.getSalario());
	}

	public void ingresar50() {
		c.ingresarDinero(50.0);
		System.out.println("El saldo de la cuenta es: " + c.getSalario());
	}

	public void ingresar100() {
		c.ingresarDinero(100.0);
		System.out.println("El saldo de la cuenta es: " + c.getSalario());
	}

	public void run() {
		synchronized (c) {
			if(ingresar) {
				if(cantidad == 20) {
					ingresar20();
				} else if(cantidad == 50) {
					ingresar50();
				} else {
					ingresar100();
				}
			} else {
				if(cantidad == 20) {
					retirar20();
				} else if(cantidad == 50) {
					retirar50();
				} else {
					retirar100();
				}
			}
		}
	}
	
	public void comprobarCantidad(double cantComprobar) {
		if(cantComprobar==20||cantComprobar==50|| cantComprobar == 100) {
			this.cantidad = cantComprobar;
		} else {
			System.err.println("Operación no realizable");
			cantidad = 0.0;
		}
	}
}
