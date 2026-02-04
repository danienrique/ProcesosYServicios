package EjercicioSimulacionAlmacenes;

import java.util.ArrayList;

public class Simulacion {
	public static void main(String[] args) {
		Tienda carrefour = new Tienda();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		for(int i = 0; i<300;i++) {
			clientes.add(new Cliente(carrefour));
		}
	}
}
