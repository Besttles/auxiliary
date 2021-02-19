package com.auxiliary.exercise;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by biwh on 2021/2/5.
 */
public class NIOClient {

    public static void main(String[] args) throws IOException {
        for (;;){
            Socket socket = new Socket("127.0.0.1", 8889);
            OutputStream out = socket.getOutputStream();
//            String s = "hello world";
            Scanner scanner = new Scanner(System.in);

            String next = scanner.next();
            byte[] bytes = next.getBytes("UTF-8");
            String str2 = new String(bytes, "UTF-8");
            out.write(next.getBytes());
            out.close();
        }

    }
}