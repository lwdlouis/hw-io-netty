package com.dml.hw.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {


    public static void main(String[] args) throws IOException {
        startUp();
    }

    public static void startUp() throws IOException {

        System.out.println("start server socket ... ");

        ServerSocket server = new ServerSocket(18080);

        while (true) {
            Socket socket = server.accept();

            InputStream inputStream = socket.getInputStream();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, "utf-8"));

            String str = null;
            while((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        }

//        inputStream.close();
//        reader.close();
    }

}
