package com.dml.hw.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.UUID;

public class BioClient {


    public static void main(String[] args) throws IOException {

        Socket client = new Socket("localhost", 18080);

        OutputStream ot = client.getOutputStream();

        String uuid = UUID.randomUUID().toString();

        ot.write(uuid.getBytes());

        ot.flush();

        ot.close();
    }
}
