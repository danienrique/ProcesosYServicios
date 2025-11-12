package Hilos7;

public class CalculaAreas extends Thread{
	int base, altura;
	CalculaAreas(int base, int height){
		this.base = base;
		this.altura = height;
	}
	public void run(){
		System.out.println("El area del triangulo es: " + ((base*altura)/2));
	}
}
