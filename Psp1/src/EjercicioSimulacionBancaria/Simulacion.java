package EjercicioSimulacionBancaria;

import java.util.ArrayList;

public class Simulacion {
	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
		for(int  i = 0; i<40;i++) {
			operaciones.add(new Operacion(c, true, 100));
		}
		for(int  i = 0; i<20;i++) {
			operaciones.add(new Operacion(c, true, 50));
		}
		for(int  i = 0; i<60;i++) {
			operaciones.add(new Operacion(c, true, 20));
		}
		for(int  i = 0; i<40;i++) {
			operaciones.add(new Operacion(c, false, 100));
		}
		for(int  i = 0; i<20;i++) {
			operaciones.add(new Operacion(c, false, 50));
		}
		for(int  i = 0; i<60;i++) {
			operaciones.add(new Operacion(c, false, 20));
		}
		for(Operacion o : operaciones) {
			o.start();
			try {
				o.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Terminado");
	}
}
