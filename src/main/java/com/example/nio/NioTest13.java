package com.example.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * @author hzq
 * @date 2019/7/17 0017 下午 11:37
 */
public class NioTest13 {

    public static void main(String[] args) throws Exception {
        String inputFile = "NioTest13_in.txt";
        String outputFile = "NioTest13_out.txt";

        RandomAccessFile inputRandAccessFile = new RandomAccessFile(inputFile, "r");
        RandomAccessFile outputRandAccessFile = new RandomAccessFile(outputFile, "rw");

        long inputLength = new File(inputFile).length();

        FileChannel inputFileChannel = inputRandAccessFile.getChannel();
        FileChannel outputFileChannel = outputRandAccessFile.getChannel();

        MappedByteBuffer mappedByteBuffer = inputFileChannel.map(FileChannel.MapMode.READ_ONLY, 0, inputLength);

        Charset charset = Charset.forName("iso-8859-1");
        CharsetDecoder decoder = charset.newDecoder();
        CharsetEncoder encoder = charset.newEncoder();

        CharBuffer charBuffer = decoder.decode(mappedByteBuffer);
        ByteBuffer byteBuffer = encoder.encode(charBuffer);
        outputFileChannel.write(byteBuffer);

        inputRandAccessFile.close();
        outputRandAccessFile.close();
    }
}
