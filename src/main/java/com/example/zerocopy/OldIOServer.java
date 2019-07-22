package com.example.zerocopy;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hzq
 * @date 2019/7/22 0022 下午 10:50
 */
public class OldIOServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while(true){
            Socket socket = serverSocket.accept();
            InputStream inputStream = new DataInputStream(socket.getInputStream());

            try {
                byte[] buffer = new byte[4096];
                while(true){
                    int read = inputStream.read(buffer, 0, buffer.length);
                    if(read == -1){
                        break;
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
