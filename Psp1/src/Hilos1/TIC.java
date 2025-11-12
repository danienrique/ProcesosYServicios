package Hilos1;

public class TIC implements Runnable{
	String conten;
	TIC(){
		conten = "TIC";
	}
	void mostrar(){
		for(;;) {
			System.out.println(conten);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		mostrar();
	}
}