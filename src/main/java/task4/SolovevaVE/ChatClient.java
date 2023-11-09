package task4.SolovevaVE;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) throws IOException {
        Socket serverSocket = new Socket("services.tms-studio.ru", 27015);

        BufferedReader in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(serverSocket.getOutputStream()));

        String nickName = new Scanner(System.in).nextLine();
        System.out.println("Ваш ник: "+nickName);

        out.write(nickName);
        out.newLine();
        out.flush();

        if(serverSocket.isConnected()){
            ReadWorker readWorker = new ReadWorker(serverSocket, in);
            WriteWorker writeWorker = new WriteWorker(serverSocket, out);

            Thread rW = new Thread(readWorker);
            Thread wW = new Thread(writeWorker);

            rW.start();
            wW.start();

            while(serverSocket.isConnected()){
                Thread.onSpinWait();
            }
        }
    }
}
