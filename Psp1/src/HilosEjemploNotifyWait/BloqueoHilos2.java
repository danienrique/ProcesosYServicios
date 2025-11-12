package HilosEjemploNotifyWait;

public class BloqueoHilos2 {
	public static void main(String[] args) {
		ObjetoCompartido com = new ObjetoCompartido();
		HiloCadena2  a = new HiloCadena2 (com, " A ");
		HiloCadena2  b = new HiloCadena2 (com, " B ");
		HiloCadena2  c = new HiloCadena2 (com, " C ");
		a.start();
		b.start();
		c.start();
	}
}//BloqueoHilos
