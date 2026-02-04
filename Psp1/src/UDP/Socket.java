package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Socket {
	public static void main(String[] args) throws UnknownHostException {
		DatagramPacket dpEntrada = null;
		DatagramPacket dpSalida = null;
		DatagramSocket ds = null;
		try(Scanner sc = new Scanner(System.in);) {
			ds = new DatagramSocket();
			System.out.println("indica el número a multiplicar");
			int numEntrada = sc.nextInt();
			byte numEntradaBytes[] = ByteBuffer.allocate(4).putInt(numEntrada).array();
			dpSalida = new DatagramPacket(numEntradaBytes, numEntradaBytes.length, InetAddress.getByName("localhost"), 6000);
			ds.send(dpSalida);
			
			byte []numSalidaBytes = new byte[1024];
			dpEntrada = new DatagramPacket(numSalidaBytes, numSalidaBytes.length);
			ds.receive(dpEntrada);
			int numSalida = ByteBuffer.wrap(dpEntrada.getData()).getInt();
			System.out.println(numSalida);
		
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			ds.close();
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ds.close();
			e.printStackTrace();
		}
	}
}
