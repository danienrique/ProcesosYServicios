package EjercicioSimulacionAlmacenes;

public class Cliente extends Thread{
	int intentosDeEntrar = 0;
	Tienda tienda;
	
	Cliente(){
		
	}
	Cliente(Tienda t){
		this.tienda = t;
	}
	
	public void run() {
		synchronized (tienda) {
			for(int i = 0; i<10;i++){
				entrarTienda();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void entrarTienda() {
		if(!this.tienda.clienteDentro) {
			this.intentosDeEntrar++;
		}else {
			tienda.comprarProducto();
		}
	}
}
