package com.jackyoung.IOTest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read()读取数据太慢
int read(byte[] b) 一次可以读取b.length字节的byte数组 减少内存和硬盘的交互
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //IDEA默认的当前路径是Project的根
            fis = new FileInputStream("README.md");

            //使用byte数组读数据
            byte[] bytes = new byte[4];//一次最多读4字节
            int readCount = fis.read(bytes); // 返回读到的字节数，读不到数据返回-1，数据读在bytes里
            System.out.println(new String(bytes,0,readCount)); //后面的数据覆盖前面的数据，需要设置转换的起始位置和长度
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
