package TCP;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String host = "localhost";
		int puerto = 6000;
		System.out.println("INICIO DE PROGRAMA");
		try {
			Socket socket = new Socket(host, puerto);
			DataOutputStream dous = new DataOutputStream(socket.getOutputStream());
			System.out.println("Di tu verdad");
			String line = sc.nextLine();
			dous.writeUTF(line);
			DataInputStream dius = new DataInputStream(socket.getInputStream());
			String respuesta = dius.readUTF();
			System.out.println(respuesta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
