package task4.SolovevaVE;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class WriteWorker implements Runnable{
    private Socket serverSocket;
    private BufferedWriter out;

    public WriteWorker(Socket serverSocket, BufferedWriter out) {
        this.serverSocket = serverSocket;
        this.out = out;
    }

    @Override
    public void run() {
        try{
            Scanner input = new Scanner(System.in);
            while (!serverSocket.isOutputShutdown()){
                String outputMessage = input.nextLine();
                out.write(outputMessage);
                out.newLine();
                out.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
