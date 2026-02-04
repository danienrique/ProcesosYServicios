package Hiloss2_2;

public class Cliente extends Thread {
	String nombre;
	int cantidad, total;
	Cuenta c;
	Cliente(String name, int cuantity, Cuenta c){
		this.nombre = name;
		this.cantidad = cuantity;
	}
	public void run(){
		synchronized (c) {
			while(c.aux) {
				c.restarSaldo(cantidad);
				System.out.println("El saldo de la cuenta es: " + c.getSaldo());
				if(c.getSaldo()<0) {
					c.aux=false;
				}
				c.notify();
				try {
					c.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
