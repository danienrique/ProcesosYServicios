package Hiloss2_1;

public class HiloEscritor extends Thread {
	private Buffer buf;
	HiloEscritor(Buffer b){
		this.buf = b;
	}
	public void run(){
		synchronized (buf) {
			for(int i = 0; i<this.buf.bufferAtr.length;i++) {
				buf.bufferAtr[i] +=i;
				System.out.println("El buffer vale: " + buf.bufferAtr[i]);
				buf.notify();
				try {
					buf.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			buf.notify();
		}
	}
}
