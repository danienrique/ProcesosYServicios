package Hiloss2_1;

public class HiloLector extends Thread{
	private Buffer buf;
	HiloLector(Buffer b){
		this.buf = b;
	}
	
	
	public void run(){
		synchronized (buf) {
			for(int i = 0; i<this.buf.bufferAtr.length;i++) {
				if(buf.bufferAtr[i] == 1) {
					System.out.println("Correcto, el buffer en la posicion " + i + " vale " + buf.bufferAtr[i] );
				} else {
					System.err.println("ERROR");
				}
				buf.notify();
				try {
					buf.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
