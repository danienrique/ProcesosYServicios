package EjercicioSimulacionAlmacenes;

public class Tienda {
	int productos = 100;
	boolean clienteDentro = false;
	
	public synchronized void comprarProducto() {
		clienteDentro = true;
		if(productos <1) {
			System.err.println("Error: no quedan productos");
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			productos--;
		}
		salirTienda();
	}
	public synchronized void salirTienda() {
		clienteDentro= false;
		notifyAll();
	}
}
