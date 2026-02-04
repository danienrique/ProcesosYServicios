package Uhilos2;

public class Trabajador extends Thread{
	String compartido;
	public Trabajador(String comp) {
		// TODO Auto-generated constructor stub
		this.compartido = comp;
	}
	@Override
	public void run() {
		synchronized (compartido) {
			for(int i = 0; i<10;i++) {
				System.out.println(compartido + i);
				compartido.notifyAll();
				try {
					compartido.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
