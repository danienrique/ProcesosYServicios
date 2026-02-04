package TCP;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		int puerto = 6000;
		try {
			ServerSocket ss =new ServerSocket(puerto);
			Socket cliente1 = ss.accept();
			DataInputStream dius = new DataInputStream(cliente1.getInputStream());
			String lineaRecibida = dius.readUTF();
			DataOutputStream dous = new DataOutputStream(cliente1.getOutputStream());
			if(lineaRecibida.equalsIgnoreCase("Nigga")) {
				System.out.println("¡NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!");
				dous.writeUTF("MU MAAALO");
			} else {
				System.out.println("TA BIEN :D");
				dous.writeUTF("te libraste");
			}
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
