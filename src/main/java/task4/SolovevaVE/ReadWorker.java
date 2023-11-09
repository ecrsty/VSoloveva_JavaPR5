package task4.SolovevaVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ReadWorker implements Runnable{
    private Socket serverSocket;
    private BufferedReader in;

    public ReadWorker(Socket serverSocket, BufferedReader in) {
        this.serverSocket = serverSocket;
        this.in = in;
    }

    @Override
    public void run() {
        try {
            while (!serverSocket.isInputShutdown()) {
                String message = in.readLine();
                System.out.println(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
