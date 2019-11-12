package com.dml.hw.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {




    public void startUp() throws IOException {

        ServerSocket server = new ServerSocket(18080);

        Socket socket = server.accept();

        InputStream inputStream = socket.getInputStream();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, "utf-8"));




    }

}
