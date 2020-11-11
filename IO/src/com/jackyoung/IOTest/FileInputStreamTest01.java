package com.jackyoung.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileInputStream
    文件字节输入流，可以读取任何形式的文件
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\code\\quicksort.png");

            int readData = fis.read();//读取一个字节
            System.out.println(readData);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //使用finally确保流一定关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
