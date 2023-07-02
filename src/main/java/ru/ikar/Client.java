package ru.ikar;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String... args){
        try(Socket clientSocket = new Socket("localhost", 8787);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            out.println("coolClient");
            System.out.println("Message is send");
            System.out.println(in.readLine());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
