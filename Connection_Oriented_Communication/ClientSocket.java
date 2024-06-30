import java.net.Socket;
import java.io.IOException; // used to throw exception when there is any connection error between server and client
import java.io.DataInputStream;

class ClientSocket{
    public static void main(String[] args) throws IOException{
        // the socket instance is created to communicate with the server 
        // (it will Send the connection request to the server)
        Socket socket = new Socket("localhost",8888);

        // the dataInputStream instance is used to get the data stream form the server using the getInputStream() method
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        // readUTF() method is used to read data form the server and store it in the message variable
        String messsage = dataInputStream.readUTF();
        System.out.println("message from server: "+ messsage);
    }
}