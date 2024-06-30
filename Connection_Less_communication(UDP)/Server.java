import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


class Server{
    public static void main(String[] args) throws IOException {
        // UDP protocol will use the DatagramSocket to send data
        DatagramSocket datagramSocket = new DatagramSocket();

        // generate the message want to send to the client
        Scanner scanner = new Scanner(System.in);
        System.out.print("server side message through UDP: ");
        String message = scanner.nextLine();

        // ip address of the client
        InetAddress ip = InetAddress.getByName("localhost");

        // in UDP protocol the message will be send in the form of bytes 
        // this datagramPacket will contain all the arguments need for the transmission
        DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(),message.length(),ip,8989);

        // the send() method will send the message to the respected ip through the datagramSocket
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}