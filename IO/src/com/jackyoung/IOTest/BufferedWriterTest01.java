package com.jackyoung.IOTest;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("myfile"));
        writer.write("123");
        writer.flush();
        writer.close();
    }
}
