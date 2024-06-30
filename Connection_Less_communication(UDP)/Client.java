import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


class Client{
    public static void main(String[] args) throws IOException {
        // UDP protocol will use the DatagramSocket to send data
        DatagramSocket datagramSocket = new DatagramSocket(8989);

        // store te data in a byte array
        byte[] buffer = new byte[1024];

        // this datagramPacket will contain all the arguments need for the transmission
        DatagramPacket datagramPacket = new DatagramPacket(buffer,1024);

        // the receive() method will receive the message from the server through the datagramSocket
        datagramSocket.receive(datagramPacket);

        // converting the byte array into a string, the getData() method will get the data form the datagramPacket
        String message = new String(datagramPacket.getData());
        System.out.print("message form server: "+ message);

        datagramSocket.close();
    }
}