package com.jackyoung.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream其他常用方法
    int available(): 返回当前剩余的没有读到的字节量
    long skip(long n): 跳过n个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("README.md");
            int readData = fis.read();//读取一个字节
            System.out.println("还有"+fis.available()+"字节没有读");
            fis.skip(3);//跳过3个字节
//            byte[] bytes = new byte[fis.available()];//该方法不适合大文件读取
//            int readCount = fis.read(bytes);
//            System.out.println(new String(bytes));
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
