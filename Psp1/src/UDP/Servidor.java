package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.SocketException;
import java.nio.ByteBuffer;

public class Servidor {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket dpEntrada = null;
		DatagramPacket dpSalida = null;
		try {
			ds = new DatagramSocket(6000);
			byte[] numeroEntradaBytes = new byte [1024];
			dpEntrada = new DatagramPacket(numeroEntradaBytes, numeroEntradaBytes.length);
			ds.receive(dpEntrada);
			
			int numeroEntrada = ByteBuffer.wrap(dpEntrada.getData()).getInt();
			
			byte[] numeroSalidaMultiplicado = ByteBuffer.allocate(4).putInt(numeroEntrada*numeroEntrada).array();
			dpSalida = new DatagramPacket(numeroSalidaMultiplicado, numeroSalidaMultiplicado.length, dpEntrada.getAddress(), dpEntrada.getPort());
			ds.send(dpSalida);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
