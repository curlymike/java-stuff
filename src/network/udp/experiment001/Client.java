package network.udp.experiment001;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/***
 * Клиент принимает broadcast сообщения
 */

public class Client {
  public static final int PORT_NUMBER = 33334;

  public static void main(String[] args) throws Exception {
    DatagramSocket socket = new DatagramSocket(PORT_NUMBER);
    byte[] buff = new byte[1024];
    DatagramPacket packet = new DatagramPacket(buff, buff.length);
    while (true) {
      socket.receive(packet);
      System.out.println("Client: got packet! " + packet.getAddress() + ", length=" + packet.getLength());
    }
  }
}
