package Hiloss2_1;

public class Check {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		HiloLector hl = new HiloLector(b);
		HiloEscritor he = new HiloEscritor(b);
		hl.start();
		he.start();
	}
}
