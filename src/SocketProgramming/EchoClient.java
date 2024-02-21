package SocketProgramming;
import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int SERVER_PORT = 12345;

        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to server.");

            String message;
            while (true) {
                System.out.print("Enter a message (or 'exit' to quit): ");
                message = userInput.readLine();
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                out.println(message);
                String response = in.readLine();
                System.out.println("Server response: " + response);
            }

            System.out.println("Closing connection.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
