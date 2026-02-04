package Hilos2_4;

/**Para suspender de forma segura el hilo se debe introducir en el hilo una vble, por ej, suspender
*y comprobar su valor dentro del método run(), es lo que se hace en la llamada al 
*método esperandoParaReanudar() de este código.
*El método Suspende del hilo da valor true a la variable para suspender el hilo.
*El método Reanuda da el valor false para que detenga la suspensión y continue
*ejecutándose el hilo.
**/

public class MyHilo extends Thread {
	private int i = 0;
	private SolicitaSuspender suspender = new SolicitaSuspender();
	
	public void Suspende() {
		suspender.set(true);//petición de suspender hilo
	}
	public void Reanuda() {
		suspender.set(false);//petición de continuar
	}
	
	public void run (){
		try {
			int aux  =10;
			while (i<aux) {
					System.out.println(i);
					this.i++;
					Thread.sleep(600);
					suspender.esperandoParaReanudar();//comprobar
				
			}
			System.out.println("Bucle Finalizado");
		}catch (InterruptedException exception) {
			
		}
	}

}
