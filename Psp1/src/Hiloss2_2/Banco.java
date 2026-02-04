package Hiloss2_2;

public class Banco {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1000);
		Cliente c1 = new Cliente("Paco", 25,c);
		Cliente c2 = new Cliente("Maria", 55,c);
		
		c1.start();
		c2.start();
	}
}
