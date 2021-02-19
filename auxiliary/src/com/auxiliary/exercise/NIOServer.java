package com.auxiliary.exercise;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by biwh on 2021/2/5.
 */
public class NIOServer {

        public static void main(String[] args) throws IOException {

            Selector selector = Selector.open();

            ServerSocketChannel ssChannel = ServerSocketChannel.open();
            ssChannel.configureBlocking(false);
            ssChannel.register(selector, SelectionKey.OP_ACCEPT);

            ServerSocket serverSocket = ssChannel.socket();
            InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8889);
            serverSocket.bind(address);

            while (true) {

                selector.select();
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = keys.iterator();

                while (keyIterator.hasNext()) {

                    SelectionKey key = keyIterator.next();

                    if (key.isAcceptable()) {

                        ServerSocketChannel ssChannel1 = (ServerSocketChannel) key.channel();

                        // 服务器会为每个新连接创建一个 SocketChannel
                        SocketChannel sChannel = ssChannel1.accept();
                        sChannel.configureBlocking(false);

                        // 这个新连接主要用于从客户端读取数据
                        sChannel.register(selector, SelectionKey.OP_READ);

                    } else if (key.isReadable()) {

                        SocketChannel sChannel = (SocketChannel) key.channel();
                        System.out.println(readDataFromSocketChannel(sChannel , "utf-8"));
                        sChannel.close();
                    }

                    keyIterator.remove();
                }
            }
        }

        private static String readDataFromSocketChannel(SocketChannel sChannel ,String charsetName) throws IOException {


            Charset c = Charset.forName(charsetName);
            // 解码器，字节流信息转换为字符信息
            CharsetDecoder decoder = c.newDecoder();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            StringBuilder data = new StringBuilder();

            while (true) {

                buffer.clear();
                int n = sChannel.read(buffer);
                if (n == -1) {
                    break;
                }
                buffer.flip();
                int limit = buffer.limit();
                char[] dst = new char[limit];
                for (int i = 0; i < limit; i++) {
                    dst[i] = (char) buffer.get(i);
                }
                data.append(dst);
                buffer.clear();
            }
            return data.toString();
        }
    }
