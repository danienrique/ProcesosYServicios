package Uhilos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Productor extends Thread {
	private File f;

	public Productor(File fu) {
		f = fu;
	}

	@Override
	public void run() {
		synchronized (f) {
			try (PrintWriter pw = new PrintWriter(new FileWriter(f))){
				for(int i = 0; i<10;i++) {
					
					pw.println(i);
					pw.flush();
					System.out.println("Numero producido: " + i);
					f.notifyAll();
					try
					{
						f.wait();
					} catch(Exception e) 
					{
						e.printStackTrace();
					}
				}
			}catch(Exception e) {
				
			}
		}
	}

}
