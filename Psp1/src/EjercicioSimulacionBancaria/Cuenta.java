package EjercicioSimulacionBancaria;

public class Cuenta {
	private double salario = 100.0;
	Cuenta(){
		
	}
	Cuenta(double salarioBase){
		this.salario = salarioBase;
	}
	public synchronized double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public synchronized void ingresarDinero(double dineroIngresado) {
		this.salario +=dineroIngresado;
	}
	public synchronized void retirarDinero(double dineroRetirar) {
		if((this.salario - dineroRetirar) < 0) {
			System.err.println("Error, esta operación no puede hacerse");
		} else {
			this.salario -= dineroRetirar;
		}
	}
}
