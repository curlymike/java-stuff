package network.udp.experiment001;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/***
 * Сервер шлёт broadcast сообщения с интервалом в 1 секунду
 */

public class Server {
  public static final int PORT_NUMBER = 33333;

  public static void main(String[] args) throws Exception {

    DatagramSocket socket = new DatagramSocket(PORT_NUMBER);
    socket.setBroadcast(true);
    for (int i = 0; i < 10; i++) {
      String str = "Hello! " + i;
      DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("255.255.255.255"), Client.PORT_NUMBER);
      socket.send(packet);
      LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(1));
      System.out.println("Server: packet has been sent.");
    }

    System.out.println("Server is done.");
  }
}
