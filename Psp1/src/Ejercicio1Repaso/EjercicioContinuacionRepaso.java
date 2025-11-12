package Ejercicio1Repaso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioContinuacionRepaso {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			ArrayList<Alumno> alumnos = new ArrayList <>();
			System.out.println("¿Quieres introducir un nuevo alumno?");
			String respuesta = sc.next();
			while (!respuesta.equals("no")) {
				if(respuesta.equals("si")) {
					System.out.println("Dime el nombre");
					String name = sc.next();
					System.out.println("Dime la nota");
					double nota = sc.nextDouble();
					alumnos.add(new Alumno(name, nota));
					System.out.println("¿Quieres introducir un nuevo alumno?");
					respuesta = sc.next();
				} else {
					System.err.println("Valor incorrecto");
					respuesta = "no";
				}
			}
			System.out.println();
			double notamedia = 0;
			for(Alumno aux:alumnos) {
				notamedia += aux.nota;
				System.out.print(aux.nombre + " - ");
			}
			notamedia = notamedia/alumnos.size();
			System.out.println("La nota media es: " + notamedia);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
