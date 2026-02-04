package Uhilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Consumidor extends Thread {
	private File f;
	public Consumidor(File fu) {
		this.f = fu;
	}
	@Override
	public void run() {
		synchronized (f) {
			try (BufferedReader pw = new BufferedReader(new FileReader(f))){
				
				for(int i = 0; i<10;i++) {
					
					System.out.println(pw.readLine());
					f.notifyAll();
					f.wait();
					
				}
			}catch(Exception e) {
				
			}
		}
	}
}
