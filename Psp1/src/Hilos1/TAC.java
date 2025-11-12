package Hilos1;

public class TAC implements Runnable{
	String conten;
	TAC(){
		conten = "TAC";
	}
	void mostrar(){
		for(;;) {
			System.out.println(conten);
			try {
				Thread.sleep(2995);
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
