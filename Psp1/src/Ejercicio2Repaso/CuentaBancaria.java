package Ejercicio2Repaso;

import java.util.ArrayList;
import java.util.Iterator;

public class CuentaBancaria {
	private String num_cuenta;
	private double saldo;
	private ArrayList<Titular> titulares = new ArrayList<>();

	CuentaBancaria(Titular tit) {
		titulares.add(tit);
	}

	CuentaBancaria(String num, double sal, Titular tit) {
		this.num_cuenta = num;
		this.saldo = sal;
		titulares.add(tit);
	}

	CuentaBancaria(String num, double sal, ArrayList<Titular> tit) throws numMaximoTitularesException {
		this.num_cuenta = num;
		this.saldo = sal;
		comprobacionTitularesAniadir(tit);
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(ArrayList<Titular> titulares) {
		this.titulares = titulares;
	}

	void comprobacionTitularesAniadir(ArrayList<Titular> titu) throws numMaximoTitularesException {
		if (titu.size() > 3) {
			titulares = titu;
		} else {
			throw new numMaximoTitularesException("No se puede crear una cuenta con mas de 3 titulares");
		}
	}

	void ingresarDinero(double dineroAgregado) {
		saldo += dineroAgregado;
	}

	void retirarDinero(double dineroRetirado) {
		if (dineroRetirado > this.saldo) {
			new saldoNegativoException("No se puede retirar tanto dinero, no tienes tanto dinero en la cuenta");
		} else {
			saldo -= dineroRetirado;
		}
	}

	void agregarTitular(Titular t1) {
		if (this.titulares.contains(t1)) {
			System.out.println("El titular que está introduciendo, ya es un titular de esta cuenta");
		} else {
			this.titulares.add(t1);
		}
	}

	void borrarTitular(Titular t1) {
		Iterator<Titular> it = titulares.iterator();
		if (!this.titulares.contains(t1)) {
			System.out.println("No existe dicho titular");
		} else if (this.titulares.size() < 2) {
			System.out.println("La cuenta debe tener un minimo de un Titular");
		} else {
			while(it.hasNext()) {
				
			}
		}
	}
}
