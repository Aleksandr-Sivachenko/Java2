import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientsocket;
    private DataInputStream in;
    private DataOutputStream out;

    public Server() {
        try {
            System.out.println("Server");
            serverSocket = new ServerSocket(8888);
            clientsocket = serverSocket.accept();
            System.out.println(clientsocket);

            in = new DataInputStream(clientsocket.getInputStream());
            out = new DataOutputStream(clientsocket.getOutputStream());

            while (true){
                String incomingMessage = in.readUTF();
                System.out.println(incomingMessage);
                Scanner scanner = new Scanner(System.in);
                out.writeUTF(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void closeConection() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            clientsocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
