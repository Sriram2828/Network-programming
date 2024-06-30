import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException; // used to throw exception when there is any connection error between server and client
import java.io.DataOutputStream;
import java.util.Scanner;

class ServerSideSocket{
    public static void main(String[] args) throws IOException{
        // the serverSocket instance is created to communicate with the client only through the port:8888
        ServerSocket serverSocket = new ServerSocket(8888);
        // accept() method is used to accept the client connection request
        Socket socket = serverSocket.accept();

        // the dataOutputStream instance is used to send the data to the client using the getOutputStream() method
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        // generate the server side message which is to send to the client
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        // send the message using the writeUTF() method to the client
        dataOutputStream.writeUTF(message);
        dataOutputStream.close();
    }
}