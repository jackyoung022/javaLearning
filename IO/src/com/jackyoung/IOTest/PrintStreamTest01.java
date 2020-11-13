package com.jackyoung.IOTest;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
PrintStream标准输出流，输出到控制台
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception{
        PrintStream ps = System.out;
        ps.println("hello world!");

        //将标准输出流不再指向控制台，使其指向log文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        System.setOut(printStream);
        System.out.println("hello world!");
    }
}
