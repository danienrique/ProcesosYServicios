package Hiloss2_2;

public class Cuenta {
	private int numeros_Reintegro, saldo;
	Cuenta(int num, int sal){
		this.numeros_Reintegro = num;
		this.saldo = sal;
	}
	public int getNumeros_Reintegro() {
		return numeros_Reintegro;
	}
	public void setNumeros_Reintegro(int numeros_Reintegro) {
		this.numeros_Reintegro = numeros_Reintegro;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void devolverSaldo() {
		System.out.println(this.saldo);
	}
	public void restarSaldo(int cifraARestar) {
		if(comprobacionRestaValida(cifraARestar)) {
			this.saldo -= cifraARestar;
		}else if(!comprobacionRestaValida(cifraARestar)) {
			System.out.println("Error ");
			System.exit(0);
		}
	}
	public boolean comprobacionRestaValida(int cifraARestar) {
		if(cifraARestar>this.saldo) {
			return true;
		}
		return false;
	}
}
